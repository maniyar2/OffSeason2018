package frc.team3324.robot

import frc.team3324.robot.subsystems.DriveTrain
import frc.team3324.robot.commands.DriveGroup

import edu.wpi.first.wpilibj.command.Scheduler
import edu.wpi.first.wpilibj.IterativeRobot

class Robot: IterativeRobot() {

    val scheduler: Scheduler = Scheduler.getInstance()
    companion object {
    }

    override fun robotInit() {
        DriveTrain
    }

    override fun disabledInit() {

    }

    fun disabldPeriodic() {

    }

    override fun autonomousInit() {

    }

    override fun autonomousPeriodic() {

    }
    override fun teleopInit() {
	    scheduler.add(DriveGroup());
    }

    override fun teleopPeriodic() {
        scheduler.run();
    }
}