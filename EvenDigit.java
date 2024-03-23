package OOPs;

public class EvenDigit {
	static int evenDigit(int nums[]){
		int count=0;
		for(int num: nums) {
			if(even(num)) {
				count++;
			}
		}
		return count;
		static boolean even(int num) {
			int numOfDigits =digits(num);
			if(numOfDigits %2 ==0) {
				return true;
			}
		    return false;
		}
		static int digits(int num) {
			if(num==0) {
				return 1;
			}
			if(num<0) {
				num=num*(-1);
			}
			int count=0;
			
			if(num>0) {
				num=num/10;
				count++;
			}
			return count;
		}
		
	}
	public static void main(String args[]) {
		int nm[]= {234,12,35654,75,33,1,6,444,104};
		int a=evenDigit(nm);
		System.out.println(a);
		
	}

}
