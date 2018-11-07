package chapter01;

public class ArrayTest3 {

	public static void main(String[] args) {
		int arrayInt1[];   //비추천
	    int[] arraysInt2;  //추천
	    
	    //int[5] arrayInt3; //오류-c언어에서 사용 (자바에서 객체생성은 new 아니고는 절대불가!)
	    arraysInt2 = new int [5]; //배열은 객체다. 객체 생성은 new 키워드로 해야 한다. 
	    arraysInt2[0] = 1;
	    arraysInt2[1] = 2;
	    arraysInt2[2] = 3;
	    arraysInt2[3] = 4;
	    arraysInt2[4] = 5;
	    
	    int[] arraysInt3 = {1, 2, 3, 4, 5};
	    int[] arraysInt4 = new int[] {1, 2, 3, 4, 5}; //비추천
	    
	    // error 위처럼 같은 라인으로 적어 줘야한다. 2개의 구문으로 적는것은 불가하다.
	    //int[] arrayInt5;
	    //arrayInt5 = {1, 2, 3, 4, 5};
	    //Book 객체 5개를 만든 것이 아니다. 
	    //Book 객체 참조값 5개를 저장할 공간을 만든 것이다.
	    Book[] books = new Book[5];
	    
	    books[0] = new Book();
	    books[0].title = "이것이 자바다";
	    
	    
	    
	    
	}

}
