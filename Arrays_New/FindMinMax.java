package Arrays_New;

import java.util.Scanner;

public class FindMinMax {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of your array: ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array values: ");
        for(int i=0;i<size;i++)
        {
            arr[i] = scanner.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
      
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
            if(arr[i]<min){ min = arr[i];}
            if(arr[i]>max){max = arr[i];}
        }

        System.out.println(min + " " + max);

    }
}
