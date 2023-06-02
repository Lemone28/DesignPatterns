package com.patterns.abstractFactory;

import com.patterns.AbstractRunnable;

public class AbstractFactoryRunnable extends AbstractRunnable {
    @Override
    public void run() {
        GUIComponentFactory factory = new WinFactory();

        GUIComponent[] buttons = {
                factory.createButton(),
                factory.createCheckbox("Text WinCheckbox", false),
        };

        factory = new MacFactory();

        GUIComponent[] checkboxes = {
                factory.createButton(),
                factory.createCheckbox("Text MacCheckbox", false)
        };

        for(GUIComponent b : buttons) {
            b.render();
        }
        for(GUIComponent c : checkboxes) {
            c.render();
        }
    }
}
