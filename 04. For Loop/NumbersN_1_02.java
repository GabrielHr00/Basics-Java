import java.util.Scanner;

public class NumbersN_1_02 {
    public static void main(String[] argvs) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for(int i = n; i >= 1; --i) {
            System.out.println(i);
        }
    }
}
