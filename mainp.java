/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: 02/2/YYYY
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here:Dagim Abeje
*/

import java.util.Scanner;
import java.util.*; // * is for wild card
import java.io.*; // For File Input/Output
import java.util.Scanner; // For File Input
public class mainp {

	public static void main(String[] args) throws java.io.IOException {
		String play_again = "yes";
		int correct_guesses = 0;
		System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		System.out.println("Welcome to ESP - extrasensory perception!");
		Scanner scan = new Scanner(System.in);
		while(play_again.equalsIgnoreCase("yes")) {
			System.out.println("Would you please choose one of the 4 options from the menu: \n");

		
		
		System.out.println("1- read and display on the screen first 16 names "
				+ "of colors from a file colors.txt, "
				+ "so the player can select one of them names "
				+ "of colors.");
		System.out.println("2- read and display on the screen first 10 names "
				+ "of colors from a file colors.txt, "
				+ "so the player can select one of them names "
				+ "of colors.");
		System.out.println("3- read and display on the screen first 5 names "
				+ "of colors from a file colors.txt, "
				+ "so the player can select one of them names "
				+ "of colors.");
		System.out.println("4- Exit form a program");
		System.out.print("Enter the option: ");
		
		
		int option_number = scan.nextInt();
		scan.nextLine();
		
		if(option_number == 4) {
			System.out.print("\n");
			break;
		}
		
		int color_number = 0;
		System.out.print("Enter the filename: ");
		String file_name = scan.next();
		
		
		File color_file = new File(file_name);
		Scanner colors = new Scanner(color_file);
		System.out.println( "There are sixteen colors from a file: ");

		if(option_number == 1) {
			
			color_number = 16;
			for(int i = 1; i <= color_number; i++) {
			
				String the_color = colors.nextLine(); 
			
				System.out.println(i + " " +the_color);
				
			}
		}
		else if(option_number == 2) {
			
			color_number = 10;
			for(int i = 1; i <= color_number; i++) {
				String the_color = colors.nextLine(); 
			
				System.out.println(i + " " +the_color);
				
			}
			
		}
		
		else if(option_number == 3) {
			
			color_number = 5;
			for(int i = 1; i <= 5; i++) {
				
				String the_color = colors.nextLine(); 
			
				System.out.println(i + " " + the_color);	
			}
		}
		
		
		System.out.print("\n");
		for(int i = 1; i <= 3; i++) {
			
		System.out.println("Round " + i + "\n");
		
		//--------------------RCG------------------
	    String color1 = "black";
        String color2 = "white";
        String color3 = "gray";
        String color4 = "silver";
        String color5 = "maroon";
        String color6 = "red";
        String color7 = "purple";
        String color8 = "fuchasia";
        String color9 = "gray";
        String color10 = "silver";
        String color11 = "maroon";
        String color12 = "red";
        String color13 = "navy";
        String color14 = "blue";
        String color15 = "teal";
        String color16 = "aqua";
        
        // Generate a random index
        Random random = new Random();
        int randomIndex = random.nextInt(color_number);
        
        // Select and print a random color
        String selected_color;
        
        switch (randomIndex) {
            case 0: selected_color = color1; break;
            case 1: selected_color = color2; break;
            case 2: selected_color = color3; break;
            case 3: selected_color = color4; break;
            case 4: selected_color = color5; break;
            case 5: selected_color = color6; break;
            case 6: selected_color = color7; break;
            case 7: selected_color = color8; break;
            case 8: selected_color = color9; break;
            case 9: selected_color = color10; break;
            case 10: selected_color = color11; break;
            case 11: selected_color = color12; break;
            case 12: selected_color = color13; break;
            case 13: selected_color = color14; break;
            case 14: selected_color = color15; break;
            
            default: selected_color = color16; break;
        }
	
        	
        	
	
	//-----------------End of Random Color generator-----------------------------------------------
	
			
		System.out.println("I am thinking of a color.");
		System.out.println("Is it one of list of colors above?");
		System.out.println("Enter your guess: ");
		String user_guess = scan.next();
		
		if(user_guess.equalsIgnoreCase(selected_color)) {
    		
    		correct_guesses++;
    		
    	}
    	
		System.out.println("\nI was thinking of " + selected_color);
		
		
		}
		System.out.println("Game Over \n");
		colors.close();
		
		System.out.println("You guessed " + correct_guesses + " out of 3 colors correctly.\n");
		System.out.println("Would you like to continue a Game? Type Yes/No ");
		play_again = scan.next();
		
		colors.close();
		
		}//while
		System.out.print("Enter your name: ");
		String user_name = scan.next();
		System.out.print("Describe yourself: ");
		String user_description = scan.next();
		System.out.print("Due Date: ");
		String due_date = scan.next();
		
		System.out.print("Username: " + user_name + "\n");
		System.out.print("User Description: " + user_description + "\n");
		System.out.print("Date: " + due_date);
		
		
		File out_file = new File("EspGameResults.txt");
		FileWriter tw = new FileWriter(out_file);
		
		tw.write("Game Over \n");
		tw.write("You guessed " + correct_guesses + " out of 3 colors correctly.\n");
		tw.write("Due Date: ");
		String due_date2 = scan.next();
		tw.write("Username: " + user_name + "\n");
		tw.write("User Description: " + user_description + "\n");
		tw.write("Date: " + due_date2);

		/*
		 * make an algorithm that selects a random color
		 * 
		 * */
		
		
		
		
	
		
		 // To close the input data file
		scan.close();
		tw.close(); // To close the output data file
		// To terminate the background running thread!
		
		System.exit(0);
		
	}

}