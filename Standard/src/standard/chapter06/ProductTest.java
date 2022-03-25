package standard.chapter06;

//각각 다른 인스턴스지만, 클래스변수는 공유함을 이용하여 serialNo 자동으로 늘리기 + 멤버변수의 초기화 시기와 순서 설명

//멤버변수의 초기화 시기와 순서

/*
 * 클래스변수의 초기화 시점		클래스가 처음 로딩될 때 단 한 번 초기화 된다.
 * 인스턴스변수의 초기화 시점	인스턴스가 생성될 때마다 각 인스턴스별로 초기화가 이루어진다.
 * 
 * 클래스변수의 초기화 순서		기본값 -> 명시적 초기화 -> 클래스 초기화 블럭
 * 인스턴스변수의 초기화 순서	기본값 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자
 * 명시적 초기화 전에 기본값이 먼저 저장된다.
 */

class Product {
	static int count = 0;	//생성된 인스턴스의 수를 저장하기 위한 변수
	int serialNo;			//인스턴스 고유의 번호
	
	{	//인스턴스 블럭
		++count;			//Product클래스의 인스턴스를 생성할 때마다 인스턴스 블럭이 수행되어, 클래스변수의 값을 1증가시킨 다음, 그 값을 serialNo에 저장한다.
		serialNo = count;
	}
	
	//만일 count를 인스턴스 변수로 선언했다면, 인스턴스가 생성될 때마다 0으로 초기화 될 것이므로
	//모든 Product인스턴스의 serialNo값은 항상 1이 될 것이다.
	
	//클래스 변수는 모든 인스턴스가 공유하므로, count를 클래스 변수로 선언했기에(클래스 변수는 메모리 공간에 "하나"만 생성된다.)
	//다른 인스턴스를 생성해도 serialNo가 1씩 증가한다
	
	public Product() {}	//기본 생성자, 생략가능

}

class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);
		System.out.println("p2의 제품번호(serial no)는 " + p2.serialNo);
		System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 "+Product.count+"개 입니다.");
	}
}

/*
p1의 제품번호(serial no)는 1
p2의 제품번호(serial no)는 2
p3의 제품번호(serial no)는 3
생산된 제품의 수는 모두 3개 입니다.
*/
