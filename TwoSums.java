class TwoSums {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> indi = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++)
        {
            
            Integer diff = target - nums[i];

            if(indi.containsKey(diff))
            {
                return new int[] {i, indi.get(diff)};
            }
            
            indi.put(nums[i],i);
        }
        return null;
    }

public static void main(String[] args){

}

    
}
