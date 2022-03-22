import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution139 {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("apple", "pn");
        System.out.println(new Solution139().wordBreak("applepenapple",list ));
    }

    Tree root = new Tree('/');
    boolean[] Failure;
    public boolean wordBreak(String s, List<String> wordDict) {
        for (int i = 0; i < s.length(); i++){
            Failure[i] = true;
        }
        InitTree(wordDict);
        return dfs(s,0);
    }

    public boolean dfs(String s, Integer start){
        if (!Failure[start]) return false;
        if (start == s.length())    return true;
        Tree tmp = root;
        for (int i = start; i < s.length(); i++){
            if (tmp.children[s.charAt(i)-'a'] != null){
               tmp = tmp.children[s.charAt(i)-'a'];
                if  (tmp.isEndingChar && dfs(s,i+1))    return true;
           }else{ break; }
        }
        Failure[start] = false;
        return  false;
    }

    public void InitTree(List<String> wordDict){
        for (String word : wordDict) {
            Tree tmp = root;
            for (char c : word.toCharArray()) {
                if (tmp.children[c-'a'] == null){
                    tmp.children[c-'a'] = new Tree(c);
                }
                tmp = tmp.children[c-'a'];
            }
            tmp.isEndingChar = true;
        }
    }
}

class Tree{
    public char data;
    public Tree[] children = new Tree[26];
    public boolean isEndingChar = false;
    public Tree(char data) {
        this.data = data;
    }
}