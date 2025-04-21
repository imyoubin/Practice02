package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자2개를 입력하세요.");
		
		System.out.print("숫자1: ");
		int num = sc.nextInt();
		
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();		
		
		if(num>num2) {
			System.out.print("큰수: " +num+"\t작은수: "+num2+" 입니다." );				
		}else if(num<num2) {
			System.out.println("큰수: "+num+"\t작은수: "+num2+ "입니다" );
		}else {
			System.out.println("큰수: "+num+"\t작은수: "+num2+" 입니다");
		}
		
		sc.close(); 

	}

}
