package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	//두 개의 정수를 입력받은 후에 작은 수가 큰 수의 약수인지 확인하는 프로그램을 작성하세요.(0은 입력하지 않습니다.)
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num01 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num02 = sc.nextInt();
		
		if( num01 > num02 ) {
			if( num01 % num02 == 0 ) {
				System.out.println(num02 + " 는(은) " + num01 + " 의 약수입니다.");
			}
			else {
				System.out.println(num02 + " 는(은) " + num01 + " 의 약수가 아닙니다.");
			}
		}
		
		if( num02 > num01 ) {
			if(num02 % num01 == 0) {
				System.out.println(num01 + " 는(은) " + num02 + " 의 약수입니다.");
			}
			else {
				System.out.println(num01 + " 는(은) " + num02 + " 의 약수가 아닙니다.");
			}
		}


		sc.close();

		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		int big, small;
		
		if(num1>num2) {
			big = num1;
			small = num2;
		}else {
			big = num2;
			small = num1;
		}
		
		if(big % small == 0) {
			System.out.println(small+" 는(은)"+big+" 의 약수입니다.");			
		}else {
			System.out.println(small+" 는(은)"+big+" 의 약수가 아닙니다.");	
		}
		
		sc.close();
		*/
	}

}
