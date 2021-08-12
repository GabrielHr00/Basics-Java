import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] argvs) {

        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < count;i++) {
            int number = Integer.parseInt(scan.nextLine());
            if(i%2==0) {
                sum1 += number;
            }
            else{ sum2 += number;}

        }

        if(sum1 == sum2) {System.out.printf("Yes %nSum = %d", sum1);}
        else {System.out.printf("No %nDiff = %d", Math.abs(sum1-sum2));}
    }
}
