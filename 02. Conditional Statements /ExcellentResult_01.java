import java.util.Scanner;

public class ExcellentResult_01 {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);
        double grade = Double.parseDouble(scan.nextLine());

        if(grade >= 5.0) {
            System.out.println("Excellent!");
        }
    }
}
