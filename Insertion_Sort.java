import java.util.Scanner;

//==============================================Selection Sort========================================//
/*
you have given a String .first you have to fetch all the INTEGER values from the string
and convert into Integer Array.
After converting into Array, Sort the Array using Insertion Sort.

Input 0:
EMP185AF63
Output 0:
1 3 5 6 8

Input 1:
HII
Output 1:
0

Input 2:
2KEY
Output 2:
2
 */

public class Insertion_Sort {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //----------REMOVING CHARACTERS FROM THE STRING
        String strnew = str.replaceAll("[^0-9]","");
        int ar[] = new int[strnew.length()];
        System.out.println("Conversion of String into  Number String:"+strnew);

        //------------CONVERTING INTEGER STRING TO ARRAY
        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = Integer.parseInt(String.valueOf(strnew.charAt(i)));

        }

        //-----------CHECKING IF NO INTEGER ELEMENT IN THE ARRAY
        if(ar.length==0)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println("Array of converted Integers:");
            for (int res:ar) {
                System.out.print(res+" ");
            }
            System.out.println();
            print(insertion_sort(ar));
        }
    }

    //-------------METHOD SORTING ARRAY USING INSERTION SORT
    public static int[] insertion_sort(int ar[])
    {
        //----------FOR TRAVERSING WHOLE ARRAY
        for (int i = 1; i < ar.length; i++) {
            int temp = ar[i];
            int j = i;
            //--------------FOR COMPARING ELEMENTS
            while (j > 0 && ar[j - 1] > temp) {
                ar[j] = ar[j - 1];
                j--;
            }
            ar[j] = temp;                    //-----------SWAPPING VALUES
        }
        return ar;
    }

    //-------------FOR PRINTING SORTED ARRAY
    public static void print(int ar[])
    {
        System.out.println("Sorted Array:");
        for (int res:ar)
        {
            System.out.print(res+" ");
        }
    }
}
