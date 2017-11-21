
public class p135_6 {
	public static void main(String[] args)
	{
		int cnt = 1;
		int a = 1;
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= cnt; j++)
			{
				System.out.print("*");			
			}
			cnt += a;
			if(cnt == 3)
			{
				a *= -1;
			}
			System.out.println("");	
		}
	}
}
