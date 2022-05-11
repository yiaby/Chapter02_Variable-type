package chapter02_3;

public class P53_CharacterEx1 {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);            //출력:A  =>문자출력
		System.out.println((int)ch1);		//출력:65 =>문자에 해당하는 아스키 코드값 출력
		
		char ch2 = 66;			            //정수값 대입
		System.out.println(ch2);			//출력:B  =>정수값에 해당하는 문자 출력
		
		int ch3 = 67;                        
		System.out.println(ch3);            //출력:67 =>정수출력
		System.out.println((char)ch3);		//출력:C  =>정수값에 해당하는 문자 출력

	}

}
