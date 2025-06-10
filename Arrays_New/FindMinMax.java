package Arrays_New;

import java.util.Scanner;

public class FindMinMax {
     public static void main(String[] args) {
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(largest < arr[i]) {
                largest = arr[i];
            }
        }
        
        // Create frequency array
        int[] freq = new int[largest + 1];
        for(int i = 0; i < arr.length; i++) {  // Fixed: changed <= to <
            freq[arr[i]]++;
        }
        
        // Find k-th smallest element
        int count = 0;
        for(int i = 0; i <= largest; i++) {
            if(freq[i] != 0) {
                count += freq[i];
                if(count >= k) {
                    return i;
                }
            }
        }
        
        // Return -1 if k is out of bounds (invalid input)
        return -1;

    }
}
