package standard.chapter06;

//main 메서드의 재귀호출

class MainTest {
	public static void main(String[] args) {
		main(null);	//재귀호출, 자기자신을 호출한다
	}
	
	/* 무한호출에 빠진다
	Exception in thread "main" java.lang.StackOverflowError
	at standard.chapter06.MainTest.main(MainTest.java:7)
	at standard.chapter06.MainTest.main(MainTest.java:7)
	...
	at standard.chapter06.MainTest.main(MainTest.java:7)
	at standard.chapter06.MainTest.main(MainTest.java:7)
	*/
}
