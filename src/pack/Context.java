package pack;

/**
 * Context class that uses a Strategy object to sort an array.
 * This class allows dynamic switching of sorting strategies.
 */
public class Context {
    private Strategy strategy;

    /**
     * Constructs a Context with the specified Strategy.
     *
     * @param strategy the sorting strategy to use
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Sets a new sorting strategy for this context.
     *
     * @param strategy the new sorting strategy to use
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Sorts the array using the current strategy.
     *
     * @param array the array to be sorted
     * @throws IllegalStateException if the strategy is not set
     */
    public void sortArray(int[] array) {
        if (strategy != null) {
            strategy.sort(array);
        } else {
            throw new IllegalStateException("Sort strategy not set");
        }
    }
}
