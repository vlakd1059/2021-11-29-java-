package 반복문;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int num1 =0;
		int count1=0;
		int count2=0;
		int count3=1;
		while(true) {
		
			System.out.print("숫자 입력  : ");
			num1=sc.nextInt();
			if(num1==-1) {
				System.out.println("종료되었습니다.");
				break;
			}
			else if(num1%2==0) {
				count1++;
				System.out.println("짝수개수:"+count1);
				System.out.println("홀수개수: "+count2);
			}
			else {
				count2++;
				System.out.println("짝수개수:"+count1);
				System.out.println("홀수개수: "+count2);
			}
			count3++;
		}
		System.out.println("총 시도 횟수: " +count3 );
		sc.close();
			
	}

}
