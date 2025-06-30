import java.util.Arrays;

public class NextPermustation {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        int i = nums.length-2;
        int temp = 0;
        for(;i>=0;i--)
        {
            if(nums[i]<=nums[i+1])
            {
                break;
    
            }
        }
        if(i>=0)
        {

            for(int j = nums.length-1;j>i;j--)
            {
                if(nums[j]>nums[i])
                {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        if(temp==0)
        {
            Arrays.sort(nums);
        }
    }
}


