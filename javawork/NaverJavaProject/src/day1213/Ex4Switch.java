package day1213;

import java.util.Scanner;

public class Ex4Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("숫자 입력");
		num=sc.nextInt();
		switch(num%2)
		{
		case 0:
			System.out.println("짝수입니다");
			break;//중간에 break 꼭 있어야함
		case 1:
			System.out.println("홀수입니다");
		}
		
		//if문으로도 구현
		if(num%2==0)//num을 2로 나눴을 때 0이면
			System.out.println("짝수입니다");
		else//num을 2로 나눴을 때 0이 아니면
			System.out.println("홀수입니다");

	}

}
