package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
		String goofy = JOptionPane.showInputDialog("Enter your name");
		// 2. Print upper case name to the console using .toUpperCase()
		String upper = goofy.toUpperCase();
		System.out.println(upper);
		//    Run your program to see that this works.
	
		// 3. Loop through each character of the name (steps 4 - 7).
		//    HINT: Use .length() to determine the number of characters in the String.
		for (int i = 0;i < goofy.length();i++) {
			char amazon = goofy.charAt(i);
			if (i%2==0) {
				goofyName += Character.toUpperCase(amazon);
			}else {
				goofyName += Character.toLowerCase(amazon);
			}
			
	
			
		}
		JOptionPane.showMessageDialog(null, goofyName);
		// 4. Create a char variable to store the next character of the name
				//    use .charAt()
	
				
				// 5. Use MODULO operator (%) to identify if it is an EVEN or ODD character.
			
			
				// 6. Even characters should be made uppercase and odd characters made lowercase
				//    HINT: use Character.toUpperCase() or Character.toLowerCase()
	
			
				// 7. ADD the char to the end of the goofyName String

		
		// 8. Use pop-up to show user their Goofy name

	}
}

