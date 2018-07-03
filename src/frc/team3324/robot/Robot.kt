package frc.team3324.robot

import frc.team3324.subsystems.DriveTrain

import edu.first.wpilibj.*
import edu.wpi.first.wpilibj.command.Scheduler

class Robot: IterativeRobot() {


    companion object {
    val scheduler: Scheduler = Scheduler.getInstance()
    public val mDriveTrain = DriveTrain;
    }

    override fun robotInit() {

    }

    override fun disabledInit() {

    }

    override fun disabldPeriodic() {

    }

    override fun autonomousInit() {

    }

    override fun autonomousPeriodic() {

    }
    override fun teleopInit() {
	scheduler.add(new DriveGroup());
    }

    override fun teleopPeriodic() {
    scheduler.run();
    }
}