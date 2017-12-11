package net.ensan.codest.despat.memento;

/**
 * <p>Memento design pattern is used when we want to save the state of an
 * object so that we can restore later on. Memento pattern is used to implement
 * this in such a way that the saved state data of the object is not accessible
 * outside of the object, this protects the integrity of saved state data.
 *
 * <p>Memento pattern is implemented with two objects – Originator and Caretaker.
 * Originator is the object whose state needs to be saved and restored and it uses
 * an inner class to save the state of Object. The inner class is called Memento
 * and its private, so that it can’t be accessed from other objects.
 *
 * <p>Caretaker is the helper class that is responsible for storing and restoring
 * the Originator’s state through Memento object. Since Memento is private to
 * Originator, Caretaker can’t access it and it’s stored as a Object within the caretaker.
 *
 * <p>The pattern is simple and easy to implement, one of the thing needs to take
 * care is that Memento class should be accessible only to the Originator object.
 * Also in client application, we should use caretaker object for saving and restoring
 * the originator state.
 *
 * <p>One of the drawback is that if Originator object is very huge then Memento
 * object size will also be huge and use a lot of memory.
 *
 * @author shahram at gmail.com Inspired from (Book: Java Design Patterns by Pankaj Kumar)
 */
public class FileWriterUtil {

    private String fileName;
    private StringBuilder content;

    public FileWriterUtil(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public void write(String str) {
        content.append(str);
    }

    public Memento save() {
        return new Memento(this.fileName, this.content);
    }

    public void undoToLastSave(Object obj) {
        Memento memento = (Memento) obj;
        this.fileName = memento.fileName;
        this.content = memento.content;
    }

    private class Memento {
        private String fileName;
        private StringBuilder content;

        public Memento(String fileName, StringBuilder content) {
            this.fileName = fileName;
            // notice the deep copy so that Memento and FileWriterUtil
            // content variables don't refer to same object
            this.content = new StringBuilder(content);
        }
    }
}
