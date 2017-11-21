
public class Exercise3 {
	public static void main(String[] args)
	{
		/*int sum = 0;
		for(int i = 1; i<=10; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				sum += j;
			}
		}
		System.out.println(sum);*/
		
		int sum = 0;
		int tot = 0;
		for(int i = 1; i<=27; i*=3)
		{
			sum += i;
			tot += sum;
			System.out.println(sum + " " + tot);
		}
		System.out.println(sum);
		System.out.println(tot);
		
	}
}
