import java.util.Scanner;

public class MaxNumber06 {
    public static void main(String[] argvs) {

        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        int maxnum = Integer.MIN_VALUE;

        while(!n.equals("Stop")){
            int num = Integer.parseInt(n);
            if(num > maxnum) {maxnum = num;}
            n = scan.nextLine();
        }
        System.out.println(maxnum);
    }
}
