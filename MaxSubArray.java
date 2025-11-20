class MaxSubArray {
    public int maxSubArray(int[] nums) {

        
        int maxTillNow = nums[0];
        int maxTemp = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxTemp = Math.max(nums[i], maxTemp + nums[i]);
            maxTillNow = Math.max(maxTemp, maxTillNow);
        }
        return maxTillNow;
    }

  public static void main(String[] args){
    
  }
        
    }
