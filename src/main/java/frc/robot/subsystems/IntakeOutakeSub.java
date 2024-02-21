package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class IntakeOutakeSub extends SubsystemBase {
    private CANSparkMax intakeMotor = new CANSparkMax(DriveConstants.kIntakeMotorID, MotorType.kBrushless);
   
    public void IntakeSub(){
    }

    public void Intake(boolean open){
        if(open){
            intakeMotor.set(-0.5);
        }


    }
    public void Outake(boolean open){
        intakeMotor.set(0.5);   
    }

    
}
