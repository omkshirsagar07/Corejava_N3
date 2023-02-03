package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
			
		if(a>b)		
		{
			System.out.println("A is Greater than B");
		}
		else
			System.out.println("B is Greater");
		sc.close();
		}
	}


