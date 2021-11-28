package 자바테스트;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재금액: ");
		int money=sc.nextInt();
		int a10000=0;
		int a5000=0;
		int a1000=0;
		int a500=0;
		int a100=0;
		System.out.println("잔돈변환");
		a10000=money/10000;
		
		a5000 =(money%10000)/5000;
		a1000 = (money%5000)/1000;
		a500 = (money%1000)/500;
		a100 = (money%500)/100;
//		if(money>=10000) // if문 쓸경우{
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
		System.out.println("10000원 : "+a10000+"개");
		System.out.println("5000원 : "+a5000+"개");
		System.out.println("1000원 : "+a1000+"개");
		System.out.println("500원 : "+a500+"개");
		System.out.println("100원 : "+a100+"개");
	}

}
