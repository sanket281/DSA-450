// Union of two arrays
package Array;

import java.util.HashSet;

public class problem6 {
    static void union(int a[], int b[])
    {
        HashSet<Integer> unionSet = new HashSet<>();
        for(int num:a)
        {
            unionSet.add(num);
        }
        for(int num:b)
        {
            unionSet.add(num);
        }

        int c[] = new int[unionSet.size()];
        int index = 0;
        for(int num:unionSet)
        {
            c[index++]=num;
        }
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i] + " ");
        }
    }
    public static void main(String[] args) {
        int a[] = {1,3,5,7,9};
        int b[] = {2,4,6,8};
        union(a,b);
    }
}
