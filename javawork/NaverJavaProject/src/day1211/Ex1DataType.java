package day1211;

public class Ex1DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte에 숫자 넣어보기
		byte a=127;//정수형 변수 선언후 127을 a에 대입
		byte b=(byte)128;//(byte): 강제 형변환 -cast연산자
		byte c=(byte)200;
		byte d=(byte)161;
		System.out.println("a="+a);
		System.out.println("b="+b);//-128 :틀린값이 나온다, 범위를 벗어나므로
		System.out.println("c="+c);//-56 :-2의 보수로 계산해서 나온 값
		System.out.println("d="+d);//-95

	}

}
