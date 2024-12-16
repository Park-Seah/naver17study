package day1211;

public class Ex2DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=90;
		int eng=93;
		System.out.println("합계="+kor+eng);
	//String+int+int: 묵시적 형변환에 의해서 String+int=String (String은 계산이 안됨)
	//int+int+int 이므로 먼저 계산을 해야만한다
		System.out.println("합계="+(kor+eng));
		
		//진법변환
		int a=056;//앞에 0을 붙이면 8진수로 인식
		int b=0x12a;//앞에 0x을 붙이면 16진수로 인식
		System.out.println("a= "+a);//8진수 -> 10진수로 변경
		System.out.println("b= "+b);//16진수 -> 10진수로 변경
		
		int c=047;
		int d=0xa9;
		System.out.println("c= "+c);//4*8+7*1=39
		System.out.println("d= "+d);//10*16+9*1=169
		

	}

}
