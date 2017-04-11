/* WAP to print the pattern when n is entered */
/* for n=4
4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4  */
package adobe_interv;

import java.io.*;
import java.util.*;
class set42_q1{
	public int[][] splfunc(int r,int c,int n)
	{
		int arr[][]=new int[r][c];
		int l=0;
		int m=0;
		while(l<r && m<c)
		{
			for(int i=m;i<c;i++)
				arr[l][i]=n;
			l++;
			for(int i=l;i<r;i++)
				arr[i][c-1]=n;
			c--;
			if(l<r)
			{
				for(int i=c-1;i>=m;i--)
					arr[r-1][i]=n;
				r--;
				
			}
			if(m<c)
			{
				for(int i=r-1;i>=l;i--)
					arr[i][m]=n;
				m++;
						
			}
			n--;
		}
		return arr;
	}
	public static void main(String args[]) throws IOException
	{
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bf.readLine());
		set42_q1 q1=new set42_q1();
		int arr[][]=new int [n-1][n-1];
		int r=(2*n)-1;
		arr=q1.splfunc(r,r,n);
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
	}
}