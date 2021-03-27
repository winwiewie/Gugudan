package practice.five;

public class GuguDanOne {
	public static void main(String[] args) {
		
		int[] result = new int[9];
		
		for(int i = 0; i < result.length; i++) {
			if(i > 0) {
			for(int j = 0; j < result.length; j++) {
					result[i] = (j+1) * (i+1);
					System.out.println( (i+1) + " * " + (j+1) + " = "+ result[i]);
				}
			System.out.println();
			}
		}
			
// if문 없이 하는법		
		System.out.println("====================================================");
		
			for(int k = 1; k < result.length; k++) {
				for(int j = 0; j < result.length; j++) {
					
					result[k] = (j+1) * (k+1);
					System.out.println( (k+1) + " * " + (j+1) + " = "+ result[k]);
				}
				System.out.println();
			}
		
	}
}
