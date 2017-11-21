
public class CarMain {
	public static void main(String[] args)
	{
		Car bmw5 = new Car("Blue", 350);
		Car bmwF = new Car("Red", 300);
		
		System.out.println(bmw5.company);
		System.out.println(bmw5.color);
		System.out.println(bmw5.model);
		System.out.println(bmw5.maxSpeed);
		bmw5.curSpeed = 100;
		System.out.println(bmw5.curSpeed);
		
		System.out.println(bmwF.color);
		
		System.out.println(bmw5.add(1, 2));
		
	}
}
