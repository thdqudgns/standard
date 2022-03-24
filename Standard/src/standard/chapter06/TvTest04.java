package standard.chapter06;

//객체 배열, 객체 배열을 생성하는 것은 참조변수들이 만들어질 뿐이다. 객체를 생성해서 배열의 각 요소에 저장해야 한다

class TvTest04 {
	public static void main(String[] args) {
		
		Tv[] tvArr = new Tv[3];	//길이가 3인 Tv객체 배열
		
		for(int i=0; i<tvArr.length;i++) {
			tvArr[i] = new Tv();	//Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
			tvArr[i].channel = i+10;	//tvArr[i]의 channel에 i+10을 저장 - 10, 11, 12
		}
		
		for(int i=0; i<tvArr.length;i++) {
			tvArr[i].channelUp();	//tvArr[i]의 메서드 호출. 채널이 1 증가 - 10->11, 11->12, 12->13
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
		/*
		tvArr[0].channel=11
		tvArr[1].channel=12
		tvArr[2].channel=13
		*/
		
	}// main
	
} // class - TvTest04

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