
public class p280_15 {
	private boolean log = false;
	
	boolean login(String id, String password)
	{
		if(id == "hong" && password == "12345")
		{
			log = true;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	void logout(String id)
	{
		if(id == "hong" && log == true)
		{
			log = false;
			System.out.println("로그아웃 되었습니다.");
		}
		else
		{
			System.out.println("로그아웃 실패");
		}
	}
}
