import java.util.Scanner;

//==============================================Bubble Sort========================================//

/*
You have to sort a String in the basis of word length in accending order.
if length of two words is same the sort them on basis of Lexicographical Order.
Use Bubble Sort.
Input:
String

Output:
Sorted String

Sample input 0:
the quick brown fox jump over the lazy little dog
Sample output 0:
dog fox the the jump lazy over brown quick little
 */
public class BubbleSort {

    //----------method to define logic
    public static void sort(String[] st)
    {
        String temp;                              //-----------String var to hold temporary String Array word.

        for (int i = 0; i < st.length-1; i++)                 //-------------for traversal of each element
        {
            for (int j = 0; j < st.length - 1 - i; j++)              //----------for comparing each one to other
            {
                if (st[j].length() > st[j + 1].length())                  //----------first sort on the basis of length
                {
                    temp = st[j];
                    st[j] = st[j + 1];
                    st[j + 1] = temp;
                }
                if (st[j].length() == st[j + 1].length())         //-------second sort on the basis of Lexicographical order
                {
                    if (st[j].compareTo(st[j + 1]) > 0) {
                        temp = st[j];
                        st[j] = st[j + 1];
                        st[j + 1] = temp;
                    }
                }
            }
        }

        //------------printing String Array
        System.err.println("String After sorting:");
        //----------Using Foreach loop
        for (String s:st) {
            System.out.print(s+" ");
        }
    }
    
    
//    complexity = O(n)
    
//     public static void bubbleSort(int arr[], int n)
//    {
//        if (n == 1)                     //passes are done
//        {
//            return;
//        }
//
//        for (int i=0; i<n-1; i++)       //iteration through unsorted elements
//        {
//            if (arr[i] > arr[i+1])      //check if the elements are in order
//            {                           //if not, swap them
//                int p = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = p;
//            }
//        }
//
//        bubbleSort(arr, n-1);           //one pass done, proceed to the next
//    }
//    public static void display(int arr[])                 //display the array
//    {
//        for (int i=0; i<arr.length; ++i)
//        {
//            System.out.print(arr[i]+" ");
//        }
//    }
    

    //--------main method
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
//        String str = "the quick brown fox jump over the lazy little dog";
        System.err.println("Enter a String:");
        String str = sc.nextLine();

        String s[] = str.split(" ");             //-----------splitting string from the spaces
        sort(s);
    }
}
