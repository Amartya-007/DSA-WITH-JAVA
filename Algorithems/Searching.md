# Algorithms - Searching

## 1. Introduction to Searching Algorithms

Searching algorithms are designed to retrieve information stored within some data structure or database. These algorithms aim to locate the position of a particular item in a collection of items. Understanding searching algorithms is crucial for optimizing performance in tasks involving large data sets.

### Why Searching is Important

- **Efficient Data Retrieval:** Searching helps in quickly locating specific data, which is essential in large datasets.
- **Application in Various Fields:** From databases to file systems and even in algorithms like AI, searching plays a key role.
- **Foundation for More Complex Algorithms:** Understanding basic search algorithms lays the groundwork for learning more complex algorithms like sorting, pathfinding, etc.

---

## 2. 🔍 Linear Search

### 2.1 Concept of Linear Search

**Linear Search** is the simplest searching algorithm that checks every element in a list sequentially until the desired element is found or the list ends.

- **Advantages:**

  - Simple and easy to implement.
  - Works on unsorted lists.

- **Disadvantages:**
  - Inefficient for large datasets as it has to check every element.
  - Time-consuming compared to other searching algorithms.

### 2.2 Linear Search Algorithm

**Algorithm:**

1. Start from the first element.
2. Compare the target element with the current element.
3. If the target matches the current element, return its position.
4. If not, move to the next element.
5. Repeat until the target is found or the list ends.

**Pseudocode:**

```java
function linearSearch(arr, target):
    for each element in arr:
        if element == target:
            return position
    return -1
```

### 2.3 Complexity Analysis

- **Time Complexity:**

  - Best Case: O(1) (Target found at the first position)
  - Average Case: O(n)
  - Worst Case: O(n) (Target not found or found at the last position)

- **Space Complexity:** O(1)

### 2.4 Use Cases and Applications

- **Small datasets:** Works efficiently for small or unsorted datasets.
- **Simple applications:** When simplicity is more important than performance.
- **Finding the first occurrence of an element in an array.**

### 2.5 Practice Problems

- **Basic Linear Search Implementation:**

  - Write a program to find the first occurrence of a number in an array using linear search.

- **Variations:**
  - Find all occurrences of an element in an array.
  - Return the index of the last occurrence.

---

## 3. 🔍 Binary Search

### 3.1 Concept of Binary Search

**Binary Search** is an efficient algorithm that works on sorted arrays by dividing the search interval in half. The idea is to eliminate half of the elements from the list at each step, thereby reducing the search time.

- **Advantages:**

  - Much faster than linear search.
  - Efficient for large datasets.

- **Disadvantages:**
  - Only works on sorted arrays.
  - Slightly more complex to implement.

### 3.2 Binary Search Algorithm

**Algorithm:**

1. Find the middle element of the array.
2. Compare the middle element with the target.
3. If the target is equal to the middle element, return its position.
4. If the target is less than the middle element, search the left half.
5. If the target is greater than the middle element, search the right half.
6. Repeat until the target is found or the search interval is empty.

**Pseudocode:**

```java
function binarySearch(arr, target):
    low = 0
    high = length(arr) - 1
    while low <= high:
        mid = (low + high) / 2
        if arr[mid] == target:
            return mid
        else if arr[mid] < target:
            low = mid + 1
        else:
            high = mid - 1
    return -1
```

### 3.3 Complexity Analysis

- **Time Complexity:**

  - Best Case: O(1) (Target is the middle element)
  - Average Case: O(log n)
  - Worst Case: O(log n) (Target not found)

- **Space Complexity:**
  - Iterative Version: O(1)
  - Recursive Version: O(log n) due to the call stack

### 3.4 Edge Cases in Binary Search

- **Handling Duplicates:** Modify the algorithm to find the first or last occurrence of a duplicate element.
- **Search in Infinite Arrays:** Adjust the boundaries dynamically to accommodate an infinite array.
- **Searching in Rotated Sorted Arrays:** Account for the rotation and search accordingly.

### 3.5 Recursive vs. Iterative Binary Search

**Recursive Binary Search** involves calling the function within itself with updated bounds, while **Iterative Binary Search** uses a loop to adjust bounds without recursion.

#### Difference Table: Recursive vs. Iterative Binary Search

| **Point of Comparison**   | **Recursive Binary Search**                                      | **Iterative Binary Search**                                 |
| ------------------------- | ---------------------------------------------------------------- | ----------------------------------------------------------- |
| **Implementation**        | Uses recursion to divide the search space                        | Uses loops to divide the search space                       |
| **Space Complexity**      | O(log n) due to the call stack                                   | O(1), as no extra space is needed                           |
| **Ease of Understanding** | More intuitive and easier to understand                          | Slightly more complex but eliminates the need for recursion |
| **Performance**           | Slower due to recursive calls                                    | Faster due to the absence of function call overhead         |
| **Use Case**              | Preferred in languages or scenarios where recursion is optimized | Preferred in scenarios where space efficiency is critical   |

### 3.6 Use Cases and Applications

- **Large sorted datasets:** Ideal for searching in large sorted arrays.
- **Optimization:** When performance is critical, especially in time-sensitive applications.
- **Finding specific elements in databases, file systems, and more.**

### 3.7 Practice Problems

- **Basic Binary Search Implementation:**

  - Write a program to find a number in a sorted array using binary search.

- **Variations:**
  - Implement both recursive and iterative versions.
  - Modify the algorithm to find the first or last occurrence of a target.

---

## 4. 🔍 Comparison: Linear Search vs. Binary Search

### 4.1 Performance Comparison

#### Difference Table: Linear Search vs. Binary Search

| **Point of Comparison**           | **Linear Search**                         | **Binary Search**                                   |
| --------------------------------- | ----------------------------------------- | --------------------------------------------------- |
| **Data Requirement**              | Works on unsorted or sorted data          | Requires sorted data                                |
| **Time Complexity**               | O(n) in all cases                         | O(log n) for average and worst cases                |
| **Space Complexity**              | O(1)                                      | O(1) for iterative, O(log n) for recursive          |
| **Ease of Implementation**        | Simple and straightforward                | More complex due to the need for sorted data        |
| **Performance on Large Datasets** | Inefficient due to linear time complexity | Highly efficient due to logarithmic time complexity |

### 4.2 Use Case Comparison

- **Linear Search:** Best used when dealing with small datasets or when the data isn't sorted.
- **Binary Search:** Preferred when working with large, sorted datasets for faster search operations.

### 4.3 Practical Examples and Benchmarks

- **Implement Both Algorithms:**
  - Write Java programs to implement both linear and binary searches.
- **Run Performance Benchmarks:**
  - Measure and compare the time taken by each algorithm on datasets of varying sizes.
  - Analyze results to understand the conditions under which each algorithm performs best.

---

## 5. Conclusion

Searching algorithms are crucial for efficient data retrieval. Linear search is simple but slow, while binary search is fast but requires sorted data. Understanding these algorithms helps in choosing the right one based on the specific use case, data size, and requirements.

---

## 6. Additional Resources

- **Books:** "Introduction to Algorithms" by Cormen et al., "Algorithms Unlocked" by Thomas H. Cormen
- **Articles:** Check out blogs and articles on GeeksforGeeks, Medium, etc.
- **Practice Platforms:** LeetCode, HackerRank, Codeforces for solving search algorithm problems.

---

---

# If you're curious about whether there are other algorithms beyond Linear and Binary Search then, `YES`, there are several notable ones. Here are a few examples:

### 1. **Jump Search**

**Jump Search** is an algorithm designed for sorted arrays. It works by jumping ahead by a fixed number of steps, rather than checking each element sequentially like in Linear Search.

- **How it Works:**

  - Jump forward by a fixed number of elements (step size).
  - If the target is greater than the current element, jump ahead again.
  - If the target is smaller, perform a linear search between the last jump position and the current position.

- **Advantages:**

  - More efficient than linear search for large datasets.
  - Reduces the number of comparisons.

- **Disadvantages:**

  - Less efficient than binary search.
  - Requires the data to be sorted.

- **Complexity:**
  - Time Complexity: O(√n)
  - Space Complexity: O(1)

**Pseudocode:**

```java
function jumpSearch(arr, target):
    step = √(length of arr)
    prev = 0
    while arr[min(step, length(arr)) - 1] < target:
        prev = step
        step += √(length of arr)
        if prev >= length(arr):
            return -1
    for i from prev to min(step, length(arr)):
        if arr[i] == target:
            return i
    return -1
```

### 2. **Interpolation Search**

**Interpolation Search** is an improvement over binary search for instances where the values in a sorted array are uniformly distributed.

- **How it Works:**

  - Instead of using the middle element, it estimates the position of the target based on its value relative to the start and end elements.
  - The formula used to estimate the position is:
    \[
    \text{pos} = \text{low} + \left(\frac{(\text{target} - \text{arr[low]})}{(\text{arr[high]} - \text{arr[low]})}\right) \times (\text{high} - \text{low})
    \]
  - The search continues like binary search, adjusting the low and high bounds.

- **Advantages:**

  - Potentially faster than binary search for uniformly distributed data.
  - Reduces the number of comparisons when data is uniformly distributed.

- **Disadvantages:**

  - Performance degrades when the distribution is non-uniform.
  - Requires the data to be sorted.

- **Complexity:**
  - Average Case Time Complexity: O(log log n)
  - Worst Case Time Complexity: O(n)
  - Space Complexity: O(1)

**Pseudocode:**

```java
function interpolationSearch(arr, target):
    low = 0
    high = length(arr) - 1
    while low <= high and target >= arr[low] and target <= arr[high]:
        pos = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low])
        if arr[pos] == target:
            return pos
        if arr[pos] < target:
            low = pos + 1
        else:
            high = pos - 1
    return -1
```

### 3. **Exponential Search**

**Exponential Search** is used for unbounded or infinite arrays. It starts with a small range and exponentially increases the range until it finds the target or a range where the target might exist, then switches to binary search.

- **How it Works:**

  - Start with a range of 1.
  - Double the range size until the end of the array is reached or the target is found within the range.
  - Perform binary search in the identified range.

- **Advantages:**

  - Efficient for unbounded arrays.
  - Reduces the number of comparisons in large arrays.

- **Disadvantages:**

  - Requires the data to be sorted.

- **Complexity:**
  - Time Complexity: O(log n)
  - Space Complexity: O(1)

**Pseudocode:**

```java
function exponentialSearch(arr, target):
    if arr[0] == target:
        return 0
    i = 1
    while i < length(arr) and arr[i] <= target:
        i = i * 2
    return binarySearch(arr, target, i/2, min(i, length(arr)-1))
```

### 4. **Fibonacci Search**

**Fibonacci Search** is similar to binary search but uses Fibonacci numbers to divide the array into sections. It is useful for optimizing searches in large datasets.

- **How it Works:**

  - Divide the array into Fibonacci sections.
  - Compare the target with the element at the Fibonacci position.
  - If the target is smaller, the search continues in the left section.
  - If the target is larger, the search continues in the right section.

- **Advantages:**

  - Efficient for large, sorted datasets.
  - Avoids the use of division and performs comparisons using addition and subtraction.

- **Disadvantages:**

  - Requires the data to be sorted.
  - Slightly more complex to implement than binary search.

- **Complexity:**
  - Time Complexity: O(log n)
  - Space Complexity: O(1)

**Pseudocode:**

```java
function fibonacciSearch(arr, target):
    fib2 = 0
    fib1 = 1
    fibM = fib2 + fib1
    while (fibM < length(arr)):
        fib2 = fib1
        fib1 = fibM
        fibM = fib2 + fib1
    offset = -1
    while (fibM > 1):
        i = min(offset + fib2, length(arr) - 1)
        if arr[i] < target:
            fibM = fib1
            fib1 = fib2
            fib2 = fibM - fib1
            offset = i
        else if arr[i] > target:
            fibM = fib2
            fib1 = fib1 - fib2
            fib2 = fibM - fib1
        else:
            return i
    if fib1 and arr[offset + 1] == target:
        return offset + 1
    return -1
```

### 5. **Ternary Search**

**Ternary Search** is a divide-and-conquer algorithm similar to binary search, but it divides the array into three parts instead of two.

- **How it Works:**

  - Split the array into three parts.
  - Compare the target with the two midpoints.
  - If the target is smaller, search the left third; if it's in between, search the middle third; if it's larger, search the right third.

- **Advantages:**

  - Potentially faster than binary search in some cases.
  - Can reduce the number of comparisons.

- **Disadvantages:**

  - More complex than binary search.
  - Requires the data to be sorted.

- **Complexity:**
  - Time Complexity: O(log3 n)
  - Space Complexity: O(1)

**Pseudocode:**

```java
function ternarySearch(arr, target, low, high):
    if high >= low:
        mid1 = low + (high - low) / 3
        mid2 = high - (high - low) / 3
        if arr[mid1] == target:
            return mid1
        if arr[mid2] == target:
            return mid2
        if target < arr[mid1]:
            return ternarySearch(arr, target, low, mid1-1)
        else if target > arr[mid2]:
            return ternarySearch(arr, target, mid2+1, high)
        else:
            return ternarySearch(arr, target, mid1+1, mid2-1)
    return -1
```

---

These additional searching algorithms are more specialized and optimized for certain scenarios.
