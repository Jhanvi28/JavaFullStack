import java.lang.reflect.Array;
import java.util.*;
public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter the number of overs : ");
			int over = sc.nextInt();
			int[] arr = new int[over];
			System.out.println("Enter runs for each over ");
			for(int i=1;i<over+1;i++)
			{
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter the over number ");
			int overNo = sc.nextInt();
			int temp;
			for(int i=0;i<over+1;i++)
			{
					temp = Array.getInt(arr, overNo);
					System.out.println("Runs scored in this over : "+temp);
					
				
			}
					}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println(e);
		}
		
	}

}
