import java.util.Scanner;
public class Array1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers of elements of array ");
		int n =sc.nextInt();
        int[]arr=new int[112];
        System.out.println("Enter Elements of array are: " );
        //arr[n]=sc.nextInt();
        for(int i=0;i<n-1;i++) 
        {
        	arr[i]=sc.nextInt();
        }
        System.out.println("Elements of array are: " );
        for(int i=0;i<n-1;i++)
        {
        	System.out.println("Your array is : " +arr[i]+ "");
        }
        
	}

}
