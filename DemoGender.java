import java.util.Scanner;
public class DemoGender {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your gender : ");
		char gender=sc.next().charAt(0);
		if(gender=='m'||gender=='M') {
			System.out.print("Good Morning Sir");
		}
		else if(gender=='f'||gender=='F') 
			
		{
			System.out.print("Good Morning Mam");
		}

	}

}
