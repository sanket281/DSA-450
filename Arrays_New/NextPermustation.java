package Arrays_New;

import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int right =1;
        int left = 0;
        int temp = 0;
        if(nums.length == 2)
        {
            temp = nums[1];
            nums[1] = nums[0];
            nums[0] = temp;
        }
        else
        {
        for(int i = nums.length-2;i>=0;i--)
        {
            if(nums[i]>=nums[i+1])
            {
                right++;
            }
            else
            {
                left = nums.length - right;
                break;
            }
        }  
        int[] leftt = new int[left];
        int[] rightt = new int[right];
        if(left==0)
        {
            Arrays.sort(nums);
        }  
        else if(left >1)
        {
            for(int i=0;i<nums.length;i++)
            {
                if(i<left)
                {
                    leftt[i] = nums[i];
                }
                else
                {
                    rightt[i-left] = nums[i];
                    
                }
            }
            for(int i = rightt.length-1;i>=0;i--)
            {
                if(rightt[i]>leftt[leftt.length-1])
                {
                            temp = leftt[leftt.length-1];
                            leftt[leftt.length-1] = rightt[i];
                            rightt[i] = temp;
                            // Arrays.sort(leftt);
                            Arrays.sort(rightt);
                            break;
                }
            }
            for(int i = 0;i<nums.length;i++)
            {
                if(i<left)
                {
                    nums[i] = leftt[i];
                }
                else
                {
                    nums[i] = rightt[i-left];
                }
            }
        } 
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                if(i<left)
                {
                    leftt[i] = nums[i];
                }
                else
                {
                    rightt[i-left] = nums[i];
                    
                }
            }
            for(int i=rightt.length-1;i>=0;i--)
            {
                if(rightt[i]>nums[0])
                {
                    temp = nums[0];
                    leftt[0] = rightt[i];
                    rightt[i] = temp;
                    break;
                }
            }
            Arrays.sort(rightt);
            for(int i = 0;i<nums.length;i++)
            {
                if(i<left)
                {
                    nums[i] = leftt[i];
                }
                else
                {
                    nums[i] = rightt[i-left];
                }
            }
        } 
        }
          
    }
}