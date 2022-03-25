package standard.chapter06;

//가변인자(String... args)와 오버로딩, 매개변수의 개수를 동적으로 함

//가변인자는 내부적으로 배열을 이용하기에, 가변인자가 선언된 메서드를 호출할 때마다 배열이 새로 생성된다.
//편리하지만 이런(배열이 새로 생성되는) 비효율이 있으므로 꼭 필요한 경우에만 사용하자.

//만인, 매개변수의 타입을 가변인자가 아니라 배열로 한다면, 반드시 인자를 지정해줘야 하기 때문에 인자를 생략할 수 없다 

//가변인자를 선언한 메서드를 오버로딩하면, 메서드를 호출했을 때 구별되지 못라는 경우가 발생하기 쉽다.
//가능하면 가변인자를 사용한 메서드는 오버로딩하지 않는 것이 좋다

class VarArgsEx {
	public static void main(String[] args) {
		String[] strArr = {"100", "200", "300"};
		
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[]{"1","2","3"}));
		System.out.println("[" + concatenate(",", new String[0]) + "]");
		System.out.println("[" + concatenate(",") + "]");
	}
	
	/*
	100200300
	100-200-300-
	1,2,3,
	[]
	[]
	*/
	
	static String concatenate(String delim, String... args) {
		String result = "";
		
		for (String str : args) {
			result += str + delim;
		}
		return result;
	}
	
//	static String concatenate(String... args) {
//		return concatenate("", args);
//	}

} //class
