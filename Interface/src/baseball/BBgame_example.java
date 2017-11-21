package baseball;

public class BBgame_example {
	public static void main(String[] args) {
		boolean run = true;
		BBgame bb = new BBgame();
		if(bb.inputNumber() == false) {
			while(run) {		
				bb.calcRandom();
				bb.checkStrike();
				
				System.out.println(java.util.Arrays.toString(bb.getIntputNum()));
				System.out.println(java.util.Arrays.toString(bb.getResult()));
				
				if(bb.getStrike() == 3) {
					System.out.println("»ïÁø ¾Æ¿ô");
					run = false;
				}
				else
					System.out.println(bb.getStrike() + "S " + bb.getBall() + "B");
			}
		}
		else
			System.out.println("Àß¸øµÈ ÀÔ·Â");
	}
}
