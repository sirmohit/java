import java.util.Scanner;
public class Array_Rev2D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int row=sc.nextInt();
		System.out.println("Enter number of columns : ");
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++) {//loop for taking intput.
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
		}
		}
		//Loop for printing output
		System.out.println("Your array is : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	
				// TODO Auto-generated method stub

	}
}

