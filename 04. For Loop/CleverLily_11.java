import java.util.Scanner;

public class CleverLily_11 {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());
        double wasch = Double.parseDouble(scan.nextLine());
        int toy = Integer.parseInt(scan.nextLine());

        double money = 0.0;
        double moneyB = 0.0;
        double sumToy = 0.0;
        int count = 0;
        int count1 = 0;
        int brother = 0;

        for(int i = 1; i <= age;i++) {
            if(i%2==0) {
                count++;
                money += 10;
                moneyB += money;
            }
            else{count1++;}

        }

        sumToy = count1*toy;
        brother = count*1;

        double totalSum = moneyB + sumToy - brother;

        if(wasch <= totalSum) {System.out.printf("Yes! %.2f", totalSum - wasch);}
        else {System.out.printf("No! %.2f", Math.abs(wasch - totalSum));}
    }
}
