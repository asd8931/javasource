package javaExample;

public class ProductMatrix {
	public int[][] productMatrix(int[][] a, int[][] b) {
		int[][] answer = null;
		int aLength = a.length;
		int bLength = b[0].length;
		
		if(aLength != bLength) {
			System.out.println("ÀÎÇ² ¿À·ù");
			return answer;
		}
		else
			answer = new int[aLength][bLength];
		
		for(int i=0; i<aLength; i++) {
			for(int j=0; j<bLength; j++) {
				answer[i][j] = (a[i][0] * b[0][j]) + (a[i][1] * b[1][j]);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		ProductMatrix c = new ProductMatrix();
		int[][] a = {{1,2}, 
					 {2,3},
					 {4,5}};
		int[][] b = {{3,4,5},
					 {5,6,7}};
//		int[][] a = {{1,2,3}, 
//					 {2,3,1},
//					 {4,5,3}};
//		int[][] b = {{3,4,5},
//					 {5,6,7},
//					 {7,8,9}};
		System.out.println("Çà·ÄÀÇ °ö¼À: " + java.util.Arrays.deepToString(c.productMatrix(a, b)));
		System.out.println("Çà·ÄÀÇ °ö¼À: " + a.length);
		System.out.println("Çà·ÄÀÇ °ö¼À: " + b[0].length);
		System.out.println("Çà·ÄÀÇ °ö¼À: " + java.util.Arrays.deepToString(b));
	}
}
