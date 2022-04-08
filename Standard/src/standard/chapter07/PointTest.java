package standard.chapter07;

// super() - 조상클래스의 생성자 설명

/*
 * this()와 마찬가지로 super() 역시 생성자이다. this()는 같은 클래스의 생성자를 호출하는 데 사용되지만, super()는 조상 클래스의 생성자를 호출하는 데 사용된다.
 * 자손클래스의 인스턴스에서는 자손의 멤버와 조상의 멤버들을 모두 사용할 수 있다.
 * 생성자의 첫 줄에서 조상클래스의 생성자를 호출해야 하는 이유는 조상의 멤버들이 먼저 초기화되어 있어야 자손클래스의 멤버가 조상클래스의 멤버를 사용할 수 있기 때문이다.
 */

class PointTest {
	public static void main(String args[]) {
		Point3D p3 = new Point3D(1,2,3);
	}
}

class Point {
	int x;	
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x :" + x + ", y :"+ y;
	}
}

class Point3D extends Point {
	int z;

	Point3D(int x, int y, int z) {

		/*
		 * Point3D클래스의 생성자의 첫 줄이 생성자를 호출하는 문장이 아니기 때문에,
		 * 컴파일러는 자동적으로 'super();'를 Point3D클래스의 생성자의 첫 줄에 넣어준다
		 */
		
//		super();
//		super(x,y);
		
		this.x = x;
		this.y = y;
		this.z = z;
	}

	String getLocation() {	// ¿À¹ö¶óÀÌµù
		return "x :" + x + ", y :"+ y + ", z :" + z;
	}	
}