package org.tnsif.operator;
import java.util.*;
public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Arithematic Operator 
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c=a-b;
		System.out.println("a + b = "+ a+b);
		System.out.println("a -  b = "+ c);
		System.out.println("a / b = "+ a/b);
		System.out.println("a * b = "+ a*b);
		System.out.println("a % b = "+ a%b);
		
		//RELATIONAL OPERATOR
		boolean x = a>b;
		System.out.println(x);
		
		//ASSIGNMENT OPERATOR
		a*=b;
		System.out.println(a);
		
		//LOGICAL OPERATOR
		boolean res1 = (5==5)&&(3>5);
		boolean res2 = (5==3)||(5>6);
		
		System.out.println(res1);
		System.out.println(res2);
		
		//BITWISE
		 a = 12 & 5;
		 b = 12 | 5;
		 c = 12 ^ 5;
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 
		 //TERNARY OPERATOR
		 String res = (12%2==0)?"True":"False";
		 
		 int i = 1;
		 System.out.println(1 + ++i);
		 System.out.println(1 + i++);
		 System.out.println(i+i);

	}

}
