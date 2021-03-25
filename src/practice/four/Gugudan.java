package practice.four;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		// 8, 9단
		System.out.print("구구단 총 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int danNumber = scanner.nextInt();
		System.out.println("사용자가 입력할 값 : " + danNumber);
		
		if(danNumber < 2) {
			System.out.println("값을 잘못 입력했습니다.");
		}else if(danNumber > 9 ) {
			System.out.println("값을 잘못 입력했습니다.");
		} else {
			for(int i = 1; i < 10; i++) {
				System.out.println(danNumber * i);		
			}
		}
	}
}
