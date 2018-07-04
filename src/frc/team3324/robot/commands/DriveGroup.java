package frc.team3324.robot.commands;

import frc.team3324.robot.OI;
import frc.team3324.robot.Robot;
import frc.team3324.robot.commands.teleop.ClimberSlideDown;
import frc.team3324.robot.commands.teleop.ClimberSlideUp;
import frc.team3324.robot.commands.teleop.ControlArm;
import frc.team3324.robot.commands.teleop.DriveTank;
import frc.team3324.robot.commands.teleop.LaunchCube;
import frc.team3324.robot.commands.teleop.PressureSwitch;
import frc.team3324.robot.commands.teleop.Winches;


import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Group of commands that need to be run during teleop<br><br>
 *
 * Feb 5: Refactored. Also, added Javadocs - Cameron
 *
 */
public class DriveGroup extends CommandGroup {

	/**
	 * Adds teleop commands to be run in parallel:<br>
	 * &emsp;DriveTank<br>
	 * &emsp;PressureSwitch<br>
	 * &emsp;ControlArm<br>
	 */
	public DriveGroup() {
		this.addParallel(new DriveTank()); //gamepad0, joysticks
		this.addParallel(new ControlArm()); //gamepad1, left joystick
		this.addParallel(new LaunchCube());
	}

}
