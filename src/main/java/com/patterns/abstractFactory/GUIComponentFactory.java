package com.patterns.abstractFactory;

public interface GUIComponentFactory {
    String getOS();
    Button createButton();
    Checkbox createCheckbox(String content, boolean checked);
}
