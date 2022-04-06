package standard.chapter07;

//다중상속과 단일상속의 장단점 (java에서는 단일상속만 허용)

/*
 * 다중상속을 허용하면 여러 클래스로부터 상속받을 수 있기 때문에 
 * 복합적인 기능을 가진 클래스를 쉽게 작성할 수 있다는 장점이 있지만,
 * 클래스 간의 관계가 매우 복잡해진다는 것과
 * 
 * 서로 다른 클래스로부터 상속받은 멤버 간의 이름이 같은 경우
 * 구별할 수 없다는 단점을 갖고 있다.
 * 
 * 이러한 문제점이 있기에 단일상속만을 허용한다.
 * 클래스 사이의 관계가 명확해지고, 코드를 신뢰할 수 있다는 점에서 
 * 다중상속보다 유리하다.
 */

class Tv2 {
	boolean power; 	// 전원상태(on/off)
	int channel;		// 채널

	void power()       { 	power = !power; }
	void channelUp()   { 	++channel; }
	void channelDown() {	--channel; }
}

class VCR {
	boolean power; 	// 전원상태(on/off)
	int counter = 0;
	void power() { 	power = !power; }
	void play()  { /* 내용생략*/ }
	void stop()  { /* 내용생략*/ }
	void rew()   { /* 내용생략*/ }
	void ff()    { /* 내용생략*/ }
}

//Tv2를 상속 받아서 Tv2의 멤버들을 그대로 사용할 수 있다.
//VCR 인스턴스를 생성하고, VCR의 메서드를 사용하도록 코드를 설계했다. = VCR을 상속받은 것과 마찬가지다.
//VCR클래스의 메서드가 변경되면, TVCR클래스의 메서드들도 변경된 내용이 적용된다.
//상속과 포함이지만, 다중상속을 받은 것처럼 사용하도록 설계 했다.
class TimeTest extends Tv2 {	//상속
	VCR vcr = new VCR();	//포함
	int counter = vcr.counter;

	void play() {
		vcr.play();	//VCR 클래스에 선언된 메서드를 사용하는 꼴이다.
	}

	void stop() {
		vcr.stop();
   }

	void rew() {
		vcr.rew();
   }

	void ff() {
		vcr.ff();	
   }
}