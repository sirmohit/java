import java.util.Scanner;
public class DemoNumequal {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	int c=sc.nextInt();
    	if(a==b&&b==c) {
    		System.out.println("All are equal");
    	}
    
    	else if(a==b&&b!=c){
    		System.out.println("two are equal");
    		
    	}
    	else {
    		System.out.println("no one is equal");

	}
    }
}
