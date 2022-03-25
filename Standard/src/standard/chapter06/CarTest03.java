package standard.chapter06;

//생성자를 이용한 인스턴스 복사

//Object클래스에 정의된 clone메서드를 이용하면 간단히 인스턴스를 복사할 수 있다

class Car3{
	String color;		//색상
	String gearType;	//변속기 종류 -	auto(자동), manual(수동)
	int door;			//문의 개수
	
	Car3() {
		this("white", "auto", 4);
	}
	
	Car3(Car3 c) {	//생성자를 이용한 인스턴스 복사
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	Car3(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
} //class Car3

class CarTest03{
	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1);	//두번째 생성자가 호출되어 c1이 가리키는 인스턴스와 같은 값들로 인스턴스가 만들어진다.
		
		//그러나 메모리공간에 서로 독립적으로 존재하는 별도의 인스턴스이므로 
		//c1의 값들이 변경되어도 c2는 영향을 받지 않는다.
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
		
		c1.door = 100;	//c1의 door 수정함, c2는 상관없음
		System.out.println("c1.door=100; 수행 후");
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
		
		/*
		c1의 color=white, gearType=auto, door=4
		c2의 color=white, gearType=auto, door=4
		c1.door=100; 수행 후
		c1의 color=white, gearType=auto, door=100
		c2의 color=white, gearType=auto, door=4
		*/
		
	} //main
} //class CarTest03