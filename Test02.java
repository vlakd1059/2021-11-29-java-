package �ڹ��׽�Ʈ;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����ݾ�: ");
		int money=sc.nextInt();
		int a10000=0;
		int a5000=0;
		int a1000=0;
		int a500=0;
		int a100=0;
		System.out.println("�ܵ���ȯ");
		a10000=money/10000;
		
		a5000 =(money%10000)/5000;
		a1000 = (money%5000)/1000;
		a500 = (money%1000)/500;
		a100 = (money%500)/100;
//		if(money>=10000) // if�� �����{
//			a10000 = money/10000;
//		}
//		if(money%10000>=5000) {
//			a5000 =(money%10000)/5000;
//		}
//		if(money%5000>=1000) {
//			a1000 = (money%5000)/1000;
//		}
//		if(money%1000>=500) {
//			a500 = (money%1000)/500;
//		}
//		if(money%500>=100) {
//			a100 = (money%500)/100;
//		}
		System.out.println("10000�� : "+a10000+"��");
		System.out.println("5000�� : "+a5000+"��");
		System.out.println("1000�� : "+a1000+"��");
		System.out.println("500�� : "+a500+"��");
		System.out.println("100�� : "+a100+"��");
	}

}
