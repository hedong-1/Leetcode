import java.util.*;

public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String str : strs) {
            String temp = convert(str);
            if (map.containsKey(temp)){
                ans.get(map.get(temp)).add(str);
            }else {
                List<String> list = new ArrayList<>();
                list.add(str);
                ans.add(list);
                map.put(temp,ans.size()-1);
            }
        }
        return ans;
    }

    public String convert(String word){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return Arrays.toString(chars);
    }

    public static void main(String[] args) {
        String[] strs = {""};
        System.out.println(new Solution49().groupAnagrams(strs));
    }
}
