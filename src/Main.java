import java.util.Scanner;

public class Main {
    public static boolean isPrime(int number){
        boolean isPrime = true;
        for (int i = 2; i <= number/2; i++){
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static int sumFromTo(int a, int b){
        int sum = 0;
        for (int i = a; i <= b; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = '韩', ch = 'A';
        System.out.println(c);
        System.out.println(ch);
        System.out.println(c + ch);
        System.out.println('\u0041');
        c++;ch++;
        System.out.println(c);
        System.out.println(ch);
        System.out.println('a'>'b');
        System.out.println("abc\b\td");
        System.out.println("xnsjcb\r");
        System.out.println("snjc");

        int j = 10;
        Integer k = 10;
        k = j;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Character.isLowerCase('1'));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Math.abs(-12));
        System.out.println(Math.round(10.645));
        System.out.println(Math.random()*100);
        System.out.println(Math.pow(2, 3.2));

        String s = new String("a string");
        String str = "hello";
        System.out.println("hello" + "world");
        System.out.println("hello " + 18);
        System.out.println(s + 12 + 14);
        System.out.println(s + (12 + 24));

//        String str1, str2;
//        str1 = in.next();
//        str2 = in.nextLine();
//        System.out.println(str1);
//        System.out.println(str2);
        // ‘==’表示两个变量是否管理同一个字符串
        //
        String s1 = "abc";
        String s2 = "abb";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));

        for (int i = 0; i < s1.length(); i++){
            System.out.println(s1.charAt(i));
        }
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2));
        System.out.println(s1.indexOf('a'));
        System.out.println(s2.indexOf('b'));

        String s3 = s1.toUpperCase();//不改变源字符串，只是拷贝，因为字符串不可修改


        System.out.println(isPrime(20));
        MyFirstClass m1 = new MyFirstClass("ruanying");
        MyFirstClass m2 = new MyFirstClass("dbjbdbv", 18);
        MyFirstClass m3 = new MyFirstClass("skcnksn", 19, "sjtu");
        m1.printInformation();
        m2.printInformation();
        m3.printInformation();
    }
}
