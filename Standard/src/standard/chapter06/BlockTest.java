package standard.chapter06;

// 초기화 블럭의 실행 순서 : 클래스 초기화 블럭 -> 인스턴스 초기화 블럭 -> 생성자. + 변수의 초기화 설명

/*
 * 변수의 초기화:
 * 
 * 	멤버변수(iv, cv)는 초기화를 하지 않아도 자동적으로 변수의 자료형에 맞는 기본값으로 초기화가 이루어지므로 초기화 하지 않고 사용해도 되지만,
 * 	지역변수는 사용하기 전에 반드시 초기화해야 한다.
 * 
 * 멤버변수의 초기화 방법:
 * 
 * 	명시적 초기화(explicit initialization):
 * 		- 변수를 선언과 동시에 초기화하는 것
 * 
 * 	생성자(constructor):
 * 		- 바로 전 공부한 내용
 * 
 * 	초기화 블럭(initialization block): 복잡한 초기화에 사용
 * 		- 인스턴스 초기화 블럭 : 인스턴스 변수를 초기화하는데 사용 -> {}
 * 		- 클래스 초기화 블럭 : 클래스 변수를 초기화하는데 사용 -> static {}
 * 
 * 클래스 초기화 블럭은 클래스가 메모리에 처음 로딩될 때 한 번만 수행된다.
 * 인스턴스 초기화 블럭은 생성자와 같이 인스턴스를 생성할 때마다 수행된다.
 * 생성자보다 인스턴스 초기화 블럭이 "먼저" 수행된다.
 * 
 * 인스턴스 변수의 초기화는 주로 생성자를 이용하고,
 * 인스턴스 초기화 블럭은 모든 생성자에서 공통으로 수행되어야 하는 코드를 넣는데 사용한다. (중복된 코드를 초기화 블럭에 넣음)
 */

class BlockTest {
	static {	//클래스 초기화 블럭 - 1빠로 수행된다.
		System.out.println("static { }");
	}
	
	{	//인스턴스 초기화 블럭
		System.out.println("{ }"); // - 3빠 => 생성자보다 초기화블럭이 먼저 수행됨. 그리고 인스턴스가 생성될 때마다 수행됨
	}
	
	public BlockTest() {
		System.out.println("생성자");	// - 4빠
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest(); "); // - 2빠로 수행된다.
		BlockTest bt = new BlockTest();

		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest();
	}
}

/*
static { }
BlockTest bt = new BlockTest(); 
{ }
생성자
BlockTest bt2 = new BlockTest(); 
{ }
생성자
*/
