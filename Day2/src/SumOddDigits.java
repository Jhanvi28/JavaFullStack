import java.util.*;
public class SumOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		if (num < 0)
		{
			System.out.println("Invalid number");
		}
		else if(num > 32767)
		{
			System.out.println("Invalid number");
		}
		else
		{
	
			while(num>0)
			{
				int last = num % 10;
				if(last%2 != 0)
				{
					//sum = sum + last;
					//System.out.println("odd number");
					sum = sum + last;
					

				}
				num=num/10;
			}
			System.out.println("Sum of odd digit : "+ sum);

		}
		
	}

}
