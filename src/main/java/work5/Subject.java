package work5;

import java.util.List;

/**
 * Subject interface.
 * Describes methods for managing observers.
 */
public interface Subject {

    /**
     * Adds an observer to the list of observers.
     *
     * @param observer the observer to be added
     */
    void addObserver(Observer observer);

    /**
     * Removes an observer from the list of observers.
     *
     * @param observer the observer to be removed
     */
    void removeObserver(Observer observer);

    /**
     * Notifies all observers about the state change.
     */
    void notifyObservers();
}
