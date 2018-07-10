package frc.team3324.robot.commands.teleop;

import frc.team3324.robot.Robot;
import frc.team3324.robot.subsystems.DriveTrain;
import frc.team3324.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

public object DriveTank : Command() {
    fun DriveTank() {

    }
    init {
        this.requires(DriveTrain)
        this.isInterruptible = true
    }
    override fun execute() {
        var leftY = OI.get0LeftY()
        var rightX = OI.get0RightX()
        Robot.mDriveTrain.arcadeDrive(leftY, rightX)
    }
    override fun isFinished() = false
    override fun end() = Robot.mDriveTrain.arcadeDrive(0.0, 0.0)
    override fun interrupted() = this.end()
}