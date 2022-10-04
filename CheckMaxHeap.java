
package priorityQueue;

public class CheckMaxHeap {
	public static boolean check(int[] arr,int i)
	{
		int parentindex=i;
		int left= 2 * parentindex + 1;
		int right= 2 * parentindex + 2;
		if(left<arr.length && arr[left]>arr[parentindex])
			return false;
		if(right<arr.length && arr[right]>arr[parentindex])
			return false;
		return true;
	}
	public static void main(String[] args) {
		int[] arr= {42 ,20 ,18 ,6 ,14 ,11 ,9, 4};
		for(int i=0;i<arr.length;i++)
		{
		if(!check(arr,i))
		{
			System.out.println("Not a max heap");
			return;
		}
		}
		System.out.println("Max heap");
	}
}
