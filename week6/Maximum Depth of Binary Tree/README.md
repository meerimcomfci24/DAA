**Maximum Depth of Binary Tree**

**1. Problem**
For this problem, we need to find the maximum depth of a binary tree. Maximum depth just means counting the total number of nodes along the longest path from the root node all the way down to the farthest leaf node.

**2. Approach**
I used recursion to solve this since the depth of any node just depends on the depths of its subtrees. First, I check if the current node is null—if it is, that's my base case, so I return 0. Otherwise, I recursively find the maximum depth of both the left and right subtrees, use `Math.max()` to pick whichever side is deeper, and add 1 to count the current node itself.

*Step-by-step (for tree `[3, 9, 20, null, null, 15, 7]`):*

1. Node 9 has no children, so it returns a depth of 1 (`1 + max(0, 0)`).
2. Nodes 15 and 7 are also leaves, so each of them returns a depth of 1.
3. Node 20 has 15 and 7 as children, so its depth is `1 + max(1, 1) = 2`.
4. Finally, root node 3 has a left depth of 1 and a right depth of 2, giving a total depth of `1 + max(1, 2) = 3`.

**Output:** `3`

**Challenges and Testing**
The trickiest part for me was picturing how the recursion bubbles the depth counts back up from the bottom leaves to the parent nodes—specifically why we use `Math.max()` instead of summing the left and right depths together (since we only want the *single longest* path, not the total number of nodes). To make sure everything worked, I tested my code with an empty tree, a single-node tree, and a multi-level tree, which confirmed that the base case and height calculations were accurate.

**3. Time Complexity**
**Time Complexity: $O(n)$**
We visit every node in the tree exactly once to compute its depth. So for a tree with $n$ nodes, the runtime scales linearly as $O(n)$.

**Space Complexity: $O(h)$**
The memory used by the recursion call stack depends on $h$, the height of the tree. In the worst case—if the tree is completely skewed like a straight line—$h$ equals $n$, making the space complexity $O(n)$.

**4. Reflection / Improvement**
The recursive DFS solution is already optimal in terms of runtime since we have to check every node anyway. Another way to solve this would be using Breadth-First Search (BFS) with a queue to count the levels one by one, which also runs in $O(n)$ time. However, I stuck with recursion because the code is much cleaner, shorter, and easier to read for this problem.
