package practice.three;

import java.util.Scanner;

public class GugudanOne {
	public static void main(String[] args) {
		//6단
		int i = 1;
		int sixDanSum = 0;
		
		System.out.println("6단");
		while(i < 10) {
			sixDanSum = 6 * i;
			System.out.println("6 * " + i + " = " + sixDanSum);
			i = i+1;
		}//while end
		
		//7단
		int sevenDanSum = 0;
		
		System.out.println("7단");
		for(int j = 1; j < 10; j++) {
			sevenDanSum = 7 * j;
			System.out.println("7 * " + j + " = " + sevenDanSum);
		}//for end
		
		System.out.println();
		
		//scannerDan
		int danNumber = 0;
		int scannerSum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력해주세요. : ");
		danNumber = scanner.nextInt();
		
		if(danNumber < 2) {
			System.out.println("2단 이상만 가능합니다.");
		}else if (danNumber > 9) {
			System.out.println("10단 이상은 불가능합니다.");
		}else {
			System.out.println(danNumber + "단");
			
			for(int l = 1; l < 10; l++) {
				scannerSum = danNumber * l;
				System.out.println(danNumber + " * " + l + " = " + scannerSum);
			}//for end
		}
			
		
	}
}
