Binary Search Lab Report

1. Problem Overview
We need to search for a target value inside a sorted array of numbers. If we find it, we return its index position, and if it is not there, we return negative one.
2. Solution Approach
Instead of checking every item one by one like a normal loop, I used binary search since the data is already sorted. I set up pointers for the start and end of the array. Inside a while loop, I calculated the middle element. If the middle number matches our target, we are done. If the target is larger, we shift our start pointer up. If it is smaller, we pull our end pointer down.
3. Time Complexity
Time Complexity: O(log n)
Explanation: Because we eliminate half of the remaining elements at every step, the number of operations scales logarithmically rather than linearly.
4. Space Complexity
Space Complexity: O(1)
Explanation: The algorithm only requires a few integer variables for tracking indices, meaning memory usage stays flat.
5. Reflection
Could we do better? No, binary search is already the best method for sorted arrays.
What changed from brute force? We stopped doing linear scans and started cutting the search space in half.
What did we achieve? We brought down the time complexity from O(n) to O(log n).
