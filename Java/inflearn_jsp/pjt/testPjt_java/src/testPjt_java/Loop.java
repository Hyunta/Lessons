package testPjt_java;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		System.out.println("INPUT NUMBER: ");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		
		//for ��
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d * %d = %d\n ", inputNum, i, (inputNum*i));
		}
			
		// while ��
		int j = 1;
		while(j< 10) {
			System.out.printf("%d * %d = %d \n", inputNum, j, (inputNum*j)); 
			j++;
		}
		// do~ while ��
		int k = 10;
		do {
			System.out.println("������ 1���� �����մϴ�.");
			k++;
		} while(k<10);
	}
}
