package algorithms.e461;

/**
 * Created by Administrator on 2017/6/3.
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
