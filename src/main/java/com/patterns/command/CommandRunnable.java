package com.patterns.command;

import com.patterns.AbstractRunnable;

public class CommandRunnable extends AbstractRunnable {
    @Override
    public void run() {
        Robot robot = new Robot();
        RobotController controller = new RobotController(robot);

        controller.clickButtonForward();
        controller.clickButtonBackward();
    }
}
