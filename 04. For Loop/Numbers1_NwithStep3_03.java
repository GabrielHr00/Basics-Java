import java.util.Scanner;

public class Numbers1_NwithStep3_03 {
    public static void main(String[] argvs) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for(int i = 1; i <= n; i+=3) {
            System.out.println(i);
        }

    }
}
