package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    private final double maxSpeed = 0.8;

    /**
     *  this method gives you the maximum speed
     * @return the maximum allowed intake speed (from 0.0 to 1.0)
    */
    public double getMaxSpeed(){
        return maxSpeed;
    }

    public void setSpeed(double speed){
        System.out.println("The speed is set to: "+speed);
    }
}
