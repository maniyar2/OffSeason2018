package frc.team3324.robot.commands.auto

import frc.team3324.robot.Constants
import frc.team3324.robot.Robot
import frc.team3324.robot.subsystems.DriveTrain

import edu.wpi.first.wpilibj.command.Command
import edu.wpi.first.wpilibj.Notifier;

public object JaciPathfind: Command() { // Class is WIP, getting teleop done first!

    override fun initialize() {

    }
    override fun execute() {

    }
    override fun isFinished() = false
    override fun end() = Robot.mDriveTrain.arcadeDrive(0.0, 0.0)
    override fun interrupted() = this.end()
}