package org.tnsif.thiskeyword;


public class ThisKeywordExample {
	int num;
	

	public ThisKeywordExample(int num) {
		super();
		this.num = num;
	}

	
	public ThisKeywordExample() {
		super();
	}


	public static void main(String[] args) {
		ThisKeywordExample obj = new ThisKeywordExample(6);
		System.out.println("value of num is "+ obj.num);
		
	}

}
