import java.util.Scanner;
public class Array3D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of x axis : ");
		int x=sc.nextInt();
		System.out.print("Enter the value of y axis : ");
		int y=sc.nextInt();
		System.out.print("Enter the value of z axis : ");
		int z=sc.nextInt();
		int[][][]arr=new int[x][y][z];
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				for(int k=0;k<z;k++) {
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		System.out.println("Your 3D array is : ");
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				for(int k=0;k<z;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
			}
		System.out.println();	
		}
		
	}

}
