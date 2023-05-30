package com.patterns.abstractFactory;

public class WinFactory implements GUIComponentFactory {
    private static final String OS = "Windows";

    @Override
    public String getOS() {
        return OS;
    }

    @Override
    public Button createButton() {
        return new WinButton();
    }
    @Override
    public Checkbox createCheckbox(String content, boolean checked) {
        return new WinCheckbox(content, checked);
    }
}
