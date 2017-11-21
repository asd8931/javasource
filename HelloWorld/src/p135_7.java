import java.util.Scanner;


public class p135_7 {
	public static void main(String[] args)
	{
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		int i;
		while(run)
		{
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.println("선택> ");
			i = scanner.nextInt();
			switch(i)
			{
			case 1:
				System.out.println("예금액> ");
				balance += scanner.nextInt();
				break;
			case 2:
			{
				int out = scanner.nextInt();
				if(balance - out < 0)
				{
					System.out.println("출금액>" + balance);
					balance = 0;
				}
				else
				{
					System.out.println("출금액>" + out);
					balance -= out;
				}
			}
				break;
			case 3:
				System.out.println("잔고>" + balance);
				break;
			case 4:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
