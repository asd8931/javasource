package javaExample;

import java.util.Scanner;

public class GetMean {
	public int getMean(int[] array) {
		int result = 0;
		for(int i=0; i<array.length; i++) {
			result += array[i];
		}
		result /= array.length;
		return result;
	}
	
	public int getMax(int[] array) {
		int result = array[0];
		for(int i=1; i<array.length; i++) {
			if(result < array[i]) {
				result = array[i];
			}
		}
		return result;
	}
	
	public int getMin(int[] array) {
		int result = array[0];
		for(int i=1; i<array.length; i++) {
			if(result > array[i]) {
				result = array[i];
			}
		}
		return result;
	}
	
	public int getSosuNum(int[] array) {
		int totalCount = 0;
		int count = 0;
		for(int i=0; i<array.length; i++) {
			count = 0;
			for(int j=1; j<array[i]; j++) {
				if(Math.floorMod(array[i], j) == 0)
					count++;
				if(count>1)
					break;
			}
			if(count == 1)
				totalCount++;
		}
		return totalCount;
	}
	
	public int[] getNumber() {
		int[] temp = new int[3];
		temp[0] = 3;
		temp[1] = 7;
		temp[2] = 11;
		return temp;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int x[] = new int[num];
		GetMean getMean = new GetMean();
		x = getMean.getNumber();
		
		System.out.println("Æò±Õ°ª : " + getMean.getMean(x));
		System.out.println(getMean.getSosuNum(x));
	}
}
