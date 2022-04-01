package standard.chapter07;

//포함 관계를 이용한 클래스 + toString

/*
 * 인스턴스의 정보를 반환하도록 toString()메서드를 오버라이딩하면, 
 * 참조변수를 출력했을 때 참조하고있는 주소 ( [123@safsd23와 같은 ) 가 출력되는 것이 아니라,
 * toString()을 호출하여 인스턴스의 정보를 반환한다. 
 */

//메인메서드가 있는 클래스
class DeckTest {
	public static void main(String args[]) {
		Deck d = new Deck();	   // 카드 한 벌(Deck)을 만든다.
		Card c = d.pick(0);	   // 섞기 전에 제일 위의 카드를 뽑는다.
		System.out.println(c); // System.out.println(c.toString());과 같다.
		// kind : SPADE, number : 1

		d.shuffle();			   // 카드를 섞는다.
		c = d.pick(0);		   // 섞은 후에 제일 위의 카드를 뽑는다.
		System.out.println(c);
		//kind : DIAMOND, number : Q -> 실행할 때마다 다르게 나옴
	}
}

// Deck클래스
class Deck {
	final int CARD_NUM = 52;	// 카드의 개수, 고정
	Card cardArr[] = new Card[CARD_NUM];  // Card객체 배열을 포함 '덱은 카드를 갖고있다'

	Deck () {	// Deck의 카드를 초기화한다.
		int i=0;

		for(int k=Card.KIND_MAX; k > 0; k--)		//k가 1씩 감소되면서, k가 0이 되는 순간 중지
			for(int n=0; n < Card.NUM_MAX ; n++)	//n이 1씩 증가하면서, n이 13이 되는 순간 중지
				cardArr[i++] = new Card(k, n+1);	//해당무늬(k), 카드의 수(n)마다 새로운 Card 인스턴스를 생성하여 배열에 저장
	}

	Card pick(int index) {	// 지정된 위치(index)에 있는 카드 하나를 꺼내서 반환
		return cardArr[index];
	}

	Card pick() {			// Deck에서 카드 하나를 선택한다.
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}

	void shuffle() { // 카드의 순서를 섞는다.
		for(int i=0; i < cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM);	//i가 1씩 증가하면서 랜덤 자리(r)의 카드와 바꾼다

			Card temp = cardArr[i];	
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
} // Deck클래스의 끝

// Card클래스
class Card {
	static final int KIND_MAX = 4;	// 카드 무늬의 수
	static final int NUM_MAX  = 13;	// 무늬별 카드 수

	static final int SPADE   = 4;
	static final int DIAMOND = 3;
	static final int HEART   = 2;
	static final int CLOVER  = 1;

	int kind;
	int number;

	Card() {
		this(SPADE, 1);
	}

	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK"; // 숫자 10은 X로 표현

		return "kind : " + kinds[this.kind] 
			+ ", number : " + numbers.charAt(this.number);
	} // toString()의 끝
} // Card클래스의 끝