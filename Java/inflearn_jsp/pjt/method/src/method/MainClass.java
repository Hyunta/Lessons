package method;

public class MainClass {
	
	public static void main(String[] args) {
		
		ChildClass child1 = new ChildClass();
		child1.name = "Hong";
		child1.gender = "M";
		child1.age = 24;
		
		child1.getInfo();
		
		ChildClass child2 = new ChildClass();
		child2.setInfo("Kim", "F", 20 );
		child2.getInfo();
		
	}

}
