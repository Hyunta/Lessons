
public class interfaceClass implements interfaceA, interfaceB {

	public interfaceClass() {
		System.out.println("__intclass construct__");
	}
	
	@Override
	public void funA() {
		System.out.println("__funA()__");
	}
	
	@Override
	public void funB() {
		System.out.println("__funB()__");
		
	}

}
