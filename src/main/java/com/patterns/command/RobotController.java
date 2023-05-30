package com.patterns.command;

import java.util.Objects;

public class RobotController {
    private Robot robot;
    private Command forwardCommand;
    private Command backwardCommand;

    public RobotController(Robot robot) {
        this.robot = Objects.requireNonNull(robot);
        this.forwardCommand = new MoveRobotForward(robot);
        this.backwardCommand = new MoveRobotBackward(robot);
    }

    public void clickButtonForward() {
        forwardCommand.execute();
    }
    public void clickButtonBackward() {
        backwardCommand.execute();
    }
}
