class TwoSumTwo {
    public int[] twoSum(int[] numbers, int target) {

        Integer right = numbers.length-1;
        Integer left = 0;


        while(right > left)
        {
            Integer sum = numbers[right] + numbers[left];

            if( sum == target)
            {
                return new int[] {left+1, right+1};
            }
            
            if(sum > target)
            {
                right--;
            }else
            {
                left++;
            }
        }
        
        return null;
    }


  public static void main(String[] args){
    
  }
  
}
