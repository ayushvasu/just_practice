/*Write an efficient C program to find the sum of contiguous subarray within a 
 * one-dimensional array of numbers which has the largest sum.*/
package adobe_interv;
class maxcontiguous_sum{
	static int start,end;
	public int maxarr(int arr[],int n)
	{
		int max_ending_here=0;
		
		int max_so_far=0;
		for(int i=0;i<n;i++)
		{
		max_ending_here=max_ending_here+arr[i];
		if(max_ending_here<0)
		{
			max_ending_here=0;
			start=i+1;
		}
		else if(max_so_far<max_ending_here)
		{
			max_so_far=max_ending_here;
			end=i;
		}
		}
		return max_so_far;
	}
	public static void main(String args[]){
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int n=arr.length;
		maxcontiguous_sum ms=new maxcontiguous_sum();
		int x=ms.maxarr(arr, n);
		System.out.println("max sum = "+x);
		if(start==end)
			System.out.println("At position "+start);
		else
			System.out.println("Start "+ start+ " "+"End "+ end);
	}
}

