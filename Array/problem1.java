// Write a program to reverse an array or string

package Array;

public class problem1 {
    static void reverseArray(int a[], int start, int end)
    {
        int temp;
        while(start<end)
        {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    static void printArray(int a[], int size)
    {
        for(int i=0; i<size; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        printArray(a,5);
        reverseArray(a,0,4);
        System.out.println("Reversed array \n");
        printArray(a,6);

    }
    
}