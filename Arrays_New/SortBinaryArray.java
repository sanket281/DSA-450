package Arrays_New;

import java.util.Scanner;

public class SortBinaryArray {
    public static void main(String[] args) {
        int zero,one;
  
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter size of your array: ");
            int size = scanner.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter array values: ");
            for(int i=0;i<size;i++)
            {
                arr[i] = scanner.nextInt();
            }
            zero = 0;
            one = 0;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==0)
                {
                    zero++;
                    one++;
                }
                else if(arr[i] == 1)
                {
                    one++;
                }
               
            }
            for(int i=0;i<arr.length;i++)
            {
                if(i<zero)
                {
                    arr[i] = 0;
                }
                else if(i<one)
                {
                    arr[i] = 1;
                }
                else
                {
                    arr[i] = 2;
                }
            }
            for(int i=0;i<size;i++)
            {
                System.out.println(arr[i]);
                
            }
        }
    }
}
