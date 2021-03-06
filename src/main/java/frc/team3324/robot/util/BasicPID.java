package  frc.team3324.robot.util;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class BasicPID {
    private double integral, error, decelerationCoefficient, deriv, kp, ki, kd, mass, length, systemConst;
    private double last_input = 0;
    private double lastPos = 0;
    private int maxEncoder;

    public BasicPID(int maxEncoder, double mass, double length, double stallTorque, double gr) {
	    this.maxEncoder = maxEncoder;
	    this.mass = mass;
	    this.length = length; 
	    this.systemConst = (stallTorque / 12) * gr;
    }

    public double getPID(double input, double goal) {
        error = goal - input;
        deriv = input - last_input;
        integral = integral + error;
        last_input = input;

        return (error * kp) + (integral * ki) - (deriv * kd);
    }

    public void updatePID(double kp, double ki, double kd) {
    	this.kp = kp;
    	this.ki = ki;
    	this.kd = kd;
    }

    public void getPIDF(double Kp, double Ki, double Kd, double Kf, double position, double goal, double dt) { // take in P, I, D, and F coefficients, as well as position(input), your goal, as well as the time between runs (AKA the speed of your loop, this should be as consistent as possible).
        error = goal - position;
        integral = integral + error;
    }

    public double eStat(double encoderPos) {
        double convertRadians = 162.9746617;
        double radiansPos = encoderPos / convertRadians;
        double attributeConst = (Math.cos(radiansPos)) * mass * length * 9.8;
        double voltageApp = attributeConst/systemConst;
        SmartDashboard.putNumber("Voltage Applied", voltageApp);

	    return  (0.1 * (Math.cos(radiansPos))) + (voltageApp/12);
    }

    public double eDynamic(double encoderPos,double Goal) {
        double convertRadians = 162.9746617; // ticks per revolution / 2pi
        double radiansPos = encoderPos / convertRadians;
        double velocity = (radiansPos - lastPos) / 0.02;

        lastPos = radiansPos;
        double negativeVelocitySquared = -1 * (velocity * velocity);

        try {
            decelerationCoefficient = negativeVelocitySquared / (Goal - radiansPos);
        } catch(Exception e) {
            decelerationCoefficient = 0;
        }

        double inertia = decelerationCoefficient * mass * length;
        double eDynamic = inertia / systemConst;

        SmartDashboard.putNumber("eDynamic", eDynamic/12);
        return eDynamic/12;
    }
}