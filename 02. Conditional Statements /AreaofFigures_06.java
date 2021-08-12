import java.util.Scanner;

public class AreaofFigures_06 {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        String figur = scan.nextLine();
        double area = 0.0;

        if(figur.equals("square")) {
            Double a = Double.parseDouble(scan.nextLine());
            area = a * a;
        }
        else if(figur.equals("rectangle")) {
            Double a = Double.parseDouble(scan.nextLine());
            Double b = Double.parseDouble(scan.nextLine());
            area = a * b;
        }
        else if(figur.equals("circle")) {
            Double r = Double.parseDouble(scan.nextLine());
            area = r * r * Math.PI;
        }
        else if(figur.equals("triangle")) {
            Double a = Double.parseDouble(scan.nextLine());
            Double h = Double.parseDouble(scan.nextLine());
            area = a * h / 2;
        }

        System.out.printf("%.3f", area);
    }
}
