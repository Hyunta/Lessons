package inheritance;

public class ParentClass {
	
	public ParentClass() {
		System.out.println("ParentClass constructor");
	}
	
	public void parentFun() {
		System.out.println("parentFun()");
	}
	
	// private �޼���� ChildClass���� ������ �� ���� 
	private void privatefun() {
		System.out.println("privatefun");
	}
	
	public void makefood() {
		System.out.println("__makefood()__");
	}
}
