public class ArithmeticTriplets {
    public int arithmeticTriplets(int[] nums, int diff ) {
        int out = 0;
        for(int i=0; i<nums.length-2; i++){
            for(int j=0; j<nums.length-1; j++){
                if(nums[j]-nums[i] != diff){
                    continue;
                }
                for(int k=0; k<nums.length; k++){
                    if(nums[k]-nums[j] != diff){
                        continue;
                    }
                    if(nums[k]-nums[j] == diff){
                        out++;
                    }
                }
            }
        }
        return out;
    }
}
