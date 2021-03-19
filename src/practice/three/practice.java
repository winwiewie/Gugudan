package practice.three;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		int i = 9;
		int danNum = 0;
		int danSum = 0;	
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력해주세요 : ");
		danNum = scanner.nextInt();
		
		if(danNum < 2) {
			System.out.println("2단 이상만 가능합니다.");
		}else if(danNum > 9) {
			System.out.println("10단 이상은 불가능합니다.");
		}else {
			System.out.println(danNum + "단(while문)");
			while(i > 0) {
				danSum = danNum * i; 
				System.out.println(danNum + " * " + i + " = " + danSum);
				i--;
			}//while end
		}//if end
		
		System.out.println();
		
		//초기화
		danNum = 0;
		danSum = 0;
		
		System.out.print("단을 입력해주세요 : ");
		danNum = scanner.nextInt();
		
		if(danNum < 2) {
			System.out.println("2단 이상만 가능합니다.");
		}else if(danNum > 9) {
			System.out.println("10단 이상은 불가능합니다.");
		}else {
			System.out.println(danNum + "단(for문)");
			for(int j=9; j > 0; j--) {
				danSum = danNum * j; 
				System.out.println(danNum + " * " + j + " = " + danSum);
			}
		}
		
		 
		
	}
}
