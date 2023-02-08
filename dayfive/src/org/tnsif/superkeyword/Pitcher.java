package org.tnsif.superkeyword;

public class Pitcher extends Flower{

	private String Name;
	
	public void Display()
	{
		Name = "Kutra ";
		super.setName("Gadhav");
		System.out.println(Name + super.getName());
	}
	
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Pitcher(String name, String name2) {
		super(name);
		Name = name2;
	}

	public Pitcher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pitcher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pitcher [Name=" + Name + "]";
	}
	
	

}
