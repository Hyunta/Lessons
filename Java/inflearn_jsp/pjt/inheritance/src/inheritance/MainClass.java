package inheritance;

public class MainClass {
	public static void main(String[] args) {
		
		FirstChildClass childClass = new FirstChildClass();
		childClass.childFun();
		childClass.parentFun();
		
		FirstChildClass chid = new FirstChildClass();
		childClass.makefood();
		
		ParentClass[] pArr = new ParentClass[2];
		
		
		ParentClass fch = new FirstChildClass();
		ParentClass sch = new SecondChildClass();
		
		pArr[0] = fch;
		pArr[1] = sch;
	}

}
