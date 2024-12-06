        /*
         * Operators: 
         * Operators are special symbols or keywords that perform specific operations on one, two, or three operands and return a result.
         */


public class Operators {
    /**
     * @param args
     */
    public static void main(String[] args) {

        // ===== Types of Operators =====

        int a = 10, b = 30;

        // 1. Arithmetic Operators (Binary Operators)
        System.out.println("=== Arithmetic Operators ===");
        
        System.out.println("Addition (a + b): " + (a + b)); // 40
        System.out.println("Subtraction (a - b): " + (a - b)); // -20
        System.out.println("Multiplication (a * b): " + (a * b)); // 300
        System.out.println("Division (a / b): " + (a / b)); // 0
        System.out.println("Modulo (a % b): " + (a % b)); // 10

        // 2. Unary Operators
        System.out.println("\n=== Unary Operators ===");
        int k = 40;
        boolean bool = false;

        System.out.println("Unary minus (-k): " + (-k));
        System.out.println("Logical NOT (!bool): " + (!bool));

        System.out.println("Pre-increment (++k): " + (++k));
        System.out.println("Post-increment (k++): " + (k++) + " (k now: " + k + ")");
        System.out.println("Pre-decrement (--k): " + (--k));
        System.out.println("Post-decrement (k--): " + (k--) + " (k now: " + k + ")");

        // 3. Assignment Operators
        System.out.println("\n=== Assignment Operators ===");
        int c = 10, d = a;

        System.out.println("Simple assignment (d = a): " + d);
        System.out.println("Compound assignment (d += c): " + (d += c));
        System.out.println("Compound assignment (d -= c): " + (d -= c));
        System.out.println("Compound assignment (d *= c): " + (d *= c));
        System.out.println("Compound assignment (d /= c): " + (d /= c));
        System.out.println("Compound assignment (d %= c): " + (d %= c));
        System.out.println("Compound assignment (d &= c): " + (d &= c));

        // 4. Bitwise Operators
        System.out.println("\n=== Bitwise Operators ===");
        int n = 10, z = 5;

        System.out.println("Bitwise OR (n | z): " + (n | z));
        System.out.println("Bitwise AND (n & z): " + (n & z));
        System.out.println("Bitwise Complement (~z): " + (~z));
        System.out.println("Bitwise XOR (n ^ z): " + (n ^ z));

        int x = 10;
        x &= 6; // Compound bitwise assignment
        System.out.println("Compound bitwise AND (x &= 6): " + x);

        // 5. Relational Operators
        System.out.println("\n=== Relational Operators ===");
        int f1 = 5, f2 = 3;

        System.out.println("Equal to (f1 == f2): " + (f1 == f2));
        System.out.println("Not equal to (f1 != f2): " + (f1 != f2));
        System.out.println("Less than (f1 < f2): " + (f1 < f2));
        System.out.println("Less than or equal (f1 <= f2): " + (f1 <= f2));
        System.out.println("Greater than (f1 > f2): " + (f1 > f2));
        System.out.println("Greater than or equal (f1 >= f2): " + (f1 >= f2));

        // 6. Logical Operators
        System.out.println("\n=== Logical Operators ===");
        int l1 = 10, l2 = 20;

        System.out.println("Logical AND (l1 > 2 && l2 < 3): " + (l1 > 2 && l2 < 3));
        System.out.println("Logical OR (l1 >= 2 || l2 < 3): " + (l1 >= 2 || l2 < 3));
        System.out.println("Logical NOT (!(l1 > 2 && l2 < 3)): " + !(l1 > 2 && l2 < 3));

        // 7. Ternary Operator
        System.out.println("\n=== Ternary Operator ===");
        int var = 10;
        String result = var >= 10 ? "True" : "False";
        System.out.println("Result of var >= 10: " + result);

        // 8. instanceof Operator
        System.out.println("\n=== instanceof Operator ===");
        String str = "Hello";
        System.out.println("Is str an instance of String? " + (str instanceof String));

        // 9. Type Casting
        System.out.println("\n=== Type Casting ===");
        double pi = 3.14;
        int piInt = (int) pi;
        System.out.println("Type casted pi (double to int): " + piInt);

        // 10. Shift Operators
        System.out.println("\n=== Shift Operators ===");
        int num = 8;
        System.out.println("Left shift (num << 2): " + (num << 2));
        int negNum = -8;
        System.out.println("Right shift (negNum >> 2): " + (negNum >> 2));
        System.out.println("Unsigned right shift (negNum >>> 2): " + (negNum >>> 2));
    }
}
