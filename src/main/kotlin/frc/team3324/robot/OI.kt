package frc.team3324.robot;

import edu.wpi.first.wpilibj.XboxController
import edu.wpi.first.wpilibj.GenericHID.Hand
import edu.wpi.first.wpilibj.buttons.Button
import edu.wpi.first.wpilibj.buttons.JoystickButton
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard

object OI {
    val gamepad0 = XboxController(0)
    val gamepad1 = XboxController(1)


    // Primary driver buttons

	/**
	 * Secondary driver buttons assignments
	 */

	//Joysticks
	fun get0LeftY(): Double {
        return gamepad0.getY(Hand.kLeft)
    }

	fun get0RightX(): Double {
        return gamepad0.getX(Hand.kRight)
    }

	fun get1RightY(): Double {
        return gamepad1.getY(Hand.kRight)
    }

	fun get1leftX(): Double {
        return gamepad1.getX(Hand.kLeft)
    }

	/*Digital Inputs */
	//A-B-Y-X buttons
 	fun get0APressed(): Boolean {
        return gamepad0.getAButton()
    }
	fun get0BPressed(): Boolean {
        return gamepad0.getBButton()
    }

	fun get0YPressed(): Boolean {
        return gamepad0.getYButton()
    }

    fun get0XPressed(): Boolean {
        return gamepad0.getXButton()
    }

    fun get1APressed(): Boolean {
        return gamepad1.getAButton()
    }
	fun get1BPressed(): Boolean {
        return gamepad1.getBButton()
    }
	fun get1YPressed(): Boolean {
        return gamepad1.getYButton()
    }
	fun get1XPressed(): Boolean {
        return gamepad1.getXButton()
    }

	// Bumpers
	fun get0RightBumper(): Boolean  {
        return gamepad0.getBumper(Hand.kRight)
    }

    fun get0LeftBumper():Boolean {
        return gamepad0.getBumper(Hand.kLeft)
    }

    fun get1RightBumper(): Boolean {
        return gamepad1.getBumper(Hand.kRight)
    }

    fun get1LeftBumper(): Boolean {
        return gamepad1.getBumper(Hand.kLeft)
    }


}