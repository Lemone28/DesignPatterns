package com.patterns.snapshot;

public class Editor {
    private int positionCursorX;
    private int positionCursorY;
    private int selectionLength;
    private String text;

    public Editor() {
        setCursor(0, 0);
        setSelectionLength(0);
        setText("");
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
