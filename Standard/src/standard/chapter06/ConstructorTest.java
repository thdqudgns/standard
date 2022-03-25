package standard.chapter06;

//생성자, 인스턴스 변수의 초기화 작업에 주로 사용된다.

//생성자에는 리턴값이 아예 없다.
//생성자의 이름은 클래스의 이름과 같아야 한다
//생성자도 오버로딩 가능 -> 하나의 클래스에 여러 개의 생성자가 존재할 수 있다

//지금까지 인스턴스를 생성하기 위해 사용해왔던 '클래스이름()'이 바로 생성자였다
//인스턴스를 생성할 때에는 반드시 클래스 내에 정의된 생성자 중의 하나를 선택하여 지정해주어야 한다.

//사실 모든 클래스에는 반드시 하나 이상의 생성자가 정의되어 있어야 한다.
//지금까지 클래스에 생성자를 정의하지 않고도 인스턴스를 생성할 수 있었던 것은, 컴파일러가 '기본 생성자(default constructor)'를 제공하기 때문이다.

class Data1 {
	int value;
}

class Data2 {
	int value;
	
	Data2(int x) {	//매개변수가 있는 생성자
		value = x;
	}
	
	//이렇게 생성자를 정의하면, 기본생성자가 추가되지 않는다.
	//컴파일러가 기본 생성자를 자동으로 추가해주는 경우는, '클래스 내에 생성자가 하나도 없을 때'뿐이다.
}

class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2();		//compile error 발생
	}
}