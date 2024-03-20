import java.util.Scanner;
public class DemoMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("                                                Welcome to marksheet                 ");
		System.out.print("Enter marks of Maths :");
        double maths=sc.nextDouble();
        System.out.print("Enter marks of Computer :");
        double computer=sc.nextDouble();
        System.out.print("Enter marks of English :");
        double english=sc.nextDouble();
        double totalmarks=maths+computer+english;
        System.out.println("Your total marks is :"+totalmarks);
        double percentage=totalmarks/3;
        System.out.println("Your percentage is :"+percentage);
        if(percentage>=90&&percentage<=100) {
        	System.out.println("You pass with A+ grade");} 
        else if(percentage>=60&&percentage<=89){
        	System.out.println("You pass with B grade");}
        else if(percentage>=33&&percentage<=59) {
        	System.out.println("You pass with C grade");
        }
        else
        {System.out.println("You are fail");}
	}}