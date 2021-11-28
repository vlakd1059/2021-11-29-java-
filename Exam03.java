package 반복문;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1=0;
		int num2=0;
		int num3=0;
		int count=1;
		// while(true) ~> 항상 boolean 타입만 와야한다.
		while (num1!=0||num2!=0 || count == 1) {
			System.out.println(count+"번째 시도");
			System.out.print("A 입력 >> ");
			num1=sc.nextInt();
			System.out.print("B 입력 >> ");
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
			System.out.println("결과 >> "+(num3));
			count++;
		}
		System.out.println("프로그램 종료");
		System.out.println("총 시도 횟수 : "+ count);
	}

}
