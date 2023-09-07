package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		boolean isOrdered = true;
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();

		if (x > y && y > z) {
			isOrdered = true; //this code is for when x > y > z
		} else if (z > y && y > x) {
			isOrdered = true; //this code is for when z > y > x
		} else {
			isOrdered = false; //this code is for neither cases
		}
		
		System.out.println("Is Ordered? " + isOrdered);
	}

}
