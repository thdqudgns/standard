package standard.chapter06;

//인스턴스 다루기, 멤버변수의 값 바꾸기

//여기에 적지 않아도, TvTest01에 정의되어 있어서 불러올 수 있다.
class Tv { 
	//Tv의 속성(멤버변수)
	String color;		// 색상
	boolean power;		// 전원상태 (on/off)
	int channel;		// 채널
	
	//Tv의 기능(메서드)
	void power() { power = !power; }	// TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp() { ++channel; }		// TV의 채널을 높이는 기능을 하는 메서드
	void channelDown() {--channel; }	// TV의 채널을 낮추는 기능을 하는 메서드
}

class TvTest02 {
	public static void main(String[] args) {
		Tv t1 = new Tv();	//참조변수의 선언과 인스턴스의 생성 및 주소대입을 동시에 진행함
		Tv t2 = new Tv();
		System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");
		
		t1.channel = 7;		//channel의 값을 7로 한다
		System.out.println("t1의 channel 값을 7로 변경하였습니다.");

		System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");
	}// main
	
	/*
	t1의 channel 값은 0입니다.
	t2의 channel 값은 0입니다.
	t1의 channel 값을 7로 변경하였습니다.
	t1의 channel 값은 7입니다.
	t2의 channel 값은 0입니다.
	*/
	
} // class - TvTest02
