package standard.chapter03;

public class OperatorEx08 {
	public static void main(String args[]) {
		
		//데이터 손실 후에 저장해도 소용없으니 형변환은 미리하자
		
		int a = 1_000_000;	//1,000,000 1백만
		int b = 2_000_000;	//2,000,000 2백만
		
		long c = a * b;		//a * b = 2,000,000,000,000 ?
		
		System.out.println(c);	//-1454759936
		
		//a * b의 결과가 이미 데이터 손실이 일어난 int 타입의 값(-1454759936)이므로 long형으로 자동 형변환되어도 값은 변하지 않는다
		//올바른 결과를 얻으려면 a 또는 b의 타입을 'long'으로 형변환해야 한다
		
	} //main method

} //class
