package day1212;

public class Ex1Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//증감 연산자, ++변수 (전치:1순위) , 변수++(후치:끝순위)
		int a,b,m,n;
		a=b=5;//대입연산자는 오른쪽(b=)부터 들어감
		m=++a;//먼저 a가 증가된후 m으로 도입된다
		n=b++;//먼저 대입후 b가 증가된다
		System.out.printf("a=%d,b=%d,m=%d,n=%d\n",a,b,m,n);

	}

}
