
public class Animal {
		 void eat() {
			System.out.println("eating...");
		}
		 class Dog extends Animal{
			 void bark() {
				 System.out.println("barking...");
			 }
		 }

	}
class TestInheritance{
	public static void main(String[] args) {
		Animal d=new Animal();
		d.eat();
		
	}
}


