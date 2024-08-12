# Polymorphism in Java 🌟

## Introduction to Polymorphism

**Polymorphism** is a core concept in object-oriented programming (OOP) that allows objects to be treated as instances of their parent class. The specific behavior is determined by the actual object type at runtime.

### Definition

- **Polymorphism** means "many forms." It enables methods to perform different tasks based on the object they are acting upon, even when they share the same name.

### Importance

- **🔄 Flexibility:** Enhances code flexibility and scalability.
- **♻️ Code Reusability:** Allows objects of different classes to be treated as objects of a common superclass, simplifying code management.

### Real-world Example

- Think of a person who can act as a teacher, parent, or friend. Their behavior changes based on the role, similar to how polymorphism works in programming.

---

## Types of Polymorphism in Java

### 1. Compile-Time Polymorphism (Method Overloading) 💻

**Definition:**

- **Compile-time polymorphism** occurs when multiple methods in the same class have the same name but different parameters. The method to be executed is determined at compile time.

**Key Points:**

- **Same Method Name, Different Parameters:** Methods can be overloaded by varying the type, number, or order of parameters.
- **Overloading Static Methods:** Static methods can be overloaded as well.

**Example:**

```java
class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two integers: " + calc.add(10, 20)); // Output: 30
        System.out.println("Sum of three integers: " + calc.add(10, 20, 30)); // Output: 60
        System.out.println("Sum of two doubles: " + calc.add(10.5, 20.5)); // Output: 31.0
    }
}
```

**Explanation:**

- The `add` method is overloaded to handle different types of input. The appropriate method is selected based on the parameters at compile time.

**Why Use Method Overloading:**

- **📚 Enhanced Readability:** Makes the code more intuitive.
- **🔄 Increased Flexibility:** Allows using the same method name for different functionalities.

**Practice Problem:**

- Create a class demonstrating method overloading by writing methods to perform multiplication with different types and numbers of parameters.

---

### 2. Runtime Polymorphism (Method Overriding) 🌐

**Definition:**

- **Runtime polymorphism** occurs when a subclass provides a specific implementation of a method that is already defined in its superclass. The method that gets executed is determined at runtime.

**Key Points:**

- **Inheritance Required:** Method overriding involves inheritance.
- **Use of `@Override`:** The `@Override` annotation helps ensure a method correctly overrides a method from the superclass.
- **Access Modifiers:** The overriding method must have the same or less restrictive access modifier than the method in the superclass.

**Example:**

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound(); // Output: Dog barks
        myCat.sound(); // Output: Cat meows
    }
}
```

**Explanation:**

- The `Dog` and `Cat` classes override the `sound` method of the `Animal` class. The method executed depends on the object's actual type at runtime.

**Why Use Method Overriding:**

- **🎯 Specific Behavior:** Allows a subclass to provide a specific implementation.
- **🔍 Dynamic Method Dispatch:** Selects the appropriate method at runtime, enhancing flexibility.

**Practice Problem:**

- Create a base class `Shape` with derived classes `Circle` and `Rectangle`. Override a method to calculate and display the area for each shape.

---

## Demonstrating Polymorphism with a Class Hierarchy 🏗️

**Example Scenario:**

- A class hierarchy with a base class `Shape` and derived classes `Circle`, `Rectangle`, and `Triangle`.

**Code Example:**

```java
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle();
        shape.draw(); // Output: Drawing a circle

        shape = new Rectangle();
        shape.draw(); // Output: Drawing a rectangle

        shape = new Triangle();
        shape.draw(); // Output: Drawing a triangle
    }
}
```

**Explanation:**

- The `Shape` class has a `draw` method overridden by its subclasses. At runtime, the actual method called depends on the object type.

**Output Analysis:**

- The output varies based on the object type assigned to the `shape` reference, demonstrating runtime polymorphism.

---

## Common Questions and Pitfalls ❓

### Static Methods and Polymorphism

**Can Static Methods be Overridden?**

- No, static methods cannot be overridden. They are associated with the class rather than the instance, but they can be redefined in a subclass.

**Example:**

```java
class Parent {
    static void display() {
        System.out.println("Parent display()");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Child display()");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent.display(); // Output: Parent display()
        Child.display();  // Output: Child display()
    }
}
```

**Explanation:**

- The `display` method in `Child` hides the method in `Parent`. The method call is determined by the reference type.

---

### Method Overloading vs. Method Overriding

| Aspect                      | Method Overloading                                                                     | Method Overriding                                                                            |
| --------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| **Definition**              | Multiple methods with the same name but different parameters within the same class.    | A subclass provides a specific implementation of a method already defined in its superclass. |
| **Purpose**                 | To increase code readability with methods of the same name performing different tasks. | To provide a specific implementation of a method in a subclass.                              |
| **Binding**                 | **Static Binding (Compile-Time)**                                                      | **Dynamic Binding (Runtime)**                                                                |
| **Use Case**                | When you need methods with the same name but different parameters.                     | When you want to define a method behavior specific to a subclass.                            |
| **Return Type**             | Can differ as long as method signatures are different.                                 | Must match the method in the superclass.                                                     |
| **Constructor Overloading** | Applicable to constructors in a class.                                                 | Does not apply to constructors.                                                              |

### Static Binding vs. Dynamic Binding

| Aspect                | Static Binding                                             | Dynamic Binding                                                |
| --------------------- | ---------------------------------------------------------- | -------------------------------------------------------------- |
| **Definition**        | Method calls resolved at compile time.                     | Method calls resolved at runtime.                              |
| **Examples**          | Method Overloading, Static Methods                         | Method Overriding, Virtual Methods                             |
| **Performance**       | Faster, as resolution is done at compile time.             | Slower, due to runtime resolution overhead.                    |
| **Flexibility**       | Less flexible; decisions made at compile time.             | More flexible; decisions made during program execution.        |
| **Method Resolution** | Occurs once during compilation, reducing runtime overhead. | Occurs each time a method is invoked, adding runtime overhead. |

### Inheritance vs. Polymorphism

| Aspect             | Inheritance                                                     | Polymorphism                                                                                     |
| ------------------ | --------------------------------------------------------------- | ------------------------------------------------------------------------------------------------ |
| **Definition**     | Mechanism to create a new class based on an existing class.     | Mechanism to allow objects of different classes to be treated as objects of a common superclass. |
| **Purpose**        | Code reuse and creation of hierarchical relationships.          | Dynamic method resolution and increased flexibility.                                             |
| **Implementation** | Achieved through the `extends` keyword in Java.                 | Achieved through method overriding and method overloading.                                       |
| **Key Concept**    | A subclass inherits properties and behaviors from a superclass. | An object can exhibit different behaviors depending on its actual type.                          |
| **Example**        | Class `Dog` inherits from class `Animal`.                       | Method `draw()` in class `Shape` is overridden by subclasses like `Circle`, `Rectangle`.         |

|

---

## Additional Resources

- **[Java Documentation on Polymorphism](https://docs.oracle.com/javase/tutorial/java/concepts/polymorphism.html)**
- **[Java Polymorphism Examples and Exercises](https://www.javatpoint.com/polymorphism-in-java)**

---
