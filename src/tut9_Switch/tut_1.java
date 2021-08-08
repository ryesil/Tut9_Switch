package tut9_Switch;

import java.util.Scanner;

public class tut_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a command");
		String command=scanner.nextLine();
		
		switch(command) {
		case "start":
			System.out.println("System started!");
			break;
		case "run":
			System.out.println("System running");
			break;
		case "kill":
			System.out.println("System killed");
			break;
		
		default:
			System.out.println("What!");
		
		}
	}

}
