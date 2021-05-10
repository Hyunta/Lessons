package stringbuffer;

public class MainClass {
	public static void main(String[] args) {
		StringBuffer sf = new StringBuffer("JAVA");
		System.out.println("sf : "+sf);
		sf.append("World!");
		System.out.println("sf : "+sf);
		System.out.println("sf.length() : "+sf.length());
		sf.insert(sf.length(),"~~~~");
		System.out.println("sf : "+sf);
	}

}
