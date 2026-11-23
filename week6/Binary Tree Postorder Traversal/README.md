**Binary Tree Postorder Traversal**

**Problem**
For this problem, we are given the root of a binary tree and need to return its node values using postorder traversal.

**Approach**
Postorder traversal follows a **Left → Right → Root** pattern. That means for every node, we explore its left subtree first, then its right subtree, and only after that do we record the current node's value.

To implement this, I used recursion with a helper function. First, it checks if the current node is null—if it is, that's our base case, so it just stops and returns. Otherwise, it recursively traverses the left child, then the right child, and finally appends the current node's value to the result list.

**Time Complexity**
The time complexity is $O(n)$, where $n$ is the number of nodes in the tree, since we visit each node just once.

**Space Complexity**
The space complexity is $O(n)$ because the output list holds all $n$ node values, and the recursion call stack uses $O(h)$ extra space (where $h$ is the height of the tree, which equals $n$ in the worst case of a skewed tree).
