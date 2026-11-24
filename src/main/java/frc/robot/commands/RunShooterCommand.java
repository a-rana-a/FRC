package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShooterSubsystem;

public class RunShooterCommand extends Command{
    private final ShooterSubsystem m_shooter;
    private final double m_speed;

    public RunShooterCommand(ShooterSubsystem shooter, double speed){
        m_shooter = shooter;
        m_speed = speed;
        addRequirements(shooter);
    }

    @Override
    public void execute(){
        m_shooter.setSpeed(m_speed);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted){
        m_shooter.stop();
    }
}
