
public class Exercise6 {
	public static void main(String[] args)
	{
		/*
		int num = 12345;
		int sum = 0;
		
		for(int i=10000; i>=1; i/=10)
		{
			sum += num / i;
			num %= i;
		}
		System.out.println(sum);*/
		
		int num = 12345678;
		int sum = 0;
		
		while(num > 0)
		{
			sum += num%10;
			num /= 100;
		}
		System.out.println(sum);
	}
}
