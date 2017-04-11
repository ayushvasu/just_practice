package adobe_interv;

class merge_sort{
	public void merge(int arr[],int l,int m,int r){
		int n1=m-l+1;
		int n2=r-m;
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		for(int i=0;i<n1;i++)
			arr1[i]=arr[l+i];
		for(int i=0;i<n2;i++)
			arr2[i]=arr[m+i+1];
		int i=0,j=0,k=l;
		while(i<n1 && j<n2)
		{
			if(arr1[i]<=arr2[j])
			{
				arr[k]=arr1[i];
				i++;
			}
			else if(arr1[i]>arr2[j])
			{
				arr[k]=arr2[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			arr[k]=arr1[i];
			k++;
			i++;
		}
		while(j<n2)
		{
			arr[k]=arr2[j];
			k++;
			j++;
		}
	
	}
	public void msort(int arr[],int l,int r){
		if(l<r)
		{
			int mid=(l+r)/2;
			msort(arr,l,mid);
			msort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
	}
	public void printarr(int arr[],int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void main(String args[]){
		merge_sort mss=new merge_sort();
		 int arr[] = {12, 11, 13, 5, 6, 7};
		 int n=arr.length;
		 mss.printarr(arr, n);
		 mss.msort(arr, 0, n-1);
		 mss.printarr(arr, n);
		 }
}