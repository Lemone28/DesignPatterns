package com.patterns.snapshot;

import com.patterns.Main;

public class Editor {
    private int positionCursorX;
    private int positionCursorY;
    private int selectionLength;
    private String text;


    public Editor(int positionCursorX, int positionCursorY, int selectionLength, String text) {
        setCursor(positionCursorX, positionCursorY);
        setSelectionLength(selectionLength);
        setText(text);
    }
    public Editor() {
        this(0, 0, 0, "");
    }


    public static class Snapshot {
        private int positionCursorX;
        private int positionCursorY;
        private int selectionLength;
        private String text;

        Snapshot(int x, int y, int selectionLength, String text) {
            this.positionCursorX = x;
            this.positionCursorY = y;
            this.selectionLength = selectionLength;
            this.text = text;
        }
    }

    public Editor.Snapshot createSnapshot() {
        return new Editor.Snapshot(positionCursorX, positionCursorY, selectionLength, text);
    }
    public void restore(Editor.Snapshot snapshot) {
        setCursor(snapshot.positionCursorX, snapshot.positionCursorY);
        setSelectionLength(snapshot.selectionLength);
        setText(snapshot.text);
    }

    public int getPositionCursorX() {
        return positionCursorX;
    }
    public void setPositionCursorX(int positionCursorX) {
        this.positionCursorX = positionCursorX;
    }
    public int getPositionCursorY() {
        return positionCursorY;
    }
    public void setPositionCursorY(int positionCursorY) {
        this.positionCursorY = positionCursorY;
    }
    public void setCursor(int x, int y) {
        setPositionCursorX(x);
        setPositionCursorY(y);
    }
    public int getSelectionLength() {
        return selectionLength;
    }
    public void setSelectionLength(int selectionLength) {
        this.selectionLength = selectionLength;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
