package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ShooterSubsystem extends SubsystemBase{
    private final PWMSparkMax shooterMotor = new PWMSparkMax(Constants.ShooterConstants.kMotorChannel);
    private double currentSpeed = shooterMotor.get();

    public void setSpeed(double speed){
        double clampedSpeed = MathUtil.clamp(speed, -Constants.ShooterConstants.kMaxSpeed, Constants.ShooterConstants.kMaxSpeed);
        shooterMotor.set(clampedSpeed);
        currentSpeed = clampedSpeed;

    }

    public void stop(){
        shooterMotor.stopMotor();
        currentSpeed = 0.0;
    }

    @Override
    public void periodic(){
        SmartDashboard.putNumber("Shooter hizi: ", currentSpeed);
    }

}
