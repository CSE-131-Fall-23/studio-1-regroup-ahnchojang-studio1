package studio1;

import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("The first of two integers to be averaged?");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		double average = (n1 + n2) / (double) 2;
		System.out.println("Average of " + n1 + " and " + n2 + " is " + average + ".");
	}
}
