package inheritance;

public class ParentClass {
	
	public ParentClass() {
		System.out.println("ParentClass constructor");
	}
	
	public void parentFun() {
		System.out.println("parentFun()");
	}
	
	// private 메서드는 ChildClass에서 접근할 수 없다 
	private void privatefun() {
		System.out.println("privatefun");
	}
	
	public void makefood() {
		System.out.println("__makefood()__");
	}
}
