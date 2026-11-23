**Sum of Left Leaves**

**1. Problem**
For this problem, we need to find the sum of all left leaves in a binary tree. A leaf is simply a node with no children, and a *left leaf* is a leaf node that is specifically the left child of its parent. Our goal is to scan the tree, find all these left leaves, and add their values together (or return 0 if there aren't any).

**2. Approach**
I used recursion to solve this problem by checking both the left and right subtrees starting from the root. First, I check if the current node is null—if it is, I return 0 since there's nothing to add. Next, I look at the current node's left child: if it exists and has no left or right children of its own, it's a left leaf, so I add its value directly to the sum. If the left child does have children, it's not a leaf, so I recursively call the function on it to keep searching deeper. After handling the left side, I also make a recursive call on the right subtree, because nodes on the right side can still have their own left leaves. Finally, I return the combined total.

*Tracing the example (`[3, 9, 20, null, null, 15, 7]`):*
The tree is structured with root `3`, left child `9`, and right child `20` (which has left child `15` and right child `7`).

1. Start at root `3` and check its left child, which is `9`.
2. Node `9` has no children and is a left child, so it's a left leaf. I add `9` to the sum (current sum = `9`).
3. Move on to recursively check the right subtree starting at node `20`.
4. Node `20` has a left child, `15`. Since `15` has no children, it's also a left leaf. I add `15` to the sum (current sum = `9 + 15 = 24`).
5. Node `20`'s right child, `7`, is a leaf too, but because it's a right child, it gets ignored.

**Final Answer:** `24`

**Challenges and Testing**
The trickiest part was remembering that not every leaf node counts—we have to look from the parent node's perspective to confirm a leaf is actually on the left side (like ignoring node `7` while counting node `15`). It was also important to make sure we don't accidentally count a left child if it still has children of its own, and instead keep traversing down its subtree. To test my solution, I would run it against a single-node tree (which should return 0), a tree with only right-leaning nodes, a tree with multiple left leaves, and one where a left child has deeper subtrees, ensuring only the right nodes get summed up.

**3. Time Complexity**
**Time Complexity: $O(n)$**
In the worst case, the algorithm visits every node in the binary tree once, doing just a few constant-time checks at each step. So for a tree with $n$ nodes, the runtime scales linearly as $O(n)$.

**Space Complexity: $O(h)$**
The recursion call stack uses memory proportional to $h$, the height of the tree. For a balanced tree, $h$ is around $\log n$, giving $O(\log n)$ space. In the worst case—if the tree is completely skewed like a straight line—$h$ equals $n$, making the space complexity $O(n)$.

**4. Reflection / Improvement**
This recursive approach is already optimal in terms of runtime since we have to check every branch to make sure we don't miss any left leaves. Alternatively, I could implement this iteratively using a stack or queue (DFS or BFS), which would avoid recursion overhead while keeping the exact same $O(n)$ time and $O(h)$ worst-case space complexity. Still, I prefer recursion here because it matches the natural structure of the tree and keeps the code clean and easy to follow.
