import java.util.Scanner;
class Pyramid{
public static void main(String[]args){
Scanner sc =new Scanner(System.in);
System.out.println("Length:");
int l=sc.nextInt();
System.out.println("Breath:");
int b=sc.nextInt();
int area= l*b;
System.out.print(area);
if(l==b){
System.out.println("Area is square");
}
else{
System.out.println("Area is rectangle");}

}
}