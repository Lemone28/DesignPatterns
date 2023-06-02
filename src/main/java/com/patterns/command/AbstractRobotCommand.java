package com.patterns.command;

import java.util.Objects;

public abstract class AbstractRobotCommand implements Command {
    protected Robot robot;

    public AbstractRobotCommand(Robot robot) {
        this.robot = Objects.requireNonNull(robot);
    }
}
