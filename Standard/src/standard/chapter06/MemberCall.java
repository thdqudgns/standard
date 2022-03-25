package standard.chapter06;

//클래스 변수, 클래스 메서드에서 인스턴스 변수와 메서드를 사용하려면 인스턴스를 생성한 후에 사용할 수 있다

//인스턴스 멤버간의 호출에는 아무런 문제가 없다. 
//하나의 인스턴스 멤버가 존재한다는 것은 인스턴스가 이미 생성되어 있다는 것을 의미하며, 
//즉 다른 인스턴스 멤버들도 모두 존재하기 때문이다.

class MemberCall {
	
	//------------------------------- 멤버 필드 -------------------------------------
	int iv = 10;		//인스턴스 변수 생성
	static int cv = 20;	//클래스 변수 생성
	
	int iv2 = cv;		//클래스 변수를 인스턴스 변수에 대입 - 가능, 클래스 변수는 언제나 사용 가능하기 때문
//	static int cv2 = iv;// Error. 인스턴스 변수를 클래스 변수에 대입 - 불가능, 인스턴스 변수는 인스턴스 생성 후에 사용 가능하기 때문
	static int cv2 = new MemberCall().iv;	//이처럼 객체를 생성해야 인스턴스 변수를 사용할 수 있다
	
	//------------------------------ 멤버 메소드 -------------------------------------
	
	//클래스 메서드1 생성 - 클래스변수, 인스턴스변수 사용 테스트
	static void staticMethod1() {
		System.out.println(cv);		//클래스 변수는 언제나 사용 가능
//		System.out.println(iv);		// Error. 인스턴스 변수는 인스턴스 생성 후에 사용할 수 있다
		MemberCall c = new MemberCall();	//인스턴스 생성
		System.out.println(c.iv);	//인스턴스를 생성한 후에야 인스턴스 변수의 참조 가능
	}
	
	//인스턴스 메서드1 생성 - 클래스변수, 인스턴스변수 사용 테스트
	void instanceMethod1() {
		System.out.println(cv);		//인스턴스 메서드에서 클래스 변수 사용 가능
		System.out.println(iv);		//인스턴스 메서드에서 인스턴스 변수 사용 가능
	}

	//------------------------------------------------------------------------
	
	//클래스 메서드2 생성 - 클래스 메서드, 인스턴스 메서드 사용 테스트
	static void staticMethod2() {
		staticMethod1();		//클래스 메서드 호출 가능
//		instanceMethod1();		// Error. 클래스 메서드에서는 인스턴스 메서드 호출 불가. 인스턴스를 생성하지 않았기 때문
		MemberCall c = new MemberCall();	//인스턴스 생성
		c.instanceMethod1();				//인스턴스 생성 후에야 호출할 수 있음
	}
	
	//인스턴스 메서드2 생성 - 클래스 메서드, 인스턴스 메서드 사용 테스트
	void instanceMethod2() {
		staticMethod1();		//클래스 메서드 호출 가능
		instanceMethod1();		//인스턴스메서드 호출 가능
	}
}
