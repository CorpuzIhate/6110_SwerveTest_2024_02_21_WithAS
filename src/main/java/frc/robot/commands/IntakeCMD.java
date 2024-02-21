package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeOutakeSub;


public class IntakeCMD extends CommandBase {
    private final IntakeOutakeSub intakeOutakeSub;

    public IntakeCMD(IntakeOutakeSub intakeOutakeSub){
        this.intakeOutakeSub = intakeOutakeSub;
    }
    @Override
    public void execute() {
        intakeOutakeSub.Intake(true);
    }
}
