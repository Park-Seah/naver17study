package day1213;

import java.util.Scanner;

public class Ex9While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1글자씩 입력하다가 x(대소문자 상관없음)를 입력하면 빠져나와서
		 * 입력한 데이터들을 분석한 결과를 출력하시오
		 * 
		 * 대문자:3
		 * 소문자:4
		 * 숫자 :3
		 */
		Scanner sc=new Scanner(System.in);
		char ch;
		int upper=0,lower=0,number=0;
		
		while(true)//몇 번 입력할 지 모르니 true로 주기
		{
			System.out.print("문자입력(종료:x):");
			ch=sc.nextLine().charAt(0);
			if(ch=='x' || ch=='X')
				break;
//아스키 코드ver.			
//			if(ch>='a' && ch<='z')
//				lower++;
//			else if(ch>='A' && ch<='Z')
//				upper++;
//			else if(ch>='0' && ch<='9')
//				number++;
			
//아스키 코드 모르면 아래처럼 숫자 입력
			if(ch>=97 && ch<=122)
				lower++;
			else if(ch>=65 && ch<=90)
				upper++;
			else if(ch>=48 && ch<=57)
				number++;
		}
		System.out.println("대문자 : "+upper);
		System.out.println("소문자 : "+lower);
		System.out.println("숫 자 : "+number);
		
			

	}

}