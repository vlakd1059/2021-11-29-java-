package �ݺ���;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		int count=0;
		
//		while(num<11) {
//			
//			System.out.print("���� �Է�: ");
//			num =sc.nextInt();
//			count++;
//		}
		while(true) {
			System.out.print(" �����Է� : ");
			num = sc.nextInt();
			if(num>10) {
				break;//�ش� �ݺ����� ����
				//~>�б⹮
				
			}
			count++;
		}
		System.out.println("����Ǿ����ϴ�.");
		System.out.println("�� �õ� Ƚ�� : "+count);
		sc.close();

	}

}
