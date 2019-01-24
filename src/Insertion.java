public class Insertion {
    public static void sort(Comparable[] comparables){
        // 排序算法
        int N = comparables.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(comparables[j], comparables[j-1]) ; j--) {

            }
        }

    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] comparables, int i, int j){
        Comparable t = comparables[i];
        comparables[i] = comparables[j];
        comparables[j] = t;
    }

    private static void show(Comparable[] comparables){
        for (int i = 0; i < comparables.length; i++)
            System.out.println(comparables[i] + " ");
        System.out.println();
    }

    private static boolean isSorted(Comparable[] comparables){
        for (int i = 1; i < comparables.length; i++) {
            if (less(comparables[i], comparables[i-1]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] a = {2, 9, 8, 7, 3, 6, 4, 5, 1, 0};
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
