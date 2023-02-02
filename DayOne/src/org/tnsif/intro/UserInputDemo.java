package org.tnsif.intro;
import java.util.*;
public class UserInputDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer ");
		int x = sc.nextInt();
		
		System.out.println("Enter Float value ");
		float y = sc.nextFloat();
		
		char c= sc.next().charAt(0);
		
		String name = sc.next();
		
		String str = sc.nextLine();
		
		System.out.println("x = "+ x);
		System.out.println("y =" + y);
		System.out.println("z ="+ c);

		System.out.println("Name = "+ name);

		System.out.println("Str = " +str);
		
		sc.close(); // to close the object of scanner class

	}

}
