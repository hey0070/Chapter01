package chapter01;

import java.util.Scanner;

public class SumToinput {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
        
		System.out.print("입력:");   //prompt
   		int number = scanner.nextInt();
   		
	

   		//반복문
   		int sum = 0;
   		int i = 1;
   		while(i <= number) {
   			System.out.println(i);
             sum = sum + i;
   			i = i + 1;
   			
   			System.out.println("1에서" + number + "까지의 합은" + sum + "입니다.");
   			
}
   		