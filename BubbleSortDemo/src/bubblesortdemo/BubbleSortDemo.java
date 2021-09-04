/**
 * 
 */
package bubblesortdemo;

/**
 * @author nhasa
 *
 */
public class BubbleSortDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,4,3,5};
		int tmp;
		
		for (int i=0;i<arr.length;i++)
		{
			for(int k=0; k<arr.length-i-1;k++)
			{
				if(arr[k]>arr[k+1])
				{
					tmp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=tmp;
					
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
