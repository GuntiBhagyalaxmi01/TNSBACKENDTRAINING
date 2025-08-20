//one dimensional array Demo
public class onedimensionalarray {
	public static void main(String[] args) {
        // Declare and initialize a String array named 'names'
        String[] names = {"John", "Emily", "Michael", "Sarah", "David"};

        // Access and print an element
        System.out.println("Name at index 1: " + names[1]); // Output: Name at index 1: Emily

        // Modify an element
        names[3] = "Jessica";
        System.out.println("Modified name at index 3: " + names[3]); // Output: Modified name at index 3: Jessica
    }
}
