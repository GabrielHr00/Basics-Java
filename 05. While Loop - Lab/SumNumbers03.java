import java.util.Scanner;

public class SumNumbers03 {
    public static void main(String[] argvs) {

        Scanner scan = new Scanner(System.in);
        int name = Integer.parseInt(scan.nextLine());

        int sum = 0;

        while(sum < name){
            int digit = Integer.parseInt(scan.nextLine());
            sum += digit;
        }

        System.out.println(sum);

    }
}
