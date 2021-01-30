package week3_Repitition;

import java.util.Scanner;

public class driver {
	private static int num1;
	private static int num2;
	
	public void pow_iteration(int base, int power){
		int counter = 0;
		int results = 1;
		while (counter <power){
			results = results* base;
			counter = counter + 1;
		}
		System.out.println("Answer: " +results);
		
		
		
	}
	
	public static void main(String[] args) {
		driver obj = new driver();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a base number");
		num1= in.nextInt();
		System.out.println("Enter a power number");
		num2 = in.nextInt();
		obj.pow_iteration(num1, num2);
		
		

	}

}
