package frc.team3324.robot.util;

public class BasicPID {
    private double integral, error, last_error, deriv, kp, ki, kd, input, goal, stationary_force, mass, length, systemConst;
    private double last_input = 0;
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
	deriv = input - last_input;
	integral = integral + error;
	last_input = input;
	

    }

    public double eStat(double encoderPos) {
	 
	double convertRadians = maxEncoder/2*(Math.PI);
	double radiansPos = encoderPos/convertRadians;
	double attributeConst = (Math.cos(radiansPos)) * mass * length * 9.8;
	double voltageApp = attributeConst/systemConst;

	return voltageApp/12;
    }
    

}
