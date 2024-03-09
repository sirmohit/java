import java.util.Scanner;
class Nikhil {
public static void main(String []args){
Scanner sc =new Scanner(System.in);
int limit;
System.out.println("Enter limit");
limit=sc.nextInt();
for(int i=1;i<=20;i++){
for(int j=1;j<=limit;j++)
{
System.out.print(i*j+"\t");
}
System.out.println();}
}
}        