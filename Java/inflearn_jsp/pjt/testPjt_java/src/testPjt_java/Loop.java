package testPjt_java;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		System.out.println("INPUT NUMBER: ");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		
		//for 문
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d * %d = %d\n ", inputNum, i, (inputNum*i));
		}
			
		// while 문
		int j = 1;
		while(j< 10) {
			System.out.printf("%d * %d = %d \n", inputNum, j, (inputNum*j)); 
			j++;
		}
		// do~ while 문
		int k = 10;
		do {
			System.out.println("무조건 1번은 실행합니다.");
			k++;
		} while(k<10);
	}
}
