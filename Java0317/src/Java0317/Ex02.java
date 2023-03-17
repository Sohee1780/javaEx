package Java0317;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num =s.nextInt();// 공백이 나오면 변수에 대입됨 그래서 엔터를 치면 버퍼에 엔터가 남음
		String a=s.nextLine();// 남아있는 엔터 정리
		String b=s.nextLine();// 문자입력
		System.out.println(num+b);
//		String b=s.nextLine();
//		System.out.println(b);

	}

}
