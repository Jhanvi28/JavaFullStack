import java.util.*;
public class MaxOddEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int evenSum=0,oddSum=0;
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid array size");
		}
		int[] a = new int[n];
		System.out.println("Enter your values : ");
		for(int i=0;i<n;i++)
		{
			if(a[i]<0)
			{
				System.out.println("Invalid input");
			}
			else
			{
				a[i] = sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			
			if (a[i]%2 == 0)
			{		
				evenSum = evenSum + a[i];
				
			}
			else
			{
				oddSum = oddSum + a[i];
				
			}
		}
		if(evenSum > oddSum)
		{
			System.out.println("Sum of even is max");
		}
		else
		{
			System.out.println("Sum of odd is max");

		}
		
	}
}


