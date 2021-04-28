package inheritance;

public class SecondChildClass extends ParentClass {
	
	public SecondChildClass() {
		System.out.println("ChildClass Constructor");
	}
	
	public void childFun() {
		System.out.println("childFun()");
	}
	
	@Override
	public void makefood() {
		System.out.println("__second more delicious()__");
	}

}
