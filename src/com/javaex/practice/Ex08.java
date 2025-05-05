package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {
	/*
	 * 사용자로 키와 몸무게를 입력받아 표준체중을 계산한 후에 저체중, 표준, 과체중을 구분하여 출력하 프
		로그램을 작성하세요.
 		표준체중(72.0) = (키 − 𝟏𝟎𝟎) × 0.9
 		
	 */

	public static void main(String[] args) {
		
		//변수 준비
				double height;  //키
				double weight;  //몸무게
				double sWeight; //표준 몸무게
				
				//키와 몸무게를 입력받는다.
				Scanner sc = new Scanner(System.in);
				System.out.println("키와 몸무게를 입력해주세요.");
				System.out.print("키: ");
				height = sc.nextDouble();
				
				System.out.print("몸무게: ");
				weight = sc.nextDouble();
				
				//표준몸무게를 계산한다.
				sWeight = (height - 100)*0.9;
				
				//표준몸무게와 실제몸무게를 비교하여 분류한다.
				if( weight > sWeight ) {
					System.out.println("과체중 입니다.");
				}else if(weight == sWeight){
					System.out.println("표준 입니다.");
				}else {
					System.out.println("저체중 입니다.");
				}
				
				//결과를 출력한다.
				System.out.println("표준체중: " + sWeight);
				sc.close();
	}			
			
}
