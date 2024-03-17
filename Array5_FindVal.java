import java.util.Scanner;
public class Array5_FindVal {

	public static void main(String[] args) {
		int i;
		int j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row=sc.nextInt();
		System.out.println("Enter number of columns");
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		for( i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter number you want to find");
		int num=sc.nextInt();
		for( i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				if(arr[i][j]==num){
					System.out.print("Your number found at index :" +i+  " "+j);
				}
			}
		}
	}

}
