import java.util.*;

public class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        List<Integer>[] times = new List[nums.length+1];
        for (Integer i : map.keySet()) {
            int time = map.get(i);
            if (times[time] == null){
                times[time] = new ArrayList<>();
            }
            times[time].add(i);
        }
        int[] ans = new int[k];
        int cnt = 0;
        for(int i = times.length - 1; i >= 0; i--){
            if(times[i] == null){
                continue;
            }
            for (Integer key : times[i]) {
                ans[cnt++] = key;
                if (cnt == k){
                    break;
                }
            }
            if (cnt == k){
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(new Solution347().topKFrequent(nums, 2)));
    }
}
