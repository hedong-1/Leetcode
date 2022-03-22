import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
       int ans = 0;
       int max = 0;
       int left = 0;
       Map map = new HashMap();
       for (int i  = 0; i < s.length(); i++){
           if(map.containsKey(s.charAt(i))){
               for (int j = left; j < (int) map.get(s.charAt(i)); j++){
                   map.remove(s.charAt(j));
               }
               left = (int) map.get(s.charAt(i))+1;
               ans = Math.max(ans,max);
               max = i - left ;
           }
           map.put(s.charAt(i),i);
           max++;
       }
       ans = Math.max(ans,max);
       return ans;
    }

    public static void main(String[] args) {
        String s ="abba";
        System.out.println(new Solution3().lengthOfLongestSubstring(s));
    }
}
