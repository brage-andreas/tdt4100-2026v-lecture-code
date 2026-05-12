package com.bytebadger.assembly.part2;

import java.util.List;

// TODO: Import relevant libraries

public class LargestElementFinder {

    /**
     * This method finds the largest element in a list of numbers.
     * If multiple elements share the same largest value, return any of them.  
     * 
     * Example: 
     * A list of numbers (3, 7, 2, 9, 5, 10, 1) will return the number 10.
     * 
     * @param numbers a list of Integer numbers
     * @throws IllegalArgumentException if the list is null or empty
     * @return the largest number
     */

    public int findLargest(List<Integer> numbers) {

        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException();
        }

        // Metode A
        // --------
        // Integer max = numbers.getFirst();
        //
        // for (Integer number : numbers){
        //     if (number > max) {
        //         max = number;
        //     }
        // }
        //
        // return max;

        // Metode B
        // --------
        // numbers.sort(Integer::compareTo);
        // // ELLER
        // // numbers.sort((a, b) -> a - b);
        //
        // return numbers.getLast();

        // Metode C
        // --------
        return numbers.stream().max(Integer::compareTo).get();
        // ELLER
        // return numbers.stream().max((a, b) -> a - b).get();

    }

}
