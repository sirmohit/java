import java.util.*;
public class DemoCI {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter principle amount :");
		int principle=sc.nextInt();
		System.out.print("Enter rate amount :");
		int rate=sc.nextInt();
		System.out.print("Enter time amount :");
		int time=sc.nextInt();
		System.out.print("Enter number amount :");
		int number=sc.nextInt();
		double  amount= principle*Math.pow(1 +(rate/number), number*time);
        double citerest=amount - principle;
        System.out.println("Compount Interest after "+time+" years: "+citerest);
        System.out.print("Amount after "+ time +"years :"+amount);
        
	}

}
