package net.ensan.codest.despat.observer;

public interface Subject {

    // methods to register and unregister observers
    public void register(Observer obj);
    public void unregister(Observer obj);

    // method to notify the observers of change
    public void notifyObserver();

    // method to get update from subject
    public Object getUpdate(Observer obj);
}
