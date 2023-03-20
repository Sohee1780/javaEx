package Java0320;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1에서 100까지 정수 중에서 3의 배수의 총합
		int sum=0;
		
		for(int i=1; i<=100; i++) {
			if(i%3!=0) continue;
			sum+=i;
			//if(i%3==0) sum+=i;
		}
		System.out.println(sum);
	}

}
