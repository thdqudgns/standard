package standard.chapter06;

//반환값이 없는 메서드를 반환값이 있는 메서드로 바꾸는 방법

//void add는 반환값이 없지만, 참조형 매개변수를 사용함으로서 실제 저장공간의 값을 바꿨다.
//(매개변수에 주소가 복사되어, 해당 주소를 통해 실제 데이터에 접근했기 때문)
//그래서 result2[0]을 출력하면 바뀐 값인 8이 출력된다

class ReturnTest {
	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();
		
		int result = r.add(3,5);
		System.out.println(result);
		
		int[] result2 = {0};	//배열을 생성하고, result2[0]의 값을 0으로 초기화
		r.add(3,5,result2);		//배열을 add메서드의 매개변수로 전달
		System.out.println(result2[0]);	//실제 배열의 값이 변경되었기에, 0이 아니라 8이 출력된다
	}
	
	int add(int a, int b) {
		return a+b;
	}
	
	void add(int a, int b, int[] result) {	//배열은 참조형이므로 result2가 가리키고 있는 저장공간의 주소를 매개변수로 받는다 
		result[0] = a+b;	//매개변수로 넘겨받은 배열에 연산결과를 저장 -> 실제 배열의 값이 변경된다
	}
	/*
	8
	8
	*/

}
