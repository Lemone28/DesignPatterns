package com.patterns.abstractFactory;

public class WinButton implements Button {
    private static final String OS = "Windows";

    @Override
    public String getOsStyle() {
        return OS;
    }

    @Override
    public void onClick() {
        System.out.println("Click on button in " + getOsStyle());
    }

    @Override
    public void render() {
        System.out.println("Render the button in " + getOsStyle() + " style");
    }
}
