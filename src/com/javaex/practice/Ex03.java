package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/*
		int age = 15;
		if(0<age<18) {
			System.out.println("청소년 입니다");
		}
		*/
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();		
		if(age<18) {
			System.out.println("청소년 입니다");
		sc.close();
			
		}
	}

}
