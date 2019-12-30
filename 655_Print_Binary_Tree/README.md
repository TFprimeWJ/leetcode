# 655 Print Binary Tree

First, we need to calculate the width of the 2-d array according to the height of the tree.

- height = 1: width = 1
- height = 2: width = 1 + 2
- height = 3: width = 1 + 2 + 4
- height = 4: width = 1 + 2 + 4 + 8
- ...
- height = n: width = 1 + 2 + 4 + 2^(n-1) = 2^n - 1