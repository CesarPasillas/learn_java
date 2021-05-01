package com.aran.arrayscollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Arrays and Collections - Collection API
 *
 * Example of how to modify values in an unmodifiableList
 *
 */
public class UnmodifiableCollectionVsUnmodifiableViewCollection {

    public static void main (String[] args){
        var numA = new Integer[]{1, 2}; // Creates an Array of Integers called numA
        var list1 = new ArrayList<Integer>(List.of(numA)); /* creates a Unmodifiable collection,
        that is is not necessarily immutable, we can add and modify the new elements*/

        list1.add(null); //the null value is added in list1 in the position 2.

        var list2 = Collections.unmodifiableList(list1); /*UnmodifiableList returns a unmodifiable view,
            its mutator methods throw UnsupportedOperationException
            if we try to execute the follow mutators in the list2 the JVM will throw a UnsupportedOperationException
        list2.add(null);
        list1.set(3, 4);
        */

        list1.set(2, 3); /*In this line we change the new value add it before in the line 16 (null),
            we don't modify the original values of the unmodifiable list. */

        //if we try to modify the values in the position 0, or 1 we will get the UnsupportedOperationException
        //list1.set(4, 1);

        List<List<Integer>> list3 = List.of(list1, list2); // in this line we create a unmodifiable collection,

        System.out.println(list3);
    }
}
