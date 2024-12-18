package day1216;

import java.util.Random;

public class Ex1Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 난수를 구하는 방법이 2가지가 있다
		 * 1. Math.random() -> Math가 수학 함수에서
		 * 2. Random을 선언한 다음 nextInt 해도 됨
		 * 
		 */
		
		System.out.println("Math.random()은 0.0보다 크거나같고 1.0보다 작은 난수 발생");
		for(int i=1;i<=5;i++)
		{
			System.out.println(Math.random());
		}
		System.out.println("0~9사이의 난수를 구하는 방법");
		for(int i=1;i<=5;i++)
		{
			int n=(int)(Math.random()*10);
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("0~99사이의 난수를 구하는 방법");
		for(int i=1;i<=5;i++)
		{
			int n=(int)(Math.random()*10);
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("1~10사이의 난수를 구하는 방법");
		for(int i=1;i<=5;i++)
		{
			int n=(int)(Math.random()*10);
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("Random 클래스를 이용해서 난수 구하기");
		Random r=new Random();//import가 되어있어야한다
		System.out.println("0~9까지의 난수 구하기");
		for(int i=1;i<=5;i++)
		{
			int n=r.nextInt(10);
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("1~10까지의 난수 구하기");
		for(int i=1;i<=5;i++)
		{
			int n=r.nextInt(10)+1;
			System.out.print(n+" ");
		}
		System.out.println();
        System.out.println("A~Z(65~90)까지의 난수 구하기");
	    for(int i=1;i<=5;i++)
	    {
	    	int n=r.nextInt(26)+65;//r.nextInt(26) -> 0~25가 된다 //+65를 97로 바꾸면 소문자로 나온다
	    	System.out.print((char)n+" ");
	    }
	    System.out.println();
	}	
}	
