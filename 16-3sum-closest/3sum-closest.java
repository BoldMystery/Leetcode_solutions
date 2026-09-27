class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[2];

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            int low = i + 1;
            int high = nums.length - 1;

            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == target){
                    return target; 
                }
                else if(sum < target){
                    low++;
                }else{
                    high--;
                }

                if(Math.abs(sum - target) < Math.abs(result - target)){
                    result = sum;
                }
            }
        }
        return result;
    }
}