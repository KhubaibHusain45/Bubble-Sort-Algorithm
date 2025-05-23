This is the Bubble Sort algorithm, which repeatedly steps through the list, compares adjacent items, and swaps them if they are in the wrong order.

📌 Details:
Outer loop (i) runs n-1 times (n = arr.length), each time reducing the effective array size by 1.

Inner loop (j) handles the comparison and swapping of adjacent elements.

Swap logic ensures that the largest unsorted element bubbles up to its correct position at the end of each pass.

Time Complexity:
Worst and Average Case: O(n²)

Best Case (already sorted): O(n) if optimized with a flag (not included here).
