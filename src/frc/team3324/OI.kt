package frc.team3324

import frc.team3324.util.MetroController

import edu.wpi.first.wpilibj.XboxController
import edu.wpi.first.wpilibj.GenericHID.Hand
import edu.wpi.first.wpilibj.buttons.Button
import edu.wpi.first.wpilibj.buttons.JoystickButton
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard

object OI {
    val gamepad0 = XboxController(0)
    val gamepad1 = XboxController(1)


    // Primary driver buttons
    val aButton0 = new JoystickButton(gamepad0, MetroController.BUTTON_A);

	val leftTrigger0 = new JoystickButton(gamepad0, MetroController.LT);
	val rightTrigger0 = new JoystickButton(gamepad0, MetroController.RT);

	val rightBumper0 = new JoystickButton(gamepad0, MetroController.RB);

	/**
	 * Secondary driver buttons assignments
	 */
	val aButton1 = JoystickButton(gamepad1, MetroController.BUTTON_A);
	val bButton1 = JoystickButton(gamepad1, MetroController.BUTTON_B);
	val xButton1 = JoystickButton(gamepad1, MetroController.BUTTON_X);
	val yButton1 = JoystickButton(gamepad1, MetroController.BUTTON_Y);

	val leftButton1 = JoystickButton(gamepad1, MetroController.BUTTON_BACK);
	val rightButton1 = JoystickButton(gamepad1, MetroController.BUTTON_START);

	val leftJoystickButton1 = JoystickButton(gamepad1, MetroController.JOYSTICK_LEFT_CLICK);
	val rightJoystickButton1 = JoystickButton(gamepad1, MetroController.JOYSTICK_RIGHT_CLICK);

	val leftBumper1 = JoystickButton(gamepad1, MetroController.LB);
    val rightBumper1 = JoystickButton(gamepad1, MetroController.RB);


	//Joysticks
	fun get0LeftY() = return gamepad0.getY(Hand.kLeft)
	fun get0RightX() = return gamepad0.getX(Hand.kRight)
	fun get1RightY() = return gamepad1.getY(Hand.kRight)
	fun get1leftX() = return gamepad1.getX(Hand.kLeft)

	/*Digital Inputs */

	//A-B-Y-X buttons
 	fun get0APressed() = return gamepad0.getAButton()
	fun get0BPressed() = return gamepad0.getBButton()
	fun get0YPressed() = return gamepad0.getYButton()
	fun get0XPressed() = return gamepad0.getXButton()

	fun get1APressed() = return gamepad1.getAButton()
	fun get1BPressed() = return gamepad1.getBButton()
	fun get1YPressed() = return gamepad1.getYButton()
	fun get1XPressed() = return gamepad1.getXButton()

	// Bumpers
	fun get0RightBumper() = return gamepad0.getBumper(Hand.kRight)
	fun get0LeftBumper() = return gamepad0.getBumper(Hand.kLeft)
	fun get1RightBumper() = return gamepad1.getBumper(Hand.kRight)
	fun get1LeftBumper() = return gamepad1.getBumper(Hand.kLeft)


}