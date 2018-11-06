package chapter01;

public class WhileTest {

	public static void main(String[] args) {
	   
		//초기화
		int x = 0;
		
		//진입조건 검사
	    while(x < 10) {
			System.out.println(x);
			
			//증감연산
			x = x + 1;
		}
	    
		System.out.println("끝!");
	}
	
}
