package com.patterns.snapshot;

import com.patterns.AbstractRunnable;

public class SnapshotRunnable extends AbstractRunnable {
    @Override
    public void run() {
        Editor editor = new Editor();
        Editor.Snapshot snapshot = editor.createSnapshot();

        printPropertiesEditor(editor);

        editor.setText("Editor text");
        editor.setCursor(11, 0);
        editor.setSelectionLength(4);

        printPropertiesEditor(editor);

        editor.restore(snapshot);

        printPropertiesEditor(editor);
    }
    private void printPropertiesEditor(Editor editor) {
        System.out.printf("Text: %s\n", editor.getText());
        System.out.printf("Cursor X: %d\n", editor.getPositionCursorX());
        System.out.printf("Cursor Y: %d\n", editor.getPositionCursorY());
        System.out.printf("Selection length: %d\n", editor.getSelectionLength());
        System.out.println();
    }
}
