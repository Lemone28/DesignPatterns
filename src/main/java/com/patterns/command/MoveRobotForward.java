package com.patterns.command;

public class MoveRobotForward extends AbstractRobotCommand {
    public MoveRobotForward(Robot robot) {
        super(robot);
    }

    @Override
    public void execute() {
        robot.moveForward();
    }
}
