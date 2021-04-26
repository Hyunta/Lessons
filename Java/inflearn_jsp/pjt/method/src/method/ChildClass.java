package method;

public class ChildClass {
	
	public String name;
	public String gender;
	public int age;
	
	public ChildClass() {
		System.out.println("__ChildClass constructor__");
	}
	
	public void setInfo(String n, String g, int a) {
		System.out.println("__setInfo()__");
		
		name = n;
		gender = g;
		age = a;
		
	}
	
	public void getInfo() {
		System.out.println("__getInfo() START__");
		
		System.out.println("name = " + name);
		System.out.println("gender = " + gender);
		System.out.println("age = " + age);
		
	}

}
