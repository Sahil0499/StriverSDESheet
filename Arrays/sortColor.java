package Arrays;
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.

class Solution {
    public void sortColors(int[] nums) {
        int s=nums.length,k=0;
        int[] arr= new int[s];
        for(int i=0;i<s;i++)
        {if(nums[i]==0)
        arr[k++]=nums[i];
        }
        for(int i=0;i<s;i++)
        {if(nums[i]==1)
        arr[k++]=nums[i];
        }
        for(int i=0;i<s;i++)
        {if(nums[i]==2)
        arr[k++]=nums[i];
        }
        for(int i=0;i<s;i++)
        {
        nums[i]=arr[i];
        }
    }
}