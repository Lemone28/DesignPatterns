package com.patterns.abstractFactory;

public class WinCheckbox implements Checkbox {
    private static final String OS = "Windows";
    private String content;
    private boolean checked;

    public WinCheckbox(String content, boolean isChecked) {
        this.content = content;
        this.checked = false;
    }

    @Override
    public String getOsStyle() {
        return OS;
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
    public void render() {
        System.out.println("Render the checkbox in " + getOsStyle() + " style");
    }
}
