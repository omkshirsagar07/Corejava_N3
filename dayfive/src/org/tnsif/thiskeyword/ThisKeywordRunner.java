package org.tnsif.thiskeyword;

class Maths
{
	int a,b;
	Maths()
	{
		a = 10;
		b = 20;
	}
	Maths accept()
	{
		return this;
	}
	void Display()
	{
		System.out.println("a is : "+ a);
		System.out.println("b is : "+b);
	}
}

public class ThisKeywordRunner {

	public static void main(String[] args) {
		Maths M = new Maths();
		M.accept().Display();

	}

}
