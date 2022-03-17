package standard.chapter03;

public class OperatorEx28 {
	public static void main(String args[]) {
		
		//비트 연산자 |(OR), &(AND), ^(XOR)
		//|(OR)		피연산자 중 한 쪽의 값이 1이면, 1을 결과로 얻는다. 그 외에는 0을 얻는다.
		//&(AND)	양쪽이 모두 1이어야만 1을 결과로 얻는다. 그 외에는 0을 얻는다.
		//^(XOR)	피연산자의 값이 서로 다를 때만 1을 결과로 얻는다. 같을 때는 0을 얻는다.
		
		int x = 0xAB, y = 0xF;
		
		System.out.printf("x = %#X \t\t%s%n", x, toBinaryString(x));
		System.out.printf("y = %#X \t\t%s%n", y, toBinaryString(y));
		System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x|y,  toBinaryString(x|y));
		System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x&y,  toBinaryString(x&y));
		System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x^y,  toBinaryString(x^y));
		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x, y, y, x^y^y,  toBinaryString(x^y^y));
		
		/*
		 * x = 0XAB 				00000000000000000000000010101011
		 * y = 0XF 					00000000000000000000000000001111
		 * 
		 * 0XAB | 0XF = 0XAF 		00000000000000000000000010101111, OR 연산으로 1이 많다
		 * 0XAB & 0XF = 0XB 		00000000000000000000000000001011, AND 연산으로 둘 다 1이어야 1이다
		 * 0XAB ^ 0XF = 0XA4 		00000000000000000000000010100100, XOR 연산으로 달라야 1이다
		 * 0XAB ^ 0XF ^ 0XF = 0XAB 	00000000000000000000000010101011
		 */
		
	} //main method
	
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}
	
	/* Integer.toBinaryString(int i);
	 * 
	 * 10진수 정수형을 2진수의 부호 없는 정수형으로 반환합니다.
	 * 
	 * Parameters:
	 * 		i an integer to be converted to a string.
	 * Returns:
	 * 		the string representation of the unsigned integer value represented by the argument in binary (base 2).
	 * Since:
	 * 		JDK1.0.2
	 * See Also:
	 * 		parseUnsignedInt(String, int)
	 * 		toUnsignedString(int, int)
	 */

	/* String.substring(int beginIndex);
	 * 
	 * 이 문자열의 하위 문자열인 문자열을 반환합니다. 
	 * 서브스트링은 지정된 인덱스의 문자로 시작하여 이 문자열의 끝까지 확장됩니다.
	 * 인덱스의 시작은 0이다.
	 *  
	 *  Examples: 
	 *  	"unhappy".substring(2) returns "happy"
	 *  	"Harbison".substring(3) returns "bison"
	 *  	"emptiness".substring(9) returns "" (an empty string)
	 *  
	 *  Parameters:
	 *  	beginIndex the beginning index, inclusive.
	 *  Returns:
	 *  	the specified substring.
	 *  Throws:
	 *  	IndexOutOfBoundsException - if beginIndex is negative or larger than the length of this String object.
	 */

	/* String.length();
	 * 
	 * 이 문자열의 길이를 반환합니다.
	 * 길이는 문자열 내의 Unicode 코드 단위 수와 동일합니다.
	 * 
	 * Specified by:
	 * 		length() in CharSequence
	 * Returns:
	 * 		the length of the sequence of characters represented by this object.
	 */

} //class
