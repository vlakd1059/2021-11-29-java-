package �ڹ��׽�Ʈ;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int num=sc.nextInt();
		if(num%10>=5) {
			System.out.println("�ݿø� �� �� : "+num);
			System.out.println("�ݿø� �� �� : "+(num/10+1)*10);
			
		}
		else {
			System.out.println("�ݿø� �� �� : "+num);
			System.out.println("�ݿø� �� �� : "+(num/10)*10);
		}

	}

}
