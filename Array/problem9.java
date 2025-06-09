// Minimise the maximum difference between heights [V.IMP]

package Array;

import java.util.Arrays;

public class problem9 {
    static void findMinDiff(int a[], int n, int k)
    {
        Arrays.sort(a);
        int diff = a[n-1]-a[0];
        int min, max;
        for(int i=1;i<n;i++)
        {
            if(a[i]-k<0)continue;
            max = Math.max(a[i-1]+k, a[n-1]-k);
            min = Math.min(a[0]+k, a[i]-k);
            diff = Math.min(diff,max-min);
        }
        System.out.println(diff);
    }
    public static void main(String[] args) {
        int a[] = {3,9,12,16,20};
        int n = a.length;
        int k = 3;
        findMinDiff(a,n,k);
    }
}
