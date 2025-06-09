// Write a program to cyclically rotate an array by k element.

package Array;

public class problem7 {
    static void rotate(int a[], int n, int k)
    {
        int b[] = new int[n];
        for(int i=0;i<n;i++)
        {
            b[k] = a[i];
            k=(k+1)%n;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(b[i] + " ");
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int n = a.length;
        int k = 3;
        rotate(a,n,k);
    }
}
