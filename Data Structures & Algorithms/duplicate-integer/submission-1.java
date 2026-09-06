class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int num : nums){
            if(!hash.add(num)){
                return true;
            }
        }
        return false;
    }
}