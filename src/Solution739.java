import com.sun.org.apache.bcel.internal.generic.POP;

import java.util.Arrays;
import java.util.Stack;

public class Solution739 {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> num = new Stack<>();
        int[] ans = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++){
            if (!num.isEmpty()){
                while (temperatures[i] > temperatures[num.peek()]){
                    ans[num.peek()] = i - num.peek();
                    num.pop();
                    if (num.isEmpty()){
                        break;
                    }
                }
            }
            num.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {30,40,50,60};
        System.out.println(Arrays.toString(new Solution739().dailyTemperatures(a)));
    }
}
