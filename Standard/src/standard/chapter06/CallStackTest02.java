package standard.chapter06;

//호출스택(call stack)의 작동 순서 확인하기, main - firstMethod - secondMethod - firstMethod - main


class CallStackTest02 {
	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음.");
		firstMethod();	//static 메서드는 객체 생성 없이 호출 가능하다.
		System.out.println("main(String[] args)이 끝났음.");
	}
	
	static void firstMethod() {
		System.out.println("firstMethod()이 시작되었음.");
		secondMethod();
		System.out.println("firstMethod()이 끝났음.");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()이 시작되었음.");
		System.out.println("secondMethod()이 끝났음.");
	}
	
	//객체를 생성하지 않고도 메서드를 호출할 수 있으려면, 메서드 앞에 static을 붙여야 한다.
	
	/*
	main(String[] args)이 시작되었음.
	firstMethod()이 시작되었음.
	secondMethod()이 시작되었음.
	secondMethod()이 끝났음.
	firstMethod()이 끝났음.
	main(String[] args)이 끝났음.
	*/
}
