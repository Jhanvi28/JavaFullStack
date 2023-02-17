import java.util.*;
public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try
		{	
			System.out.println("Enter total runs  scored  : ");
			int runs = sc.nextInt();
			System.out.println("Enter the total over faced : ");
			int over = sc.nextInt();
			float runRate = runs/over;
			System.out.println("Current run rate is : "+runRate);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
