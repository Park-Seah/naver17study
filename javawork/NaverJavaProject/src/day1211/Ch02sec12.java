package day1211;

public class Ch02sec12 {

	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour+"시간 "+minute+"분");
		
		int totalMinute = (hour*60) +minute;
		System.out.println("총 "+ totalMinute +"분");
		
		//변수는 또 다른 변수에 대입되어 메모리 간에 값을 복사할 수 있다
		int x = 10;
		int y = x;
		System.out.println(y);
		
		
		
	}

}
