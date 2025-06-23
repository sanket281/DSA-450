public class UnionOfTwoArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {1,2,3};
        
        int max = 0;
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max = a[i];
            }
            
        }
        for(int i=0;i<b.length;i++)
        {
            if(max<b[i])
            {
                max = b[i];
            }
            
        }

        int arr[] = new int[max+1];
        for(int i=0;i<Integer.max(a.length,b.length);i++)
        {
            if(i<a.length)
            {
                arr[a[i]]++;
            }
            if(i<b.length)
            {
                arr[b[i]]++;
            }
        }
        int count = 0;
        for(int i=0;i<=max;i++)
        {
            if(arr[i]!=0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}


// import java.util.HashSet;

// class Solution {
//     public static int findUnion(int a[], int b[]) {
//         // Create a HashSet to store unique elements
//         HashSet<Integer> set = new HashSet<>();

//         // Add all elements of array a
//         for (int num : a) {
//             set.add(num);
//         }

//         // Add all elements of array b
//         for (int num : b) {
//             set.add(num);
//         }

//         // Return the size of the set (number of unique elements)
//         return set.size();
//     }
// }