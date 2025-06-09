package Arrays_New;
import java.util.Scanner;

public class reverseArray {
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
        int swap;
        for(int i=0;i<size/2;i++)
        {
            swap = arr[i];
            arr[i] = arr[size -   (i + 1)];
            arr[size - (i+1)] = swap;
            
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
            
        }

    }
}
