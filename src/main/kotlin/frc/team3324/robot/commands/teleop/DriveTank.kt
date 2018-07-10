package frc.team3324.robot.commands.teleop;

import frc.team3324.robot.Robot;
import frc.team3324.robot.subsystems.DriveTrain;
import frc.team3324.robot.OI;

import edu.wpi.first.wpilibj.command.Command
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard

public object DriveTank : Command() {

    init {
        this.requires(DriveTrain)
        this.isInterruptible = true
    }
    override fun execute() {
        var leftY = OI.get0LeftY()
        var rightX = OI.get0RightX()
        DriveTrain.mDrive.arcadeDrive(leftY, rightX, false)
        SmartDashboard.putNumber("LeftY:", leftY)
    }
    override fun isFinished() = false
    override fun end() = DriveTrain.mDrive.arcadeDrive(0.0, 0.0, false)
    override fun interrupted() = this.end()
}