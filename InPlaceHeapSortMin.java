package priorityQueue;

import java.util.Arrays;

public class InPlaceHeapSortMin {
	public static void main(String[] args) {
		int[] arr= {7,6,2,3,4};
		inplace(arr);
	}
	private static void downheapify(int[] arr,int start,int length)
	{
		int parent=start;
		int left=2 * parent + 1;
		int right= 2 * parent + 2;
		while(left<length)
		{
			int minindex=parent;
			if(arr[left]>arr[minindex])
				minindex=left;
			if(right<length && arr[right]>arr[minindex])
				minindex=right;
			if(minindex==parent)
				return;
			int temp=arr[minindex];
			arr[minindex]=arr[parent];
			arr[parent]=temp;
			parent=minindex;
			left=2 * parent + 1;
			right= 2 * parent + 2;
		}
	}
	private static void inplace(int[] arr) {
		
		for(int i=(arr.length-1)/2;i>=0;i--)
			downheapify(arr,i,arr.length);
		for(int i=arr.length-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			downheapify(arr,0,i);
		}
		System.out.println(Arrays.toString(arr));
	}
}
