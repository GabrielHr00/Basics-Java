import java.util.Scanner;

public class MetricConverter_04_EX {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        double length = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();
        String output = scan.nextLine();

        if(input.equals("mm") && output.equals("m")) {length /= 1000.0;}
        else if(input.equals("mm") && output.equals("cm")) {length /= 10.0;}
        else if(input.equals("m") && output.equals("cm")) {length *= 100.0;}
        else if(input.equals("m") && output.equals("mm")) {length *= 1000.0;}
        else if(input.equals("cm") && output.equals("m")) {length /= 100.0;}
        else if(input.equals("cm") && output.equals("mm")) {length *= 10.0;}


        System.out.printf("%.3f", length);
    }
}
