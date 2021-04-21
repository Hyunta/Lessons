package testPjt_java;

public class SpecialCharacter {
	public static void main(String[] args) {
		
		// 특수문자 (주석처리)
		
		/*
		 * 주석처리_여러줄 버전
		 * 여러줄을 할 때는
		 * 슬래시하고 별을 치면 된다.
		 */
		
		System.out.println("Good\tMorning~");
		System.out.println("Good\nMorning");
		
		//서식문자
		
		char c1 = 'a';
		char c2 = 'A';
		
		System.out.printf("오늘의 기온은 %d도 입니다. \n", 10);
		System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.\n", c1,c2);
		
		//서식문자 정렬 기능
		System.out.printf("%6d\n",123);
		
		//서식문자 소수점 제한 기능
		System.out.printf("%f\n",1.23);
		System.out.printf("%.0f\n",1.23);
		System.out.printf("%.1f\n",1.23);
		System.out.printf("%.2f\n",1.23);
		System.out.printf("%.3f\n",1.23);
	}
	

}
