import java.util.*;

public class Solution621 {
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> map = new HashMap<>();
        int max = 0;
        int cnt = 0;
        for (char c : tasks) {
            int temp = map.getOrDefault(c,0);
            map.put(c,temp+1);
            if (map.get(c) == max){
                cnt++;
            }else if(map.get(c) > max){
                cnt = 1;
                max = map.get(c);
            }
        }

        return Math.max(tasks.length,(n+1)*(max-1)+cnt);
    }
}
