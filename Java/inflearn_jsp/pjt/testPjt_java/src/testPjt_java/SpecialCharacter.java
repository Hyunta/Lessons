package testPjt_java;

public class SpecialCharacter {
	public static void main(String[] args) {
		
		// Ư������ (�ּ�ó��)
		
		/*
		 * �ּ�ó��_������ ����
		 * �������� �� ����
		 * �������ϰ� ���� ġ�� �ȴ�.
		 */
		
		System.out.println("Good\tMorning~");
		System.out.println("Good\nMorning");
		
		//���Ĺ���
		
		char c1 = 'a';
		char c2 = 'A';
		
		System.out.printf("������ ����� %d�� �Դϴ�. \n", 10);
		System.out.printf("�ҹ��� \'%c\'�� �빮�ڴ� \'%c\'�Դϴ�.\n", c1,c2);
		
		//���Ĺ��� ���� ���
		System.out.printf("%6d\n",123);
		
		//���Ĺ��� �Ҽ��� ���� ���
		System.out.printf("%f\n",1.23);
		System.out.printf("%.0f\n",1.23);
		System.out.printf("%.1f\n",1.23);
		System.out.printf("%.2f\n",1.23);
		System.out.printf("%.3f\n",1.23);
	}
	

}
