/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.arm.routines;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.RobotMap.ArmPosition;
import frc.robot.commands.PID.ConstantLeftIntakePID;
import frc.robot.commands.PID.ConstantRightIntakePID;
import frc.robot.commands.PID.ManualArmPID;
import frc.robot.commands.PID.ManualBackFingerPID;
import frc.robot.commands.PID.ManualFrontFingerPID;
import frc.robot.commands.PID.ManualWristPID;
import frc.robot.commands.arm.RunIntakeEnds;

public class PickupBallGround extends CommandGroup {
  /**
   * Add your docs here.
   */
  public PickupBallGround() {
    addParallel(new PositionArm(ArmPosition.BALL_PICKUP));
    addSequential(new RunIntakeEnds(7, -.3, .3));
    //addParallel(new ManualLeftIntakePID(0, 3));
    //addParallel(new ManualRightIntakePID(0, 3));
    addParallel(new ManualBackFingerPID(115, 2));
    addSequential(new ManualFrontFingerPID(115, 2));
    addParallel(new ConstantLeftIntakePID(0, 3));
    addSequential(new ConstantRightIntakePID(0, 3));
    addSequential(new ManualArmPID(0, 2));
    addSequential(new ManualWristPID(0, 2));
  }
}
