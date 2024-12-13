package day1210;

public class Ex2Args {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(String[]args) -> 실행시에 넘어오는 문자의 값
		
		System.out.println("첫번째값:"+args[0]);
		System.out.println("두번째값:"+args[1]);
		System.out.println(args[0]+args[1]);
		//문자열이라 10, 20 입력시 계산이 아니라 나열돼서 나온다
		
		/*
		 * 문자열을 '계산을 하기 위한 숫자'로 변환하려면 Integer.parseInt 사용
		 * int = 선언!!!!!
		 * int value -> value에 정수값 저장하기
		 * 숫자 넣기 -> int su1=Integer.parseInt(args[0]);
		 */
		
		//문자열을 숫자 형태로 변환해보자
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		
		System.out.println("두수의 합은 "+(num1+num2)+"입니다");

	}

}