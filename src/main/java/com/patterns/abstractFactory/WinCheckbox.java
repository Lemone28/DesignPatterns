package com.patterns.abstractFactory;

public class WinCheckbox implements Checkbox {
    private static final String OS = "Windows";
    private boolean checked;

    @Override
    public String getOsStyle() {
        return OS;
    }

    @Override
    public String getContent() {
        return "Text checkbox";
    }

    @Override
    public boolean isChecked() {
        return checked;
    }

    @Override
    public void render() {
        System.out.println("Render the checkbox in " + getOsStyle() + " style");
    }
}
