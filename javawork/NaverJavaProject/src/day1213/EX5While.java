package day1213;

public class EX5While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while, do~while문은 내가 몇번이나 반복할지 모를때 사용
		//while은 조건이 맞지 않으면 한번도 실행안하고 빠져나온다
		//while -> 선 비교 후 처리
		int a=10;
		while(a<10) {
			System.out.println("while loop");
		}

		//do~while -> 선 처리 후 비교
		//do~while은 일단 한번 실행후 조건을 비교하므로 조건이 맞지 않아도 최소 한번은 문장이 실행된다
		do {
			System.out.println("do~while loop");
		}while(a<10);
		
		a=1;
		while(a<=10) {
			System.out.printf("%3d",a++);//1이니까 a++ 출력(전치냐 후치냐에 따라 조건이 달라짐)
			//그냥 a누르면 무한루프에 빠짐
		}
		System.out.println();
		a=1;
		while(true)//true니까 반드시 빠져나갈 수 있는 break 를 넣어야함
		{
			System.out.printf("%3d",a++);
			if(a>10)
				break;//10보다 커지면 break해라라는 말
		}
		System.out.println();
		a=0;
		while(a<10)//여기에 ;쓰는 순간 무한루프 돌게됨
			{
			System.out.printf("%3d",++a);//0이니까 ++a 출력(전치냐 후치냐에 따라 조건이 달라짐)
		}
		System.out.println();
		a=1;
		do {
			System.out.printf("%3d",a++);
		}while(a<10);
	}

}
