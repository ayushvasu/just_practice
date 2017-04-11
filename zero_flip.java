/* Given a binary array and an integer m, find the position of zeroes flipping which creates maximum number of consecutive 1s in array.

Examples:

Input:   arr[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1}
         m = 2
Output:  5 7
We are allowed to flip maximum 2 zeroes. If we flip
arr[5] and arr[7], we get 8 consecutive 1's which is
maximum possible under given constraints */
package adobe_interv;

class zero_flip{
	public void zeroC(int arr[],int n,int m){
		int wl=0,wr=0;
		int zerocount=0;
		int max=0;
		int bestL=0;
		while(wr<n)
		{
			if(zerocount<=m)
			{
				if(arr[wr]==0)
					zerocount++;
				wr++;
			}
			if(zerocount>m)
			{
				if(arr[wl]==0)
					zerocount--;
				wl++;
			}
			if(wr-wl>max)
			{
				max=wr-wl;
				bestL=wl;
			}
			
		}
		for(int i=0;i<max;i++)
		{
			if(arr[bestL+i]==0)
				System.out.print(bestL+i+" ");
		}
	}
	public static void main(String args[]){
		zero_flip zf=new zero_flip();
		int arr[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1};
		   int m = 2;
		   int n =  arr.length;
		   System.out.println("Indexes of zeroes to be flipped are ");
		   zf.zeroC(arr, n, m);
	}
}