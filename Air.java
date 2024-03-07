
import java.util.Scanner;
class Air{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int size;
System.out.println("Enter size of array");
size=sc.nextInt();
int a[]=new int[size];
System.out.println("Enter element of array");
for(int i=0;i<size;i++){
a[i]=sc.nextInt();}
for(int i=0;i<size;i++){
System.out.println("Array is:"+a[i]);}
int lan1=a[0];
int lan2=a[1];
for(int i=0;i<size;i++){
if(lan1<lan2){
lan1=lan2;}}
System.out.println(lan1);
System.out.println(lan2);                                                               
}
}


