
public class p105_8 {
	public static void main(String[] arsg)
	{
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;
		
		if(x == 0.0 || y == 0.0)
		{
			System.out.println("0.0���� ���� �� �����ϴ�.");
		}
		else
		{
			double result = z + 10;
			System.out.println("���: " + result);
		}
	}
}
