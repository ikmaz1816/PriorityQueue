package priorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
	public static void smallest(int[] arr,int k)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		for(Integer val:arr)
		{
			pq.add(val);
		}
		while(k>1)
		{
			pq.poll();
			k--;
		}
		System.out.println(pq.peek());
	}
	public static void main(String[] args) {
		int[] arr= {2 ,6 ,10 ,11 ,13 ,4 ,1 ,20};
		smallest(arr,4);

	}
}
