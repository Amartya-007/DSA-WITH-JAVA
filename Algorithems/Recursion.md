# Recursion in Java

## 1. Introduction to Recursion

### 1.1 What is Recursion?

Recursion is a programming technique where a function calls itself to solve smaller instances of the same problem. It is widely used in situations where a problem can be broken down into smaller subproblems that resemble the original problem.

### 1.2 How Recursion Works

In recursion, a problem is divided into subproblems. Each recursive call works on a smaller part of the problem until it reaches the simplest case, known as the base case. When the base case is reached, the recursion stops, and the function starts returning results, unwinding the recursive calls.

#### Base Case and Recursive Case

- **Base Case**: The simplest instance of the problem, which can be solved directly without further recursion.
- **Recursive Case**: The part of the problem that reduces the complexity of the problem, moving it towards the base case.

#### Call Stack Mechanism

Each time a recursive function is called, the current state of the function (including variables and the point of execution) is pushed onto the call stack. When the base case is reached, the function starts returning, and the call stack unwinds.

### 1.3 Types of Recursion

There are several types of recursion based on how the function calls itself:

- **Direct Recursion**: The function directly calls itself.
- **Indirect Recursion**: The function calls another function, which in turn calls the original function.
- **Tail Recursion**: The recursive call is the last statement in the function.
- **Non-tail Recursion**: There are additional operations after the recursive call.

## 2. Recursion vs Iteration

### 2.1 Comparison of Recursion and Iteration

Recursion and iteration are both techniques used to repeat a set of instructions, but they differ in their approach and performance.

| Aspect           | Recursion                                    | Iteration                     |
| ---------------- | -------------------------------------------- | ----------------------------- |
| **Approach**     | Function calls itself                        | Loop structure (for, while)   |
| **Memory Usage** | Uses more memory due to call stack           | Less memory-intensive         |
| **Complexity**   | Sometimes more intuitive for problem-solving | More straightforward          |
| **Performance**  | Can be less efficient due to overhead        | Generally more efficient      |
| **Use Cases**    | Suitable for divide-and-conquer problems     | Suitable for repetitive tasks |

### 2.2 Converting Recursion to Iteration

In some cases, recursive algorithms can be converted to iterative ones. This can improve performance by eliminating the overhead associated with recursive calls. Common techniques include using loops and manually managing a stack.

## 3. Classic Recursion Problems

### 3.1 Factorial of a Number

#### 3.1.1 Problem Statement

Calculate the factorial of a non-negative integer `n`, denoted as `n!`, which is the product of all positive integers less than or equal to `n`.

#### 3.1.2 Recursive Solution

The factorial of a number can be defined recursively as:

- Base Case: `factorial(0) = 1`
- Recursive Case: `factorial(n) = n * factorial(n-1)`

```java
public int factorial(int n) {
    if (n == 0) return 1; // Base case
    return n * factorial(n - 1); // Recursive case
}
```

#### 3.1.3 Dry Run and Trace

For `n = 4`:

- `factorial(4)` calls `factorial(3)`
- `factorial(3)` calls `factorial(2)`
- `factorial(2)` calls `factorial(1)`
- `factorial(1)` calls `factorial(0)`
- `factorial(0)` returns `1`, and then the stack starts unwinding:
  - `factorial(1)` returns `1 * 1 = 1`
  - `factorial(2)` returns `2 * 1 = 2`
  - `factorial(3)` returns `3 * 2 = 6`
  - `factorial(4)` returns `4 * 6 = 24`

#### 3.1.4 Time and Space Complexity Analysis

- **Time Complexity**: `O(n)` since the function is called `n` times.
- **Space Complexity**: `O(n)` due to the call stack usage.

#### 3.1.5 Comparison with Iterative Approach

| Aspect              | Recursive Factorial                               | Iterative Factorial                   |
| ------------------- | ------------------------------------------------- | ------------------------------------- |
| **Code Simplicity** | More intuitive, resembles mathematical definition | More verbose, uses loops              |
| **Performance**     | May cause stack overflow for large `n`            | More efficient, avoids stack overflow |
| **Memory Usage**    | Higher due to recursive calls                     | Lower, uses constant space            |

### 3.2 Fibonacci Series

#### 3.2.1 Problem Statement

Generate the `n`th Fibonacci number, where each number is the sum of the two preceding ones, starting with `0` and `1`.

#### 3.2.2 Recursive Solution

The Fibonacci sequence can be defined recursively as:

- Base Case: `fibonacci(0) = 0`, `fibonacci(1) = 1`
- Recursive Case: `fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)`

```java
public int fibonacci(int n) {
    if (n == 0) return 0; // Base case
    if (n == 1) return 1; // Base case
    return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
}
```

#### 3.2.3 Dry Run and Trace

For `n = 4`:

- `fibonacci(4)` calls `fibonacci(3)` and `fibonacci(2)`
- `fibonacci(3)` calls `fibonacci(2)` and `fibonacci(1)`
- `fibonacci(2)` calls `fibonacci(1)` and `fibonacci(0)`
- The base cases return their values, and the function starts returning:
  - `fibonacci(2)` returns `1 + 0 = 1`
  - `fibonacci(3)` returns `1 + 1 = 2`
  - `fibonacci(4)` returns `2 + 1 = 3`

#### 3.2.4 Time and Space Complexity Analysis

- **Time Complexity**: `O(2^n)` due to the exponential growth of recursive calls.
- **Space Complexity**: `O(n)` due to the depth of the recursion tree.

#### 3.2.5 Optimization Techniques

- **Memoization**: Store the results of subproblems to avoid redundant calculations, reducing time complexity to `O(n)`.
- **Dynamic Programming**: Build the solution iteratively from the bottom up, further improving efficiency.

#### 3.2.6 Comparison with Iterative Approach

| Aspect              | Recursive Fibonacci                   | Iterative Fibonacci       |
| ------------------- | ------------------------------------- | ------------------------- |
| **Time Complexity** | `O(2^n)` (without optimization)       | `O(n)`                    |
| **Memory Usage**    | High, due to multiple recursive calls | Lower, uses a simple loop |
| **Optimization**    | Can be optimized using memoization    | Already optimized         |

### 3.3 Tower of Hanoi

#### 3.3.1 Problem Statement

Solve the Tower of Hanoi puzzle, where you have to move `n` disks from the source rod to the destination rod, following specific rules.

#### 3.3.2 Recursive Solution

The Tower of Hanoi can be solved using recursion:

- Base Case: Move one disk directly from the source to the destination.
- Recursive Case: Move `n-1` disks from the source to an auxiliary rod, move the `n`th disk to the destination, then move the `n-1` disks from the auxiliary rod to the destination.

```java
public void towerOfHanoi(int n, char source, char destination, char auxiliary) {
    if (n == 1) {
        System.out.println("Move disk 1 from " + source + " to " + destination);
        return;
    }
    towerOfHanoi(n - 1, source, auxiliary, destination);
    System.out.println("Move disk " + n + " from " + source + " to " + destination);
    towerOfHanoi(n - 1, auxiliary, destination, source);
}
```

#### 3.3.3 Dry Run and Trace

For `n = 3`, the steps will be:

1. Move 2 disks from `source` to `auxiliary`.
2. Move the 3rd disk from `source` to `destination`.
3. Move 2 disks from `auxiliary` to `destination`.

#### 3.3.4 Time and Space Complexity Analysis

- **Time Complexity**: `O(2^n)`, exponential growth as the number of disks increases.
- **Space Complexity**: `O(n)`, proportional to the number of disks due to recursion depth.

#### 3.3.5 Applications of Tower of Hanoi

The Tower of Hanoi is often used to teach recursion and is a classic example of the divide-and-conquer approach. It also has applications in algorithm analysis and parallel computing.

## 4.

Advanced Recursion Concepts

### 4.1 Recursive Backtracking

Recursive backtracking is a technique used to solve problems that require exploring all possible configurations, such as the N-Queens problem or Sudoku solver. It involves choosing an option, exploring further, and backtracking if the option leads to a dead end.

### 4.2 Divide and Conquer Approach

The divide-and-conquer approach involves dividing a problem into smaller subproblems, solving them recursively, and combining their solutions to solve the original problem. Examples include Merge Sort and Quick Sort.

### 4.3 Tail Recursion Optimization

Tail recursion occurs when the recursive call is the last statement in the function. Some compilers can optimize tail recursion to avoid stack overflow by reusing the current function's stack frame for the next recursive call.

## 5. Common Pitfalls in Recursion

### 5.1 Infinite Recursion

Infinite recursion occurs when the base case is not properly defined or unreachable, causing the function to call itself indefinitely. This leads to a stack overflow.

### 5.2 Stack Overflow

A stack overflow occurs when the call stack exceeds its limit due to excessive recursive calls. To avoid this, ensure that the recursion depth is manageable and consider iterative solutions for deeply recursive problems.

### 5.3 Performance Issues

Recursive solutions can be less efficient than iterative ones due to overhead from function calls and the risk of stack overflow. Optimizing recursion or using iteration can mitigate these issues.

## 6. Practice Problems

### 6.1 Classic Recursion Problems

- **Reverse a String Recursively**: Write a recursive function to reverse a given string.
- **Find the Greatest Common Divisor (GCD)**: Implement the Euclidean algorithm recursively to find the GCD of two numbers.
- **Print All Permutations of a String**: Write a recursive function to generate all permutations of a string.

### 6.2 Advanced Recursion Problems

- **Solve the N-Queens Problem**: Place `n` queens on an `n x n` chessboard such that no two queens threaten each other.
- **Recursive Binary Search**: Implement binary search recursively to find an element in a sorted array.
- **Generate All Possible Subsets of a Set**: Write a recursive function to generate all subsets of a given set.

## 7. Summary and Recap

### 7.1 Key Takeaways from Recursion

Recursion is a powerful tool for solving problems that can be broken down into smaller subproblems. It is essential to understand the base case, recursive case, and how the call stack works.

### 7.2 When to Use Recursion

Recursion is best used when the problem has a natural recursive structure, such as tree traversal, combinatorial problems, or problems that can be divided into smaller subproblems.

### 7.3 Recap of Solved Problems

Review the classic problems like factorial, Fibonacci, and Tower of Hanoi, along with more advanced problems like N-Queens and binary search.

## 8. Additional Resources

### 8.1 Books and Online Articles

- _Introduction to Algorithms_ by Cormen, Leiserson, Rivest, and Stein
- _The Art of Computer Programming_ by Donald Knuth
- Online tutorials from platforms like GeeksforGeeks and HackerRank

### 8.2 Practice Websites

- [LeetCode](https://leetcode.com/)
- [HackerRank](https://www.hackerrank.com/)
- [GeeksforGeeks](https://www.geeksforgeeks.org/)
