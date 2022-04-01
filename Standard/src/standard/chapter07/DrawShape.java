package standard.chapter07;

//클래스 간의 포함관계 + 상속과 포함의 구분 + 오버라이딩

/*
 * 포함관계는 한 클래스의 "멤버변수"로 "다른 클래스 타입의 참조변수"를 선언하는 것을 뜻한다.
 * 	class Circle {
 * 		Point p = new Point();
 * 	}
 * 처럼 말이다.
 * 
 * '~은 ~이다'라는 문장이 성립하면 상속관계를 맺어주고
 * '~은 ~을 가지고 있다'는 문장이 성립하면 포함관계를 맺어준다
 * '원은 도형이다' -> 상속관계
 * '원은 점을 갖고 있다' -> 포함관계
 */

//메인 메서드를 수행하는 클래스
class DrawShape {
	public static void main(String[] args) {
		Point[] p = {   new Point(100, 100),	//세 점의 좌표를 배열로 생성 x,y쌍이 세 개 생성됨.
                        new Point(140,  50),
                        new Point(200, 100)
					};

		Triangle t = new Triangle(p);	// 세 점의 좌표를 인자로 하여 "삼각형 인스턴스" 생성
		Circle   c = new Circle(new Point(150, 150), 50);	//원점의 좌표와 반지름을 인자로 하여 "원 인스턴스" 생성

		t.draw(); // 삼각형을 그린다.	-> 삼각형 출력 메서드 호출
		c.draw(); // 원을 그린다.		-> 원 출력 메서드 호출
		
		/*
		[p1=(100,100), p2=(140,50), p3=(200,100), color=black]
		[center=(150, 150), r=50, color=black]
		*/
	}
}

//도형 클래스 - 도형의 색상 초기화, 색상 출력
class Shape {
	String color = "black";	//기본 색상은 검정이다
	void draw() {			//색상을 출력하는 메서드
		System.out.printf("[color=%s]%n", color);
	}
}

//점 클래스 - 도형의 좌표 초기화, 도형의 좌표 반환
class Point {
	int x;	//x좌표 멤버변수
	int y;	//y좌표 멤버변수

	Point(int x, int y) {	//x,y 값을 인자로 받으면, 받은 값으로 멤버변수 x,y 초기화
		this.x = x;
		this.y = y;
	}

	Point() {	//x,y 값을 인자로 받지 않으면, 기본 0,0으로 멤버변수 x,y 초기화
		this(0,0);
	}

	String getXY() {	//x,y 값을 문자열로 반환하는 메서드
		return "("+x+","+y+")"; // x와 y의 값을 문자열로 반환
	}
}

//도형을 상속받은 원 클래스 -> 원은 도형이다.
class Circle extends Shape {
	Point center;	// 원의 원점좌표 -> 원은 점을 갖고 있다 = 포함관계
	int r;			// 반지름

	Circle() {		//원의 기본 생성자
		this(new Point(0, 0), 100); // 동일한 클래스의 Circle(Point center, int r) 생성자를 호출
	}

	Circle(Point center, int r) {	//매개변수가 있는 생성자, 멤버변수인 원점과 반지름을 초기화한다
		this.center = center;
		this.r = r;
	}
	
	//Shape클래스의 draw를 오버라이딩함
	void draw() { // 원을 그리는 대신에 원의 정보를 출력하도록 했다.
		System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
	}
}

//도형을 상속받은 삼각형 클래스 -> 삼각형은 도형이다.
class Triangle extends Shape {
	Point[] p = new Point[3];	//삼각형은 점을 갖고 있다 -> 포함관계

	Triangle(Point[] p) {	//점의 좌표를 초기화 하는 메서드
		this.p = p;
	}

	//Shape클래스의 draw를 오버라이딩함
	void draw() { 
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}
