package makingclassPjt;

public class MainClass {
	
	public static void main(String[] args) {
		
		Grandeur myCar1 = new Grandeur();
		myCar1.color = "red";
		myCar1.gear = "auto";
		myCar1.price = 100;
		
		myCar1.run();
		myCar1.stop();
		myCar1.info();
		
		Bicycle mybike1 = new Bicycle();
		mybike1.color = "blue";
		mybike1.price = 100;
		
		mybike1.info();
		
		Bicycle mybike2 = new Bicycle("green", 100);
		mybike2.info();
		
		mybike2.color = "yellow";
		mybike2.info();
		
	}

}
