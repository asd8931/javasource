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
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("--------------------------");
			System.out.println("����> ");
			i = scanner.nextInt();
			switch(i)
			{
			case 1:
				System.out.println("���ݾ�> ");
				balance += scanner.nextInt();
				break;
			case 2:
			{
				int out = scanner.nextInt();
				if(balance - out < 0)
				{
					System.out.println("��ݾ�>" + balance);
					balance = 0;
				}
				else
				{
					System.out.println("��ݾ�>" + out);
					balance -= out;
				}
			}
				break;
			case 3:
				System.out.println("�ܰ�>" + balance);
				break;
			case 4:
				run = false;
				break;
			}
		}
		System.out.println("���α׷� ����");
	}
}
