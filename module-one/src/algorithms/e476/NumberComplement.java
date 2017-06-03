package algorithms.e476;

/**
 * Created by Administrator on 2017/6/3.
 */
public class NumberComplement {
    public int findComplement(int num) {
        return ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }
}
