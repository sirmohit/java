/*
public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[]{1,2,3,4,5,6};
		int arrcopy[]=new int[6];
		arrcopy=arr;
		System.out.println("My first array elements are");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\n");
		}
		System.out.println("Your copy array elements are");
		for(int i=0;i<arrcopy.length;i++) {
			System.out.print(arrcopy[i]+"\n");
		}
	}

}*/
//-------------------------------------------------------------------------------------------------//
//COPY AN ARRAY BY SYSTEM CLASS METHOD
/*public class ArrayCopy{
	public static void main(String[]args) {
		int arr[]= {1,2,3,4,5,6};
		int arrCopy[]=new int[6];
		System.out.println("Original array is");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.arraycopy(arr,0,arrCopy,0,6);//METHOD TO COPY AN ARRAY BY SYSTEM CLASS METHOD.
		System.out.println("Copied array is");
		for(int i=0;i<arrCopy.length;i++) {
			System.out.println(arrCopy[i]);
			
		}
	}
}*/
//________________________________________________________------------------------------------___------//
//COPING AN ARRAY BY ARRAY CLASS METHOD
/*import java.util.Scanner;
import java.util.Arrays;
class ArrayCopy{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter size of array"+"\n");
	int n=sc.nextInt();
	int arr[]=new int[n];
	//int arrCopy[]=Arrays.copyOf(arr,n);
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	int arrCopy[]=Arrays.copyOf(arr,n);
	System.out.print("Copy array is"+"\n");
	for(int i=0;i<arrCopy.length;i++) {
		System.out.println(arrCopy[i]);
	}
	
	
}
}*/
//===============================================================================================//
import java.util.Arrays;
class ArrayCopy{
	public static void main(String []args) {
		System.out.print("Elements of first array are"+"\n");
		int arr[]= {1,2,4,5,6};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.print("Elements of copy array are"+"\n");
		int arrCopy[]=Arrays.copyOf(arr,5);
		for(int i=0;i<arrCopy.length;i++) {
			System.out.println(arrCopy[i]);
		}
	}
}
//=+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
		
		
		
	
