package work5;

import java.util.ArrayList;
import java.util.List;

/**
 * Task class (ConcreteSubject).
 * Represents a task that manages its observers and notifies them about state changes.
 */
public class Task implements Subject {
    /**
     * The name of the task.
     */
    private String name;

    /**
     * The current state of the task.
     */
    private String state;

    /**
     * The list of observers subscribed to this task.
     */
    private final List<Observer> observers = new ArrayList<>();

    /**
     * Constructs a new Task with a given name.
     *
     * @param name the name of the task
     */
    public Task(String name) {
        this.name = name;
        this.state = "Created";
    }

    /**
     * Adds an observer to the task's list of observers.
     *
     * @param observer the observer to be added
     */
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        System.out.println(observer + " subscribed to task " + name);
    }

    /**
     * Removes an observer from the task's list of observers.
     *
     * @param observer the observer to be removed
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println(observer + " unsubscribed from task " + name);
    }

    /**
     * Notifies all observers about the state change.
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(name, state);
        }
    }

    /**
     * Sets a new state for the task and notifies all observers.
     *
     * @param state the new state of the task
     */
    public void setState(String state) {
        this.state = state;
        System.out.println("Task \"" + name + "\" changed to: " + state);
        notifyObservers();
    }
}
