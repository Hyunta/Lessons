package settergetter;

public class MainClass {
	
	public static void main(String[] args) {
		
		Student std1 = new Student("ȫ�浿", 90);
		std1.getInfo();
		
		std1.setScore(100);
		std1.getInfo();
	}

}
