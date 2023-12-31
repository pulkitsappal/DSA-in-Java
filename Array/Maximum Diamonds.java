class Solution {
    static long maxDiamonds(int[] A, int N, int K) {
        // code here
         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: A) pq.add(i);
        
        long ans = 0;
        
        for(int i=0; i<K; i++){
            int curr = pq.remove();
            ans += curr;
            pq.add(curr/2);
        }
        
        return ans;
    }
};
