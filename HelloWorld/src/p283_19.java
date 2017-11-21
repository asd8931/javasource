
public class p283_19 {
	private int balance;
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	p283_19()
	{
		balance = 0;
	}
	
	int Getter()
	{
		return this.balance;
	}
	
	void Setter(int balance)
	{
		if(MIN_BALANCE <= balance && balance <= MAX_BALANCE)
		{
			this.balance = balance;
		}
	}
}
