// Minimum no. of Jumps to reach end of an array

package Array;

public class problem10 {
    static void minJump(int a[], int n)
    {
        int pos = 0;
        int des = 0;
        int jump = 0;
        for(int i=0;i<n-1;i++)
        {
            des = Math.max(des, a[i] + i);
            if(pos == i)
            {
                pos = des;
                jump++;
            }
        }
        System.out.println(jump);
    }
    public static void main(String[] args) {
        int a[] = {2, 9, 5, 8, 0, 2, 6, 7, 6, 8, 9};
        int n = a.length;
        minJump(a,n);
    }
}
