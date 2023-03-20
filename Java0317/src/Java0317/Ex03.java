package Java0317;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run=true;
		int balance=0;
		Scanner s = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			System.out.print(" 선택> ");
			String ch=s.nextLine();
			String ch1="";
			switch(ch) {
				case "1":
					System.out.printf(" 예금액> ");
					balance += s.nextInt();
					ch1=s.nextLine(); //버퍼 정리
					break;
				case "2":
					System.out.printf(" 출금액> ");
					int m = s.nextInt();
					ch1=s.nextLine(); //버퍼 정리
					if(balance<m) System.out.println(" 예금이 부족합니다.");
					else balance -= m;
					break;
				case "3":
					System.out.printf(" 잔고> ");
					System.out.println(balance);
					break;
				case "4":
					run=false;
					System.out.println(" 프로그램 종료");
					break;
				default:
					System.out.println(" 다시 선택해주세요.");
					break;
			}
			
		}
	}
}
