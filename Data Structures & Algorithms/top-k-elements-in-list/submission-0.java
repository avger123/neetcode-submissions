class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> hm.get(a) - hm.get(b)
        );

        for(int num : hm.keySet()){
            heap.add(num);
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] output = new int[k];
        for(int i = 0; i < k; i++){
            output[i] = heap.poll();
        }

        return output;
    }
}
