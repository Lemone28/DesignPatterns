package com.patterns.abstractFactory;

public class MacCheckbox implements Checkbox{
    private static final String OS = "MacOS";
    private String content;
    private boolean checked;

    public MacCheckbox(String content, boolean isChecked) {
        this.content = content;
        this.checked = false;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public boolean isChecked() {
        return checked;
    }

    @Override
    public String getOsStyle() {
        return OS;
    }

    @Override
    public void render() {
        System.out.println("Render the checkbox in " + getOsStyle() + " style");
    }
}
