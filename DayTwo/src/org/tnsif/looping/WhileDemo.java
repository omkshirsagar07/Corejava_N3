package org.tnsif.looping;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit :");
		int n = sc.nextInt();
		sc.close();
		int i = 1;
		while(i <= n) // if no. of itteration is not fix
		{
			System.out.print(i++ +" ");
			
			
		}
		System.out.println();
		while(i > 1)
		{
			System.out.print(--i + " ");
			
		}
			

	}

}
