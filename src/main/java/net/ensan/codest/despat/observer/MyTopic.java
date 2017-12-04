package net.ensan.codest.despat.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Observer design pattern is useful when you are interested in
 * the state of an object and want to get notified whenever there
 * is any change. In observer pattern, the object that watch on the
 * state of another object are called Observer and the object that
 * is being watched is called Subject.
 *
 * <p>Define a one-to-many dependency between objects so that when
 * one object changes state, all its dependents are notified and
 * updated automatically.
 *
 * @author shahram at gmail.com Inspired from (Book: Java Design Patterns by Pankaj Kumar)
 */
public class MyTopic implements Subject {

    private List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (obj == null) {
            throw new NullPointerException("Null Observer");
        }
        synchronized (MUTEX) {
            if (!observers.contains(obj)) {
                observers.add(obj);
            }
        }
    }

    @Override
    public void unregister(Observer obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObserver() {
        List<Observer> observersLocal = null;
        // Synchronization is used to make sure any observer
        // registered after message received is not notified.
        synchronized (MUTEX) {
            if (!changed) {
                return;
            }
            observersLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }
        for (Observer obj: observersLocal) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    //method to post message to the topic
    public void postMessage(String msg) {
        System.out.println("Message Posted to Topic: " + msg);
        this.message = msg;
        this.changed = true;
        notifyObserver();
    }
}
