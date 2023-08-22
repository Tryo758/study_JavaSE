package section03;
/*
 * 연산자(Operator)
 * 	프로그램에서 데이터를 처리하여 산출하는것을 연산(operation)이라 한다.
 * 	연산에 사용되는 표시나 기호를 연산자(operator)라고 한다.
 * 
 * 1. 산술연산자
 * 	숫자 값을 가지고 수학적인 연산을 수행하는 연산자.
 * 	+, -, *(곱하기), /(나누기), %(나머지연산)
 * 
 */

public class Operator01 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 5;
		
		// 두수의 합
		int sum = num1 + num2; // 정수 + 정수 = 정수이다
		System.out.println("sum: " + sum); // 문자열 + 숫자 -> 값이 연결된 문자열이다.
		
		String result;
		result = num1 + "+" + num2 + "=" + sum;
		System.out.println(result);
	}
}
