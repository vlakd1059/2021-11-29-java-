package 반복문;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		// 반복문 (for, while, do-while)
		// 반복문 = 정답을 맞출때까지 같은 처리를 반복하여 실행하는 구조
		// 1. while : 정확히 몇번 반복해야할지 정해지지 않는 경우 사용.
		// while (검사조건) {
        // 실행로직	
	    // }
		// 예제1) = 정답맞추기 맞출때 까지 실행
		int answer = 30;
		int user=0;
		int count =0;
		while(user!=answer) {
			System.out.print("정답을 입력해주세요 : ");
			Scanner sc = new Scanner(System.in);
			user = sc.nextInt();
			count++;
		}
		
		System.out.println("정답!!");
		System.out.println("총 시도 횟수 : "+count);
	}

}
