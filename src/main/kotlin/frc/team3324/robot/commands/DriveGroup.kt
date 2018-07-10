package frc.team3324.robot.commands

import frc.team3324.robot.Robot
import frc.team3324.robot.commands.teleop.DriveTank

import edu.wpi.first.wpilibj.command.CommandGroup

public class DriveGroup(): CommandGroup() {
    fun DriveGroup() {
        this.addParallel(DriveTank)
    }
}