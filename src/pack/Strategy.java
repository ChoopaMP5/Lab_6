package pack;

/**
 * Strategy interface defining a method for sorting arrays.
 * Concrete implementations of this interface will provide
 * specific sorting strategies.
 */
public interface Strategy {
    /**
     * Sorts the provided array.
     *
     * @param array the array to be sorted
     */
    void sort(int[] array);
}