public class Exercise5 {
    public static void main(String[] args) {
        double s = 1000.00;
        double delta = 0.00;
        int month = 0;

        while (delta <= 30) {
            delta = s * 0.02;
            s = s + s * 0.02;
            month ++;
        }
        System.out.printf("Ежемесячное увеличение вклада: " + "%.2f", delta);
        System.out.printf(" будет в месяце №: " + month);
        System.out.println();

        s = 1000.00;
        month = 0;
        while (s <= 1200) {
            s = s + s * 0.02;
            month ++;
        }
        System.out.printf("Размер вклада: " + "%.2f", s);
        System.out.printf(" будет в месяце №: " + month);


    }
}