package test;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum =0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {			
			case 1:
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				if(studentNum > 0)
					scores = new int[studentNum];
				else {
					studentNum = 0;
					System.out.println("잘못된 입력");
				}
				break;
			case 2:
				if(studentNum > 0) {
					inputScores(studentNum, scanner, scores);
				}
				else
					System.out.println("학생 수 필요");
				break;
			case 3:
				if(scores != null) {
					outputScores(studentNum, scores);
				}
				else
					System.out.println("점수 필요");
				break;
			case 4:
				if(scores != null) {
					maxValue(studentNum, scores);
					avgValue(studentNum, scores);
				}
				else
					System.out.println("점수 필요");
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	static void maxValue(int _studentNum, int[] _scores) {
		int iResult = 0;
		for(int i=0; i<_studentNum; i++){
			if(iResult < _scores[i]) {
				iResult = _scores[i];
			}
		}
		System.out.println("최고 점수 : "+ iResult);
	}
	
	static void avgValue(int _studentNum, int[] _scores) {
		double dResult = 0.0;
		for(int i=0; i<_studentNum; i++){
			dResult += _scores[i];
		}
		dResult /= _studentNum;
		System.out.println("평균 점수 : "+ dResult);
	}
	
	static void inputScores(int _studentNum, Scanner _scanner, int[] _scores) {
		for(int i=0; i<_studentNum; i++) {
			int temp = 0;
			System.out.print("scores["+i+"]: ");
			temp = _scanner.nextInt();
			if(temp > 0)
				_scores[i] = temp;
			else {
				System.out.println("잘못된 입력");
				break;
			}
		}
	}
	
	static void outputScores(int _studentNum, int[] _scores) {
		for(int i=0; i<_studentNum; i++) {
			System.out.println("scores["+i+"]: "+_scores[i]);
		}
	}
}
