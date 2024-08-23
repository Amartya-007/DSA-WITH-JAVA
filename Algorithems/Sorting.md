# Sorting Algorithms

## 1. Introduction to Sorting Algorithms

### Definition and Importance

**Sorting** is arranging items in a specific order, usually ascending or descending. It's important because it makes searching and organizing data faster and easier.

### Types of Sorting Algorithms

- **Comparison-based:** Algorithms that sort by comparing elements with each other. Examples: Bubble Sort, Insertion Sort, Selection Sort, Merge Sort, Quick Sort, Heap Sort.
- **Non-comparison-based:** Algorithms that sort without direct comparisons. Examples: Counting Sort, Radix Sort.

---

## 2. Bubble Sort

### Algorithm Overview

Bubble Sort repeatedly compares adjacent items and swaps them if they are out of order. This process is repeated until the entire list is sorted.

- **Step-by-Step:**
  1. Start from the beginning of the list.
  2. Compare each pair of adjacent items.
  3. Swap them if the first item is greater than the second.
  4. Repeat this process for each pair until the end of the list.
  5. After each pass, the largest item "bubbles" up to its correct position.
  6. Repeat the process for the remaining items.

### Implementation in Java

```java
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        bubbleSort(arr);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
```

### Output

```
Sorted array:
11 12 22 25 64
```

### Time Complexity Analysis

- **Best Case:** O(n) (if already sorted)
- **Average Case:** O(n^2)
- **Worst Case:** O(n^2)

### Space Complexity Analysis

- **Space Complexity:** O(1) (does not need extra space)

### Use Cases and Applications

Bubble Sort is mainly used for teaching. It’s not suitable for large datasets because of its slow performance.

### Advantages and Disadvantages

- **Advantages:** Easy to understand and implement.
- **Disadvantages:** Slow for large lists due to its time complexity.

---

## 3. Insertion Sort

### Algorithm Overview

Insertion Sort builds the final sorted list one item at a time. It takes each new item and inserts it into its correct position among the previously sorted items.

- **Step-by-Step:**
  1. Start from the second item in the list.
  2. Compare it with the items before it.
  3. Insert the item into the correct position among the sorted items.
  4. Repeat for each item in the list.

### Implementation in Java

```java
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        insertionSort(arr);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
```

### Output

```
Sorted array:
11 12 22 25 64
```

### Time Complexity Analysis

- **Best Case:** O(n) (if already sorted)
- **Average Case:** O(n^2)
- **Worst Case:** O(n^2)

### Space Complexity Analysis

- **Space Complexity:** O(1) (does not need extra space)

### Use Cases and Applications

Insertion Sort works well for small or nearly sorted lists. It’s also used in hybrid algorithms where it can handle small sublists.

### Advantages and Disadvantages

- **Advantages:** Simple and efficient for small lists or nearly sorted data.
- **Disadvantages:** Inefficient for large lists.

---

## 4. Selection Sort

### Algorithm Overview

Selection Sort repeatedly finds the smallest item from the unsorted portion and moves it to the beginning of the list.

- **Step-by-Step:**
  1. Start at the beginning of the list.
  2. Find the smallest item in the unsorted part.
  3. Swap it with the first item in the unsorted part.
  4. Move the boundary between sorted and unsorted parts one step to the right.
  5. Repeat until the whole list is sorted.

### Implementation in Java

```java
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] with arr[minIndex]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
```

### Output

```
Sorted array:
11 12 22 25 64
```

### Time Complexity Analysis

- **Best Case:** O(n^2)
- **Average Case:** O(n^2)
- **Worst Case:** O(n^2)

### Space Complexity Analysis

- **Space Complexity:** O(1) (does not need extra space)

### Use Cases and Applications

Selection Sort is useful when memory writes are costly. It’s simple and requires only a small, constant amount of extra space.

### Advantages and Disadvantages

- **Advantages:** Simple and straightforward.
- **Disadvantages:** Inefficient for large lists due to its O(n^2) time complexity.

---

## 5. Merge Sort

### Algorithm Overview

Merge Sort divides the list into two halves, sorts each half, and then merges them back together.

- **Step-by-Step:**
  1. Divide the list into two halves.
  2. Recursively sort each half.
  3. Merge the two sorted halves back together.

### Implementation in Java

```java
public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
```

### Output

```
Sorted array:
11 12 22 25 64
```

### Time Complexity Analysis

- **Best Case:** O(n log n)
- **Average Case:** O(n log n)
- **Worst Case:** O(n log n)

### Space Complexity Analysis

- **Space Complexity:** O(n) (needs extra space for merging)

### Use Cases and Applications

Merge Sort is great for large lists and is stable, meaning it maintains the order of equal elements.

###

Advantages and Disadvantages

- **Advantages:** Stable and has a guaranteed O(n log n) time complexity.
- **Disadvantages:** Requires extra space for merging.

---

## 6. Quick Sort

### Algorithm Overview

Quick Sort selects a "pivot" element and partitions the list into elements less than the pivot and elements greater than the pivot. It then recursively sorts the partitions.

- **Step-by-Step:**
  1. Choose a pivot element from the list.
  2. Partition the list into elements less than the pivot and elements greater than the pivot.
  3. Recursively apply Quick Sort to the partitions.

### Implementation in Java

```java
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
```

### Output

```
Sorted array:
11 12 22 25 64
```

### Time Complexity Analysis

- **Best Case:** O(n log n)
- **Average Case:** O(n log n)
- **Worst Case:** O(n^2) (if the pivot is the smallest or largest element)

### Space Complexity Analysis

- **Space Complexity:** O(log n) (due to recursion stack)

### Use Cases and Applications

Quick Sort is fast on average and is widely used in practice. It's efficient for large datasets.

### Advantages and Disadvantages

- **Advantages:** Fast on average, in-place sorting.
- **Disadvantages:** Can be slow if the pivot is not well chosen (worst-case O(n^2)).

---

## 7. Heap Sort

### Algorithm Overview

Heap Sort builds a heap from the list and repeatedly extracts the maximum element from the heap, rebuilding the heap after each extraction.

- **Step-by-Step:**
  1. Build a max heap from the list.
  2. Swap the root (largest item) with the last item.
  3. Reduce the heap size by one and heapify the root.
  4. Repeat until the heap is empty.

### Implementation in Java

```java
public class HeapSort {
    public static void heapSort(int[] arr) {
        int n = arr.length;
        // Build heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        // Extract elements from heap
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        heapSort(arr);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
```

### Output

```
Sorted array:
11 12 22 25 64
```

### Time Complexity Analysis

- **Best Case:** O(n log n)
- **Average Case:** O(n log n)
- **Worst Case:** O(n log n)

### Space Complexity Analysis

- **Space Complexity:** O(1) (in-place sorting)

### Use Cases and Applications

Heap Sort is used when memory usage is a concern. It's efficient for large datasets.

### Advantages and Disadvantages

- **Advantages:** In-place sorting, good worst-case time complexity.
- **Disadvantages:** Not stable, slower than Quick Sort on average.

---

## 8. Performance Comparison

### Comparison of Sorting Algorithms

| Algorithm      | Best Case Time Complexity | Average Case Time Complexity | Worst Case Time Complexity | Space Complexity | Stability |
| -------------- | ------------------------- | ---------------------------- | -------------------------- | ---------------- | --------- |
| Bubble Sort    | O(n)                      | O(n^2)                       | O(n^2)                     | O(1)             | Stable    |
| Insertion Sort | O(n)                      | O(n^2)                       | O(n^2)                     | O(1)             | Stable    |
| Selection Sort | O(n^2)                    | O(n^2)                       | O(n^2)                     | O(1)             | Unstable  |
| Merge Sort     | O(n log n)                | O(n log n)                   | O(n log n)                 | O(n)             | Stable    |
| Quick Sort     | O(n log n)                | O(n log n)                   | O(n^2)                     | O(log n)         | Unstable  |
| Heap Sort      | O(n log n)                | O(n log n)                   | O(n log n)                 | O(1)             | Unstable  |

### Summary of Sorting Algorithms

- **Bubble Sort, Insertion Sort, Selection Sort:** Simple but inefficient for large lists.
- **Merge Sort, Quick Sort, Heap Sort:** More efficient for larger datasets.

---

## 9. Conclusion

### Summary of Key Points

- Sorting helps in organizing and searching data efficiently.
- Different algorithms have their own strengths and weaknesses depending on the use case.

### Choosing the Right Sorting Algorithm

- **Small Lists:** Insertion or Bubble Sort.
- **Large Lists:** Quick Sort or Merge Sort.
- **Memory Constraints:** Heap Sort.

### Further Reading and Resources

- "Introduction to Algorithms" by Cormen, Leiserson, Rivest, and Stein
- Practice on platforms like GeeksforGeeks, HackerRank.

---
