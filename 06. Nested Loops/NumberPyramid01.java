import java.util.Scanner;

public class NumberPyramid01 {
    public static void main(String[] argvs) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int counter = 1;
        boolean bi = false;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if(counter > n) {
                    bi = true;
                    break;
                }
                System.out.print(counter + " ");
                counter++;
            }
            if(bi) {break;}
            System.out.println();
        }
    }
}
