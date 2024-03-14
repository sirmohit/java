//ANONYMOUS ARRAY MEANS "ARRAY WITHOUT NAME.
//CREATED AND INITIALZED IN SINGLE LINE.
//IT CAN BE SINGLE OR MULTIDIMENSOINAL.
//IT CAM BE USED ONLY ONE TIME.
//IT CAN BE USED AS AN ARGUMENT IN METHOD.
public class AnonymousArray {
	public static void main(String[]args) {
	AnonymousArray.sum(new int[] {1,2,3,4});//IT IS USED AS AN ARGUMENT IN METHOD.
}
static void sum(int[]a) {
	int total=0;
	for(int i:a)
	{
		total=total+i;
	}
	System.out.print(total);

		// TODO Auto-generated method stub

	}

}
