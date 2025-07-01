package Arrays_New;

public class CountInverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(countInv(arr,0,arr.length-1)); 
    }
  
    
    static int countInv(int[] arr,int l,int r)
    {
        int res = 0;
        if(l<r)
        {
            int m = (l+r)/2;
            
            res+= countInv(arr,l,m);
            res+= countInv(arr,m+1,r);
            
            res+= countAndMerge(arr,l,m,r);
        }
        return res;
    }
    static int countAndMerge(int[] arr, int l,int m,int r)
    {
        int n1 = m-l+1;
        int n2 = r-m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i=0;i<n1;i++)
        {
            left[i] = arr[l+i];
        }
        for(int i=0;i<n2;i++)
        {
            right[i] = arr[m+1+i];
        }
        
        int res = 0;
        int i =0;
        int j=0;
        int k = l;
        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            {
                arr[k++] = left[i++];
            }
            else
            {
                arr[k++] = right[j++];
                res += (n1-i);
            }
        }
        while(i<n1)
        {
            arr[k++] = left[i++];
        }
        while(j<n2)
        {
            arr[k++] = right[j++];
        }
        return res;
    }
}