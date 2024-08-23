# Java Basics - Technical Questions and Answers

## Java Syntax and Fundamentals

1. **Question:** What is a variable in Java?

   **Answer:** A variable is a container that holds data that can be changed during program execution. You must declare its type before using it. For example:

   ```java
   int age = 25; // 'age' is a variable of type 'int' holding the value 25.
   ```

---

2. **Question:** How do you declare and initialize an `int` variable in Java?

   **Answer:** To declare and initialize an `int` variable, you specify the type `int`, followed by the variable name and the initial value. For example:

   ```java
   int number = 10; // Declares an integer variable 'number' and initializes it with the value 10.
   ```

---

3. **Question:** What is the difference between `int` and `float` data types?

   **Answer:** `int` is used to represent whole numbers without decimals, while `float` is used to represent numbers with fractional parts. For example:

   ```java
   int count = 100; // Integer value
   float price = 19.99f; // Floating-point value
   ```

---

4. **Question:** What are the logical operators in Java?

   **Answer:** Logical operators are used to combine boolean expressions. They include:

   - `&&` (AND): Returns true if both conditions are true.
   - `||` (OR): Returns true if at least one condition is true.
   - `!` (NOT): Returns true if the condition is false.

   ```java
   boolean result = (5 > 3) && (2 < 4); // result is true
   ```

---

5. **Question:** How do you take user input in Java?

   **Answer:** To take user input, you use the `Scanner` class. Create a `Scanner` object and use its methods to read input. For example:

   ```java
   import java.util.Scanner;

   Scanner scanner = new Scanner(System.in); // Create a Scanner object
   System.out.print("Enter a number: ");
   int number = scanner.nextInt(); // Read an integer input from the user
   ```

---

6. **Question:** What does `System.out.println()` do?

   **Answer:** `System.out.println()` prints a line of text to the console and moves the cursor to the next line. For example:

   ```java
   System.out.println("Hello, World!"); // Prints "Hello, World!" and moves to the next line.
   ```

---

7. **Question:** What is an identifier in Java?

   **Answer:** An identifier is a name used to identify a variable, method, class, or any other user-defined item. Identifiers must start with a letter, underscore, or dollar sign, and can be followed by letters, digits, or underscores. For example:

   ```java
   int userAge; // 'userAge' is an identifier for an integer variable.
   ```

---

8. **Question:** What are the common data types in Java?

   **Answer:** Common data types in Java include:

   - `int`: For whole numbers (e.g., `int age = 30;`)
   - `float`: For floating-point numbers (e.g., `float height = 5.9f;`)
   - `double`: For double-precision floating-point numbers (e.g., `double salary = 75000.50;`)
   - `char`: For single characters (e.g., `char grade = 'A';`)
   - `boolean`: For true/false values (e.g., `boolean isActive = true;`)

---

9. **Question:** How do you perform addition in Java?

   **Answer:** To perform addition, use the `+` operator. For example:

   ```java
   int a = 5;
   int b = 3;
   int sum = a + b; // sum will be 8
   ```

---

10. **Question:** What is the purpose of `//` in Java?

    **Answer:** `//` is used to write single-line comments. Anything following `//` on that line is ignored by the compiler. For example:

    ```java
    // This is a single-line comment
    int x = 10; // 'x' is initialized with 10
    ```

---

## Control Flow

11. **Question:** How does an `if-else` statement work in Java?

    **Answer:** An `if-else` statement executes one block of code if the condition is true and another block if it is false. For example:

    ```java
    int number = 10;
    if (number > 5) {
        System.out.println("Number is greater than 5.");
    } else {
        System.out.println("Number is 5 or less.");
    }
    ```

---

12. **Question:** How do you write a `for` loop to print numbers from 1 to 5?

    **Answer:** Use a `for` loop with a loop control variable to iterate and print numbers. For example:

    ```java
    for (int i = 1; i <= 5; i++) {
        System.out.println(i); // Prints numbers from 1 to 5
    }
    ```

---

13. **Question:** What is the difference between `while` and `do-while` loops?

    **Answer:** A `while` loop checks the condition before executing the loop body, while a `do-while` loop executes the body at least once before checking the condition. For example:

    ```java
    // while loop
    int i = 1;
    while (i <= 5) {
        System.out.println(i++);
    }

    // do-while loop
    int j = 1;
    do {
        System.out.println(j++);
    } while (j <= 5);
    ```

---

14. **Question:** How do you use a `switch` statement in Java?

    **Answer:** A `switch` statement selects one of many code blocks to execute. For example:

    ```java
    int day = 3;
    switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        default:
            System.out.println("Invalid day");
    }
    ```

---

15. **Question:** How can you break out of a loop early in Java?

    **Answer:** Use the `break` statement to exit a loop before it finishes all iterations. For example:

    ```java
    for (int i = 1; i <= 10; i++) {
        if (i == 5) {
            break; // Exits the loop when i is 5
        }
        System.out.println(i);
    }
    ```

---

16. **Question:** What is the purpose of the `continue` statement in a loop?

    **Answer:** The `continue` statement skips the current iteration of the loop and proceeds to the next iteration. For example:

    ```java
    for (int i = 1; i <= 5; i++) {
        if (i == 3) {
            continue; // Skips the rest of the loop when i is 3
        }
        System.out.println(i);
    }
    ```

---

17. **Question:** How do you print a pattern using nested loops?

    **Answer:** Use nested loops to control the number of rows and columns for pattern printing. For example, to print a right triangle:

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
    **Answer:** `Greater` because `i` is 10, which is greater than 5.

---

19. **Question:** How do you use a `for-each` loop to iterate over an array?

    **Answer:** The `for-each` loop simplifies array iteration by automatically accessing each element. For example:

    ```java
    int[] numbers = {1, 2, 3, 4, 5};
    for (int num : numbers) {
        System.out.println(num); // Prints each element in the array
    }
    ```

---

20. **Question:** What is a ternary operator in Java?

    **Answer:** A ternary operator is a shorthand for an `if-else` statement. It has the form `condition ? ifTrue : ifFalse`. For example:

    ```java
    int a = 10;
    int b = 20;
    int max = (a > b) ? a : b; // max will be 20
    ```

---

## Methods

21. **Question:** How do you declare a method that returns an `int` value?

    **Answer:** To declare a method that returns an `int`, specify the return type `int`, followed by the method name and parameters. For example:

    ```java
    public int add(int a, int b) {
        return a + b; // Returns the sum of a and b
    }
    ```

---

22. **Question:** What is the purpose of the `void` keyword in method declaration?

    **Answer:** The `void` keyword indicates that the method does not return any value. For example:

    ```java
    public void printMessage() {
        System.out.println("Hello, World!"); // Prints a message but returns nothing
    }
    ```

---

23. **Question:** How do you call a method named `printMessage`?

    **Answer:** To call a method, use its name followed by parentheses. For example:

    ```java
    printMessage(); // Calls the method 'printMessage'
    ```

---

24. **Question:** What is recursion in Java?

    **Answer:** Recursion occurs when a method calls itself to solve a problem in smaller chunks. It usually requires a base case to terminate the recursive calls. For example:

    ```java
    public int factorial(int n) {
        if (n == 1) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }
    ```

---

25. **Question:** How do you write a recursive method to calculate the factorial of a number?

    **Answer:** The factorial of a number can be computed recursively by multiplying the number by the factorial of the number minus one. For example:

    ```java
    public int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }
    ```

---

26. **Question:** What are method parameters and return types?

    **Answer:** Parameters are the inputs provided to a method, and the return type specifies the type of value the method will return. For example:

    ```java
    public int multiply(int x, int y) {
        return x * y; // Parameters: x, y; Return type: int
    }
    ```

---

27. **Question:** How do you overload a method in Java?

    **Answer:** Method overloading involves defining multiple methods with the same name but different parameter lists. For example:

    ```java
    public void display(int a) {
        System.out.println(a);
    }

    public void display(String b) {
        System.out.println(b);
    }
    ```

---

28. **Question:** What is the difference between a method and a constructor?

    **Answer:** A method performs a specific action, while a constructor initializes a new object. Methods have a return type and can be called multiple times, whereas constructors do not have a return type and are called once when an object is created.

---

29. **Question:** How do you define a method with multiple parameters?

    **Answer:** To define a method with multiple parameters, list the parameters in parentheses, separated by commas. For example:

    ```java
    public void display(int a, String b) {
        System.out.println("Integer: " + a + ", String: " + b);
    }
    ```

---

30. **Question:** What is the base case in recursion?

    **Answer:** The base case is a condition in a recursive method that stops further recursive calls and prevents infinite recursion. For example:

    ```java
    public int factorial(int n) {
        if (n == 1) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }
    ```

---

## Arrays

31. **Question:** How do you declare an array of `int` in Java?

    **Answer:** To declare an array of `int`, specify the type `int` followed by square brackets. For example:

    ```java
    int[] numbers; // Declares an array of integers
    ```

---

32. **Question:** How do you initialize an array with 5 elements?

    **Answer:** To initialize an array with 5 elements, use the `new` keyword with the array size. For example:

    ```java
    int[] numbers = new int[5]; // Initializes an array with 5 integer elements
    ```

---

33. **Question:** How do you access the third element of an array?

    **Answer:** To access an element in an array, use its index. Array indices start at 0. For example:

    ```java
    int[] numbers = {10, 20, 30, 40, 50};
    int thirdElement = numbers[2]; // Accesses the third element (30)
    ```

---

34. **Question:** How do you find the largest element in an array?

    **Answer:** Iterate through the array, comparing each element to find the maximum value. For example:

    ```java
    int[] numbers = {3, 5, 7, 2, 8};
    int max = numbers[0];
    for (int num : numbers) {
        if (num > max) {
            max = num;
        }
    }
    System.out.println("Largest element: " + max);
    ```

---

35. **Question:** How do you reverse an array?

    **Answer:** Swap the elements from the beginning and end, moving towards the center. For example:

    ```java
    int[] array = {1, 2, 3, 4, 5};
    for (int i = 0; i < array.length / 2; i++) {
        int temp = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - 1 - i] = temp;
    }
    System.out.println(Arrays.toString(array)); // Prints the reversed array
    ```

---

36. **Question:** How do you declare a 2D array in Java?

    **Answer:** To declare a 2D array, specify the type followed by two sets of square brackets. For example:

    ```java
    int[][] matrix; // Declares a 2D array of integers
    ```

---

37. **Question:** How do you initialize a 2D array with values?

    **Answer:** To initialize a 2D array with values, use nested curly braces. For example:

    ```java
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    ```

---

38. **Question:** How do you access a specific element in a 2D array?

    **Answer:** Use two indices to access an element in a 2D array. For example:

    ```java
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    int value = matrix[1][2]; // Accesses the element at row 1, column 2 (6)
    ```

---

39. **Question:** How do you find the sum of all elements in an array?

    **Answer:** Iterate through the array, adding each element to a total sum. For example:

    ```java
    int[] array = {1, 2, 3, 4, 5};
    int sum = 0;
    for (int num : array) {
        sum += num;
    }
    System.out.println("Sum of elements: " + sum);
    ```

---

40. **Question:** How do you declare and initialize an array with predefined values in one line?

    **Answer:** To declare and initialize an array with values in one line, use curly braces. For example:

    ```java
    int[] numbers = {1, 2, 3, 4, 5}; // Initializes an array with these values
    ```

---
