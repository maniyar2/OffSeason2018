package frc.team3324.robot.subsystems

import frc.team3324.robot.Robot
import frc.team3324.robot.Constants

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX

import com.kauailabs.navx.frc.AHRS

import edu.wpi.first.wpilibj.*
import edu.wpi.first.wpilibj.SpeedControllerGroup
import edu.wpi.first.wpilibj.Encoder
import edu.wpi.first.wpilibj.drive.DifferentialDrive
import edu.wpi.first.wpilibj.command.Subsystem

object DriveTrain: Subsystem() {
    private val flMotor = WPI_VictorSPX(Constants.flMotorPort)
    private val blMotor = WPI_VictorSPX(Constants.blMotorPort)
    private val lMotors = SpeedControllerGroup(flMotor, blMotor)


    private val frMotor = WPI_VictorSPX(Constants.frMotorPort)
    private val brMotor = WPI_VictorSPX(Constants.brMotorPort)
    private val rMotors = SpeedControllerGroup(frMotor, brMotor)

    val mDrive = DifferentialDrive(lMotors, rMotors)

    private val leftEncoder = Encoder(Constants.leftEncoderPortA, Constants.leftEncoderPortB, false)
    private val rightEncoder = Encoder(Constants.rightEncoderPortA, Constants.rightEncoderPortB, false)

    override fun initDefaultCommand() {

    }
}