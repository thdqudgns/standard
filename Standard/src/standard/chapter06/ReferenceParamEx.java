package standard.chapter06;

//메서드에서 참조형 매개변수의 동작 확인하기, 변수의 값을 읽고 변경도할 수 있다.
//인스턴스의 주소가 복사되기 때문이다.

class ReferenceParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	} //main
	
	static void change(Data d) {	//참조형 매개변수, 주소가 복사되었다.
		d.x = 1000;		//참조변수 d의 주소를 통해 x에 접근했다
		System.out.println("change() : x = " + d.x);
	} //change
	
	//change메서드가 끝나고 매개변수 d는 스택에서 제거되었지만, 변화된 x의 값은 남아있다.

	/*
	main() : x = 10
	change() : x = 1000
	After change(d)
	main() : x = 1000		//변경되었다
	*/
	
} //class