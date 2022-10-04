package priorityQueue;

import java.util.*;
class Pair
{
	int value;
	int index;
	public Pair(int value,int index)
	{
		this.value=value;
		this.index=index;
	}
}
public class BuyTheTicket {
	public static void buy(int[] arr,int k)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		Queue<Pair> q=new LinkedList<>();
		for(int i=0;i<arr.length;i++)
		{
			pq.add(arr[i]);
			q.add(new Pair(arr[i],i));
		}
		int count=0;
		while(!pq.isEmpty())
		{
			if(pq.peek()==q.peek().value)
			{
				count++;
				pq.poll();
				Pair p=q.poll();
				if(p.index==k)
				{
					System.out.println(count);
					return;
				}
			}
			else
				q.add(q.poll());
		}
	}
	public static void main(String[] args) {
		int[] arr= {2 ,3 ,2 ,2 ,4};
		int k=3;
		buy(arr,k);
	}

}
