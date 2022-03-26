package standard.chapter07;

// 상속의 정의와 장점

/*
 * 자손 클래스는 조상 클래스의 모든 멤버를 상속 받으므로 항상 조상 클래스보다 같거나 많은 멤버를 갖는다.
 * 그래서 상속을 받는다는 것은 조상 클래스를 확장(extends)한다는 의미로 해석할 수 있다.
 * 이것이 상속에 사용되는 키워드가 'extends'인 이유다.
 * 
 * - 생성자와 초기화 블럭은 상속되지 않는다. 멤버만 상속된다.
 * - 자손 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많다.
 * 
 * 조상 클래스만 변경해도 모든 자손 클래스에, 자손의 자손 클래스에까지 영향을 미치기 때문에,
 * 클래스 간의 상속관계를 맺어주면 자손 클래스들의 공통적인 부분은 조상 클래스에서 관리하고
 * 자손 클래스는 자신에 정의된 멤버들만 관리하면 되므로 각 클래스의 코드가 적어져서 관리하기 쉬워진다.
 * 
 * 클래스 간의 상속관계를 적절히 맺어주는 것이 객체지향 프로그래밍에서 가장 중요한 부분이다.
 */

class Tv {
	boolean power;	// 전원상태(on/off), 기본값 false
	int channel;	// 채널, 기본값 0
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class CaptionTv extends Tv {
	boolean caption;	// 캡션상태(on/off), 기본값 false
	void displayCaption(String text) {
		if(caption) {	// 캡션상태가 on(true)일 때만 text를 보여준다.
			System.out.println(text);
		}
	}
}

class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;		//조상 클래스로부터 상속받은 멤버
		ctv.channelUp();		//조상 클래스로부터 상속받은 멤버
		System.out.println(ctv.channel);	//11 출력
		ctv.displayCaption("Hello, World");		//boolean caption;의 기본값이 false이므로 
												//displayCaption()메서드의 if문이 수행되지 않아서 출력되지 않는다.
		ctv.caption = true;		//캡션(자막) 기능을 켠다, caption이 false에서 true로 바뀜.
		ctv.displayCaption("Hello, World");		//displayCaption()메서드의 if문이 수행되어 text가 출력된다.
	}
}
