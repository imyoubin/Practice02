package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	//두 개의 정수를 입력받아 큰수를 작은수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하세요
	public static void main(String[] args) {
		
		
		
		
		int quotient; //몫
		int remainder; //나머지
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num01 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num02 = sc.nextInt();
		
		if(num01>num02) { // num1이 num2보다 클때
			quotient = num01 / num02;
			remainder = num01 % num02;
			
		}else { //num2가 num1보다 크거나 같을때
			quotient = num02 / num01;
			remainder = num02 % num01;
			
		}

		System.out.println("몫: " + quotient );
		System.out.println("나머지: " + remainder );
		

		sc.close();
	}

}