public class Counter {

    private final String name;
    private int count; // 默认初始化为0

    public Counter(String id){ name = id; }
    // 计票
    public void increment(){ count++; }
    // 返回票数
    public int tally(){ return count; }
    // 字符串转换
    public String toString(){ return count + " " + name; }

    // 测试用例
    public static void main(String[] args) {

        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");

        heads.increment();
        heads.increment();
        tails.increment();

        StdOut.println(heads + " " + tails); // 此处自动调用toString()
        StdOut.println(heads.tally() + tails.tally());
    }
}
