package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.LimelightHelpers;
import frc.robot.subsystems.SwerveSub;
import frc.robot.subsystems.LimeLightSub;

public class LockOnCMD extends CommandBase {

    public final SwerveSub swerveSubsystem;
    public final LimeLightSub limeLightSub ;

    private final int adjustButton = 0;

    public LockOnCMD(SwerveSub swerveSubsystem ,LimeLightSub limeLightSub){
        this.swerveSubsystem = swerveSubsystem;
        this.limeLightSub = limeLightSub;

        addRequirements(swerveSubsystem);
        addRequirements(limeLightSub);
    }

    @Override
    public void execute(){
        System.out.println(limeLightSub.calculateDistanceFromTarget());
        double adjust = limeLightSub.steerMotorToTarget(LimelightHelpers.getTX(getName()));
        //swerveSub.setMotors( adjust, -adjust);

    }





    
}