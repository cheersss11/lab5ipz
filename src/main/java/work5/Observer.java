package work5;

/**
 * Observer interface.
 * Defines a method to update the observer's state.
 */
public interface Observer {

    /**
     * Updates the observer with the new task state.
     *
     * @param taskName the name of the task that was updated
     * @param taskState the new state of the task
     */
    void update(String taskName, String taskState);
}
