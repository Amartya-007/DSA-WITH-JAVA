
# Java Inheritance: Comprehensive Guide

## Table of Contents
1. [Introduction to Inheritance](#introduction-to-inheritance)
2. [Superclasses and Subclasses](#superclasses-and-subclasses)
   - Definition and Relationship
   - Inheritance Types
   - Accessing Superclass Members
3. [Method Overriding](#method-overriding)
   - Definition
   - Rules for Overriding
   - `@Override` Annotation
   - Calling Superclass Methods
4. [Practice: Implement Inheritance in Programs](#practice-implement-inheritance-in-programs)
   - Creating Superclass and Subclasses
   - Constructor Chaining
   - Method Overriding Examples
   - Usage of `instanceof` Operator
   - Polymorphism
5. [Multiple Inheritance Using Interfaces](#multiple-inheritance-using-interfaces)
   - Implementing Interfaces
   - Extending Interfaces
   - Example of Multiple Inheritance
6. [Creating and Running `.java` Files](#creating-and-running-java-files)

---

## Introduction to Inheritance

Inheritance is one of the four fundamental principles of Object-Oriented Programming (OOP), along with encapsulation, abstraction, and polymorphism. It allows one class to inherit the fields and methods of another class, promoting code reuse and establishing a hierarchical relationship between classes.

### Key Concepts of Inheritance:
- **Code Reusability:** With inheritance, you can define common behavior in a superclass and reuse it in multiple subclasses, reducing redundancy.
- **Hierarchical Classification:** Inheritance naturally models real-world relationships, allowing you to create a hierarchy of classes.
- **Extensibility:** Existing classes can be extended with new functionality without modifying the original class.

In Java, inheritance is implemented using the `extends` and `implements` keywords.

---

## Superclasses and Subclasses

### Definition and Relationship

- **Superclass (Parent Class):** The class whose properties and methods are inherited by another class. It is also known as the base class or parent class.
  
- **Subclass (Child Class):** The class that inherits properties and methods from another class. It is also known as the derived class or child class.

The relationship between a superclass and its subclass is often described as an "is-a" relationship, where the subclass is a specialized form of the superclass. For example, a `Dog` is a specialized form of `Animal`.

**Example:**

```java
class Animal {
    String name;
    void eat() {
        System.out.println("This animal eats.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
```

### Inheritance Types

- **Single Inheritance:** A subclass inherits from a single superclass.
  
  **Example:**
  ```java
  class A {
      // code
  }

  class B extends A {
      // code
  }
  ```

- **Hierarchical Inheritance:** Multiple subclasses inherit from a single superclass.
  
  **Example:**
  ```java
  class A {
      // code
  }

  class B extends A {
      // code
  }

  class C extends A {
      // code
  }
  ```

- **Multilevel Inheritance:** A subclass inherits from another subclass, forming a chain of inheritance.
  
  **Example:**
  ```java
  class A {
      // code
  }

  class B extends A {
      // code
  }

  class C extends B {
      // code
  }
  ```

- **Hybrid Inheritance:** A combination of two or more types of inheritance. Java does not support multiple inheritance directly through classes but allows it through interfaces.

### Accessing Superclass Members

When a subclass inherits from a superclass, it has access to the superclass's fields and methods. However, it can also override them to provide a more specific implementation.

**Using `super`:**

- **`super` keyword:** Used to access superclass methods, constructors, and fields.
- **Calling Superclass Constructors:** The `super()` call must be the first statement in a subclass constructor if it is used.

**Example:**

```java
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name); // Calls the superclass constructor
    }

    void display() {
        System.out.println("Dog's name is " + name);
    }
}
```

---

## Method Overriding

### Definition

Method overriding is a feature in Java that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. This is crucial for runtime polymorphism.

### Rules for Overriding

1. **Method Signature:** The method in the subclass must have the same name, return type, and parameter list as the method in the superclass.
2. **Access Level:** The access level of the overriding method cannot be more restrictive than that of the overridden method.
3. **`final` Methods:** Methods declared as `final` in the superclass cannot be overridden.
4. **Static Methods:** Static methods cannot be overridden; they are hidden instead if redefined in a subclass.
5. **`private` Methods:** Private methods in a superclass cannot be overridden.

**Example:**

```java
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}
```

### `@Override` Annotation

The `@Override` annotation is used to inform the compiler that the method is intended to override a method in the superclass. If the method signature does not match any method in the superclass, the compiler will generate an error.

**Example:**

```java
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}
```

### Calling Superclass Methods

In some cases, a subclass might want to call the superclass's version of an overridden method. This can be done using the `super` keyword.

**Example:**

```java
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        super.makeSound(); // Calls the superclass method
        System.out.println("Bark");
    }
}
```

---

## Practice: Implement Inheritance in Programs

### Creating Superclass and Subclasses

To understand inheritance, let's create a basic hierarchy of classes. We'll start with a superclass `Animal` and create subclasses `Dog` and `Cat` that extend `Animal`.

**Example:**

```java
// Animal.java
public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Dog.java
public class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating dog food.");
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Cat.java
public class Cat extends Animal {
    String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating cat food.");
    }

    public void meow() {
        System.out.println(name + " is meowing.");
    }
}
```

### Constructor Chaining

Constructor chaining refers to the practice of calling one constructor from another constructor within the same class or a superclass. In inheritance, it ensures that the superclass's constructor is called before the subclass's constructor.

**Example:**

```java
class A {
    A() {
        System.out.println("Constructor of A");
    }
}

class B extends A {
    B() {
        super(); // Calls constructor of A
        System.out.println("Constructor of B");
    }
}
```

### Method Overriding Examples

Method overriding allows a subclass to provide a specific implementation for a method that is already defined in its superclass.

**Example:**

```java
class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}
```

### Usage of `instanceof` Operator

The `instanceof` operator is used to check if an object is an instance of a specific class or subclass. It is useful when dealing with polymorphism.

**Example:**

```java
Animal myDog = new Dog();

if (myDog instanceof Dog) {
    System.out.println("myDog is an instance of Dog");
}
```

### Polymorphism

Polymorphism allows one interface to be used for a general class of actions. The specific action is determined by the exact nature of the situation. In Java, polymorphism is mainly achieved through method overriding.

**Example:**

```java
Animal myAnimal = new

 Dog(); // Polymorphism
myAnimal.sound(); // Calls Dog's overridden method
```

---

## Multiple Inheritance Using Interfaces

Java does not support multiple inheritance directly through classes due to the diamond problem. However, multiple inheritance is supported through interfaces.

### Implementing Interfaces

An interface in Java is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors.

**Example:**

```java
interface Animal {
    void sound();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {
    public void sound() {
        System.out.println("Bark");
    }

    public void play() {
        System.out.println("Playing fetch");
    }
}
```

### Extending Interfaces

An interface can extend another interface, allowing it to inherit the abstract methods of the parent interface.

**Example:**

```java
interface Animal {
    void sound();
}

interface Mammal extends Animal {
    void run();
}

class Dog implements Mammal {
    public void sound() {
        System.out.println("Bark");
    }

    public void run() {
        System.out.println("Running");
    }
}
```

### Example of Multiple Inheritance

Let's create an example where a class implements multiple interfaces.

**Example:**

```java
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class A implements Printable, Showable {
    public void print() {
        System.out.println("Print");
    }

    public void show() {
        System.out.println("Show");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        A obj = new A();
        obj.print();
        obj.show();
    }
}
```

---

## Creating and Running `.java` Files

To create and run the `.java` files provided in this guide:

1. **Create the `.java` Files:**
   - Create each of the classes and interfaces as separate `.java` files using your preferred text editor or IDE.
   
2. **Compile the Java Files:**
   - Open a terminal or command prompt.
   - Navigate to the directory where your `.java` files are located.
   - Compile the files using `javac ClassName.java`.
   
3. **Run the Compiled Classes:**
   - After compiling, run the classes using `java ClassName`.

For example, to run the `Dog` class from the `Dog.java` file:

```bash
javac Dog.java
java Dog
```

---
