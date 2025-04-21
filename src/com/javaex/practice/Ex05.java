package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age = sc.nextInt();
		if(age>20) {
			System.out.println("\"1번그룹\"");
		}else {
			System.out.println("\"2번그룹\"");
		}
		sc.close();  
		/*
		 * 15일때 2번그룹
		 * 19일때 2번그룹
		 * 20일때 2번그룹
		 * 21일때 1번그룹
		 * 100일때 1번그룹
		 */

	}

}
