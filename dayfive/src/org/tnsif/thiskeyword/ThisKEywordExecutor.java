package org.tnsif.thiskeyword;
class HR
{
	
	public void fun1(HR obj)
	{	
		System.out.println("function1 executed");
		
	}
	
	public void fun2()
	{
		fun1(this);
	}
}
public class ThisKEywordExecutor {

	
	public static void main(String[] args) {
		HR e = new HR();
		e.fun2();

	}

}
