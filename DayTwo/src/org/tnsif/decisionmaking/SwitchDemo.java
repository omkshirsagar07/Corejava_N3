package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Yor Choice");
		int a = sc.nextInt();
		switch(a){
		
		case 1: 
			System.out.println("Johny Johny πΆπΆ");
			break;
		
		case 2 :
			System.out.println("Yes Pappa ππ");
			break;
		case 3 :
			System.out.println("Eating Sugar ππ");
			break;
			
		case 4 :
			System.out.println("No Pappa ππ");
			break;
			
		case 5 :
			System.out.println("Open Your mouth ππ ");
			break;
			
		default:
			System.out.println("HaHaHa πππ");
		}
		sc.close();
		
		}
	

}
