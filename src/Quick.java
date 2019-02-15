public class Quick {

    public static void sort(Comparable[] a){
        // 排序算法
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }


    private static void sort(Comparable[] a, int lo, int hi){

        if (hi <= lo) return;
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

    /******************************************************************************************/

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
