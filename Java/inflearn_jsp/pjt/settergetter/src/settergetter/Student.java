package settergetter;

public class Student {
	
	private String name;
	private int score;
	
	public Student(String n, int s) {
		this.name = n;
		this.score = s;
	}
	
	public void getInfo() {
		System.out.println("__getInfo()__");
		System.out.println("name :" + name);
		System.out.println("score :" + score);
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if(score > 50) { this.score = score;		
		} 
	}

}
