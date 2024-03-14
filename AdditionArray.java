/*import java.util.Scanner;
public class AdditionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int sum=0;
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			sum=sum+arr[i];
			}
		System.out.print("Sum of array is"+"\n");
		System.out.print(sum+"\n");
		}
		}*/

//================================================================================

/*import java.util.Scanner;
class AdditionArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,sum=0;
		System.out.println("Enter number of rows");
		int n=sc.nextInt();
		System.out.println("enter number of columns");
		int m=sc.nextInt();
		int arr1[][]=new int[m][n];
		System.out.println("Enter elements of matrix");
		for(i=0;i<m;i++) {
			for( j=0;j<n;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("The elements of matrix");
		for( i=0;i<m;i++) {
			for( j=0;j<n;j++) {
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Sum of array is");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				sum=sum+arr1[i][j];
			}
		}
		System.out.println(sum);
		
	}
}*/
//==========================================================================
import java.util.Scanner;
class AdditionArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j = 0;
		System.out.println("Enter number of rows");
		int n=sc.nextInt();
		System.out.println("enter number of columns");
		int m=sc.nextInt();
		int arr1[][]=new int[m][n];
		System.out.println("Enter elements of matrix");
		for(i=0;i<m;i++) {
			for( j=0;j<n;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("The elements of matrix 2");
		int arr2[][]=new int[m][n];
		for( i=0;i<m;i++) {
			for( j=0;j<n;j++) {
				arr2[i][j]=sc.nextInt();
				//System.out.println("\t");
			}
			//System.out.println("\t");
		}
		System.out.println("Sum of array is");
		int arr3[][]=new int[m][n];
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println(arr3[i][j]);
		
	}
}




















