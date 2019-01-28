public class SortCompare {

    public static double time(String alg, Double[] a){

        Stopwatch timer = new Stopwatch();

        if (alg.equals("Insertion")) Insertion.sort(a);
        if (alg.equals("Selection")) Selection.sort(a);
        if (alg.equals("Shell")) Shell.sort(a);

        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg, int N, int T){

        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform();
            }
            total += time(alg, a);
        }
        return total;
    }

/*************************************************************************/

    public static void main(String[] args) {

        String alg1 = args[0];
        String alg2 = args[1];
        String alg3 = args[2];

        int N = Integer.parseInt(args[3]);
        int T = Integer.parseInt(args[4]);

        double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);
        double t3 = timeRandomInput(alg3, N, T);

        StdOut.println(t1);
        StdOut.println(t2);
        StdOut.println(t3);
    }
}
