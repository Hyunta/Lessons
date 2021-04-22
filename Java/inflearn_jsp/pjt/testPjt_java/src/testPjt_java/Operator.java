package testPjt_java;

public class Operator {
	public static void main(String[] args) {
		//대입 연산자
		int x = 10;
		int y = 20;
		System.out.println(x+y);
		
		// 산술 연산자
		System.out.println(x%y);
		
		// 대입 연산자
		System.out.println("x += = "+ (x+=10));
		System.out.println(("x -= "+(x-=10)));
		x = 10;
		
		//관계 연산자 부등식 , != , == 같은 연산자
		
		// 증감 연산자
		System.out.println("++x = " + (++x));
		System.out.println("x++ = " + (x++)); // 출력을 하고 난뒤에 x에 1을 더함
		System.out.println("x="+x);
		
		// 논리 연산자 && , || , !(상태부정)
		
		// 조건 연산자 ? , 조건식 ? 식1 : 식2 / 조건식이 참일 때 식 1, 거짓일 때 식 2
		x = 10; y = 20;
		int result = 0;
		result = (x>y) ? 100: 200;
		System.out.println("result:"+result);
		
		//비트 연산자, 속도가 향상됨 (&: and / |: or /^:a와b가 다르면)
		
		
	}

}
