package Goliath;

public class GAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GToA ga = new GToA() {
			public void attackAir() {
				System.out.println("attackAir");
			}
		};
		
		ga.attackAir();
	}

}
