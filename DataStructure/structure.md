# 🎯 Complete Data Structures & Algorithms Roadmap

## Phase 1: Foundation & CRUD Mastery (Weeks 1-4)

### Week 1: Arrays & Basic Operations
**Goal**: Master array CRUD in both Java & C++

#### Day 1-2: Static Arrays
- **Java**: Fixed-size array operations
- **C++**: Native arrays and std::array
- **CRUD Practice**:
  - Create: Initialize arrays
  - Read: Access by index
  - Update: Modify elements
  - Delete: Remove and shift elements
- **Problems**: 5 easy array problems

#### Day 3-4: Dynamic Arrays
- **Java**: ArrayList deep dive
- **C++**: std::vector mastery
- **CRUD Practice**:
  - Dynamic resizing
  - Capacity vs size
  - Insert at any position
  - Remove from any position
- **Problems**: 5 dynamic array problems

#### Day 5-7: String Manipulation
- **Java**: String, StringBuilder, StringBuffer
- **C++**: std::string operations
- **CRUD Operations**:
  - Character access and modification
  - Substring operations
  - Concatenation and splitting
  - Search and replace
- **Problems**: 10 string problems
- **Key Problems**:
  - Reverse string
  - Check palindrome
  - Valid anagram
  - First unique character

---

### Week 2: Linked Lists
**Goal**: Implement all linked list variants from scratch

#### Day 1-3: Singly Linked List
- **Implementation**: Node class + LinkedList class
- **CRUD Operations**:
  - Insert: At beginning, end, position
  - Delete: From beginning, end, position
  - Search: Linear search through list
  - Update: Modify node values
- **Additional Operations**:
  - Reverse linked list
  - Detect cycle
  - Find middle element
  - Remove nth node from end
- **Problems**: 10 problems

#### Day 4-5: Doubly Linked List
- **Implementation**: Bidirectional traversal
- **CRUD Operations**: Similar to singly, but with prev pointers
- **Problems**: 5 problems

#### Day 6-7: Circular Linked List
- **Implementation**: Last node points to first
- **Use Cases**: Round-robin scheduling
- **Problems**: 3 problems

---

### Week 3: Stacks & Queues
**Goal**: Master LIFO and FIFO data structures

#### Day 1-3: Stack
- **Implementations**:
  - Array-based stack
  - Linked list-based stack
- **CRUD Operations**:
  - Push (Create)
  - Pop (Delete)
  - Peek (Read)
  - isEmpty, size
- **Applications**:
  - Valid parentheses
  - Evaluate postfix expression
  - Next greater element
  - Min stack
  - Daily temperatures
- **Problems**: 12 problems

#### Day 4-7: Queue Variants
**Simple Queue**:
- Array-based and linked list implementations
- Enqueue, Dequeue, Peek operations

**Circular Queue**:
- Efficient space utilization
- Front and rear pointer management

**Deque (Double-Ended Queue)**:
- Insert/delete from both ends
- Sliding window maximum

**Priority Queue**:
- Min heap and max heap based
- Top K elements problems

- **Problems**: 15 problems across all variants

---

### Week 4: Hash Tables
**Goal**: Master constant-time lookups

#### Day 1-3: HashMap/HashSet
- **Java**: HashMap, HashSet, LinkedHashMap, TreeMap
- **C++**: unordered_map, unordered_set, map, set
- **CRUD Operations**:
  - Insert key-value pairs
  - Retrieve values by key
  - Update existing keys
  - Delete entries
- **Collision Handling**:
  - Chaining
  - Open addressing
- **Problems**: 15 problems
  - Two sum
  - Group anagrams
  - Longest consecutive sequence
  - Subarray sum equals K

#### Day 4-7: Advanced Hashing
- **Custom hash functions**
- **Frequency counters**
- **Sliding window with hash**
- **Problems**: 10 problems

---

## Phase 2: Core Algorithms (Weeks 5-8)

### Week 5: Searching Algorithms

#### Day 1-2: Linear Search
- Sequential search
- Sentinel search
- **Time Complexity**: O(n)

#### Day 3-7: Binary Search & Variations
**Basic Binary Search**:
- Iterative implementation
- Recursive implementation
- **Time Complexity**: O(log n)

**Binary Search Variations**:
- First occurrence
- Last occurrence
- Count of occurrences
- Search in rotated sorted array
- Find peak element
- Square root using binary search

**Binary Search on Answer**:
- Minimum capacity to ship packages
- Koko eating bananas
- Split array largest sum

- **Problems**: 20 problems

---

### Week 6: Sorting Algorithms

#### Day 1-2: Basic Sorts
**Bubble Sort**: O(n²)
- Compare adjacent elements
- Swap if out of order

**Selection Sort**: O(n²)
- Find minimum, swap with first unsorted

**Insertion Sort**: O(n²)
- Build sorted array one element at a time

#### Day 3-4: Efficient Sorts
**Merge Sort**: O(n log n)
- Divide and conquer
- Stable sort
- Extra space required

**Quick Sort**: O(n log n) average
- Partition around pivot
- In-place sorting
- Unstable sort

**Heap Sort**: O(n log n)
- Build max heap
- Extract max repeatedly

#### Day 5-7: Special Sorts
**Counting Sort**: O(n + k)
- For small range of integers

**Radix Sort**: O(d × n)
- Sort by digit position

**Bucket Sort**: O(n + k)
- Distribute into buckets

- **Problems**: 15 sorting problems

---

### Week 7: Recursion & Backtracking

#### Day 1-3: Recursion Fundamentals
- Base case and recursive case
- Call stack understanding
- Tail recursion optimization

**Classic Problems**:
- Fibonacci sequence
- Factorial
- Power function
- Tower of Hanoi
- Generate all subsets
- Generate all permutations

#### Day 4-7: Backtracking
**Concept**: Try all possibilities, backtrack on failure

**Template**:
```
void backtrack(state):
    if (base_case):
        add to result
        return

    for each choice:
        make choice
        backtrack(new_state)
        undo choice (backtrack)
```

**Classic Problems**:
- N-Queens problem
- Sudoku solver
- Generate parentheses
- Letter combinations of phone number
- Combination sum
- Word search
- Palindrome partitioning

- **Problems**: 20 problems

---

### Week 8: Two Pointers & Sliding Window

#### Day 1-3: Two Pointers Technique
**Patterns**:
- Opposite direction pointers
- Same direction pointers (fast & slow)
- Multiple pointers

**Problems**:
- Two sum (sorted array)
- Three sum
- Container with most water
- Trapping rain water
- Remove duplicates from sorted array
- Move zeroes
- Linked list cycle detection
- Find intersection of two linked lists

- **Problems**: 15 problems

#### Day 4-7: Sliding Window
**Fixed Size Window**:
- Maximum sum subarray of size K
- First negative in every window of size K

**Variable Size Window**:
- Longest substring without repeating characters
- Minimum window substring
- Longest substring with K distinct characters
- Fruits into baskets
- Max consecutive ones III

- **Problems**: 15 problems

---

## Phase 3: Non-Linear Structures (Weeks 9-12)

### Week 9-10: Trees

#### Day 1-3: Binary Trees
**Node Structure**:
```java
class TreeNode {
    int val;
    TreeNode left, right;
}
```

**CRUD Operations**:
- Insert node
- Delete node
- Search node
- Update node value

**Traversals**:
- Inorder (Left, Root, Right)
- Preorder (Root, Left, Right)
- Postorder (Left, Right, Root)
- Level order (BFS)

**Problems**: 20 problems
- Maximum depth
- Invert binary tree
- Diameter of tree
- Lowest common ancestor
- Path sum
- Serialize/deserialize

#### Day 4-7: Binary Search Trees
**Properties**: Left < Root < Right

**CRUD Operations**:
- Insert: Maintain BST property
- Delete: Three cases (leaf, one child, two children)
- Search: O(log n) average
- Find min/max

**Problems**: 15 problems
- Validate BST
- Kth smallest element
- Convert sorted array to BST
- Range sum of BST

#### Advanced Trees (Optional Deep Dive):
- **AVL Trees**: Self-balancing BST
- **Red-Black Trees**: Balanced BST with color property
- **Trie (Prefix Tree)**: String search optimization
- **Segment Tree**: Range queries
- **Fenwick Tree**: Efficient range sum

---

### Week 11: Heaps & Priority Queues

#### Day 1-4: Heap Fundamentals
**Min Heap**: Parent ≤ Children
**Max Heap**: Parent ≥ Children

**CRUD Operations**:
- Insert: Add at end, bubble up
- Delete (extract min/max): Remove root, bubble down
- Peek: View root
- Heapify: Convert array to heap

**Implementation**:
- Array-based representation
- Parent at i, children at 2i+1, 2i+2

#### Day 5-7: Heap Applications
**Problems**: 15 problems
- Kth largest element
- Top K frequent elements
- Merge K sorted lists
- Find median from data stream
- Task scheduler
- Reorganize string

---

### Week 12: Graphs

#### Day 1-2: Graph Representations
**Adjacency Matrix**: 2D array
**Adjacency List**: HashMap of lists

**Graph Types**:
- Directed vs Undirected
- Weighted vs Unweighted
- Cyclic vs Acyclic

#### Day 3-4: Graph Traversals
**BFS (Breadth-First Search)**:
- Level by level exploration
- Uses queue
- Shortest path in unweighted graph

**DFS (Depth-First Search)**:
- Explore as deep as possible
- Uses stack (or recursion)
- Cycle detection, topological sort

**Problems**: 20 problems
- Number of islands
- Clone graph
- Course schedule
- Word ladder

#### Day 5-7: Advanced Graph Algorithms
**Shortest Path**:
- Dijkstra's algorithm (non-negative weights)
- Bellman-Ford (handles negative weights)
- Floyd-Warshall (all pairs)

**Minimum Spanning Tree**:
- Prim's algorithm
- Kruskal's algorithm

**Topological Sort**: For DAGs

**Union-Find (Disjoint Set)**:
- Find operation
- Union operation
- Path compression

---

## Phase 4: Dynamic Programming (Weeks 13-16)

### Week 13: DP Fundamentals

#### Day 1-3: Introduction to DP
**Characteristics**:
- Overlapping subproblems
- Optimal substructure

**Approaches**:
- Top-Down (Memoization): Recursion + cache
- Bottom-Up (Tabulation): Iterative

**Steps to Solve DP**:
1. Define state (dp array meaning)
2. Find recurrence relation
3. Initialize base cases
4. Determine iteration order
5. Return final answer

#### Day 4-7: 1D DP Problems
- Fibonacci number
- Climbing stairs
- House robber
- Maximum subarray (Kadane's algorithm)
- Longest increasing subsequence
- Jump game
- Coin change
- Perfect squares

- **Problems**: 15 problems

---

### Week 14: 2D Dynamic Programming

#### Day 1-7: Grid & Matrix DP
- Unique paths
- Minimum path sum
- Longest common subsequence (LCS)
- Edit distance
- Regular expression matching
- Wildcard matching
- Maximal square
- Dungeon game

- **Problems**: 20 problems

---

### Week 15: Advanced DP Patterns

#### Knapsack Patterns
- 0/1 Knapsack
- Unbounded knapsack
- Subset sum
- Partition equal subset sum
- Target sum

#### String DP
- Palindromic substring
- Longest palindromic substring
- Palindrome partitioning
- Distinct subsequences

#### Tree DP
- House robber III
- Binary tree cameras

- **Problems**: 25 problems

---

### Week 16: DP Optimization
- Space optimization techniques
- State compression
- Bitmask DP

---

## Phase 5: Greedy & Advanced Topics (Weeks 17-20)

### Week 17: Greedy Algorithms

**Concept**: Make locally optimal choice

**When to Use Greedy**:
- Problem has optimal substructure
- Greedy choice property holds

**Classic Problems**:
- Activity selection
- Fractional knapsack
- Huffman coding
- Jump game II
- Gas station
- Candy distribution
- Partition labels
- Minimum number of arrows

- **Problems**: 15 problems

---

### Week 18: Bit Manipulation

**Basic Operations**:
- AND (&), OR (|), XOR (^)
- Left shift (<<), Right shift (>>)
- NOT (~)

**Common Tricks**:
- Check if power of 2: `(n & (n-1)) == 0`
- Toggle ith bit: `n ^ (1 << i)`
- Set ith bit: `n | (1 << i)`
- Clear ith bit: `n & ~(1 << i)`

**Problems**:
- Single number
- Number of 1 bits
- Counting bits
- Maximum XOR
- Subsets using bitmask

- **Problems**: 12 problems

---

### Week 19: Advanced Data Structures

#### Trie (Prefix Tree)
- Insert word
- Search word
- Search prefix
- **Problems**: Autocomplete, word search II

#### Disjoint Set Union (Union-Find)
- Find with path compression
- Union by rank
- **Problems**: Connected components, redundant connection

#### Monotonic Stack/Queue
- Next greater element
- Sliding window maximum
- Largest rectangle in histogram

- **Problems**: 15 problems

---

### Week 20: String Algorithms

**Pattern Matching**:
- KMP Algorithm: O(n+m)
- Rabin-Karp: Rolling hash
- Z-Algorithm

**Advanced String Problems**:
- Longest palindromic substring
- Minimum window substring
- Group shifted strings
- Text justification

- **Problems**: 10 problems

---

## Phase 6: Practice & Mastery (Weeks 21-24)

### Week 21-22: Mixed Problem Solving
- Solve 5 problems daily (Easy: 2, Medium: 2, Hard: 1)
- Focus on weak areas
- Time yourself (simulate interview conditions)

### Week 23: Mock Interviews
- 2 full mock interviews per week
- Focus on communication
- Practice explaining approach before coding

### Week 24: System Design & Final Review
- Review all data structures
- Time complexity cheat sheet
- Space complexity optimization
- Common patterns recap

---

## 📊 Daily Practice Schedule

### Morning (1 hour)
- Review theory
- Watch video explanation
- Understand one concept deeply

### Afternoon (1.5 hours)
- Implement data structure from scratch
- Code CRUD operations
- Test edge cases

### Evening (2 hours)
- Solve 2-3 problems
- One easy (warm-up)
- One medium (main practice)
- One hard (stretch goal, optional)

### Weekend
- **Saturday**: Solve 5 problems, all medium/hard
- **Sunday**: Mock interview + review week's problems

---

## 🎯 Problem Count Targets

| Difficulty | Target Count |
|------------|--------------|
| Easy | 100 problems |
| Medium | 200 problems |
| Hard | 50 problems |
| **Total** | **350 problems** |

---

## 📚 Resources by Phase

### CRUD & Fundamentals
- **Books**: "Data Structures and Algorithms in Java" by Robert Lafore
- **Platform**: GeeksforGeeks, Programiz
- **Video**: freeCodeCamp DSA course

### Algorithms
- **Books**: "Introduction to Algorithms" (CLRS)
- **Platform**: LeetCode Easy-Medium
- **Video**: Abdul Bari's algorithm playlist

### Advanced Topics
- **Books**: "Competitive Programming 3" by Steven Halim
- **Platform**: LeetCode Hard, Codeforces
- **Video**: Tushar Roy, William Fiset

---

## ✅ Weekly Review Checklist

Every Sunday, review:
- [ ] Can I implement this DS from scratch?
- [ ] Do I understand time/space complexity?
- [ ] Can I explain the approach clearly?
- [ ] Have I solved at least 10 problems this week?
- [ ] Did I revisit failed problems?

---

## 🚨 Important Tips

1. **Master CRUD First**: Don't move forward until you can implement each data structure from scratch in both Java and C++

2. **Focus on Understanding, Not Memorization**: Understand why an algorithm works

3. **Solve Problems Multiple Times**:
   - First attempt (struggle is okay)
   - Review solution if stuck > 45 mins
   - Solve again after 3 days
   - Solve again after 1 week

4. **Time Yourself**: Start timing yourself in Week 3

5. **Track Your Progress**: Maintain a spreadsheet of solved problems

6. **Don't Skip Easy Problems**: They build pattern recognition

7. **Learn to Recognize Patterns**:
   - "Find all subarrays" → Sliding window
   - "Shortest path" → BFS/Dijkstra
   - "Count ways" → DP
   - "Optimize choices" → Greedy

8. **Code Without IDE Help Initially**: Build muscle memory

9. **Explain Solutions Out Loud**: Prepares you for interviews

10. **Join a Study Group**: Accountability and different perspectives

---

## 🎖️ Milestones

- ✅ Week 4: Implement all basic DS from scratch
- ✅ Week 8: Solve 50 problems
- ✅ Week 12: Solve 100 problems
- ✅ Week 16: Complete all DP patterns
- ✅ Week 20: Solve 200 problems
- ✅ Week 24: Ready for technical interviews!

---

## 🔄 When You Feel Stuck

1. **Take a Break**: 15-min walk helps
2. **Solve Easier Problems**: Build confidence
3. **Revisit Theory**: Sometimes we miss fundamentals
4. **Ask for Help**: Stack Overflow, Discord communities
5. **Switch Languages**: Sometimes a different syntax helps understanding

---

## 🏆 Success Metrics

By Week 24, you should be able to:
- ✅ Implement any basic DS in 15 minutes
- ✅ Recognize problem patterns instantly
- ✅ Solve medium LeetCode problems in 30 minutes
- ✅ Explain your approach clearly
- ✅ Optimize your initial solution
- ✅ Handle follow-up questions confidently

---

**Remember**: Consistency > Intensity. 2 hours daily beats 14 hours on Sunday!

Good luck on your DSA journey! 🚀
