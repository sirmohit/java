import java.util.Scanner;
public class DemoRectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of length :");
		double length=sc.nextDouble();
		System.out.print("Enter value of breadth :");
        double breadth=sc.nextDouble();
        double area=length*breadth;
        double breath=area/length;
        System.out.println("Breath of rectangle is :"+ breath);
        System.out.println("Area of Rectangle is : " +area);
        double parameter=2*(length+breadth);
        System.out.print("Parameter of Rectangle is :"+parameter);
	}

}
