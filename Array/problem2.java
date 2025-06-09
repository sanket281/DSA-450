//Maximum and minimum of an array using minimum number of comparisons

package Array;

public class problem2 {
    static void findMinMax(int a[], int size)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<size;i++)
        {
            if(a[i]<min)
            {
                min = a[i];
            }
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Minimum value is " + min);
        System.out.println("Maximum value is " + max);
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int size = a.length;
        findMinMax(a,size);
  
    }
}
