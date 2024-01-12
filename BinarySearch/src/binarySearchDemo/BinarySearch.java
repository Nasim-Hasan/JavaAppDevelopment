/**
 * 
 */
package binarySearchDemo;

/**
 * @author nhasa
 *
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 // TODO Auto-generated method stub
	 int[] arr = {2,3,4,10,40};
        int start=0;
        int end = arr.length-1;
        int target=2;
       if(binarySearch(arr,start,end,target)==-1){
           System.out.println("No element found");
       }
       else{
           System.out.println("Element found at index number:"+binarySearch(arr,start,end,target));
       }
	}
	
	private static int binarySearch(int[] arr, int start,int end,int target){
    int pivot;
    while (start<=end){
             pivot = (start+end)/2;
             if(arr[pivot]==target){
                 return pivot;
             }
             if(arr[pivot]>target){
                 end = pivot-1;
             }
             else{
                 start = pivot+1;
             }

    }
    return -1;
   }
}
