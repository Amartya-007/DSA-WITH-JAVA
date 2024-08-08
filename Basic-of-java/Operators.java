public class Operators {
    public static void main(String[] args) {
        /*
        Operators Definition:
        Operators are special symbols that perform specific operations on one, two, or three operands, and then return a result.
        */

        //* Types Of Operators
        
        int a = 10;
        int b = 30;
        
        // 1. Arithmetic Operators (these are binary operators)
        // Addition (returns the sum)
        
        int sum = a + b;
        System.out.println("The sum is: " + sum); // The sum is: 40 

        // Subtraction (returns the difference)
        int diff = a - b;
        System.out.println("The difference is: " + diff);   // The difference is: -20

        // Multiplication (returns the product)
        int prod = a * b;
        System.out.println("The product is: " + prod);  // The product is: 300

        // Division (returns the Quotient)
        int quot = a / b;
        System.out.println("The quotient is: " + quot); // The quotient is: 0  however 10/30 = 0.3333 but as both are integers so it will return 0
        // Modulo or Remainder (returns the remainder upon division)
        int rem = a % b;
        System.out.println("The remainder is: " + rem); // The remainder is: 10

        // 2. Unary Operators
        int k = 40;
        boolean bool = false;
        // unary minus
        System.out.println("Unary minus of k is: " + (-k));

        // unary negation
        System.out.println("Unary negation of bool is: " + (!bool));

        // pre-increment and post-increment
        System.out.println("Pre-increment of k is: " + (++k));
        System.out.println("Post-increment of k is: " + (k++) + " (k after post-increment: " + k + ")");

        // pre-decrement and post-decrement
        System.out.println("Pre-decrement of k is: " + (--k));
        System.out.println("Post-decrement of k is: " + (k--) + " (k after post-decrement: " + k + ")");

        // 3. Assignment Operators
        int c = 10;
        // Simple Assignment
        int d = a;
        System.out.println("Simple assignment d = a, d is: " + d);

        // Compound Assignment (first performs the operation then assigns the value)
        System.out.println("d += c, d is: " + (d += c));
        System.out.println("d -= c, d is: " + (d -= c));
        System.out.println("d *= c, d is: " + (d *= c));
        System.out.println("d /= c, d is: " + (d /= c));
        System.out.println("d %= c, d is: " + (d %= c));

        // 4. Bitwise Operators
        int n = 10; // (1010 in binary)
        int z = 5;  // (101 in binary)
        // Bitwise OR (|)
        System.out.println("Bitwise OR of n and z is: " + (n | z));

        // Bitwise AND (&)
        System.out.println("Bitwise AND of n and z is: " + (n & z));

        // Bitwise Complement (~)(unary)
        System.out.println("Bitwise Complement of z is: " + (~z));

        // Bitwise XOR (^)
        System.out.println("Bitwise XOR of n and z is: " + (n ^ z));

        // 5. Relational Operators (Comparison)
        int f1 = 5;
        int f2 = 3;
        // ( these operators return true or false based on comparison)
        // Equal to (==)
        System.out.println("f1 == f2: " + (f1 == f2));

        // Not equal to (!=)
        System.out.println("f1 != f2: " + (f1 != f2));

        // Less than (<)
        System.out.println("f1 < f2: " + (f1 < f2));

        // Less than Equal to (<=)
        System.out.println("f1 <= f2: " + (f1 <= f2));

        // Greater than (>)
        System.out.println("f1 > f2: " + (f1 > f2));

        // Greater than Equal to (>=)
        System.out.println("f1 >= f2: " + (f1 >= f2));

        // 6. Logical Operators (works on conditions) (is a binary operator)
        int l1 = 10;
        int l2 = 20;

        // Logical AND (&&)
        System.out.println("l1 > 2 && l2 < 3: " + (l1 > 2 && l2 < 3));

        // Logical OR (||)
        System.out.println("l1 >= 2 || l2 < 3: " + (l1 >= 2 || l2 < 3));

        // Logical NOT (!=)
        System.out.println("l1 > 2 != l2 < 3: " + (l1 > 2 != l2 < 3));

        // 7. Ternary Operator (?:)
        // works three operands
        // variable = condition ? expression1 : expression2;
        // if condition is true expression 1 is returned
        // if condition is false expression 2 is returned

        int var = 10;
        boolean result = var >= 10 ? true : false;
        System.out.println("Result of ternary operation var >= 10 ? true : false is: [" + result+"]");
    }
}
