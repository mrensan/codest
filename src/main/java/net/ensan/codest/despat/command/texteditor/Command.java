package net.ensan.codest.despat.command.texteditor;

public abstract class Command {
    public Editor editor;
    private String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();

    void backup() {
        backup = editor.textField.getText();
    }
}
