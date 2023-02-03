package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Weight");
		int wgt = sc.nextInt();
		
		System.out.println("Enter Age");
		int age = sc.nextInt();
		
		if(age>12)		
		{
			if(wgt >= 40 && wgt <= 120)
				System.out.println("Applicant Eligble");
			
			else if(wgt > 120)
				System.out.println("Extra Ropw Must be Added");
			
			else
				System.out.println("Applicant is not Eligible");
		}
		
		else
			System.out.println("Applicant is Not Eligible");
		sc.close();
		

	}

}
