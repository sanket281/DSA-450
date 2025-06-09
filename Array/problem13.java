//Kadane's Algorithm
package Array;

public class problem13 {
    static void maxSum(int a[],int n)
    {
        int max=Integer.MIN_VALUE;
        int p =0;
        for(int i=0;i<n;i++)
        {
            p = p+a[i];
            max = Math.max(max,p);
            if(p<0)
            {
                p=0;
            }
               
        }  
        System.out.println(max);
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,-2,5};
        int n = a.length;
        maxSum(a,n);
    }
}
