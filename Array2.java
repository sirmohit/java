import java.util.Scanner;
public class Array2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number;
		int j;
		System.out.println("How many friends you have ");
		number=input.nextInt();
		input.skip(System.lineSeparator());
		String name[]=new String[number];
		System.out.println("Enter names of your friends ");
		for( j=0;j<number;j++) 
		{
			System.out.println("Enter names of your friends "+ (j));
			name[j]=input.nextLine();
		}
		input.close();
		System.out.println("Your friends are");
		for( j=0;j<number;j++);
		{
		System.out.println(name[j]);
		}
	}

}
