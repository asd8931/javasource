
public class Exercise1 {
	public  static void main(String[] args)
	{
		int fahreheit = 100;
		float celcius = 0.0f;
		celcius = (int)(5.0f / 9.0f * (fahreheit - 32)*100+0.5)/(float)100;
		
		System.out.println("fahrenheit:"+fahreheit);
		System.out.println("Celcius:"+celcius);
	}
}
