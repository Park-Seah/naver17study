package day1213;

public class Ex10For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for문은 반복횟수가 정해져있을 때 사용 for(초기식;조건식;증감식)
		//초기식: 딱 1번 실행
		//증감식 결과가 조건에 맞지 않으면 빠져나옴
		//for문 안에서 두 문장 이상일 때 반드시 () 사용
		
		for(int i=1;i<=5;i++)//3번째값은 증간연산자나 대입연산자만 올 수 있다 (+1 불가능 / +=1 가능)
			System.out.print(i+" ");//이거는 for문 안에서 실행되는 것
		System.out.println();//이거는 for문 밖에서 실행
		for(int i=1;i<=10;i+=2)
			System.out.print(i+" ");
		System.out.println();
		for(int i=10;i>=1;i--)
			System.out.print(i+" ");
		System.out.println();
		for(int i=10;i<=100;i+=10)
			System.out.print(i+" ");
		System.out.println();
		
		//for문 break
		System.out.println("break");
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
			if(i==5)
				break;
		}

		//for문 continue(는 증감식에 적용된다)
		System.out.println();
		System.out.println("continue");
		for(int i=0;i<=10;i++) {
			if(i%2==1)
				continue;//i++로 이동
			System.out.print(i+" ");
		}
	}

}
