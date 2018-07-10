package frc.team3324.robot

import kotlin.math.PI

object Constants {

    //Drivetrain motors
    const val flMotorPort = 6
    const val blMotorPort = 4
    const val frMotorPort = 0
    const val brMotorPort = 2
    // Encoders
    const val leftEncoderPortA = 0
    const val leftEncoderPortB = 1
    const val rightEncoderPortA = 2
    const val rightEncoderPortB = 3
    const val encoderTicksPerRevolution = 1024 // Ticks per rev of the encoder, NOT pulses
    const val encoderGearRatio = 7.5 // Gear ratio between output shaft and the encoder
    // Encoder physical values
    const val wheelCircumference = 18.85 // Inches
    const val wheelDiameter = 6 // Inches
}