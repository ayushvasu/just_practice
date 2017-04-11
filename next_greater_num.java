/*This program prints the next greater number using the digits entered in the number */
package adobe_interv;

import java.util.*;
import java.io.*;
class next_greater_num
{
	public void swap(StringBuffer str,int a,int b)
	{
		char tmp=str.charAt(a);
		str.setCharAt(a,str.charAt(b));
		str.setCharAt(b, tmp);
	}
	
	public static void main(String args[]) throws IOException{
		next_greater_num ng=new next_greater_num();
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer str=new StringBuffer();
		str.append(bf.readLine());
		int l=str.length();
		int i,j;
		for(i=l-1;i>0;i--)
		{
			if(str.charAt(i)>str.charAt(i-1))
				break;
		}
		if(i==0)
			System.out.println("No greater number available");
		int x= str.charAt(i-1);
		int small=i;
		for( j=i+1;j<l;j++)
		{
			if(str.charAt(j)>x &&str.charAt(j)<str.charAt(small))
				small=j;
		}
		ng.swap(str,i-1,small);
		String str1=str.substring(i,l);
		String str2=str.substring(0,i);
		char[] ch=str1.toCharArray();
		Arrays.sort(ch);
		String str3=new String(ch);
		str2=str2+str3;
		System.out.println(str2);
	}
	
}