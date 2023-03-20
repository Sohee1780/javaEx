package Java0320;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두개의 주사위를 던져서 나온 수
//		int a=0;
//		int b=0;
//		while(a+b!=5) {
//			a=(int)(Math.random()*6)+1;
//			b=(int)(Math.random()*6)+1;
//			System.out.println("("+a+", "+b+")");
//		}
		
//		for(int i=1;i<=10;i++) {
//			for(int j=1;j<=10;j++) {
//				if(4*i+5*j==60) System.out.println("("+i+", "+j+")");
//			}
//		}
		
		//별찍기1
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i<=j) System.out.printf("*");
			}
			System.out.printf("%n");
		}
		System.out.printf("%n");
		//별찍기2
		for(int i=0;i<4;i++) {
			for(int j=1;j<=4;j++) {
				if(i>j-1) System.out.printf(" ");
				else System.out.printf("*");
			}
			System.out.printf("%n");
		}
		System.out.printf("%n");
		//별찍기3
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i>=j) System.out.printf("*");
			}
			System.out.printf("%n");
		}
		System.out.printf("%n");
		//별찍기4-1
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=1;j--) {
				if(i<=j-1) System.out.printf(" "); 
				else System.out.printf("*");
			}
			System.out.printf("%n");
		}
		System.out.printf("%n");
//		//별찍기4-2
//		for(int i=1;i<=4;i++) {
//			for(int j=4;j>=1;j--) {
//				if(i>=j) System.out.printf("*");
//				else System.out.printf(" ");
//			}
//			System.out.printf("%n");
//		}
//		System.out.printf("%n");
		
		//별찍기 마름모
		for(int i=1;i<=4;i++) {
			for(int j=8,k=1;j>=1;j--,k++) {
				if(i<=j-5||i+3<k) {
					System.out.printf(" "); 
					}
				else System.out.printf("*");
			}
			System.out.printf("%n");
		}
		for(int i=1;i<=4;i++) {
			for(int j=8,k=1;j>=1;j--,k++) {
				if(i>j-1||i>k) {
					System.out.printf(" "); 
					}
				else System.out.printf("*");
			}
			System.out.printf("%n");
		}

	}

}