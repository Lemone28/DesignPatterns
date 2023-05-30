package com.patterns.abstractFactory;

public class MacFactory implements GUIComponentFactory {
    private static final String OS = "MacOS";

    @Override
    public String getOS() {
        return OS;
    }
    @Override
    public Button createButton() {
        return new MacButton();
    }
    @Override
    public Checkbox createCheckbox(String content, boolean checked) {
        return new MacCheckbox(content, checked);
    }
}
