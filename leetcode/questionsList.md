Revise Map, hasmap and tree map
Get familiar with insertion, updation, deletion, traversing a map(Java).(if doing in any other language learn ordered and unordered map)

Write a function which takes int n as input and returns nth fibonacci series
Write a function which takes int n as input and returns its factorial
Write a function which takes int n as input and returns an array of all its factors. O(squareRoo(n))

Find time complexities of following functions in Big O notation

//what is the time complexity of these function?
//think-> write samples(dry run)
// make counter in core part of function, increment it and
//see pattern(can be used in starting but dry run is preffered for learning)

    public static void tc1(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n ;i++){


            for(int j=0; j<2; j++){
                int a =2+3;
            }
        }
    }


    public static void tc2(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n ;i++){
            if(i%2){
                break;
            }
            for(int j=0; j<n*n; j++){
                int a =2+3;
            }
        }
    }

public static void tc3(int arr[]){
int n = arr.length;
for(int i = 0;i<n ;i++){

            for(int j=0; j< n; j++){


                for(int k =0;k<n/2;k++){
                    if(k+j>1){
                        break;
                    }
                }
            }
        }
    }


     public static void tc4(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n*n ;i++){
            if(i%2 == 0){
                break;
            }
            for(int j=0; j<n*n; j++){
                int a =2+3;
            }
        }
    }

All the following problems dont require any data structures and are good for reasoning, solve as many as you can, think of approaches for the rest.
General strategy to solve a problem

1. Understand the problem, read it.
2. See samples, then verify you understood the problem clearly.
3. Come up with a solution, try on sample, dry run(do with pen paper)
4. Code it and submit, if fails, think and repeat.

Try for around 20-30 mins, if not getting soln, see hints, think, again after 20-30 mins, go to discussion, see approaches and try to get them, then see solution.

The journey at arriving a solution is as important as understanding the solution, as it enhances problem solving ability.

The following problems can be solved with prior knowledge.

LeetCode:

No 1 -> two sum
No 242-> valid anagram -> will discuss on 4 sep
No 53 -> maximum subarrary, good problem(tricky)
No 58 -> length of last word -> will discuss on 4 sep
No 27 -> remove element -> will discuss on 4 sep
no 205 -> isomorphic string
no 191 -> no of 1 bits
no 125 -> valid palindrome
no 977 -> Squares of sorted array
no 283 -> Move zeroes
no 724 -> find pivot index
no 136 -> single no, tricky as required, use maps for it.
no 448 ->find all numbers disappeared in an array
no 680 -> find all no disappeareddisappared in an array
no 682
No 344
No 1207
No 3304
No 26
No 443. String Compression (similar to problem that came in recent hackathon)

Step 1 solve, step 2 optimise

Part 2.
Matrix problems: 21. No 54. Spiral Matrix 22. No 48. Rotate Image 23. LC No 79 24. 88. Merge Sorted Array 25. Find all paths in a grid (Lc problem 62, with simple recursion it will give Time limit exceeded, but that's our aim for now) 26. Lc problem 733. Flood Fill 27. Lc problem 79 word search 28. Lc No 46. Permutations 29. 912. Sort an Array (merge/quicksort) 30. 680. Valid Palindrome II 31. 5. Longest Palindromic Substring 32. 14. Longest Common Prefix 33. 9. Palindrome Number 34. 51. N-Queens 35. 20. Valid Parentheses 36. 22. Generate Parentheses 37. 28. Find the Index of the First Occurrence in a String 38. 36. Valid Sudoku

Implement Linked List your self, adding node, deleting node, making connections, printing etc, do it yourself from scratch.
When a problem is asked on LL, how one makes and breaks connections is seen, how many traversals we need to make(yes, here single traversal or more traversal is considered important)

39. Reverse Linked List - LeetCode
    40.Delete Node in a Linked List - LeetCode
40. Remove Linked List Elements - LeetCode
41. Palindrome Linked List - LeetCode
42. Linked List Cycle - LeetCode
43. Rotate List - LeetCode
44. Remove Nth Node From End of List - LeetCode
45. Add Two Numbers - LeetCode
46. Reverse Linked List II - LeetCode

47. Largest Triangle Area - LeetCode
48. Transform Array to All Equal Elements - Submission Detail - LeetCode
    50.First Unique Character in a String - LeetCode
49. 258 Add Digits - LeetCode

50. 2974 Minimum Number Game - LeetCode
51. 1832 Check if the Sentence Is Pangram - LeetCode
52. 2114 Maximum Number of Words Found in Sentences - LeetCode
53. 977 Squares of a Sorted Array - LeetCode
54. 3019 Number of Changing Keys - LeetCode
55. 1672 Richest Customer Wealth - LeetCode
56. 3232 Find if Digit Game Can Be Won - LeetCode
57. 682 Baseball Game - LeetCode

58. Stock span problem | Practice | GeeksforGeeks
59. 496 Next Greater Element I - LeetCode
60. 497 Find the Town Judge - LeetCode
61. Backspace String Compare - LeetCode
62. 150 Evaluate Reverse Polish Notation - LeetCode
63. 1598 Crawler Log Folder - LeetCode
64. 225 Implement Stack using Queues - LeetCode
65. 232 Implement Queue using Stacks - LeetCode
66. 2357. Make Array Zero by Subtracting Equal Amounts
