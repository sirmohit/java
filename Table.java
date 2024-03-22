import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your desire number : ");
		int no=sc.nextInt();
		System.out.println("Your desire table is  ");
		for(int i=1;i<=10;i++) {
			int tab=i*no;
			System.out.println(tab);
		}

	}

}
