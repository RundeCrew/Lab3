import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Hello! What is your name?");
		String userName = scnr.nextLine();
		
		int numEntered;
		boolean validEntry;
		char answer = 'y';
		
		while (answer == 'y') {
		
		do {
			
			System.out.println("Hi, " + userName + " please enter a number between 1 and 100");
			numEntered = scnr.nextInt();
			
			int i = numEntered;
			
			validEntry = ((i >= 1) && (i <= 100));
			
			if (!validEntry) {
				System.out.println("Entry is not valid, please try again.");
			}
		} while (validEntry == false);
		
		if (numEntered % 2 == 0) {
				if (numEntered >= 2 && numEntered <= 25) { // number between 2 and 25 (even)
				System.out.println(userName + ", your number is even and less than 25");
				}
				else if (numEntered >= 26 && numEntered <= 60) {  //number between 26 and 60 (even)
					System.out.println(userName + ", your number is even");
				} 
				else {
					System.out.println("" + userName + ", the number " + numEntered + " is Even");
				}
				
		}
		else if (numEntered % 2 == 1) {
				if (numEntered > 60 && numEntered < 101) {
				System.out.println("Odd and over 60");
				}
				else {
					System.out.println(userName + ", your number is Odd");
				}
				}
				
	
		else {
				System.out.println("Odd");
		}
		
		System.out.println("Continue? (y/n)");
		answer = scnr.next().charAt(0);
		
		}

	}

}
