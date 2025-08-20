
public class ImplictTypeCasting {

	public static void main(String[] args) {
		int intValue = 10;
        double doubleValue = intValue; // Implicit casting from int to double
        System.out.println("Double value: " + doubleValue); // Output: Double value: 10.0

        // Upcasting with objects
        class Animal {}
        class Dog extends Animal {}
        Animal myAnimal = new Dog(); // Implicit upcasting from Dog to Animal
        System.out.println("Object upcasting successful.");
    }
}
		
