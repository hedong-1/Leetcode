import java.util.ArrayList;
import java.util.List;

public class Solution17 {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        String[] map = {null,null,"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuffer combination = new StringBuffer();
        dfs(map, 0, combination, digits, ans);
        return ans;
    }

    public void dfs(String[] map, int index, StringBuffer combination, String digits, List<String> ans){
        if (index == digits.length()){
            ans.add(combination.toString());
            return;
        }
        String s = map[Integer.parseInt(digits.substring(index,index+1))];
        for (int i = 0; i < s.length(); i++ ){
            combination.append(s.charAt(i));
            dfs(map, index+1, combination, digits, ans);
            combination.deleteCharAt(index);
        }
        return;
    }

    public static void main(String[] args) {
        String digits = "";
        System.out.println(new Solution17().letterCombinations(digits));
    }
}
