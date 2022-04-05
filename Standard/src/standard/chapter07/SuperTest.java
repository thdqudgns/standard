package standard.chapter07;

//오버라이딩 설명 + super 설명

/*
 * 오버라이딩의 조건: 
 * 자손클래스에서 오버라이딩하는 메서드는 조상 클래스 메서드와
 * 		- 이름이 같아야 한다
 * 		- 매개변수가 같아야 한다
 * 		- 반환타입이 같아야 한다
 * 오버라이딩 할 때 주의사항:
 * 		- 접근제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다
 * 		- 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다
 * 		(예외 클래스의 상속관계 주의. Exception클래스를 예외로 두는 것은 가장 많은 예외를 던질 수 있도록 선언한 것이다)
 * 		- 인스턴스메서드를 static메서드로 또는 그 반대로 변경할 수 없다
 * 		 ( + static메서드는 오버라이딩 할 수 없다)
 */

/*
 * 오버로딩과 오버라이딩
 * 	오버로딩: 기존에 없는 새로운 메서드를 정의하는 것
 * 	오버라이딩: 상속받은 메서드의 내용을 변경하는 것
 */

/*
 * super는 자손클래스에서 조상클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조변수이다.
 * 조상클래스의 멤버와 자손클래스의 멤버가 중복 정의되어 서로 구별해야 하는 경우에만 super를 사용하는 것이 좋다
 * static메서드에서는 사용할 수 없고, 인스턴스메서드에서만 사용할 수 있다
 */

class SuperTest {
	public static void main(String args[]) {
		Child c = new Child();
		c.method();
	}
}

class Parent {
	int x=10;
}

class Child extends Parent {
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x="+ super.x);
	}
	/*
	x=10
	this.x=10
	super.x=10
	*/
}

//이 경우 x, this.x, super.x 모두 같은 변수를 의미하므로 모두 같은 값이 출력되었다
