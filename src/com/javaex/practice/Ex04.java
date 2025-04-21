package com.javaex.practice;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		
	
		 int x =0;
		 //x가 0과같으면
		 if(x=0) {
		 System.out.println("x는 0이다");	
		 }	
		sc.close();		
		 */
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); 

        if (x == 0) {
            System.out.println("x는 0이다");
		sc.close();
        }

	}
}
