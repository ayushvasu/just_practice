package adobe_interv;

class coinchange_ways{
	public int countways(int arr[],int m,int n)
	{
		int sol[]=new int[n+1];
		sol[0]=1;
		for(int i=0;i<m;i++)
		{
			for(int j=arr[i];j<=n;j++)
			{
				sol[j]+=sol[j-arr[i]];
			}
		}
		return sol[n];
	}
	public static void main(String args[])
	{
		int arr[] = {1, 2, 3};
        int m = arr.length;
        int n = 4;
        coinchange_ways cw=new coinchange_ways();
        int x=cw.countways(arr, m, n);
        System.out.println(x);
	}
}