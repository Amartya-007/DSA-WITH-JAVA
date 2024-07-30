

/*   
    ! NOTE :  
             * PLEASE INSTALL BETTER COMMENTS EXTENSION IN YOUR VSCODE EDITOR TO GET BETTER VISUALIZATION OF COMMENTS.

        ! Better Comments Extension Link: https://marketplace.visualstudio.com/items?itemName=aaron-bond.better-comments



 ------------------    Java Syntax and Fundamentals:    --------------------
  
* Keywords, identifiers, data types (int, float, char, boolean, etc.)
  
* Operators (arithmetic, relational, logical, bitwise)
  
* Input/output operations (Scanner for input, System.out for output)


---------------------------------------------------------------------------------
*/




/*

 ---------------------------------   Keywords, Identifiers and Data Types in Java   --------------------------------- 

 ! What is Keywords ?

* Keywords are the reserved words in Java. We cannot use a keyword as an identifier.

* Keywords are case sensitive.

* There are 50 reserved keywords in Java.

* Keywords in Java are: 
    abstract, assert, boolean, break, byte, case, catch, char, class, const, continue, default, do, double, else, enum, extends, final, finally, float, for, goto, if, implements, import, instanceof, int, interface, long, native, new, package, private, protected, public, return, short, static, strictfp, super, switch, synchronized, this, throw, throws, transient, try, void, volatile, while.

* Keywords in Java are also called as "Reserved Words".

* Keywords are the words whose meaning has already been explained to the compiler and hence, cannot be changed.

* We cannot use keywords as a variable name, class name or method name.

* Keywords are the backbone of a program and have a special meaning.

* Keywords are the reserved words that have a specific meaning relevant to a compiler.

* Keywords are the reserved words that have a predefined meaning in Java.


*/


// Example of Keywords:

class Keywords {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("The sum of a and b is: " + c);
    }
}

/* 

* how is this a keyword example?

    * In the above example, we have used the "class", "public", "static", "void", "main", "String" and "System.out.println" keywords.

    * These are the reserved words in Java and have a specific meaning.
*/



/*

 What is Identifiers ?

* Identifiers are the name given to the entities like variables, classes, methods, packages, etc.

* Identifiers are the user-defined names consisting of a sequence of characters.

* Identifiers are the name given to the entities like variables, classes, methods, packages, etc.

*/
// Example of Identifiers: We are using same code as above. [ output will be same. ]

class Identifiers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println( c); // 30
    }
}


/* how is this an identifier example?

/   * In the above example, we have used the ( Identifiers ) as a class name ( main ) as a method name, "args" as a variable name, "a", "b" and "c" as variable names.
    * as a method name, "args" as a variable name, "a", "b" and "c" as variable names.

    * These are the user-defined names and are called as identifiers.

    * Identifiers are the name given to the entities like variables, classes, methods, packages, etc.

*/


/*

 What is Data Types ?

 * Data types specify the different sizes and values that can be stored in the variable.

* There are two types of data types in Java:

     Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.

     Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.

* Data types specify the different sizes and values that can be stored in the variable.


*/

// Example of Data Types:

class DataTypes {
    public static void main(String[] args) {
        int a = 10;
        float b = 10.5f;
        char c = 'A';
        boolean d = true;
        System.out.println("The value of a is: " + a);  // 10
        System.out.println("The value of b is: " + b);  // 10.5
        System.out.println("The value of c is: " + c);  // A
        System.out.println("The value of d is: " + d);  // true
    }
}

/*

  how is this a data type example?

    * In the above example, we have used the int, float, char and boolean data types.

    * These are the primitive data types in Java.

    * Data types specify the different sizes and values that can be stored in the variable.

    * The int data type is used to store the integer value.

    * The float data type is used to store the floating-point value.

    * The char data type is used to store the character value.

    * The boolean data type is used to store the boolean value.

*/

