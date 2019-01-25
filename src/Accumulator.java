/**
 *  实现一个计数器类：
 *  1. 每加入一个数字后，重新计算均值
 */
public class Accumulator {

    private double total;
    private int N;

    public void addDataValue(double val){
        N++;
        total += val;
    }

    public double mean(){ return total/N; }

    public String toString(){
        return "Mean (" + N + " values):" + String.format("%7.5f", mean());
    }

    // 测试用例
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);

        Accumulator a = new Accumulator();
        for (int t = 0; t < T; t++) {
            a.addDataValue(StdRandom.random());
        }
        StdOut.println(a);
    }
}
