package inheritance;

public class FirstChildClass extends ParentClass {
	
	public FirstChildClass() {
		System.out.println("ChildClass Constructor");
	}
	
	public void childFun() {
		System.out.println("childFun()");
	}
	
	@Override
	public void makefood() {
		System.out.println("__first more delicious()__");
	}

}
