package com.patterns.command;

public class MoveRobotBackward extends AbstractRobotCommand {

    public MoveRobotBackward(Robot robot) {
        super(robot);
    }

    @Override
    public void execute() {
        robot.moveBackward();
    }
}
