/* Quick Sort
This algorithm is based on divide and conquer algorithm (We take the bigger problem , break it down to the smaller problem, try to solve the solution to
smaller problem and then join the smaller solutions to get the final result
concept of quick sort algorithm
===============================
At each step it finds "pivot" (Means point of division)and then make sure that all the smaller elements are at left side of the pivot and all bigger
elements are at right side of pivot. This we will do multiple times(Recursively) so that we get the final answer
*/

public class QuickSort {
  
  public static void main(String[] args) {
    int ar[] = {45, 6 ,89,2 ,30,50,2};
    quicksort(ar,0,ar.length-1);
    display(ar);
  }
  
  public static void quicksort(int ar[], int start, int end)
  {
    if (start < end) {
      int pivot = partition(ar, start, end);
      // recursively calling the method here 
      // left side of array
      quicksort(ar, start, pivot-1 );
      // right side of array
      quicksort(ar, pivot + 1,end);
    }
  }
  
  // here in this partition method we are going to break down the array 
  // main logic of quick sort
  public static int partition(int ar[], int p , int q )
  {
    int pivot= q;
    int i = p-1;
    for(int j =p; j<=q;j++)
    {
      if(ar[j]<=ar[pivot])
      {
        i++;
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
      }
    } // end of the loop
    return i;
  }
  
  public static void display(int ar[])
    {
        for (int res:ar) {
            System.out.print(res+" ");
        }
    }
}
