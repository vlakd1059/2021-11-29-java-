package �ݺ���;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int num1 =0;
		int count1=0;
		int count2=0;
		int count3=1;
		while(true) {
		
			System.out.print("���� �Է�  : ");
			num1=sc.nextInt();
			if(num1==-1) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			else if(num1%2==0) {
				count1++;
				System.out.println("¦������:"+count1);
				System.out.println("Ȧ������: "+count2);
			}
			else {
				count2++;
				System.out.println("¦������:"+count1);
				System.out.println("Ȧ������: "+count2);
			}
			count3++;
		}
		System.out.println("�� �õ� Ƚ��: " +count3 );
		sc.close();
			
	}

}
