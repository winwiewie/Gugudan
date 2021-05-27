package practice.six;

public class GugudanOne {
	public static void main(String[] args) {
			calculate(5, 9);
			oneDan(-8);
	}
	
	
	public static int[] oneDan(int Dan) {
		int[] result = new int[9];
		
		System.out.println(Dan + " 단");
		
		for(int i = 0; i < result.length; i++) {
			result[i] =  Dan * (i+1);
			System.out.println(Dan + " * " + (i+1) + " = " +   result[i]);
		}
		
		return result;
		
	}
	
	
	public static int[] calculate(int firstDan,int lastDan) {
		
		
		int[] result = new int[9];
		
		if (firstDan > lastDan) {
			System.out.println("첫번째 숫자가 마지막 숫자보다 클수 없습니다.");
			return null;
		}
		
//		System.out.println((lastDan- firstDan) +1);
		
		if (result.length <  (lastDan- firstDan) +1) {
			System.out.println("단의 갯수는 10개이상 넘어갈수 없습니다.");
			return null;
		}
		

		for (int i = 0; i <= result.length; i++) {
			
			if (firstDan+i == lastDan +1) {
				break;
			}
			
			System.out.println((firstDan+i) + " 단");
			
			for (int j = 0; j < result.length; j++) {
				result[i] = (firstDan+i) * (j+1); 
				System.out.println( (firstDan+i) + " * " + (j+1) + " = "+ result[i]);
			}
			System.out.println();
			
		}
		return result;
	}
	
}
