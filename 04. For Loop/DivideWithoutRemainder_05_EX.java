import java.util.Scanner;

public class DivideWithoutRemainder_05_EX {
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
            if(number%2 == 0) {a++;}
            if(number%3 == 0) {b++;}
            if(number%4 == 0) {c++;}
        }

        a = (a/count)*100.0;
        b = (b/count)*100.0;
        c = (c/count)*100.0;


        System.out.printf("%.2f",a);
        System.out.println("%");
        System.out.printf("%.2f",b);
        System.out.println("%");
        System.out.printf("%.2f",c);
        System.out.println("%");

    }
}
