package Wrapper;

public class Wrap {

	public static void main(String[] args) {
		Integer a = new Integer(100);
		Integer b = Integer.valueOf(101);
		Integer c = 102;
		Integer d = Integer.parseInt("101");
		Integer e = new Integer(102);		
		
		Character f = new Character('c');
		Character g = 'c';
		
		b+=2;
		System.out.println(b);
//		
//		Boolean f = Boolean.valueOf("true");
//		Boolean g = false;
		if(d>e)
			System.out.println("t");
		else
			System.out.println("f");
//		System.out.println(b.equals(d));
//		System.out.println(b.compareTo(d));
//		System.out.println(b+c);
//		System.out.println(a.compareTo(b));
//		if(f.compareTo(g) == 0)
//			System.out.println("true");
//		else
//			System.out.println("false");
	}

}
