package org.tnsif.thiskeyword;

 class Account{
	int a;
	int b;
	
	public void getData(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	public void showData()
	{
		System.out.println("value of A  : " + a);
		System.out.println("Valaue of b  : "+ b);
	}
}


public class ThisKeywordDemo {

	

	public static void main(String[] args) {
		
		Account T = new Account();
		T.getData(5, 6);
		T.showData();

	}

}
