package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	//두 개의 정수를 입력받아 큰수를 작은수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하세요
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		if (num == 0 || num2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
		} else {
			int big = (num > num2) ? num : num2;
			int small = (num < num2) ? num : num2;
			
			int quotient = big / small;
			int remainder = big % small;
			
			System.out.println("몫: " + quotient);
			System.out.println("나머지: " + remainder);
		}
		
		
		
		sc.close();
	}
}
