package practice.five;

public class GuguDanTwo {
	public static void main(String[] args) {
		int[][] gugudan = new int[9][9];
		
//		for (int i = 1; i < gugudan.length; i++) {
//			System.out.println((i+1) + " 단");
//			for (int j = 0; j < gugudan.length; j++) {
//				gugudan[i][j] = (i+1) * (j+1);
//				
//				System.out.println((i+1) + " * " + (j+1) + " = " + gugudan[i][j] +"\t");
//			}
//			System.out.println();
//		}
		
		
		for (int i = 1; i < gugudan.length; i++) {
			System.out.print( i+1 +" 단\t\t");
		}
		
		System.out.println();
		
		
		for (int i = 0; i < gugudan.length; i++) {
			
			for (int j = 1; j < gugudan.length; j++) {
				
				gugudan[i][j] = (i+1) * (j+1);
				
				System.out.print((j+1) + " * " + (i+1) + " = " + gugudan[i][j] +"\t");
			}
			System.out.println();
		}
		
	}
}


