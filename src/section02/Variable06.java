package section02;
/*
 * 5. String 형 (문자열)
 * 문자열을 저장할 수 있다.
 * 참조형 변수
 * 
 * 선언방법
 * 	String 변수명;
 * 
 * 
 * 기본형 변수 - boolean, char, byte, short, int, long, float, double
 * 실제 값을 저장하고있는 변수
 * 
 * 참조형 변수 - 기본형을 제외한 모든 객체(class 코드로 되어있다.)
 * 실제 값이 아닌 , 주소 값을 저장하고 있다. 객체에는 속성(값-변수), 기능(메서드)을 가지고 있다.
 * 
 */
public class Variable06 {
	public static void main(String[] args) {
		String str = "안녕하세요.";
		System.out.println("str: " + str);
		
		/*
		 * 문자열에는 인덱스 번호가 있다.
		 * h e l l o
		 * 0 1 2 3 4 <-일종의 방번호(인덱스 번호)
		 * 
		 */
		
		String hello = "hello";
		System.out.println("1번 인덱스: " + hello.charAt(1));
		System.out.println("2번 인덱스 부터 4번 인덱스 전까지: " + hello.substring(2,4));//substring = 문자열을 잘라줌
		
		String addr = "서울 특별시 서대문구 신촌";
		boolean isContain = addr.contains("특별시");
		
		// if 조건문
		if(isContain) {
			System.out.println("특별시민 입니다.");
		} else {
			System.out.println("특별시민이 아닙니다.");
		}
	}
}
