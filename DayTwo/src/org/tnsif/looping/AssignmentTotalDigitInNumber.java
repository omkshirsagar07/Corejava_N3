package org.tnsif.looping;

import java.util.Scanner;

public class AssignmentTotalDigitInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit :");
		int n = sc.nextInt();
		sc.close();
		int dig = 0;
		while(n>0)
		{
			n/=10;
			dig++;
		}
		System.out.println("Number of digits in number are "+dig);
	}

}
