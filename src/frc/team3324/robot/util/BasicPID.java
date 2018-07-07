package frc.team3324.robot.util;

public class BasicPID {
    private double integral, error, last_error, deriv, kp, ki, kd, input, goal;
    private double last_input = 0;
    public BasicPID(double kp, double ki, double kd, double input, double goal) {
        this.kp = kp;
        this.ki = ki;
        this.kd = kd;
        this.input = input;
        this.goal = goal;
    }
    public double getPID(double input, double goal) {
        error = goal - input;
        deriv = input - last_input;
        integral = integral + error;
        last_input = input;

        return (error * kp) + (integral * ki) - (deriv * kd);

    }

}
