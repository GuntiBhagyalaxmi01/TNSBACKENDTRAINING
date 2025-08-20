
public class twodimensionalarray {
	    public static void main(String[] args) {
	        // Declare and initialize a 3x4 integer array (matrix)
	        int[][] matrix = {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12}
	        };

	        // Accessing elements
	        System.out.println("Element at row 0, column 0: " + matrix[0][0]); // Outputs: 1
	        System.out.println("Element at row 1, column 2: " + matrix[1][2]); // Outputs: 7

	        // Modifying an element
	        matrix[0][0] = 100;
	        System.out.println("Modified element at row 0, column 0: " + matrix[0][0]); // Outputs: 100

	        // Iterating through the array using nested loops
	        System.out.println("\nMatrix elements:");
	        for (int i = 0; i < matrix.length; i++) { // Iterate through rows
	            for (int j = 0; j < matrix[i].length; j++) { // Iterate through columns in the current row
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println(); // New line after each row
	        }
	    }
	}
	
