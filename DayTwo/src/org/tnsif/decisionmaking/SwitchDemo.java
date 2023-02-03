package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Yor Choice");
		int a = sc.nextInt();
		switch(a){
		
		case 1: 
			System.out.println("Johny Johny 🎶🎶");
			break;
		
		case 2 :
			System.out.println("Yes Pappa 😏😏");
			break;
		case 3 :
			System.out.println("Eating Sugar 😏😏");
			break;
			
		case 4 :
			System.out.println("No Pappa 😒😒");
			break;
			
		case 5 :
			System.out.println("Open Your mouth 😛😛 ");
			break;
			
		default:
			System.out.println("HaHaHa 😁😁😁");
		}
		sc.close();
		
		}
	

}
