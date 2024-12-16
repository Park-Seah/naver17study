package day1211;

public class Ex5DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자바에서 char 타입은 2바이트이다(한글 1글자도 저장이 가능)
		//char 사용 시 문자는 ''만 가능, ""사용하면 문자열로 인식, printf 일 때 %c)
		char ch1='A';
		char ch2='가';
		System.out.println("ch1="+ch1);
		System.out.println("ch2="+ch2);
		
		//printf로 출력시 변환기호 1글자 : %c, 문자열 : %s
		System.out.printf("ch1=%c/tch2=%c\n",ch1,ch2);
		System.out.printf("ch1=%d\tch2=%d\n",(int)ch1,(int)ch2);//ascii code로 변환돼서 출력
		
		int a=65;
		System.out.println(a);//65
		System.out.println(a+32);//97
		System.out.println((char)a);//A (ascii code)
		System.out.println((char)(a+32));//a (ascii code)
		
		//printf를 이용해서 출력해보자
		System.out.printf("%c, %c, %c, %c\n",a,a,a,a);
		System.out.printf("%c,%c,%c,%c\n",a,a+2,a+33,a+40);//ascii code로 변환돼서 출력
		
		//printf, ascii code를 사용해서 문자 출력
		System.out.printf("%c%c%c%c%c\n",72,101,108,108,111);//Hello, %c에 콤마 안쓰면 출력 안됨
		System.out.printf("%c%c%c!\n",89,101,115);//Yes!, !도 출력됨
		System.out.printf("%c%c%c!\n",a+24,a+4,a+18);//YES!
	}

}
