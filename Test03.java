package �ڹ��׽�Ʈ;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵ �Է� >> ");
		int year = sc.nextInt();
		if(year%4==0 && year%100!=0){
			
			System.out.println("����");
		}
		
		else if(year%400==0) {
			System.out.println("����");
		}
		else {
			System.out.println("���� �ƴ�");
		}

	}

}
