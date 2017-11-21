
public class SwitchExample {

	public static void main(String[] args)
	{
		int[] arr = {87,90,93};
		int[] arr2 = new int[5];
		
		for(int i = 0; i < arr.length ; i++)
		{
			arr2[i] = arr[1];
		}
		
		System.arraycopy(arr, 0, arr2, 0, 3);
	}
}
