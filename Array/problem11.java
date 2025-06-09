// find duplicate in an array of N+1 Integers

package Array;

public class problem11 {
    static void findDuplicate(int a[], int n)
    {
        int count[] = new int[n+1];
        int i;
        for(i=0;i<n;i++)
        {
            count[a[i]]++;
            if(count[a[i]]>1)
            {
                System.out.println(count[a[i]]);
                break;
            }
        }
        if(i==n)
        {
            System.out.println("No duplicate found");
        }
    }
    public static void main(String[] args) {
        int a[] = {1,3,4,2};
        int n = a.length;
        findDuplicate(a,n);
    }
}
