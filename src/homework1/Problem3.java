package homework1;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int sum;
		System.out.print("Enter First Integer:");
		x = input.nextInt();
		System.out.print("Enter Second Integer:");
		y = input.nextInt();
		sum = x + y;
		System.out.printf("Sum is %d\n", sum);
		input.close();
		
		
	}

}
