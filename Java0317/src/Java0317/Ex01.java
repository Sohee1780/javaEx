package Java0317;

import java.util.Scanner;

/*
 * 접근제한자 class 클래스이름 {
 * 	-필드(iv, cv) : 속성을 정의
 * 	-메서드(lv) : 기능을정의 *mainMethod : 실행을 담당
 * 	-생성자 : 객체를 생성할 때 사용(new를 만나면 생성자를 통해서 객체가 생성됨), 초기화블럭
 * }
 */
public class Ex01 {

	int j = 0; //필드 전역변수
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수선언
		//타입 변수명 = new 타입(매개변수);
		//참조변수는 메모리의 주소값을 가지고 있음
		Scanner s=new Scanner(System.in);
		System.out.println("키를 입력해주세요(m) 숫자만 입력 가능합니다.");
		double height = s.nextDouble();
		System.out.println("몸무게를 입력해주세요(kg) 숫자만 입력 가능합니다.");
		double weight = s.nextDouble();
		
		double bmi = weight/(height*height);
		System.out.printf("당신의 bmi는 %.2f입니다.", bmi);

	}

}
