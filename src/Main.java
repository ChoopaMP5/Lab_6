import pack.*;
import java.util.Arrays;

/**
 * Main class demonstrating the use of the Strategy design pattern.
 * Provides sorting of an array in ascending and descending orders.
 */
public class Main {
    /**
     * The entry point of the application.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 9, 2};

        // Initialize context with ascending sort strategy
        Context context = new Context(new AscendingStrategy());
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Sort in ascending order
        context.sortArray(numbers);
        System.out.println("Sorted in Ascending Order: " + Arrays.toString(numbers));

        // Change to descending sort strategy
        context.setStrategy(new DesendingStrategy());
        context.sortArray(numbers);
        System.out.println("Sorted in Descending Order: " + Arrays.toString(numbers));
    }
}
