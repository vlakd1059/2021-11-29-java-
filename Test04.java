package �ڹ��׽�Ʈ;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� >> ");
		int num1=sc.nextInt();
		System.out.print("�� ��° ���� �Է� >> ");
		int num2=sc.nextInt();
//		int num3=0;
//		int num4=0;
//		int num5=0;
		int result =num1*num2;
//		num3=num1*(num2%10);
//		num4=num1*((num2%100)/10);
//		num5=num1*(num2/100);
//		System.out.println(num3);
//		System.out.println(num4);
//		System.out.println(num5);
		while(num2>0) {   //while������ Ǯ���
			int console=num1*(num2%10);
			num2=num2/10;
			System.out.println(console);
		}
		System.out.println(result);
		
		
		sc.close();

	}

}
