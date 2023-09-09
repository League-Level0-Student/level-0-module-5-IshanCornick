package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Enter a number I will tell you if it is prime.");
		int number = Integer.parseInt(answer);
		for (int i =2;i<number;i++) {
			if (number%i==0) {
				JOptionPane.showMessageDialog(null, "Your number "  + answer + " is not prime");
				System.exit(0);
			}
		}
		JOptionPane.showMessageDialog(null, "Your number " + answer + " is prime");
		}
		
	}