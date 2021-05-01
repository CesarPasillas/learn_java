package com.aran.lambdastream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Lambdas and Streams - Stream API
 * Examples of the use of Streams
 */
public class StreamExample {

    public static void main(String[] args){

        //With Arrays.asList is created a list of Strings after the List is create we can transform it into a Stream
        Arrays.asList("red","green","blue","white","black","pink")
                .stream() //A new Stream is created from the List created with Arrays.asList
                .sorted() /*The Stream sorted() method (is a intermediate operation) creates a new Stream with the
                sorted list with the natural ascending order*/
                .findFirst() /* is a terminal operation that returns an Optional, this method look for
                 the first element in the stream and returns an optional with the result*/
                .ifPresent(System.out::println); /*if the optional has something the consumer with the value is invoked
                otherwise do nothing*/

        //Example  of the creation and manipulation of a Stream with filter.
        Stream.of("apple", "pear", "banana", "cherry", "apricot", "coconut", "pineapple")
                .filter(fruit -> {
                    System.out.println("Filter: " + fruit);
                    return fruit.startsWith("a");}) /*Here is created a new Stream with all the filtered
                fruits that starts with "a", remember that filter is an intermediate operation */
                .forEach(fruit -> System.out.println("Starts with A: " + fruit)); /* forEach is terminal operator that
                will print all the fruits that starts with "A".
                If the forEach method is removed nothing is printed.*/

        //Example of the use of map (intermediate operation) and the creation of a Stream using the Stream.of method
        List<String> collected = Stream.of("Java", " Is awesome")
                .map(s -> s.toUpperCase()) /*map returns a Stream consisting of the values after apply the given
                function, on this case change the String in to Upper case*/
                .collect(toList()); /*collect(toLis()) save the Stream into a new List, the collect performs a mutable
                reduction operation, remember thi is a terminal operation*/
        System.out.println((collected));
    }
}
