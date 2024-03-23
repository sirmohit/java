package OOPs;
/*
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int tar=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==tar) {
				System.out.println("Target is found at index" + i);
			}
		}
		System.out.println("target is not found");
	}
}*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////

/*public class LinearSearch{
	public static void main(String args[]) {
		int ar[]= {1,12,15,12,45};
		int target=45;
		System.out.println(linearSearch(ar,target));
	}
	static int linearSearch(int ar[],int target) {
		if(ar.length==0) {
			return -1;}
		
		for (int i=0;i<ar.length;i++) {
			int element =ar[i];
			if(element== target) {
				return i;
			}
		}
		return Integer.MAX_VALUE;
		}
}*/
///////////////////////////// Linear Search in 2d array //////////////////////////////////////

public class LinearSearch{
	static int find(int a[][],int tar) {
		for(int row =0;row <a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				if(a[row][col]==tar) {
					return a[row][col];
				}
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		int aa[][]= {{34,45,56},{52,78,89},{11,22,33}};
		int target=89;
		int a=find(aa,target);
		System.out.println(a);
	}
}


















































