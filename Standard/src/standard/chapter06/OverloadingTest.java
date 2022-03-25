package standard.chapter06;

//오버로딩, 한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것

//한 클래스 내에 사용하려는 이름과 같은 이름의 메서드가 이미 있더라도 
//매개변수의 개수 or 타입이 다르면, 같은 이름을 사용해서 메서드를 정의할 수 있다
//이처럼 한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것을 '오버로딩'이라 한다

// 1. 같은 이름을 가져야 한다
// 2. 매개변수의 개수 또는 타입이 달라야 한다
// *. 반환타입이 다른 것은 영향없음

//장점: 
//	같은 기능을 하는 메서드들의 이름을 통일함으로써 메서드를 호출할 때 매개변수를 다르게 입력해도 같은 기능을 할 수 있다. 
//	메서드의 이름을 절약할 수 있다

class OverloadingTest {
	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3,3) 결과: "	+ mm.add(3,3));
		System.out.println("mm.add(3L,3) 결과: "	+ mm.add(3L,3));
		System.out.println("mm.add(3,3L) 결과: "	+ mm.add(3,3L));
		System.out.println("mm.add(3L,3L) 결과: "	+ mm.add(3L,3L));
		
		int[] a = {100,200,300};
		System.out.println("mm.add(a) 결과: " + mm.add(a));
		
	} //main
	
} //class

class MyMath3 {
	
	//메서드 오버로딩 1,2,3,4 -> 매개변수의 타입을 바꿈
	
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a+b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a+b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	
	//메서드 오버로딩 5 -> 배열 타입 매개변수 
	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for (int i=0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}

} //class


/*
int add(int a, int b) - mm.add(3,3) 결과: 6
long add(long a, int b) - mm.add(3L,3) 결과: 6
long add(int a, long b) - mm.add(3,3L) 결과: 6
long add(long a, long b) - mm.add(3L,3L) 결과: 6
int add(int[] a) - mm.add(a) 결과: 600
*/