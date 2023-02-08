import java.util.*;
public class CalcSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int salary,spend_salary,new_salary,salary_with_shift1,salary_with_shift2,shift;
		System.out.println("Enter your salary : ");
		salary = sc.nextInt();
		System.out.println("Enter your shift : ");
		shift = sc.nextInt();
		if (salary > 8000)
		{
			System.out.println("Salary is too large");
		}
		else if (salary == 0)
		{
			System.out.println("Salary is too small");
		}
		else if(shift == 0)
		{
			System.out.println("Shift is too small");
		}
		else
		{
			spend_salary = salary*50/100;
			new_salary = salary - spend_salary; 
			salary_with_shift1 = salary*2/100;
			salary_with_shift2 = salary_with_shift1 * shift;
			int total = new_salary + salary_with_shift2;
			System.out.println("Total salary = "+total);
			
		}
			
	}

}
