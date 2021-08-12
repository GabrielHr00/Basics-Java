import java.util.Scanner;

public class Cinema_01_EX {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        String sort = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int coloms = Integer.parseInt(scan.nextLine());

        double price = 0.0;

        if(sort.equals("Discount")) {price = rows*coloms*5;}
        else if(sort.equals("Normal")) {price = rows*coloms*7.5;}
        else if(sort.equals("Premiere")) {price = rows*coloms*12.0;}
        System.out.printf("%.2f leva", price);
    }
}
