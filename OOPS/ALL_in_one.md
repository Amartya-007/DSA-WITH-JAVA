# Java OOPS Concepts: ALL in One ( **In Brief**)

## 1. Introduction to OOPS

Object-Oriented Programming System (OOPS) is a paradigm that models real-world objects, offering a structured and modular approach to programming.

- **Encapsulation**: Wrapping up of data and methods in a single unit.
- **Abstraction**: Hiding complex details and exposing only essential information.
- **Inheritance**: Acquiring properties and behaviors from a parent class.
- **Polymorphism**: Same function name, different forms (e.g., method overloading).

**Why OOPS Matters:**

- **Modularity**: Code is divided into separate modules (classes).
- **Reusability**: Inheritance allows code reuse.
- **Flexibility**: Polymorphism makes code flexible and adaptable.
- **Maintenance**: Encapsulation reduces the complexity of the code, making it easier to maintain.

---

## 2. Classes and Objects

A **class** is a blueprint for objects, defining their properties and behavior, while **objects** are real instances of classes.

### Additional Points:

- **Constructors**: Used to initialize objects. Can be overloaded to offer flexibility.
- **`this` keyword**: Refers to the current object instance.
- **Memory Allocation**: Objects are stored in the heap; primitive types are in the stack.
- **Static Members**: Belong to the class, not the instance.

**Example with Constructor Overloading:**

```java
class Car {
    String model;
    int year;

    Car(String model) {
        this.model = model;
        this.year = 2020;  // Default year
    }

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}
```

---

## 3. Encapsulation

Encapsulation binds the data (fields) and methods into a single class, restricting direct access to its internal details.

### Additional Points:

- **Data Hiding**: Sensitive data can be hidden using private access.
- **Mutability**: Control whether class properties are mutable using setters.
- **Better Control**: Encapsulation provides better control over how data is modified.

**Differential Table: Encapsulation vs Abstraction**
| Feature | Encapsulation | Abstraction |
|--------------------|----------------------------------------------------------|--------------------------------------------------------|
| Focus | Hides data and provides methods to manipulate it | Hides implementation details and shows only the essentials |
| Access Control | Achieved via access modifiers (private, protected, public)| Achieved via abstract classes and interfaces |
| Implementation | Actual code is written to manipulate the data | No actual implementation in abstraction |
| Flexibility | Provides control over how fields are accessed/modified | Allows focus on "what" instead of "how" |
| Code Example | `private int age; public void setAge(int age)` | `abstract void run();` |
| Purpose | Protect data from outside interference | Focus on essential features |

---

## 4. Inheritance

Inheritance allows a class to inherit fields and methods from another class. It enables code reuse and a hierarchical class structure.

### Additional Points:

- **Super Keyword**: Refers to the parent class' constructor or method.
- **Multilevel Inheritance**: Chain of inheritance (A → B → C).
- **Overriding**: Subclass modifies a method defined in the parent class.
- **Final Keyword**: Prevents inheritance by marking a class or method as final.

**Differential Table: Inheritance vs Composition**
| Feature | Inheritance | Composition |
|----------------------|--------------------------------------------------------|--------------------------------------------------------|
| Relationship Type | "Is-a" relationship | "Has-a" relationship |
| Flexibility | Less flexible, tight coupling between classes | More flexible, loose coupling |
| Code Reusability | Code can be reused, but changes to parent affect child | High reusability, changes in one class don’t affect others |
| Ease of Maintenance | Harder to maintain with deep inheritance hierarchies | Easier to maintain |
| Control | Inherited methods can be overridden | Composition allows more control over individual parts |
| Example | Dog is an Animal | Car has an Engine |

---

## 5. Polymorphism

Polymorphism allows one method to take many forms. It's implemented in Java through method overloading and method overriding.

### Additional Points:

- **Upcasting**: Object of a subclass can be referred to as a superclass object.
- **Downcasting**: Converting a superclass reference back to a subclass reference.
- **Dynamic Method Dispatch**: At runtime, the JVM decides which method to invoke.

**Differential Table: Compile-time vs Runtime Polymorphism**
| Feature | Compile-time Polymorphism | Runtime Polymorphism |
|---------------------|---------------------------------------------------------|--------------------------------------------------------|
| Definition | Achieved through method overloading | Achieved through method overriding |
| Binding Time | Early (compile-time) | Late (runtime) |
| Flexibility | Less flexible, relies on method signatures | More flexible, depends on object type at runtime |
| Performance | Faster, since method calls are resolved at compile-time | Slower, as it involves method resolution at runtime |
| Use Case | When behavior is known at compile-time | When behavior is determined dynamically |
| Example | `add(int a, int b)` and `add(double a, double b)` | Overriding `toString()` method in subclass |

---

## 6. Abstraction

Abstraction is the process of hiding the implementation details and showing only the functionality. It's implemented using abstract classes and interfaces.

### Additional Points:

- **Interfaces in Java 8**: Can now have default and static methods.
- **Real-world Analogy**: A car, where you don’t need to know how the engine works to drive it.

**Differential Table: Abstract Class vs Interface**
| Feature | Abstract Class | Interface |
|---------------------|-------------------------------------------------------|--------------------------------------------------------|
| Methods | Can have both abstract and concrete methods | Only abstract methods (with Java 8, default methods are allowed) |
| Multiple Inheritance | Not supported | Supported |
| Fields | Can have instance variables | Can only have constants |
| Access Modifiers | Can have any access modifier | Methods are `public` and fields `final` by default |
| Constructor | Can have constructors | Cannot have constructors |
| Example | `abstract class Vehicle` | `interface Drawable` |

---

## 7. Real-world Use Cases

OOPS is crucial for implementing design patterns like Factory, Singleton, Observer, and Decorator patterns, which are widely used in software development.

### Additional Points:

- **Factory Pattern**: Provides a way to create objects without exposing the creation logic.
- **Singleton Pattern**: Ensures a class has only one instance.
- **Observer Pattern**: Helps manage dependencies between objects, where one change affects others.

---

## 8. Advanced Techniques

- **`final` keyword**: Restricts the user from overriding methods or inheriting classes.
- **`static` keyword**: Allows methods/variables to belong to the class rather than the instance.
- **Best Practices**: Follow SOLID principles (Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion).

---

## New Topics:

### 9. Interfaces and Multiple Inheritance

Java doesn't support multiple inheritance through classes but allows it using interfaces. Interfaces enable a class to implement multiple contracts.

### Additional Points:

- **Default Methods**: Allows interfaces to have method bodies (since Java 8).
- **Functional Interfaces**: Interfaces with only one abstract method, used for lambda expressions.
- **Example**:

  ```java
  interface Animal {
      void sound();
  }

  interface Mammal {
      void hasFur();
  }

  class Dog implements Animal, Mammal {
      public void sound() {
          System.out.println("Dog barks.");
      }

      public void hasFur() {
          System.out.println("Dog has fur.");
      }
  }
  ```

---

### 10. Exception Handling

Exception handling in Java ensures the smooth execution of a program by managing runtime errors.

**Key Concepts**:

- **try-catch**: Handles exceptions.
- **throw**: Used to explicitly throw an exception.
- **finally**: Block that executes whether or not an exception is caught.

### Example:

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Division by zero is not allowed.");
} finally {
    System.out.println("This will always execute.");
}
```
