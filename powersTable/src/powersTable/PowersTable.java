//Brittany Romero, CIS406, Lab submission: powersTable

package powersTable;

import java.util.Scanner;

public class PowersTable {

	public static void main(String[] args) {
				
		System.out.println("Welcome to the Squares and Cubes table");
		
		Scanner input = new Scanner(System.in);
		
		char keepGoing = 'y';
		
		while (keepGoing != 'n' && keepGoing != 'N')
		{		
			System.out.print("\nEnter an integer: ");
			int number = input.nextInt();
			
			System.out.println();
			System.out.println("Number\tSquared\tCubed");
			System.out.println("======\t=======\t=====");
			
			for (int i = 1; i < number + 1; i++) {
				System.out.println(i +           "\t" + 
								   i * i + "\t" +
						           i * i * i + "\t");
			}
												
			System.out.print("\nContinue? (y/n): ");
			keepGoing = input.next().charAt(0);
		}
		
		input.close();
		System.out.println("Bye!!");
	}

}