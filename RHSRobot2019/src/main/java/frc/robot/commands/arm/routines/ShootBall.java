/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.arm.routines;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.RobotMap.BallTarget;

public class ShootBall extends CommandGroup {
  /**
   * Add your docs here.
   */
  public ShootBall() {

  }

  public ShootBall(BallTarget target){

    //AIM with LIMELIGHT

    //ARM POS, ADJUST DISTANCE, AND FIRE
    if(target == BallTarget.kMID){

    } else if(target == BallTarget.kLOW){

    } else if(target == BallTarget.kCARGO){

    }
  }
}
