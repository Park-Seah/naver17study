package day1211;

public class Ex2DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=90;
		int eng=93;
		System.out.println("합계="+kor+eng);
	//String+int+int: 묵시적 형변환에 의해서 String+int=String (String은 계산이 안됨)
	//int+int+int 이므로 먼저 계산을 해야만한다
	//String은 프로그래밍에서 문자열을 의미하는 용어
		System.out.println("합계="+(kor+eng));
		
		//진법변환
		int a=056;//앞에 0을 붙이면 8진수로 인식

	}

}
