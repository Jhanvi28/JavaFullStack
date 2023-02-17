import java.util.*;
public class CricketScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n];
		System.out.println("Enter enter cricketer's id and score : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter max score : ");
		int maxScore = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				int temp = arr[i];
				if(temp>maxScore)
				{
					arr1[n]=arr[i-1];
				}
			}
		}
	}

}
