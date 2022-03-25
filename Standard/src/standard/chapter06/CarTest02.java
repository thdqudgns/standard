package standard.chapter06;

//생성자에서 다른 생성자 호출하기 - this(), this

//1. 생성자에서 다른 생성자를 호출할 때 생성자의 이름으로 클래스이름 대신 this를 사용한다.
//2. 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능하다.

class Car2{
	String color;		//색상
	String gearType;	//변속기 종류 -	auto(자동), manual(수동)
	int door;			//문의 개수
	
	Car2() {
		this("white", "auto", 4);	//Car(String color, String gearType, int door)를 호출한다
	} //this를 사용함, 첫 줄에서 호출함
	
	Car2(String color){
		this(color, "auto", 4);
	}
	
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		//this.color는 인스턴스 변수이고, color은 지역변수이다.
		//단순히 매개변수의 이름을 다르게 하는 것보다,
		//this를 이용하여 구별되도록 하는 것이 의미가 더 명확하고 이해하기 쉽다.
		
		//참조변수를 통해 인스턴스의 멤버에 접근하는 것처럼, 'this'로 인스턴스 변수에 접근할 수 있는 것이다.
		
		//static메서드에서 인스턴스 멤버들을 사용할 수 없는 것처럼, 'this'역시 사용할 수 없다.
		//static메서드가 호출된 시점에 인스턴스가 존재하지 않을 수 있기 때문이다.
	}
}

class CarTest02 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
		
		/*
		c1의 color=white, gearType=auto, door=4
		c2의 color=blue, gearType=auto, door=4
		*/
	}
}
