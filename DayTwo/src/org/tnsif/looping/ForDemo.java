package org.tnsif.looping;
import java.util.*;
public class ForDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit :");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) // if no. of itteration is fix
		{
			System.out.print(i+" ");
		}
		System.out.println(" ");
		for(int i = n; i > 0; i-- )
		{
			System.out.print(i+" ");
		}
		
		

	}

}
