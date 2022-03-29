import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0)  return new int[0][2];

        Arrays.sort(intervals,(o1, o2) -> o1[0] - o2[0]);
        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++){
            if (intervals[i][0] <= merged.get(merged.size() - 1)[1]){
                merged.get(merged.size() - 1)[1] = Math.max(intervals[i][1], merged.get(merged.size() - 1)[1]);
            }else{
                merged.add(intervals[i]);
            }
        }
        return merged.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        new Solution56().merge(intervals);
    }
}
