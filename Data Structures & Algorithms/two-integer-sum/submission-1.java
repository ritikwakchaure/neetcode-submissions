class Solution {
    public int[] twoSum(int[] nums, int target) {

        int left = 0;

        int right = nums.length - 1;


        for( int  i = 0 ; i < nums.length;i++){

            int sum =  nums[left] +  nums[right];


            if( sum == target){
                return  new int[] {left , right};
            } else if( sum < target){
                left++;
            }else {
                right--;
            }
        }


        return new int[]{ 0, 0};
        
    }
}
