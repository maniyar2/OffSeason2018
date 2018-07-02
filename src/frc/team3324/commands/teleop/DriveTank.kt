package frc.team3324.commands.teleop;

import frc.team3324.Robot;
import frc.team3324.subsystems.DriveTrain;
import frc.team3324.OI;

class DriveTank() {
    init {
        this.requires(DriveTrain)
        this.isInterruptible = true
    }
    override fun execute() {
        leftY = OI.get0LeftY;
        rightX = OI.get0RightX;
        Robot.mDriveTrain.arcadeDrive(leftY, rightX)
    }
    override fun isFinished() = false
    override fun end() = Robot.mDriveTrain.arcadeDrive(0, 0)
    override fun interrupted() = this.end()
}