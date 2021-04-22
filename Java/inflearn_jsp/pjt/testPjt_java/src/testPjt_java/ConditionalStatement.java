package testPjt_java;

import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		
		// if, else if, else 조건문
		if (num1 < num2) {
			System.out.println("num1 은 num2보다 작다");
		} else if (num1 > num2) {
			System.out.println("num1 은 num2보다 크다");
		} else {
			System.out.println("num1과 num2 는 같다");
		}
		
		System.out.println("점수를 입력하세요.");
		
		// Switch 문
		
		Scanner inputNum = new Scanner(System.in);
		int score = inputNum.nextInt();
		
		switch (score) {
		case 90:
			System.out.println("score is 90");
			break;
		case 80:
			System.out.println("score is 80");
			break;
		case 70:
			System.out.println("score is 70");
			break;
		case 60:
			System.out.println("score is 60");
			break;
		case 50:
			System.out.println("score is 50");
			break;
		default:
			System.out.println("score is unknown");
			break;
		}
		
		
		inputNum.close();
	}

}
