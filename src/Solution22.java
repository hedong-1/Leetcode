import java.util.ArrayList;
import java.util.List;

public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        dfs(ans,"",n,n);
        return ans;
    }
//左括号大于零 左括号小于右括号
    public void dfs(List<String> ans, String curStr, int left, int right){
        if (left == 0 && right == 0){
            ans.add(curStr);
            return;
        }
        if (left > right){
            return;
        }
        if (left > 0){
            dfs(ans,curStr+'(',left-1,right);
        }
        if (left < right){
            dfs(ans,curStr+')',left,right-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution22().generateParenthesis(3));
    }
}
