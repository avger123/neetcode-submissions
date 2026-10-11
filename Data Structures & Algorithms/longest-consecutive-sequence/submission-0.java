class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max = 0;
        for(int num : nums){
            if(!set.contains(num - 1)){
                int currStreak = 1;
                int currNum = num;
                while(set.contains(currNum + 1)){
                    currStreak++;
                    currNum++;
                }
                max = Math.max(max, currStreak);
            }
        }
        return max;
    }
}
