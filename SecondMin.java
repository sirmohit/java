package OOPs;

public class SecondMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int array[]= {23,55,45,42,64,75,45};
       int ans=secmin(array);
       System.out.println(ans);
	}
	static int secmin(int aa[])
	{
		if(aa.length==0)
		{
			return 0;
		}
		int min=aa[0];
		for (int i=0;i<aa.length;i++)
		{
			if(min>aa[i]) {
				aa[i]=min;
			}
		}
		for(int i=min;i<aa.length;i++) {
			if(aa[i]>min) {
				return aa[i];
			}
		}
		return ;
	}
	
}
