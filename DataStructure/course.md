I. Fundamental Data Structures (Linear)
These are structures where elements are arranged in a sequential order.

Array

Static Array

Dynamic Array (e.g., List in Python/C#, ArrayList in Java, vector in C++)

Linked List

Singly Linked List

Doubly Linked List

Circular Linked List

Stack (LIFO - Last In, First Out)

Queue (FIFO - First In, First Out)

Simple Queue

Circular Queue

Deque (Double-Ended Queue)

Priority Queue (often implemented with a Heap, see below)

II. Non-Linear Data Structures
These are structures where elements do not form a simple sequence.

Trees (Hierarchical)

Binary Tree

Binary Search Tree (BST)

Balanced BSTs:

AVL Tree

Red-Black Tree

Heap (A complete binary tree, used for Priority Queues)

Min-Heap

Max-Heap

Trie (Prefix Tree) - Excellent for strings and prefixes.

Segment Tree - For range queries and updates.

Fenwick Tree (Binary Indexed Tree) - Efficient range sum queries.

B-Tree, B+ Tree (Used in databases and file systems)

Graphs (A collection of nodes and edges)

Directed Graph (Digraph)

Undirected Graph

Weighted Graph

Cyclic vs. Acyclic Graph

III. Core Algorithms & Techniques
This is the "tricks and methods" part. Mastery here is key.

A. Searching Algorithms
Linear Search - For unsorted data.

Binary Search - Crucial. Only for sorted data. Many variations exist.

B. Sorting Algorithms
Basic Sorts:

Bubble Sort

Selection Sort

Insertion Sort

Efficient Comparison Sorts:

Merge Sort (Divide & Conquer)

Quick Sort (Divide & Conquer)

Heap Sort

Non-Comparison Sorts (for specific data types):

Counting Sort

Radix Sort

Bucket Sort

C. Graph Algorithms
Graph Traversal:

Breadth-First Search (BFS) - Shortest path in unweighted graphs, level-order traversal.

Depth-First Search (DFS) - Cycle detection, pathfinding, topological sort.

Shortest Path:

Dijkstra's Algorithm - For weighted graphs with non-negative weights.

Bellman-Ford Algorithm - For weighted graphs that may have negative weights.

Floyd-Warshall Algorithm - All-pairs shortest path.

Minimum Spanning Tree (MST):

Prim's Algorithm

Kruskal's Algorithm (Uses Union-Find data structure)

Topological Sorting - For Directed Acyclic Graphs (DAGs).

Cycle Detection (Union-Find, DFS).

D. String Manipulation Algorithms
Pattern Matching:

Knuth-Morris-Pratt (KMP) Algorithm

Rabin-Karp Algorithm

Longest Common Subsequence (LCS)

Sliding Window on Strings (e.g., Longest Substring Without Repeating Characters).

IV. Core Problem-Solving Techniques & Paradigms
These are the mental models you use to approach problems.

Brute Force - The naive, first approach. Understand it before optimizing.

Two Pointers Technique - Often used in arrays and linked lists (e.g., finding a pair with a sum, detecting a cycle, reversing a string).

Sliding Window - For subarray/substring problems (e.g., maximum sum subarray of size k).

Prefix Sum (or Suffix Sum) - Precompute to answer range sum queries in O(1) time.

Divide and Conquer - Break problem into sub-problems, solve, and combine (e.g., Merge Sort, Quick Sort, Binary Search).

Recursion & Backtracking

Recursion: A function calls itself.

Backtracking: An optimized recursion where you "undo" a choice if it doesn't lead to a solution (e.g., N-Queens, Sudoku Solver, generating all permutations/combinations).

Greedy Algorithms - Make the locally optimal choice at each step, hoping it leads to a global optimum (e.g., Dijkstra's, Prim's, Activity Selection, Coin Change where denominations are "nice").

Dynamic Programming (DP) - Extremely Important.

Concept: Break a problem into overlapping subproblems, solve each once, and store their results (Memoization/Caching).

Approaches:

Top-Down (Memoization): Recursion + Caching.

Bottom-Up (Tabulation): Iterative approach, filling up a table.

Classic Problems:

Fibonacci Number

Climbing Stairs

0/1 Knapsack Problem

Longest Increasing Subsequence (LIS)

Longest Common Subsequence (LCS)

Coin Change (number of ways / minimum coins)

Edit Distance

Matrix Chain Multiplication

V. Competitive Programming (CP) Tricks & Advanced Concepts
These build on the fundamentals and are common in high-level interviews and contests.

Advanced Data Structures:

Union-Find (Disjoint Set Union - DSU) - Essential for dynamic connectivity problems.

Sparse Table - For Range Minimum Queries (RMQ).

Monotonic Stack/Queue - For problems involving "next greater/smaller element".

Algorithmic Techniques:

Bit Manipulation - Using bits as a compact data structure or for optimizations.

Binary Search on Answer - When the problem is monotonic (e.g., find the minimum capacity to ship packages in D days).

Meet in the Middle - Divide the problem into two halves, solve independently, and combine results (e.g., subset sum for large N).

Combinatorics & Probability - Counting, permutations, combinations.

Number Theory:

Sieve of Eratosthenes (finding primes)

Euclid's Algorithm (GCD/LCM)

Modular Arithmetic

Geometry:

Basic operations (distance, cross product, dot product)

Convex Hull (Graham Scan, Jarvis March)

Recommended Learning Path
Start with the Fundamentals: Master Arrays, Strings, Linked Lists, Stacks, Queues, and basic Time/Space Complexity.

Learn Core Techniques: Two Pointers, Sliding Window, Prefix Sum, and Binary Search.

Dive into Recursion & Backtracking: This is a mental hurdle for many. Practice a lot.

Conquer Trees & Graphs: Understand traversals (BFS/DFS) and basic algorithms.

Tackle Dynamic Programming: Start with the classic problems. This takes time and practice to internalize.

Explore Greedy & Divide and Conquer.

Finally, move to Advanced CP topics as needed.
