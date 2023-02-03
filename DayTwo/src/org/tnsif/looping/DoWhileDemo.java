package org.tnsif.looping;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit :");
		int n = sc.nextInt();
		sc.close();
		int i = 1;
		do  // itteration done at least once 
		{           
			System.out.print(i++ +" ");
		}while(i<=n);

	}

}

// WAP in java to print total digit in a given number