package work5;

/**
 * User class (ConcreteObserver).
 * Represents a user who subscribes to tasks and gets notified about changes.
 */
public class User implements Observer {

    /**
     * The name of the user.
     */
    private final String name;

    /**
     * Constructs a new User with a given name.
     *
     * @param name the name of the user
     */
    public User(String name) {
        this.name = name;
    }

    /**
     * Updates the user with the task's name and new state.
     *
     * @param taskName the name of the task that was updated
     * @param taskState the new state of the task
     */
    @Override
    public void update(String taskName, String taskState) {
        System.out.println(name + " was notified: Task \"" + taskName + "\" changed state to \"" + taskState + "\"");
    }

    /**
     * Returns a string representation of the user.
     *
     * @return the user's name
     */
    @Override
    public String toString() {
        return "User " + name;
    }
}
