package work5;

/**
 * Main class.
 * Demonstrates the implementation of the Observer pattern using tasks and users.
 */
public class Main {

    /**
     * The main method to run the program.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");

        User user1 = new User("Andrew");
        User user2 = new User("Marina");

        task1.addObserver(user1);
        task1.addObserver(user2);
        task2.addObserver(user2);

        task1.setState("In progress");
        task2.setState("Completed");
    }
}
