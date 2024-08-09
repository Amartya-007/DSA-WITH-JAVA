public class ArrayDeclarationAndAccess {
    public static void main(String[] args) {
        // Array Declaration
        int[] numbers = {10, 20, 30, 40, 50};
        String[] names = {"Alice", "Bob", "Charlie"};

        // Accessing Array Elements
        System.out.println("First number: " + numbers[0]);
        System.out.println("First name: " + names[0]);

        // for space between outputs
        System.out.println();

        // Accessing and Displaying All Elements
        System.out.println("All numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // for space between outputs
        System.out.println();

        System.out.print("All names: ");
        for (String name : names) {
            System.out.print(name + " "); // print() is used to print in the same line and println() is used to print in the next line . Using + " " to add space between names
        }
    }
}
