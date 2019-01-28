public class Date implements Comparable<Date> {

    private final int month;
    private final int day;
    private final int year;

    public Date(int m, int d, int y){
        month = m;
        day = d;
        year = y;
    }

    public int getMonth(){ return month; }

    public int getDay(){return day; }

    public int getYear(){ return year; }

    // 转化字符串
    public String toString(){ return getMonth() + "/" + getDay() + "/" + getYear(); }

    // 判读是否相等
    public boolean equals(Object x){

        if (this == x) return true;
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;

        Date that = (Date) x;

        if (this.day != that.day) return false;
        if (this.month != that.month) return false;
        if (this.year != that.year) return false;
        return true;
    }

    // 实现Comparable接口
    public int compareTo(Date that){
        if (this.year > that.year) return +1;
        if (this.year < that.year) return -1;
        if (this.month > that.month) return +1;
        if (this.month < that.month) return -1;
        if (this.day > that.day) return +1;
        if (this.day < that.day) return -1;

        return 0;
    }

/*******************************************************************************/
    public static void main(String[] args) {

        Date date = new Date(1, 27, 2019);
        StdOut.println(date.getYear() + " " + date.getMonth() + " " + date.getDay());
        StdOut.println(date);
    }
}
