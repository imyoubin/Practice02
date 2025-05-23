package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {
	/*
	 * 아래의 조건과 같이 출력되도록 프로그램을 작성하세요
	 	태어난 년도를 입력 받습니다.
		나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
		15세미만의 경우와 65세이상인 경우에는 "(나이)살 무료예방접종 대상자 입니다" 메시지를 출력합니다.
		이외의 경우에는 " (나이)살 무료예방접종 대상자가 아닙니다" 메시지를 출력합니다.
	 */

	public static void main(String[] args) {
		
		int thisYear = 2023;
		int year;
		int age;
		
		//태어난 년도를 입력받는다
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도: ");
		year = sc.nextInt();

		//나이를 계산합니다.
		age = thisYear-year;
		
		
		//조건식을 비교합니다.
		if( age<15 ||  age>=65 ) { // 15세미만  65세이상 둘중에 1개라도 해당되면 무료접종대상자 
			System.out.println(age + "살 무료예방접종 대상자 입니다");

		}else {  //위의 조건이 아닌 모든 경우
			System.out.println(age + "살 무료예방접종 대상자가 아닙니다");
		}
		
		sc.close();

	}

}
