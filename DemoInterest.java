import java.util.Scanner;
public class DemoInterest {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of Principle amount : ");
		int princple=sc.nextInt();
		System.out.print("Enter value of Time : "); 
		int time=sc.nextInt();
		System.out.print("Enter value of Rate : ");
		int rate =sc.nextInt();
		int interest=(princple*rate*time)/100;
		System.out.print("Your Interest is : "+interest);
        
	}

}
