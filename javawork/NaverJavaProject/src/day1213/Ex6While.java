package day1213;

public class Ex6While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=65;
		while(a<=90)//90은 z //
			//System.out.printf("%c",a++);
		{
			System.out.print((char)a++);
			//이걸 char로 출력한다면? 형변환을 해주면 된다 (한글자씩 뽑으려고 형변환함)
		}
		System.out.println();//아무것도 안쓰면 줄넘김이됨 print는 줄넘김하려면\n
		char b='a';//do~while 문을 이용해서 a부터 z까지 출력하시오(아스키 코드)
		do {
			System.out.print(b++);
		}while(b<='z');//아스키코드를 모르면 이렇게 직접 줘도 된다
		
		int n=0;
		while(n<=10) {
			n++;
			if(n%2==0)
				continue;//조건식으로 이동(while이나 do~while에서)
			              //조건에 따라서 다시 처음으로 돌아갈때 쓰는게 continue
			System.out.printf("%3d",n);//짝수일 때는 얘가 실행안됨
		}
	 
	}

}