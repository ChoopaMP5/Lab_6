package pack;

/**
 * A concrete implementation of the Strategy interface.
 * Provides sorting in descending order using the Bubble Sort algorithm.
 */
public class DesendingStrategy implements Strategy {
    /**
     * Sorts the array in descending order.
     *
     * @param array the array to be sorted
     */
    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
