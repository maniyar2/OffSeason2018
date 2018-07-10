package frc.team3324.robot

import frc.team3324.robot.subsystems.DriveTrain
import frc.team3324.robot.commands.DriveGroup

import edu.wpi.first.wpilibj.command.Scheduler
import edu.wpi.first.wpilibj.IterativeRobot

class Robot: IterativeRobot() {


    companion object {
        val scheduler: Scheduler = Scheduler.getInstance()
        public val mDriveTrain = DriveTrain;
    }

    override fun robotInit() {

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