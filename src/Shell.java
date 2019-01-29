public class Shell {
    /* 希尔排序，根据插入排序改进算法 */
    public static void sort(Comparable[] comparables){
        // 排序算法
        int N = comparables.length;
        int h = 1;
        while (h < N/3) h = 3*h + 1;
        while (h >= 1){
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(comparables[j], comparables[j-h]); j -= h) {
                    exch(comparables, j, j-h);
                }
            }
            h = h/3;
        }
    }

    // 比较主键顺序
    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    // 交换主键
    private static void exch(Comparable[] comparables, int i, int j){
        Comparable t = comparables[i];
        comparables[i] = comparables[j];
        comparables[j] = t;
    }

    // 输出结果
    public static void show(Comparable[] comparables){
        for (int i = 0; i < comparables.length; i++)
            System.out.println(comparables[i] + " ");
        System.out.println();
    }

    // 检验是否被排完序
    public static boolean isSorted(Comparable[] comparables){
        for (int i = 1; i < comparables.length; i++) {
            if (less(comparables[i], comparables[i-1]))
                return false;
        }
        return true;
    }

    /****************************************************************/

    public static void main(String[] args) {

        Double[] a = new Double[100];
        for (int i = 0; i < 100; i++) {
            a[i] = StdRandom.random()*100;
        }
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
