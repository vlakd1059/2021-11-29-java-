package �ݺ���;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		// �ݺ��� (for, while, do-while)
		// �ݺ��� = ������ ���⶧���� ���� ó���� �ݺ��Ͽ� �����ϴ� ����
		// 1. while : ��Ȯ�� ��� �ݺ��ؾ����� �������� �ʴ� ��� ���.
		// while (�˻�����) {
        // �������	
	    // }
		// ����1) = ������߱� ���⶧ ���� ����
		int answer = 30;
		int user=0;
		int count =0;
		while(user!=answer) {
			System.out.print("������ �Է����ּ��� : ");
			Scanner sc = new Scanner(System.in);
			user = sc.nextInt();
			count++;
		}
		
		System.out.println("����!!");
		System.out.println("�� �õ� Ƚ�� : "+count);
	}

}
