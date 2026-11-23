**Invert Binary Tree**

**Problem Description**
For this problem, we are given the root of a binary tree and need to invert it and return the root. Inverting a binary tree basically means creating a mirror image of it by swapping the left and right children of every single node.

**Solution Approach**
To solve this, I went with a recursive approach since we need to repeat the exact same swap operation down the entire tree. First, I check if the current node is null—that's my base case, so I just return null because there's nothing to swap. If the node exists, I use a temporary variable to swap its left and right child pointers. Once they are swapped, I recursively call the function on both the left and right subtrees so they get inverted too. After the recursion finishes all the way down, I simply return the original root of the tree.

**Time Complexity**
The time complexity is $O(n)$, where $n$ is the total number of nodes in the tree, since we visit each node once to swap its children.

**Space Complexity**
The space complexity is $O(h)$, where $h$ is the height of the tree, because of the recursion call stack. In the worst case, if the tree is completely unbalanced (like a straight line), $h$ equals $n$, making the space complexity $O(n)$.
