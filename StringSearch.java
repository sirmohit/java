package OOPs;

public class StringSearch {
	static boolean searchChar(String str,char target) {
		if(str.length()==0) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(target==ch) {
				return true;
			}
		}
		return false;
	}
	public static void main(String args[]) {
		String s="Mohit Bhade";
		char target='o';
		boolean ans=searchChar(s,target);
		System.out.println(ans);
		
	}

}
