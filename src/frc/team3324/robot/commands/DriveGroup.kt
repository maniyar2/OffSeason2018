package frc.team3324.commands

import frc.team3324.Robot;
import frc.team3324.commands.teleop.DriveTank;

import edu.wpi.first.wpilibj.command.CommandGroup;


public class DriveGroup extends CommandGroup {
    public DriveGroup {
        this.addParallel(new DriveTank);
    }
}