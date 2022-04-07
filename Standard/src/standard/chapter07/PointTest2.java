package standard.chapter07;

//상속관계에 있는 클래스에서 생성자 호출 순서

//어떤 클래스의 인스턴스를 생성하면, 클래스 상속관계의 최고조상인 Object클래스까지 거슬러 올라가면서 모든 조상클래스의 생성자가 순서대로 호출된다는 것을 알 수 있다.
// Point3D() -> Point3D(int x, int y, int z) -> Point(int x, int y) -> Object()

class PointTest2 {
	public static void main(String argsp[]) {
		Point3D p3 = new Point3D();
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
	}
}

class Point {
	int x=10;	
	int y=20;

	Point(int x, int y) {
		
		//컴파일러가 여기에 super();를 삽입한다. super()는 Point()의 조상인 Object클래스의 기본 생성자인 Object()를 의미한다.
		
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point {
	int z=30;

	Point3D() {
		this(100, 200, 300);	// Point3D(int x, int y, int z)¸Ś ČŁĂâÇŃ´Ů.
	}

	Point3D(int x, int y, int z) {
		super(x, y);			// Point(int x, int y)¸Ś ČŁĂâÇŃ´Ů.
		this.z = z;
	}
}