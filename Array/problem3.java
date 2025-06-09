// Kth smallest element

// package Array;


// import java.util.Arrays;

// public class problem3 {
//     static void kSmallestNo(int a[], int size, int k)
//     {
//         Arrays.sort(a);
//         System.out.println(a[k-1]);
//     }
//     public static void main(String[] args) {
//         int a[] = {2,3,6,4,1,5};
//         int size = a.length;
//         int k = 3;
//         kSmallestNo(a,size,k);

//     }
// }


//Using heap

package Array;

import java.util.PriorityQueue;

public class problem3 {
    static void kSmallestNo(int a[], int size, int k)
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num:a)
        {
            minHeap.offer(num);
        }
        for(int i=0;i<k-1;i++)
        {
            minHeap.poll();
        }
        System.out.println(minHeap.poll());
    }
    public static void main(String[] args) {
        int a[] = {2,3,6,4,1,5};
        int size = a.length;
        int k = 3;
        kSmallestNo(a,size,k);

    }
}