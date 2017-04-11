package adobe_interv;

import java.util.Arrays;
import java.util.Collections;
public class eg {
  public static int sortDesc(final int num) {
    int num1=num;
    int arr[]=new int[10];
    Arrays.fill(arr,-1);
    int i=0,sum=0;
    while(num1>0)
    {
    arr[i]=num1%10;
    num1=num1/10;
    i++;
    }
    Arrays.sort(arr);
  
    for(int j=9;j>=10-i;j--)
    {
    	//System.out.print(arr[j]+" ");
      sum=(sum*10)+arr[j];    
    }
    return sum;
    
  }
  public static void main(String args[])
  {
	  int x=sortDesc(12345);
	  System.out.println(x);
  }
}