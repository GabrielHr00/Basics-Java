import java.util.Scanner;

public class Histogram_04_EX {
    public static void main(String[] argvs) {

        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        double d = 0.0;
        double e = 0.0;

        for(int i = 1; i <= count; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if(number < 200) {a++;}
            else if(number >= 200 && number <= 399) {b++;}
            else if(number >= 400 && number <= 599) {c++;}
            else if(number >= 600 && number <= 799) {d++;}
            else if(number >= 800) {e++;}
        }

        a = (a/count)*100.0;
        b = (b/count)*100.0;
        c = (c/count)*100.0;
        d = (d/count)*100.0;
        e = (e/count)*100.0;


        System.out.printf("%.2f",a);
        System.out.println("%");
        System.out.printf("%.2f",b);
        System.out.println("%");
        System.out.printf("%.2f",c);
        System.out.println("%");
        System.out.printf("%.2f",d);
        System.out.println("%");
        System.out.printf("%.2f",e);
        System.out.println("%");

    }
}
