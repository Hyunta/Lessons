package testPjt_java;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		
		int[] arr1 = new int[5]; // �迭 ���� �ܰ�
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr1[1]);
		System.out.println("arr1[2] : " + arr1[2]);
		
		int[] arr2 = {10, 20, 30}; //�� �� ������ �ڿ��� ũ�Ⱑ ������ �ʴ´�.
		System.out.println(arr2[0]);
		
		System.out.println("arr1.length = " + arr1.length);
		
		// ��� ���
		System.out.println("arr1 = "  + Arrays.toString(arr1)); 
		
		// �迭 ���� , ���縦 �ص� ���۷����� �ٲ��� �ʴ´�.
		int[] arr3 = Arrays.copyOf(arr1, arr1.length);
		System.out.println("arr3 = " + Arrays.toString(arr3));
		System.out.println(arr1);
		System.out.println(arr3);
	}

}
