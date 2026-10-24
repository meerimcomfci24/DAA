 1. Problem Description
Given the head of a linked list, return the list after sorting it in ascending order[cite: 28, 29].

 2. Approach and Personal Notes
To solve this efficiently, I chose Merge Sort. Since linked lists don't allow random access like arrays do, Merge Sort is the best choice because it works smoothly with sequential node traversal without needing extra index lookups.

 Splitting the list: I used fast and slow pointers to locate the middle node, then split the list into two halves by breaking the connection (`prev.next = null`).
 Recursive sorting: I applied the sort function recursively to both halves.
 Merging: I combined the sorted sublists back together using a dummy head node.

Challenges faced:
At first, I ran into an infinite loop because I forgot to break the link at the midpoint. Once I added `prev.next = null` to properly separate the left and right halves, the recursion worked as expected.

 3. Complexity Analysis
Time Complexity: $O(n \log n)$ because the list is split recursively ($\log n$ levels) and merged linearly ($O(n)$) at each step.
Space Complexity: $O(\log n)$ auxiliary space due to the recursive call stack.

 4. Reflection
Using merge sort directly on the linked list saved me from having to copy elements into an array, sort them, and rebuild the list from scratch. It’s a very clean approach once you get the pointer adjustments right.
