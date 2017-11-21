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
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.���� ");
			System.out.println("-----------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {			
			case 1:
				System.out.print("�л���> ");
				studentNum = scanner.nextInt();
				if(studentNum > 0)
					scores = new int[studentNum];
				else {
					studentNum = 0;
					System.out.println("�߸��� �Է�");
				}
				break;
			case 2:
				if(studentNum > 0) {
					inputScores(studentNum, scanner, scores);
				}
				else
					System.out.println("�л� �� �ʿ�");
				break;
			case 3:
				if(scores != null) {
					outputScores(studentNum, scores);
				}
				else
					System.out.println("���� �ʿ�");
				break;
			case 4:
				if(scores != null) {
					maxValue(studentNum, scores);
					avgValue(studentNum, scores);
				}
				else
					System.out.println("���� �ʿ�");
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("���α׷� ����");
	}
	
	static void maxValue(int _studentNum, int[] _scores) {
		int iResult = 0;
		for(int i=0; i<_studentNum; i++){
			if(iResult < _scores[i]) {
				iResult = _scores[i];
			}
		}
		System.out.println("�ְ� ���� : "+ iResult);
	}
	
	static void avgValue(int _studentNum, int[] _scores) {
		double dResult = 0.0;
		for(int i=0; i<_studentNum; i++){
			dResult += _scores[i];
		}
		dResult /= _studentNum;
		System.out.println("��� ���� : "+ dResult);
	}
	
	static void inputScores(int _studentNum, Scanner _scanner, int[] _scores) {
		for(int i=0; i<_studentNum; i++) {
			int temp = 0;
			System.out.print("scores["+i+"]: ");
			temp = _scanner.nextInt();
			if(temp > 0)
				_scores[i] = temp;
			else {
				System.out.println("�߸��� �Է�");
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
