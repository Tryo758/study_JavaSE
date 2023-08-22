package section02;
/*
 * 형변환(cast)
 * 	1. 업캐스팅(프로모션)
 * 		- 표현 범위가 더 큰 데이터형으로 변환하기
 * 		- 자동으로 가능
 * 		- 데이터 손실이 없다.
 * 	2. 다운캐스팅(디모션)
 * 		- 표현 버무이가 더 작은 데이터형으로 변환하기
 * 		- 명시적으로 형변환 해야한다.
 * 		- 데이터 손실이 있을 수 있다.
 * 
 */
public class Variable07 {
	public static void main(String[] args) {
		// 업캐스팅 예
		byte iByte = 10;
		int iInt = iByte; // 자동으로 형변환됨
		System.out.println("iInt: " + iInt); // 문자열+숫자는 문자열이 된다.
		
		float iFloat = 10.1f;
		double iDouble = iFloat; // 자동으로 형변환됨
		
		// 다운캐스팅 - overflow 현상 주의!
		int iInt2 = 130; // 128 : -128, 129 : -127, 130 : -126
		byte iByte2 = (byte)iInt2; //(변환하고 싶은 데이터형)을 명시
		System.out.println("iByte2: " + iByte2);
		
		// 실수 -> 정수 형변환 예
		float iFloat2 = 3.14f;
		int iInt3 = (int)iFloat2; // 소수부분 절삭됨
		System.out.println("iInt3: " + iInt3);
	}
}
