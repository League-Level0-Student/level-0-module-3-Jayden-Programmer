package _01_else_if._1_robot_color_chooser;

//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot rob = new Robot();
		// 3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 10; i++) {
		
		String color = JOptionPane.showInputDialog(null, "what color would you like the robot to draw?");
		// 5. Use an if/else statement to set the pen color that the user requested
		if (color.equals("red")) {
		rob.setPenColor(Color.red);
		}
		else if (color.equals("blue")) { 
		rob.setPenColor(Color.blue);
		}
		else if (color.equals("green")) { 
		rob.setPenColor(Color.green);
		}
		else if (color.equals("yellow")) {
		rob.setPenColor(Color.yellow); 
		}
		else if (color.equals("black")) {
		rob.setPenColor(Color.black);
		}
		else if(color.equals("pink")) {
		rob.setPenColor(Color.pink); 
		}
		// 6. If the user doesn't enter anything, choose a random color
		else {
		rob.setRandomPenColor(); 
		}
		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them
		
			
		 

		// 4. Set the pen width to 10
		rob.setPenWidth(10);
		// 2. Make the robot draw a shape (this will take more than one line of code)
		for (int a = 0; a < 360; a++) { 
		rob.setSpeed(100);
		rob.penDown();
		rob.move(1);
		rob.turn(1);
		
		
		}
	}
}
}

