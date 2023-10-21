package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();
	public void run() {
		// Check the recipe to find out what code to put here
		rob.setX(50);
		rob.setY(500);
		rob.setSpeed(50);
		rob.setPenWidth(10);
		rob.penDown();
		house("small", 0,20,200);
		house("large", 40,50,100);
		house("medium",200,180, 10);
		house("small", 204,80,100);
		house("small", 125,65,94);
		house("large", 73,198,4);
		house("small",3,64,249);
		house("medium",34,1,219);
		house("large",80,20,235);
		house("small",255,216,155);
	}
	
	public void house(String height, int r, int g, int b) {
		int heightN = 0;
		if(height.equals("small")) {
			heightN = 60;
		}
		else if(height.equals("medium")) {
			heightN = 120;
		}
		else {
			heightN = 250;
		}
		rob.setPenColor(r, g, b);
		rob.move(heightN);
		rob.turn(90);
		rob.move(40);
		rob.turn(90);
		rob.move(heightN);
		rob.turn(-90);
		rob.setPenColor(0, 200, 0);
		rob.move(30);
		rob.turn(-90);
	}
}
