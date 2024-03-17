
public class Clone {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,5,6,};
		System.out.println("original array is");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\n");
		}
		System.out.println("clone array is");
		int arr_clone[]=arr.clone();//METHOD TO CLONE AN ARRAY
		for(int i=0;i<arr_clone.length;i++) {
			System.out.println(arr_clone[i]);
		}
	}

}
