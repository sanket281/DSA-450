package Arrays_New;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = { 2,3 };
        int[] b = { 0,1};
        int i = 0;
        int j = 0;
        int right = a.length - 1;
        int temp = 0;
        while ((i < a.length) && (j < b.length)) {
            if (right < i) {
                break;
            }
            if (b[j] < a[i]) {
                temp = a[right];
                a[right] = b[j];
                b[j] = temp;
                right--;
                j++;
            } else {
                i++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int k=0;k<a.length;k++)
        {
            System.out.println(a[k]);
        }
        for(int k=0;k<b.length;k++)
        {
            System.out.println(b[k]);
        }
    }
}
