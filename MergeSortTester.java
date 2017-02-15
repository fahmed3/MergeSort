/*======================================
  class MergeSortTester

  ALGORITHM:
  MergeSort splits an array into two until the array lengths are 1. If the array length is 1, the array is sorted so then it is merged with the other half of the array it came from.

  BIG-OH CLASSIFICATION OF ALGORITHM:
  O(nlogn)

  Mean execution times for dataset of size n: 
  Batch size: 100000 times per execution of the code.
  n=1       	time: 6.3 ms
  n=10     	  	time: 118.3 ms
  n=100     	time: 1437.8 ms
  n=1000      	time: 14701 ms
  n=10000      	time: 161450.6 ms

  ANALYSIS:
  Each sort and merge has a run time of n. 
  x = number of steps
  0: n
  1: n/2
  2: n/4
  ...  
  x: n/2^x
  Sorting splits the array into two (2^x) until there are n  arrays of 1 element each, so
  n = 2^x 
  x = logn

  Merge runtime is n * number of times it has to merge, so
  n * x
  n * logn
  Thus, the runtime is O(nlogn)
  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * Running arrays of varying lengths of powers of ten 100000 times each.
	 * Printing their times in milliseconds by subtracting the end time by the start time.
	 * Finding the average of a few (10) trials for each power of ten.
	 * Creating a graph and inputting all the trials for each length and finding the curve best fit.
	 * Find the most similar curve from the BIg O notation curves.
     ******************************/
    public static void main( String[] args ) 
    {
	MergeSort a = new MergeSort();
	int[] arr1 = {1};
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr3 = new int[100];
	int[] arr4 = new int[1000];
	int[] arr5 = new int[10000];
	for (int i = 0; i < 100; i++){
		arr3[i] = i;
	}
	for (int i = 0; i < 1000; i++){
		arr4[i] = i;
	}
	for (int i = 0; i < 10000; i++){
		arr5[i] = i;
	}
		/*
	long time = System.currentTimeMillis();

	System.out.println("\nSorting arr5-10...");
	for (int i = 0; i < 100000; i++){
		a.sort( arr1 );
	}
	time = System.currentTimeMillis() - time;
	System.out.println("Time (ms): " + time);
	
	long time = System.currentTimeMillis();

	System.out.println("\nSorting arr5-10...");
	for (int i = 0; i < 100000; i++){
		a.sort( arr2 );
	}
	time = System.currentTimeMillis() - time;
	System.out.println("Time (ms): " + time);
	
	long time = System.currentTimeMillis();

	System.out.println("\nSorting arr5-10...");
	for (int i = 0; i < 100000; i++){
		a.sort( arr3 );
	}
	time = System.currentTimeMillis() - time;
	System.out.println("Time (ms): " + time);
		
	long time = System.currentTimeMillis();

	System.out.println("\nSorting arr5-10...");
	for (int i = 0; i < 100000; i++){
		a.sort( arr4 );
	}
	time = System.currentTimeMillis() - time;
	System.out.println("Time (ms): " + time);
	*/
	long time = System.currentTimeMillis();

	System.out.println("\nSorting arr5-10...");
	for (int i = 0; i < 100000; i++){
		a.sort( arr5 );
	}
	time = System.currentTimeMillis() - time;
	System.out.println("Time (ms): " + time);
		
    }//end main

}//end class
