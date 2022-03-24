package standard.chapter06;

//변수의 종류 - 인스턴스 변수, 클래스 변수, 지역 변수

/*
 * 인스턴스 변수 : 
 * 	인스턴스를 먼저 생성해야 한다
 *	각각의 인스턴스마다 다른 값을 저장할 수 있다
 * 
 * 클래스 변수 : 
 * 	인스턴스 변수 앞에 'static'을 붙인다
 * 	인스턴스를 생성하지 않고도 [클래스명].[변수명] 형식으로 바로 사용할 수 있다
 * 	([클래스명].[변수명] 형식으로만 사용하는 것이 좋다. 그렇지 않으면 인스턴스 변수로 오해하기 쉽기 때문이다)
 * 	모든 인스턴스가 공통된 저장공간을 공유한다
 * 
 * 지역 변수:
 * 	메서드 안에서만 사용 가능
 */

class CardTest {
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height); //클래스 변수는 객체 생성 없이 '클래스명.클래스변수명' 으로 직접 사용 가능
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;	//인스턴스 변수의 값을 변경
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		c1.width = 50;
		c1.height = 80;	//클래스 변수의 값을 변경
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
		
		/*
		Card.width = 100
		Card.height = 250
		c1은 Heart, 7이며, 크기는 (100, 250)
		c2은 Spade, 4이며, 크기는 (100, 250)
		c1의 width와 height를 각각 50, 80으로 변경합니다.
		c1은 Heart, 7이며, 크기는 (50, 80)
		c2은 Spade, 4이며, 크기는 (50, 80)
		*/
		
	}// main
} //class


class Card {
	//인스턴스를 생성해야만 사용할 수 있는 "인스턴스 변수"
	//각각의 인스턴스마다 다른 데이터를 가질 수 있다
	String kind;	//카드의 종류 - 클로버, 스페이드, 하트, 다이아
	int number;		//카드의 숫자 - 2 ~ 10, K, Q, J
	
	//인스턴스를 생성하지 않고도 [클래스명].[변수명]으로 사용할 수 있는 "클래스 변수"
	//모든 인스턴스들이 공통적으로 공유하는 데이터다 (한 번 바꾸면 모든 인스턴스에 영향을 미친다)
	static int width = 100;		//가로 길이
	static int height = 250;	//세로 길이
}