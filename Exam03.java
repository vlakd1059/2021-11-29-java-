package �ݺ���;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1=0;
		int num2=0;
		int num3=0;
		int count=1;
		// while(true) ~> �׻� boolean Ÿ�Ը� �;��Ѵ�.
		while (num1!=0||num2!=0 || count == 1) {
			System.out.println(count+"��° �õ�");
			System.out.print("A �Է� >> ");
			num1=sc.nextInt();
			System.out.print("B �Է� >> ");
			num2=sc.nextInt();
			if(num2>num1) {
				num3 = num2 - num1;
				System.out.println("B-A : "+num3);
			}
			else if (num1==num2){
				num3=0;
				System.out.println(num3);
			}
			else {
				num3 = num1 - num2;
				System.out.println("A-B : "+num3);
			}
			if(num1==0 && num2==0 ) {			
				break;
			}
			System.out.println("��� >> "+(num3));
			count++;
		}
		System.out.println("���α׷� ����");
		System.out.println("�� �õ� Ƚ�� : "+ count);
	}

}
