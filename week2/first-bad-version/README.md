First Bad Version Lab Report
1. Problem Overview
We need to track down the exact software version where a bug first appeared using an external API. Since every version after the bad one is broken too, we want to find the very first failure with minimal API checks.
2. Solution Approach
Instead of checking every single version sequentially from start to finish, I applied binary search across the version numbers. I set my start pointer to 1 and end pointer to n. Inside a loop, I found the middle version and tested it with the API. If it returned true, the bad version was at or to the left, so I pulled the end pointer down. If it was false, I pushed the start pointer up.
3. Time Complexity
Time Complexity: O(log n)
Explanation: By dividing the search space in half with every check instead of testing one by one, the number of operations scales logarithmically.
4. Space Complexity
Space Complexity: O(1)
Explanation: The algorithm only uses a few primitive variables like start, end, and mid, keeping auxiliary memory constant.
5. Reflection
Could we do better? No, binary search is already the most efficient way to solve this.
What changed from brute force? We abandoned the linear check that causes time limit errors and used a sorted boundary approach instead.
What did we achieve? We dropped the time complexity from O(n) down to O(log n).
