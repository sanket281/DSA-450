// Sort an array of 0s, 1s and 2s


package Array;

public class problem4 {
    static void sortArray(int a[],int size)
    {
      int low = 0;
      int high = size-1;
      for(int i=0;i<high;i++)
      {
        if(a[i]==0)
        {
            int temp;
            temp = a[low];
            a[low]=a[i];
            a[i] = temp;
            low++;
        }
        else if(a[i]==2)
        {
            int temp;
            temp = a[high];
            a[high]=a[i];
            a[i] = temp;
            high--;
            if(a[i]==0)
            {
            temp = a[low];
            a[low]=a[i];
            a[i] = temp;
            low++;
            }
        }
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i] + " ");
        }
      }
    
    public static void main(String[] args) {
        int a[] = {0,2,1,2,0,2,1,0,0,0};
        int size = a.length;
        sortArray(a,size);
    }
}
