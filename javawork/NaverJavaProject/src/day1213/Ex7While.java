package day1213;

import java.util.Scanner;

public class Ex7While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while, do~while문은 내가 몇번이나 반복할지 모를때 사용
		Scanner sc=new Scanner(System.in);
		int score,total=0,count=0;//대입연산자, 증감연산자의 사용자의 변수에는 초기값이 반드시 필요
		double avg;
		
		while(true)//0을 쓰면 빠져나와서 평균을 구할꺼니까 true 작성
		{
			System.out.print("점수입력(종료시 0):");//print하면 입력이 옆으로 나옴
			score=sc.nextInt();
			if(score<0 || score>100)
			{
				System.out.println("\t잘못 입력된 점수입니다");
				continue;//다시 처음으로(조건식)이동
				         //이렇게 되면 나머지는 실행이 안됨
			}
			
			
			if(score==0)//만약 if문을 total 밑에 적으면 헷갈리니까 제대로 순서 기입
				break;
			
			count++;
			total+=score;
		}
		
		avg=(double)total/count;//둘다 integer이여서 안나오니까 하나를 double로 바꾸기

		System.out.println("총 입력한 점수갯수:"+count);
		System.out.println("점수의 총 합계:"+total);
		System.out.printf("점수들의 평균 : %5.2f\n",avg);
		//NaN == Not a Number
	}

}
