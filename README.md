# Quicksort: Basic vs Optimized - Java implementation

This repository contains implementations of the Quicksort algorithm:

- A basic version that matches the Lomuto scheme that partitions the array by assuming the last element as the pivot.
- An optimized version that implements the tail-recursion optimization and the "Median of Three" strategy that takes the first, last, and middle elements of the array and assumes their median as the pivot.


  
## Quick overview of Quicksort
Quicksort is a divide-and-conquer sorting algorithm:

  1- Choose a pivot element in the array.

  2- Partition the array into two parts:

    - elements less than the pivot

    - elements greater than or equal to the pivot

  3- Recursively apply Quicksort to the left and right parts.
