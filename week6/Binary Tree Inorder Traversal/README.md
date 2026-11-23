Binary Tree Inorder Traversal

1. Problem
The goal is to return a binary tree's node values in inorder sequence. This means visiting the left subtree first, then the current node, and finally the right subtree (Left → Root → Right).
2. Approach
I solved this using recursion. First, I initialized an empty list to store the result, then called a helper function. If the current node is null, the function returns. Otherwise, it recursively traverses the left child, appends the current node's value to the list, and recursively traverses the right child.

Example
Input:

```text
1
 \
  2
 /
3

```

Step-by-step:

1. Start at node 1; its left child is null.
2. Add 1 to the list.
3. Move to the right child (node 2).
4. Move to the left child of node 2 (node 3).
5. Add 3 to the list.
6. Backtrack to node 2 and add 2.

Output:

```text
[1, 3, 2]

```

Challenges and Testing
The main challenge was grasping the execution order of recursive calls—specifically why the node's value is recorded between the left and right calls. I tested the code with an empty tree, a single-node tree, and a multi-node tree, which clarified how the base case stops recursion and returns to previous nodes.

3. Time Complexity
Time Complexity: O(n)
Every node is visited once. For a tree with n nodes, the algorithm processes all n nodes, giving a linear time complexity of O(n).

Space Complexity: O(n)
The output list holds all n values, and the recursive call stack takes O(h) space, where h is the tree's height. In the worst case (a skewed tree), h equals n.

4. Reflection / Improvement
The recursive solution is concise and already optimal in time. As an alternative, an iterative approach using an explicit stack avoids recursion overhead and prevents stack overflow on very deep trees, while keeping the same O(n) time complexity..
