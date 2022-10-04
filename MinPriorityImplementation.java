package priorityQueue;

import java.util.ArrayList;

class MinPriorityImplementation {

	private ArrayList<Integer> heap;
	
	public MinPriorityImplementation()
	{
		heap=new ArrayList<>();
	}
	public boolean isEmpty()
	{
		return heap.size()==0;
	}
	public int size()
	{
		return heap.size();
	}
	public void insert(int value)
	{
		heap.add(value);
		int childindex=heap.size()-1;
		int parentindex=(childindex-1)/2;
		while(childindex>0)
		{
			if(heap.get(childindex) < heap.get(parentindex))
			{
				int temp=heap.get(childindex);
				heap.set(childindex, heap.get(parentindex));
				heap.set(parentindex, temp);
				childindex=parentindex;
				parentindex=(childindex-1)/2;
			}
			else
				return;
		}
	}
	public int removeMin()
	{
		int value=heap.get(0);
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.get(heap.size()-1));
		int parentindex=0;
		int leftchild=2 * parentindex + 1;
		int rightchild= 2 * parentindex + 2;
		while(leftchild < heap.size())
		{
			int minindex=parentindex;
			if(heap.get(leftchild) < heap.get(parentindex))
				minindex=leftchild;
			if(rightchild < heap.size() && heap.get(rightchild)<heap.get(minindex))
				minindex=rightchild;
			if(minindex==parentindex)
				break;
			int temp=heap.get(minindex);
			heap.set(minindex, heap.get(parentindex));
			heap.set(parentindex,temp);
			parentindex=minindex;
			leftchild=2 * parentindex +1;
			rightchild=2 * parentindex + 2;
		}
		return value;
	}

}
