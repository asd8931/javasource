
public class p134_4 {
	public static void main(String[] args)
	{
		int a, b, c;
		do
		{
			a = 0;
			b = 0;
			c = 0;
			a = (int)(Math.random()*6) + 1;
			b = (int)(Math.random()*6) + 1;
			c = a+b;
		}while(c != 5);
		System.out.println(a +","+ b);
	}
}
