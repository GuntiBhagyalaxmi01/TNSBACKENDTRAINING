
public class VariableDemo {

	public static void main(String[] args) {
		// Primitive data types
        int age = 30; // Integer variable
        double price = 19.99; // Double-precision floating-point variable
        char initial = 'J'; // Character variable
        boolean isActive = true; // Boolean variable
        String name = "Alice"; // String (reference type)

        // Displaying the values of variables
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Initial: " + initial);
        System.out.println("Is Active: " + isActive);
        System.out.println("Name: " + name);

        // Modifying variable values
        age = 31;
        price = 25.50;
        name = "Bob";

        System.out.println("\n--- After modification ---");
        System.out.println("New Age: " + age);
        System.out.println("New Price: " + price);
        System.out.println("New Name: " + name);

        // Performing an operation using variables
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;
        System.out.println("\nSum of num1 and num2: " + sum);
	}

}
