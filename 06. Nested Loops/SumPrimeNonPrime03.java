import java.util.Scanner;

public class SumPrimeNonPrime03 {
    public static void main(String[] argvs) {

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        int sum1 = 0;
        int sum2 = 0;

        while(!line.equals("stop")) {
            boolean prime = false;
            int num = Integer.parseInt(line);

            if(num < 0) {
                System.out.println("Number is negative.");
                line = scan.nextLine();
                continue;
            }

            for(int i = 2; i < num; i++) {
                if(num%i == 0) {
                    prime = true;
                    break;
                }
            }

            if(prime) {sum1+=num;}
            else {sum2 += num;}

            line = scan.nextLine();
        }

        System.out.println("Sum of all prime numbers is: " + sum2);
        System.out.println("Sum of all non prime numbers is: " + sum1);
    }
}
