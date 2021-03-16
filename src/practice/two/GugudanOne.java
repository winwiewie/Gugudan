package practice.two;

import java.util.Scanner;

public class GugudanOne {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		
		System.out.print("단을 입력해주세요 : ");
		number = scanner.nextInt();
		
		//if start
		if (number <= 1) {
			System.out.println("2단 이상 가능합니다.");
		} else if(number >= 10) {
			System.out.println("10단 이상은 불가능합니다.");
		} else {
/**				
			System.out.println(number * 1);
			System.out.println(number * 2);
			System.out.println(number * 3);
			System.out.println(number * 4);
			System.out.println(number * 5);
			System.out.println(number * 6);
			System.out.println(number * 7);
			System.out.println(number * 8);
			System.out.println(number * 9);
*/
			//보기 쉽게 바꿈
			//위에것은 "        5" 출력
			//지금것은 "5 * 1 = 5" 출력
			System.out.println(number + "단");
			System.out.println(number + " * 1 = " + number * 1);
			System.out.println(number + " * 2 = " + number * 2);
			System.out.println(number + " * 3 = " + number * 3);
			System.out.println(number + " * 4 = " + number * 4);
			System.out.println(number + " * 5 = " + number * 5);
			System.out.println(number + " * 6 = " + number * 6);
			System.out.println(number + " * 7 = " + number * 7);
			System.out.println(number + " * 8 = " + number * 8);
			System.out.println(number + " * 9 = " + number * 9);
		}
		//if end
			
	}
}
