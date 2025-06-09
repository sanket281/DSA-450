// find Largest sum contiguous Subarray [V. IMP]

package Array;

public class problem8 {
    static void maxSubarraySum(int a[], int n)
    {
        int maxSum = 0;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum = sum + a[i];
            if(sum<0)
            {
                sum = 0;
            }
            else if(sum>maxSum)
            {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int a[] = {1,2,-3,-2,5};
        int n = a.length;
        maxSubarraySum(a,n);
    }
}
