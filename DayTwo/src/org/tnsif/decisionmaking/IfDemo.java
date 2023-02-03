package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
			
		if(a>b)		
		{
			System.out.println("A is Greater than B");
		}
		sc.close();
		}

	}


