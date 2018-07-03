package frc.team3324.subsystems

import frc.team3324.Robot
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX

import com.kauailabs.navx.frc.AHRS

import edu.wpi.first.wpilibj.*
import edu.wpi.first.wpilibj.SpeedControllerGroup
import edu.wpi.first.wpilibj.Encoder
import edu.wpi.first.wpilibj.drive.DifferentialDrive
import edu.wpi.first.wpilibj.command.Subsystem

object DriveTrain: Subsystem() {
    private val flMotor = VictorSPX(Constants.flMotorPort)
    private val blMotor = VictorSPX(Constants.blMotorPort)
    private val lMotors = SpeedControllerGroup(flMotor, blMotor)


    private val frMotor = VictorSPX(Constants.frMotorPort)
    private val brMotor = VictorSPX(Constants.brMotorPort)
    private val rMotors = SpeedControllerGroup(frMotor, brMotor)

    private val mDrive = DifferentialDrive(lMotors, rMotors)


    private val leftEncoder = Encoder(Constants.leftEncoderPortA, Constants.leftEncoderPortB, false, Encoder.EncodingType.k4X)
    private val rightEncoder = Encoder(Constants.rightEncoderPortA, Constants.rightEncoderPortB, false, Encoder.EncodingType.k4X)


    fun arcadeDrive(xSpeed: Double, ySpeed: Double) {
        mDrive.arcadeDrive(xSpeed, ySpeed, false);
    }

}