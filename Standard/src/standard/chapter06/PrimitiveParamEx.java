package standard.chapter06;

//메서드에서 기본형 매개변수의 동작 확인하기, 변수의 값을 읽기만 할 수 있다.

class Data { int x; }

class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	} //main
	
	static void change(int x) {	//기본형 매개변수, 값 10이 복사되어 넘어온다.
		x = 1000;
		System.out.println("change() : x = " + x);
	} //change
	
	//change 메서드가 종료되면서 매개변수 x는 스택에서 제거된다.
	//d.x의 값이 변경된 것이 아니라, change메서드의 매개변수 x의 값이 변경된 것이다.
	//즉, 원본이 아닌 복사본이 변경된 것이다. 원본에는 아무런 영향을 미치지 못한다.
	
	/*
	main() : x = 10
	change() : x = 1000		// x의 값이 바뀌었다.
	After change(d.x)		// 하지만,
	main() : x = 10			// main으로 돌아오니 10 그대로다
	*/
} //class
