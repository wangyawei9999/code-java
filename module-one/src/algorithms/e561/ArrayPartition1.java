package algorithms.e561;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/6/3.
 */
public class ArrayPartition1 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }
}
