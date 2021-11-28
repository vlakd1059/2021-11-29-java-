package ÀÚ¹ÙÅ×½ºÆ®;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("³âµµ ÀÔ·Â >> ");
		int year = sc.nextInt();
		if(year%4==0 && year%100!=0){
			
			System.out.println("À±³â");
		}
		
		else if(year%400==0) {
			System.out.println("À±³â");
		}
		else {
			System.out.println("À±³â ¾Æ´Ô");
		}

	}

}
