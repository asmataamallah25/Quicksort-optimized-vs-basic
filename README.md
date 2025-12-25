# Quicksort: Basic vs Optimized - Java implementation

This repository contains implementations of the Quicksort algorithm:

- A basic version that matches the Lomuto scheme that partitions the array by assuming the last element as the pivot.
- An optimized version that implements the tail-recursion optimization and the "Median of Three" strategy that takes the first, last, and middle elements of the array and assumes their median as the pivot.


  
## Quick overview of Quicksort
Quicksort is a divide-and-conquer sorting algorithm:

1. Choose a pivot element in the array.  
2. Partition the array into two parts:
   - elements less than the pivot  
   - elements greater than or equal to the pivot  
3. Recursively apply quicksort to the left and right parts.

## Time complexity

### Average case
We assume that Quicksort splits the array into roughly equal parts.

- Each partition step scans the current subarray once, so it does linear work in the array size ( \(n\) for the full array).
- After partition, there are two subarrays of about size \(n/2\), then \(n/4\), and so on.
- On each recursion level, the sizes of all subarrays added up on that level are \(n\).

So:

- Work per level \(\approx cn\) for some constant \(c\).
- Number of levels \(\approx\) how many times we can divide \(n\) by 2 until you reach size 1, which is \(\log_2 n\).

Therefore:
\[
T_{\text{avg}}(n) \approx (\text{work per level}) \times (\text{levels}) \approx cn \cdot \log n = O(n \log n)
\]
### Worst case
