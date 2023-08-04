//Sort Array By Parity
//https://leetcode.com/problems/sort-array-by-parity/description/
//Reference - Own

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int right = nums.length-1;
        int left = 0;

        for(int i = 0; i < n; i++){
            if(nums[i]%2==0){
                ans[left]=nums[i];
                left++;
            }else{
                ans[right]=nums[i];
                right--;
            }
        }

        return ans;
    }
}
