package org.usfirst.frc.team2641.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.SpeedController;

public class Robot extends IterativeRobot
{
	//fields of Robot class
	DifferentialDrive drivetrain;
	Joystick stick;
	Timer timer;
	
	public void robotInIt()
	{
		 drivetrain = new DifferentialDrive();
         stick = new Joystick(1);
         timer = new Timer();
	}
	
	public void autonomousInit() { //This method is called once each time the robot enters autonomous mode
	     timer.reset(); // Resets the timer to 0
	     timer.start(); // Start counting
	}

	public void autonomousPeriodic() { //This method is called each time the robot recieves a packet instructing the robot to be in autonomous enabled mode
	     // Drive for 2 seconds
	     if (timer.get() < 2.0) {
	          drivetrain.tankDrive(-0.5, 0.0); // drive forwards half speed
	     } else {
	          drivetrain.tankDrive(0.0, 0.0); // stop robot
	     }
	}

}
