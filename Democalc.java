import java.util.Scanner;
public class Democalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter value of a :" );
		a=sc.nextInt();
		System.out.print("Enter value of b :");
		b=sc.nextInt();
		System.out.print("Enter the operation you want to perform :");
		n=sc.nextInt();
		if(n<1||n>5)
			System.out.print("Enter a valid operational key");
		switch(n) {
		case 1:
			int sum=a+b;
			System.out.println("Sum of number is :"+ sum);
			break;
		case 2:
			int sub=a-b;
			System.out.println("Subtration of number is :"+sub);
			break;
		case 3:
			int mul=a*b;
			System.out.println("Multiply of number is :"+mul);
			break;
		case 4:
			float div=a/b;
			System.out.println("Division of number is :"+ div);
			break;
		case 5:
			int modulo= a%b;
			System.out.println("Remainder of number is :"+ modulo);
			break;
		}
	}
}
