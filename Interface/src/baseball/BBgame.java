package baseball;

import java.util.Scanner;

public class BBgame {
	Scanner sc = new Scanner(System.in);
	
	private int[] inputNum = new int[3];
	private int[] result = new int[3];
	private int strike = 0;
	private int ball = 0;
	
	int[] getIntputNum() {
		return inputNum;
	}
	
	int[] getResult() {
		return result;
	}
	
	int getStrike() {
		return strike;
	}
	
	int getBall() {
		return ball;
	}
	
	boolean inputNumber() {
		int temp = 0;
		for(int i=0; i<3; i++) {
			System.out.print(i+1+"> ");
			temp = sc.nextInt();
			if(0 <= temp && temp <= 9) {
				for(int j=0; j<i; j++) {
					if(inputNum[j] == temp) {
						return true;
					}
				}
			}
			else {
				return true;
			}
			inputNum[i] = temp;
		}
		return false;
	}

	void calcRandom() {
		boolean run;
		boolean isEqualNum;
		int temp;
		for(int i=0; i<3; i++) {
				run = true;
				temp = 0;
				while(run) {
					isEqualNum = false;
					temp = (int) (Math.random()*10);
					for(int j=0; j<i; j++) {
						if(result[j] == temp) {
							isEqualNum = true;
							break;
						}
					}
					if(isEqualNum == false) {
						result[i] = temp;
						run = false;
					}
				}
			}
		}
	
	void checkStrike() {
		strike = 0;
		ball = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(inputNum[i] == result[j]) {
					strike++;
					break;
				}
			}
		}
		ball = 3 - strike;
	}
}
