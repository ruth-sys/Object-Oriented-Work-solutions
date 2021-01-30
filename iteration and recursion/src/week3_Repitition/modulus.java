package week3_Repitition;

import java.util.Scanner;

public class modulus {
	static int  num1;
	static int  num2;
	static int results;
	public static int  NumOfTimes(int num1, int num2) {
		int i=0;
		int results = num1;
		while((results)!= (num1%num2)) {
			 results = results-num2;
			 i++;
		}
		return results;
	}
	public static int reNumOfTimes(int num1, int num2) {
		int results;
		if (num1 < num2) {
			return 1;
		}
		else {
			return results = num1%num2;
		}
	}
	
	

	public static void main(String[] args) {
		int answer;
		int results;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num1 = in.nextInt();
		System.out.println("Enter a second number: ");
		num2 = in.nextInt();
		answer =  NumOfTimes(num1, num2);
		System.out.println("Iteration answer: "+answer);
		results = reNumOfTimes(num1, num2);
		System.out.println("recursion method answer: "+results);
		

	}

}
