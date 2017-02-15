/*======================================
  class MergeSortTester

  ALGORITHM:
  MergeSort splits an array into two until the array lengths are 1. If the array length is 1, the array is sorted so then it is merged with the other half of the array it came from.

  BIG-OH CLASSIFICATION OF ALGORITHM:
  O(nlogn)

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    {
	MergeSort a = new MergeSort();
	
	long time = System.currentTimeMillis();
	int[] arr0 = {0};
	int[] arr1 = {1};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};

	System.out.println("\nSorting arr4-7...");
	a.printArray( a.sort( arr4 ) );
	a.printArray( a.sort( arr5 ) );
	a.printArray( a.sort( arr6 ) );
	a.printArray( a.sort( arr7 ) );

	time = System.currentTimeMillis() - time;
	System.out.println("Time (ms): " + time);
    }//end main

}//end class
