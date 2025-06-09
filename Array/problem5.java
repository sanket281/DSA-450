// Move all negative numbers to beginning and positive to end with constant extra space

package Array;

public class problem5 {
    static void arrange(int a[],int size)
    {
        int left = 0;
        int right = size-1;
        while (left <= right) {
            if (a[left] < 0 && a[right] < 0) {
               left++;
            } else if (a[left] >= 0 && a[right] < 0) {
                 int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            } else if (a[left] >= 0 && a[right] >= 0) {
                right--;
            } else {
                left++;
                right--;
            }
        }

        for(int i=0;i<size;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int a[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int size = a.length;
        arrange(a,size);
    }
}
