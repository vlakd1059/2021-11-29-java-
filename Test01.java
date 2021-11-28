package 자바테스트;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num=sc.nextInt();
		if(num%10>=5) {
			System.out.println("반올림 전 값 : "+num);
			System.out.println("반올림 후 값 : "+(num/10+1)*10);
			
		}
		else {
			System.out.println("반올림 전 값 : "+num);
			System.out.println("반올림 후 값 : "+(num/10)*10);
		}

	}

}
