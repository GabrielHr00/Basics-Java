import java.util.Scanner;

public class Odd_EvenPosition_03_EX {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        double count = Double.parseDouble(scan.nextLine());
        double maxnum = -1000000000.0;
        double minnum = 1000000000.0;
        double maxnum1 = -1000000000.0;
        double minnum1 = 1000000000.0;
        double sum1 = 0.0;
        double sum2 = 0.0;

        for(int i = 1; i <= count; i++)
        {
            double num = Double.parseDouble(scan.nextLine());
            if(i%2 == 0) {
                if(num < minnum) {minnum = num;}
                if(num > maxnum) {maxnum = num;}
                sum1 += num;
            }else {
                if(num < minnum1) {minnum1 = num;}
                if(num > maxnum1) {maxnum1 = num;}
                sum2 += num;
            }
        }
        System.out.printf("OddSum=%.2f,%n",sum2);
        if(minnum1 == 1000000000.0) {System.out.printf("OddMin=No,%n",minnum1);}
        else {System.out.printf("OddMin=%.2f,%n",minnum1);}
        if(maxnum1 == -1000000000.0) {System.out.printf("OddMax=No,%n",maxnum1);}
        else {System.out.printf("OddMax=%.2f,%n",maxnum1);}
        System.out.printf("EvenSum=%.2f,%n",sum1);
        if(minnum == 1000000000.0) {System.out.printf("EvenMin=No,%n",minnum);}
        else {System.out.printf("EvenMin=%.2f,%n",minnum);}
        if(maxnum == -1000000000.0) {System.out.printf("EvenMax=No%n",maxnum);}
        else {System.out.printf("EvenMax=%.2f%n",maxnum);}
    }
}
