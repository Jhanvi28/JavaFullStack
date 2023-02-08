import java.util.*;
public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
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
			while(num > 1)
	        {
	            //num = num/2;
	            if(num%2 != 0 && num != 1)
	            { 
	            	num = num/2;
	            	System.out.println("No");
	            	break;
	            }
	            else
	            {
	            	System.out.println("yes");
	            	break;
	            }
	            
	        }
			
		}
		
	}

}
