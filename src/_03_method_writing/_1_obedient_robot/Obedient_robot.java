package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_robot {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.hide();
		rob.setSpeed(97654387);
		String shape = JOptionPane.showInputDialog("What shape do you want?");
		
		
		if (shape.equals("square")) {
		rob.setRandomPenColor();
		Square(rob);
		}
		if (shape.equals("triangle")) {
		rob.setRandomPenColor();
		Triangle(rob);
		}
		if (shape.equals("circle")) {
		rob.setRandomPenColor();
		Circle(rob);
		}
	}
	static void Square(Robot rob) {
		for (int i = 1; i<5; i++) {
			rob.penDown();
			rob.move(50);
			rob.turn(90);
		}
	}
	static void Triangle(Robot rob) {
		for (int i = 1; i<4; i++) {
			rob.penDown();
			rob.move(50);
			rob.turn(120);
		}
	}	
	static void Circle(Robot rob) {
		for (int i = 1; i<360; i++) {
			rob.penDown();
			rob.move(1);
			rob.turn(1);
		}
	}	
	}
	