package standard.chapter06;

//매개변수가 있는 생성자, 인스턴스마다 각기 다른 값으로 초기화되어야 하는 경우가 많기 때문에 매개변수를 사용한 초기화는 유용하다.

//기본 생성자를 통해 인스턴스를 생성한 다음에 인스턴스 변수의 값을 변경하는 것보다, 
//매개변수가 있는 생성자를 사용하는 것이 코드를 보다 간결하고 직관적으로 만든다.

class Car{
	String color;		//색상
	String gearType;	//변속기 종류 -	auto(자동), manual(수동)
	int door;			//문의 개수
	
	Car() {}	//default constructor
	
	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
}

class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();			//기본 생성자를 통해 인스턴스를 생성한 다음에 인스턴스 변수의 값을 변경하는 것보다, 
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white", "auto", 4);	//매개변수가 있는 생성자를 사용하는 것이 코드를 보다 간결하고 직관적으로 만든다.
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
		//결과는 같다
	}
	/*
	c1의 color=white, gearType=auto, door=4
	c2의 color=white, gearType=auto, door=4
	*/
}
