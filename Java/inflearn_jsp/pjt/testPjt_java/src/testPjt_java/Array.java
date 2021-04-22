package testPjt_java;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		
		int[] arr1 = new int[5]; // 배열 선언 단계
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr1[1]);
		System.out.println("arr1[2] : " + arr1[2]);
		
		int[] arr2 = {10, 20, 30}; //한 번 선언한 뒤에는 크기가 변하지 않는다.
		System.out.println(arr2[0]);
		
		System.out.println("arr1.length = " + arr1.length);
		
		// 요소 출력
		System.out.println("arr1 = "  + Arrays.toString(arr1)); 
		
		// 배열 복사 , 복사를 해도 레퍼런스가 바뀌지 않는다.
		int[] arr3 = Arrays.copyOf(arr1, arr1.length);
		System.out.println("arr3 = " + Arrays.toString(arr3));
		System.out.println(arr1);
		System.out.println(arr3);
	}

}
