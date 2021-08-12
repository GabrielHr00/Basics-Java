import java.util.Scanner;

public class NumbersEndingin7_01_EX {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        for(int i = 7; i <= 997; i++) {
            if(i%10==7){
                System.out.println(i);
            }
        }
    }
}
