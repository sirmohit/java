/*import java.util.Scanner;
public class Array3 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number elements");
		int number=sc.nextInt();
		int count;
		int arr[]=new int[number];
		System.out.println("Your elements are "+"");
		for(count=0;count<=number-1;count++)
		{
		arr[count]=sc.nextInt();
		}
		System.out.println("Your array is : ");
		for(count=0;count<=number-1;count++)
		{
		System.out.print(arr[count]+" ");
		}
		System.out.println();
		int max=arr[0];
		for(count=0;count<arr.length;count++) {
		if(arr[count]>=max) {
			max=arr[count];
		}
		}
		System.out.println("Maximum elements is :"+max);
		int min=arr[0];
		for(count=0;count<arr.length;count++) {
		if(arr[count]<min) {
			min=arr[count];
		}
		}
		System.out.println("Minimum elements is :"+ min);
	}

}*/
//============================================================================================//
	//PASSING ARRAY TO A METHOD
public class Array3{
	
		//CREATING AN ARRAY WHICH TAKES AN ARRAY AS A PARAMETER
		static void min(int arr[]) {
			int min=arr[0];
			for(int i=0;i<arr.length;i++) 
				if(min>arr[i])
					min=arr[i];
				System.out.println(min);
		}
			public static void main(String []args) {
				int a[]= {33,3,4,5};//DECLARING AND INITIALIZING AN ARRRAY
				min(a);//PASSING ARRAY TO A METHOD
			}
}
		
	

