package testPjt_java;

public class Operator {
	public static void main(String[] args) {
		//���� ������
		int x = 10;
		int y = 20;
		System.out.println(x+y);
		
		// ��� ������
		System.out.println(x%y);
		
		// ���� ������
		System.out.println("x += = "+ (x+=10));
		System.out.println(("x -= "+(x-=10)));
		x = 10;
		
		//���� ������ �ε�� , != , == ���� ������
		
		// ���� ������
		System.out.println("++x = " + (++x));
		System.out.println("x++ = " + (x++)); // ����� �ϰ� ���ڿ� x�� 1�� ����
		System.out.println("x="+x);
		
		// �� ������ && , || , !(���º���)
		
		// ���� ������ ? , ���ǽ� ? ��1 : ��2 / ���ǽ��� ���� �� �� 1, ������ �� �� 2
		x = 10; y = 20;
		int result = 0;
		result = (x>y) ? 100: 200;
		System.out.println("result:"+result);
		
		//��Ʈ ������, �ӵ��� ���� (&: and / |: or /^:a��b�� �ٸ���)
		
		
	}

}
