package chapter01;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		int total = 0;
		int value = 0;
		
		do {
			System.out.print("숫자입력[0 to quit]:");
			Scanner scanner = new Scanner(System.in);
					
					value = scanner.nextInt();
			
			        if( value == 0 ) {
			        	break;
			        }
			        total = total + value;
		} while(value != 0);
  }

	
	}


