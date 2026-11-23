**Minimum Depth of Binary Tree**

**1. Problem**
For this problem, we need to find the minimum depth of a binary tree. Minimum depth means counting the number of nodes along the shortest path from the root node down to the nearest leaf node (where a leaf is a node that has no left or right children).

**2. Approach**
I used recursion to solve this problem, but with a small twist compared to finding the maximum depth. First, I check if the current node is null—if it is, I return 0. Next, I check if one of the children is missing: if the left child is null, I have to keep going down the right side (`1 + minDepth(root.right)`), and if the right child is null, I go down the left side (`1 + minDepth(root.left)`). Only when both children exist do I recursively find the depths of both subtrees, pick the smaller one using `Math.min()`, and add 1 for the current node.

*Step-by-step (for tree `[3, 9, 20, null, null, 15, 7]`):*

1. Nodes 9, 15, and 7 have no children, so they are all leaf nodes with a depth of 1.
2. Node 20 has two children (15 and 7), so its minimum depth is `1 + min(1, 1) = 2`.
3. Root node 3 has a left child (9) with depth 1 and a right subtree (20) with depth 2.
4. Taking the shorter path to node 9 gives `1 + min(1, 2) = 2`.

**Output:** `2`

**Challenges and Testing**
The trickiest part for me was figuring out how to handle nodes that only have one child. At first, I realized that if I just used `Math.min()` right away when one child is null, it would return `1 + min(0, depth) = 1`, which is wrong because a node with one child isn't actually a leaf! To make sure my logic worked, I tested my code with an empty tree, a single-node tree, a balanced tree, and a skewed tree where every node only had one child. Testing that skewed tree really helped me see why those extra null-child checks are necessary.

**3. Time Complexity**
**Time Complexity: $O(n)$**
In the worst case, the algorithm still has to check every node in the tree to find the closest leaf, visiting each of the $n$ nodes once.

**Space Complexity: $O(h)$**
The memory used by the recursion call stack depends on $h$, the height of the tree. In the worst case—like a completely skewed tree—$h$ equals $n$, making the space complexity $O(n)$.

**4. Reflection / Improvement**
While recursion works well and is easy to write, another great approach for this problem is Breadth-First Search (BFS) using a queue to go level by level. Since BFS checks the shallowest nodes first, we can stop and return the depth the very moment we hit the first leaf node without having to explore the rest of the tree. Even though its worst-case runtime is still $O(n)$, BFS is often faster in practice on unbalanced trees.
