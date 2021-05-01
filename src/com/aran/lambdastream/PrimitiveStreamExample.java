package com.aran.lambdastream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Lambdas and Streams - Stream API
 * Examples of the use of PrimitiveStreams
 */
public class PrimitiveStreamExample {

    public static void main(String[] args){

        //Example of the creation and usage of the IntStream
        IntStream.range(1, 4) /*Returns a sequetial IntStream with the values in the range from the first to the last -1
        in this example the IntStream return will contain 1, 2, and 3*/
                .forEach(System.out::println);

        //Example of  the IntStream
        Arrays.stream(new int[] {1, 2, 3, 4}) //an IntStream is created, becasue we pass as parameter an array of ints
                .map(n -> n * n) // the intermediate operation map transforms the values of the IntStream
                .average() /*Returns an OptionalDouble describing the arithmetic mean (MEDIA ARITMETICA) of elements of
                this stream, or an empty optional if this stream is empty. This is a special case of a reduction. This
                is a terminal operation */
                .ifPresent(System.out::println);

        //Example of Stream to IntStream
        Stream.of(1.5, 2.3, 3.7)
                .mapToInt(Double::intValue) /*Returns a IntStream from a Stream of Double*/
                .forEach(System.out::println);
    }
}
