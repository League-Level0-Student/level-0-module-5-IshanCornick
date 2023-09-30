package _03_method_writing._4_calculator;

import java.util.Random;

import javax.swing.JOptionPane;

public class Calculator {

	//GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);

		// 3) Call the correct method depending on what option the user chooses
		int a = 0;
		if (a == 0) {
		if (task == 3) {
			a = add(number1,number2);
		}
		if (task == 2) {
			a = sub(number1,number2);
		}
		if (task == 1) {
			a = mult(number1,number2);
		}
		if (task == 0) {
			a = div(number1,number2);
		}
		// 4) Call the result() method and put the answer in a pop-up
		JOptionPane.showMessageDialog(null, result(a));
		}
	}
	
	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//		They should each take 2 numbers as parameters
	//		and return the answer.
	static int add(int number1,int number2) {
		int answer1 = number1 + number2;
		return answer1;
	}
	static int div(int number3,int number4) {
		int answer1 = number3 / number4;
		return answer1;
	}
	static int mult(int number5,int number6) {
		int answer1 = number5 * number6;
		return answer1;
	}
	static int sub(int number7,int number8) {
		int answer1 = number7 - number8;
		return answer1;
	}
	
	static String result(int answer1) {
		return "Your answer is " + answer1;
	}

	// 2) Make a static method called " result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;

	
}
