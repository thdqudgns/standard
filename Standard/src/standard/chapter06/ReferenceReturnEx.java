package standard.chapter06;

//참조형 반환타입, 인스턴스를 가리키고 있는 주소를 반환한다.

//메서드에서 인스턴스를 생성하면, 인스턴스는 "힙 영역"에 생성되기 때문에
//메서드가 종료되어 "호출스택 영역"에서 비워져도 인스턴스는 남아있게 되는데,
//이 인스턴스를 가리키는 주소만 있다면 계속 사용할 수 있다.

public class ReferenceReturnEx {
	public static void main(String[] args) {
		Data d = new Data();	// 인스턴스 생성 - PrimitiveParamEx에서 생성했던 class Data { int x; }
		d.x = 10;	// x에 10 저장
		
		Data d2 = copy(d);	//tmp의 주소가 d2에 저장되었다. 그러나 copy 메서드 종료 후 호출스택에서 tmp는 사라졌을 텐데?

		//그렇다. 메서드의 작업이 이뤄지는 동안 호출스택을 사용하기에, 메서드가 끝나면 할당되었던 메모리 공간은 비워진다.
		//그러나. copy메서드에서 새로운 tmp라는 인스턴스를 생성하였는데, 인스턴스는 호출 스택에 생기는 것이 아니라, "힙 영역"에 생성된다.
		//그래서 tmp가 가리키는 인스턴스는 힙 영역에 있으므로 지워지지 않고 남아있다.
		//그래서 tmp가 가리키는 인스턴스의 주소가 d2에 저장되었으므로, 호출스택에서 tmp가 사라져도, d2를 이용해서 계속해서 이 인스턴스를 다룰 수 있다. 
		
		System.out.println("d.x =" + d.x);
		System.out.println("d2.x =" + d2.x);
	} //main method
	
	static Data copy(Data d) {	// 참조형 매개변수네요. 주소를 통해 실제 인스턴스에 접근합니다.
		Data tmp = new Data();	// 새로운 인스턴스 생성 -> 힙 영역에 생성됨
		tmp.x = d.x;			// d.x는 10이다. 10을 tmp.x에 저장한다
		
		return tmp;				// tmp의 주소를 반환한다?
	} //copy method
	
	/*
	d.x =10
	d2.x =10
	*/
	
} //class
