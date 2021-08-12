import java.util.Scanner;

public class MinNumber07 {
    public static void main(String[] argvs) {

        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        int minnum = Integer.MAX_VALUE;

        while(!n.equals("Stop")){
            int num = Integer.parseInt(n);
            if(num < minnum) {minnum = num;}
            n = scan.nextLine();
        }
        System.out.println(minnum);
    }
}
