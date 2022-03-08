package standard.chapter02;

public class VarEx2 {
	public static void main(String[] args) {
		
		// 두 변수의 값 교환하기
		
		int x = 10, y = 20;
		int tmp = 0; // 공간을 하나 더 이용하면 된다.
		
		System.out.println("x: "+x+", y: "+y); // x: 10, y: 20
		
		tmp = x;
		x = y;
		y = tmp;

		System.out.println("x: "+x+", y: "+y); // x: 20, y: 10
	}

}
