package priorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElement {
	public static void largest(int[] arr,int k)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		for(Integer val:arr)
		{
			pq.add(val);
		}
		while(k>0)
		{
			System.out.println(pq.remove());
			k--;
		}
	}
	public static void main(String[] args) {
		int[] arr= {2 ,12 ,9 ,16 ,10 ,5 ,3 ,20, 25 ,11 ,1 ,8 ,6 };
		largest(arr,4);

	}

}
