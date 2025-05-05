package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
    	/*
        Scanner sc = new Scanner(System.in);

        System.out.println("출력되는 내용을 입력하세요.");
        System.out.print("기호: ");
        String sign = sc.next();

        System.out.print("숫자1: ");
        int num1 = sc.nextInt();

        System.out.print("숫자2: ");
        int num2 = sc.nextInt();

        switch (sign) {
            case "+":
                System.out.println("결과는: " + ((double)num1 + num2));
                break;
            case "-":
                System.out.println("결과는: " + ((double)num1 - num2));
                break;
            case "*":
                System.out.println("결과는: " + ((double)num1 * num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("계산할 수 없습니다");
                } else {
                    System.out.println("결과는: " + ((double)num1 / num2));
                }
                break;
            default:
                System.out.println("알 수 없는 기호입니다.");
                break;
        }
        sc.close();
        */
    	
    	String mark; //기호
		double num01; //숫자1
		double num02; //숫자2
		double result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		mark = sc.nextLine();
		
		System.out.print("숫자1: ");
		num01 = sc.nextDouble();
		
		System.out.print("숫자2: ");
		num02 = sc.nextDouble();
		
		switch(mark) {
			case "+":
				result = num01 + num02;
				System.out.println( "결과는: " +  result );
				break;
			case "-":
				result = num01 - num02;
				System.out.println( "결과는: " +  result );
				break;
			case "*":
				result = num01 * num02;
				System.out.println( "결과는: " +  result );
				break;
			case "/":
				if(num02==0) {
					System.out.println( "계산할 수 없습니다." );
				}else {
					result = num01 / num02;
					System.out.println( "결과는: " +  result );
				}
				break;
			default:
				System.out.println("계산할 수 없는 기호입니다.");
				break;
		}
		
		sc.close();

    }
}