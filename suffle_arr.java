/* Math.random() function gives output from 0.0 to less than 1.0

 * In the general case:
(int)(Math.random() * ((upperbound - lowerbound) + 1) + lowerbound);*/



package adobe_interv;
import java.io.*;

class suffle_arr{
	public void randomi(int arr[],int n){
		for(int i=n-1;i>0;i--)
		{
			int j=(int) (Math.random()*(i+1));
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	public void printarr(int arr[],int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		
	}
	public static void main(String args[]) throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		suffle_arr sa=new suffle_arr();
		int n=Integer.parseInt(bf.readLine());
		String str=bf.readLine();
		String str1[]=str.trim().split("\\s+");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(str1[i]);
		}
		sa.printarr(arr, n);
		sa.randomi(arr, n);
		sa.printarr(arr, n);
		
	}
}