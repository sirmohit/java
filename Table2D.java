import java.util.Scanner;
public class Table2D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your desire number : ");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++) {
			for(int j=1;j<=10;j++) {
				int tab=i*j;
				System.out.println("\t"+tab);
			}
			System.out.println("");
		}

	}

}
