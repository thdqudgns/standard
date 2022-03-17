package standard.chapter03;

public class OperatorEx32 {
	public static void main(String args[]) {
		
		//조건 연산자 ? :
		//조건식 ? 식1 : 식2
		//조건식의 평가 결과가 true이면 식1이, false이면 식2가 연산결과가 된다
		
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >= 0 ? x : -x;	//x의 값이 음수이면 양수로 만든다
		absY = y >= 0 ? y : -y;	//y는 5가 되어 absY에 저장
		absZ = z >= 0 ? z : -z;	//0이 signZ에 저장
		
		signX = x > 0 ? '+' : ( x==0 ? ' ':'-');	//조건 연산자를 중첩, '+'가 signX에 저장
		signY = y > 0 ? '+' : ( y==0 ? ' ':'-');	//y는 음수(-5)라서 식2 쪽을 연산하는데, 또 0이 아니라서 '-'가 signY에 저장된다
		signZ = z > 0 ? '+' : ( z==0 ? ' ':'-');	//공백문자 ' '가 signZ에 저장
		
		System.out.printf("x=%c%d%n", signX, absX);	//x=+10
		System.out.printf("y=%c%d%n", signY, absY);	//y=-5
		System.out.printf("z=%c%d%n", signZ, absZ);	//z= 0
		
	} //main method

} //class
