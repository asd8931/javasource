
public class loop {
	public static void main(String[] args)
	{
		int num1 = 4;
		int num2 = 15;
		int result = 0;
		
		
		for(int i = 1; i <= num1; i++)
		{
			if(num1%i == 0)
			{
				if(num2%i == 0)
				{
					result = i;
				}
			}
		}
		
		System.out.println("�ִ����� : " + result);

		result = num1 * num2 / result;
		
		System.out.print("�ּҰ���� : " + result);
		
		
		
	}
}
