Problem Description
Given an array of integers nums, sort the array in ascending order and return it. You must solve the problem without using any built-in functions in O(n log n) time complexity and with the smallest space complexity possible.
Approach and Personal Notes
To solve this efficiently and meet the strict O(1) space complexity requirement without using any built-in functions, I chose Heap Sort.
The approach consists of two main phases:
Heap Construction: I rearranged the input array into a max-heap structure, starting from the last non-leaf node up to the root.
Extraction and Sorting: I repeatedly swapped the root (the maximum element) with the last element of the current heap, reduced the heap size, and called heapify to maintain the max-heap property.
Challenges: Writing the heapify helper function correctly took some careful debugging, especially ensuring that the left and right child index calculations did not go out of bounds.
Complexity Analysis
Time Complexity: O(n log n) because building the heap takes linear time O(n), and the n extractions each take O(log n) time.
Space Complexity: O(1) auxiliary space because the sorting is performed entirely in-place without needing extra arrays.
Reflection
Heap Sort turned out to be a great choice here because unlike merge sort, it does not require extra memory for temporary arrays, allowing me to achieve true in-place O(1) space complexity while keeping O(n log n) performance.
