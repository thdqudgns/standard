package standard.chapter02;

public class CastingEx1 {
	public static void main(String[] args) {
	
		//형변환
		//변환하고자 하는 타입을 괄호와 함께 붙여주기만 하면 된다.
		
		double d = 85.4;
		int score = (int)d; //8byte인 double형의 데이터를 4byte인 int형으로 형변환
		
		System.out.println("score="+score);
		System.out.println("d="+d);
		
	}

}
