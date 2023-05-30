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
