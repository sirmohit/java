import java.util.Scanner;
public class DemoSum {
  /* public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter value of first integer:");
	int a=sc.nextInt();
	System.out.print("Enter value of second integer:");
	int b=sc.nextInt();
	int sum= a+b;
	System.out.print("Sum of Integer is :" + sum);

	}

}
//==============================================================
	int a,b,c;
	void getData() {
		a=10;
		b=30;
	}
	void sum() {
		c=a+b;}
	void display() {
		System.out.println(c);
		}
	public static void main(String args[]) {
		DemoSum s=new DemoSum();
		s.getData();
		s.sum();
		s.display();
	}*/
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	void getData() {
		System.out.print("Enter value of first integer:");
		 a=sc.nextInt();
		System.out.print("Enter value of second integer:");
		 b=sc.nextInt();
		 }
	void sum()
	{
		c=a+b;
	}
	void display() {
		System.out.println("Sum of integer is : "+c);
	}
	public static void main(String[] args) {
		DemoSum s=new DemoSum();
		s.getData();
		s.sum();
		s.display();
	}
}
