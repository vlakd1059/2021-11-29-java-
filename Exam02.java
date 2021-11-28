package 반복문;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		int count=0;
		
//		while(num<11) {
//			
//			System.out.print("정수 입력: ");
//			num =sc.nextInt();
//			count++;
//		}
		while(true) {
			System.out.print(" 숫자입력 : ");
			num = sc.nextInt();
			if(num>10) {
				break;//해당 반복문을 종료
				//~>분기문
				
			}
			count++;
		}
		System.out.println("종료되었습니다.");
		System.out.println("총 시도 횟수 : "+count);
		sc.close();

	}

}
