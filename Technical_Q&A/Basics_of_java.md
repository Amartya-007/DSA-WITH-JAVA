# Java Basics - Technical Questions and Answers

## Java Syntax and Fundamentals

1. **Question:** What is a variable in Java?

   **Answer:** A variable is a container that stores data values. You must declare its type before using it.

---

2. **Question:** How do you declare and initialize an `int` variable in Java?

   **Answer:** `int number = 10;`

---

3. **Question:** What is the difference between `int` and `float` data types?

   **Answer:** `int` is used for whole numbers, while `float` is used for numbers with decimals.

---

4. **Question:** What are the logical operators in Java?

   **Answer:** Logical operators include `&&` **(AND)**, `||` **(OR)**, `!` **(NOT)**.

---

5. **Question:** How do you take user input in Java?

   **Answer:** Use `Scanner` class: `Scanner scanner = new Scanner(System.in);` and `int number = scanner.nextInt();`

---

6. **Question:** What does `System.out.println()` do?

   **Answer:** It prints text to the console followed by a new line.

---

7. **Question:** What is an identifier in Java?

   **Answer:** An identifier is a name used to identify a variable, method, class, or any other user-defined item.

---

8. **Question:** What are the common data types in Java?

   **Answer:** Common data types include `int`, `float`, `double`, `char`, and `boolean`.

---

9. **Question:** How do you perform addition in Java?

   **Answer:** Use the `+` operator: `int result = 5 + 3;`

---

10. **Question:** What is the purpose of `//` in Java?

    **Answer:** `//` starts a single-line comment in Java.

---

## Control Flow

11. **Question:** How does an `if-else` statement work in Java?

    **Answer:** It executes one block of code if the condition is true, and another block if it is false.

---

12. **Question:** How do you write a `for` loop to print numbers from 1 to 5?

    **Answer:**

    ```java
    for (int i = 1; i <= 5; i++) {
        System.out.println(i);
    }
    ```

---

13. **Question:** What is the difference between `while` and `do-while` loops?

    **Answer:** `while` checks the condition before executing the loop, while `do-while` checks the condition after executing the loop at least once.

---

14. **Question:** How do you use a `switch` statement in Java?

    **Answer:**

    ```java
    int day = 3;
    switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        default:
            System.out.println("Invalid day");
    }
    ```

---

15. **Question:** How can you break out of a loop early in Java?

    **Answer:** Use the `break` statement.

---

16. **Question:** What is the purpose of the `continue` statement in a loop?

    **Answer:** It skips the current iteration and moves to the next iteration of the loop.

---

17. **Question:** How do you print a pattern using nested loops?

    **Answer:**

    ```java
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    ```

---

18. **Question:** What is the output of the following code?
    ```java
    int i = 10;
    if (i > 5) {
        System.out.println("Greater");
    } else {
        System.out.println("Smaller");
    }
    ```
    **Answer:** `Greater`

---

19. **Question:** How do you use a `for-each` loop to iterate over an array?

    **Answer:**

    ```java
    int[] numbers = {1, 2, 3, 4, 5};
    for (int num : numbers) {
        System.out.println(num);
    }
    ```

---

20. **Question:** What is a ternary operator in Java?

    **Answer:** A shorthand for `if-else` statement: `int result = (a > b) ? a : b;`

---

## Methods

21. **Question:** How do you declare a method that returns an `int` value?

    **Answer:**

    ```java
    public int add(int a, int b) {
        return a + b;
    }
    ```

---

22. **Question:** What is the purpose of the `void` keyword in method declaration?

    **Answer:** It specifies that the method does not return a value.

---

23. **Question:** How do you call a method named `printMessage`?

    **Answer:** `printMessage();`

---

24. **Question:** What is recursion in Java?

    **Answer:** Recursion is when a method calls itself to solve a problem.

---

25. **Question:** How do you write a recursive method to calculate the factorial of a number?

    **Answer:**

    ```java
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    ```

---

26. **Question:** What are method parameters and return types?

    **Answer:** Parameters are inputs to the method, and return types are the data types of the value the method returns.

---

27. **Question:** How do you overload a method in Java?

    **Answer:** By defining multiple methods with the same name but different parameter lists.

---

28. **Question:** What is the difference between a method and a constructor?

    **Answer:** A method performs an action, while a constructor initializes objects.

---

29. **Question:** How do you define a method with multiple parameters?

    **Answer:**

    ```java
    public void display(int a, String b) {
        // code
    }
    ```

---

30. **Question:** What is the base case in recursion?

    **Answer:** The condition under which the recursive method stops calling itself.

---

## Arrays

31. **Question:** How do you declare an array of `int` in Java?

    **Answer:** `int[] numbers;`

---

32. **Question:** How do you initialize an array with 5 elements?

    **Answer:** `int[] numbers = new int[5];`

---

33. **Question:** How do you access the third element of an array?

    **Answer:** `int value = array[2];`

---

34. **Question:** How do you find the largest element in an array?

    **Answer:**

    ```java
    int[] numbers = {3, 5, 7, 2, 8};
    int max = numbers[0];
    for (int num : numbers) {
        if (num > max) {
            max = num;
        }
    }
    ```

---

35. **Question:** How do you reverse an array?

    **Answer:**

    ```java
    int[] array = {1, 2, 3, 4, 5};
    for (int i = 0; i < array.length / 2; i++) {
        int temp = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - 1 - i] = temp;
    }
    ```

---

36. **Question:** How do you declare a 2D array in Java?

    **Answer:** `int[][] matrix;`

---

37. **Question:** How do you initialize a 2D array with values?

    **Answer:**

    ```java
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    ```

---

38. **Question:** How do you access a specific element in a 2D array?

    **Answer:** `int value = matrix[row][column];`

---

39. **Question:** How do you find the sum of all elements in an array?

    **Answer:**

    ```java
    int[] array = {1, 2, 3, 4, 5};
    int sum = 0;
    for (int num : array) {
        sum += num;
    }
    ```

---

40. **Question:** How do you declare and initialize an array with predefined values in one line?

    **Answer:** `int[] numbers = {1, 2, 3, 4, 5};`

---
