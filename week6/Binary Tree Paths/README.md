**Binary Tree Paths**

**Problem Description**
For this problem, we are given the root of a binary tree and need to return all the root-to-leaf paths in any order. A root-to-leaf path just means starting at the top (the root) and going all the way down to a leaf node, which is a node with no left or right children.

**Solution Approach**
To solve this, I used recursion with backtracking to explore every possible path from the root down to the leaves. Starting at the root, I keep track of the current path as I move down the tree, adding each node's value along the way. Once I hit a leaf node (where both left and right children are null), I format the current path into a string and save it to my result list. If the node isn't a leaf, I recursively explore its left and right subtrees. After finishing with a node's children, I use backtracking to remove the current node from the path so that it doesn't mess up the next branch I explore. Once all branches are checked, I return the final list of paths.

**Time Complexity**
The time complexity is $O(n)$ to traverse the tree, since we visit each of the $n$ nodes once. *(Note: if we include the time it takes to build and copy the path strings at every leaf, it can take up to $O(n^2)$ in the worst case for a skewed tree).*

**Space Complexity**
The space complexity is $O(h)$ for the recursion call stack and the temporary path list, where $h$ is the height of the tree. In the worst case, if the tree is completely unbalanced (like a straight line), $h$ equals $n$, making the auxiliary space $O(n)$ (not counting the space needed to store all the final path strings in the output list).
