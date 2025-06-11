package Arrays_New;

import java.util.Scanner;

public class FindKthSmallest {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        System.out.println("Enter the K th smallest element to find");
        int k = scanner.nextInt();
        int arr[] = new int[size];
        int max = 0;
        System.out.println("Enter the array values");
        for(int i=0;i<size;i++)
        {
            arr[i] = scanner.nextInt();
            if(i == 0)
            {
                max = arr[i];
            }
            else if(max < arr[i])
            {
                max = arr[i];
            }
        }
        int temp[] = new int[max+1];
        for(int i=0;i<size;i++)
        {
            temp[arr[i]]++;
        }
        int count = 0;
        for(int i=0;i<=max;i++)
        {
            if(temp[i]!=0)
            {
                count += temp[i];
                if(count>=k)
                {
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}
