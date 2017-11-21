
public class Exercise8 {
	public static void main(String[] args)
	{
		int number = 12321;
		int tmp = number;
		int result = 0;
		
		/*while(tmp != 0)
		{
			int i = 10000;
			int j = 1;
			while(i>=1)
			{
				result += tmp/i * j;
				tmp %= i;
				i/=10;
				j*=10;
			}
		}*/
		int j = 10000;
		while(tmp != 0)
		{
			result += tmp%10 * j;
			tmp /= 10;
			j /= 10;
		}
				
		System.out.println(result);
		if(number == result)
		{
			System.out.println(number + "는 회문수 입니다.");
		}
		else
		{
			System.out.println(number + "는 회문수가 아닙니다");
		}
	}
}
