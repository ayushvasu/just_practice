package adobe_interv;

import java.util.Arrays;

class coinchange_number{
	public int countnum(int arr[],int m,int n)
	{
		int sol[]=new int [n+1];
		Arrays.fill(sol,Integer.MAX_VALUE);
		sol[0]=0;
		for(int i=0;i<m;i++)
		{
			for(int j=arr[i];j<=n;j++)
				sol[j]=Math.min(sol[j],1+sol[j-arr[i]]);
		}
		return sol[n];
	}
	public static void main(String args[])
	{
		int arr[] = {1, 2, 3};
        int m = arr.length;
        int n = 4;
        coinchange_number cw=new coinchange_number();
        int x=cw.countnum(arr, m, n);
        System.out.println(x);
	}
}