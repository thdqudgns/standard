package standard.chapter03;

public class OperatorEx27 {
	public static void main(String args[]) {
		
		//논리 부정 연산자 !
		
		boolean b = true;
		char ch = 'C';
		
		System.out.printf("b=%b%n", b); //b=true
		System.out.printf("!b=%b%n", !b); //!b=false
		System.out.printf("!!b=%b%n", !!b); //!!b=true
		System.out.printf("!!!b=%b%n", !!!b); //!!!b=false
		//부정연산자 느낌표의 개수에 따라 결과가 달라진다
		System.out.println();
		
		System.out.printf("ch=%c%n", ch); //ch=C
		System.out.printf("ch < 'a' || ch > 'z'=%b%n", ch<'a' || ch>'z'); //ch < 'a' || ch > 'z'=true
		System.out.printf("!('a'<=ch && ch<='z')=%b%n", !('a'<=ch && ch<='z')); //!('a'<=ch && ch<='z')=true
		System.out.printf("'a'<=ch && ch<='z' =%b%n", 'a'<=ch && ch<='z'); //'a'<=ch && ch<='z' =false
		//'C'가 'a'보다 코드값이 작아서 true다
		//false에 !를 씌우면 true가 된다
		
		
	} //main method

} //class
