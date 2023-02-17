import java.util.*;
public class EmployeeMain 
{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		Employee e = new Employee();
		String name,add,mobile;
		System.out.println("Enter name : ");
		name = sc.next();
		System.out.println("Enter address : ");
		add = sc.next();
		System.out.println("Enter monile : ");
		mobile = sc.next();
		e.setName(name);
		e.setAddress(add);
		e.setMobile(mobile);
		System.out.println("name : "+e.getName());
		System.out.println("address : "+e.getAddress());
		System.out.println("mobile : "+e.getMobile());

		
	}

}
