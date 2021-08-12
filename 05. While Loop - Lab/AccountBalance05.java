import java.util.Scanner;

public class AccountBalance05 {
    public static void main(String[] argvs) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double sum = 0;
        double sum1 = 0;

        while(!input.equals("NoMoreMoney")){
            sum1 = Double.parseDouble(input);
            if(sum1 <= 0) {
                System.out.println("Invalid operation!");
                break;}
            else {
                System.out.printf("Increase: %.2f%n",sum1);
                sum += Double.parseDouble(input);
            }
            input = scan.nextLine();
        }
        System.out.printf("Total: %.2f%n", sum);
    }
}
