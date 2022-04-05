package standard.chapter07;

//super 참조변수 사용하기

class SuperTest2 {
	public static void main(String args[]) {
		Child2 c = new Child2();
		c.method();
	}
}
class Parent2 {
	int x=10;
}

class Child2 extends Parent2 {
	int x=20;

	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x="+ super.x);
	}
	
	//서로 다른 값을 참조하게 된다
	
	/*
	x=20
	this.x=20
	super.x=10
	*/
}
