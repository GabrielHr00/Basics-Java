import java.util.Scanner;

public class Character_Sequence05 {
    public static void main(String[] argvs) {

        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();

        for(int i = 0; i < num.length(); i++) {
            char zeich = num.charAt(i);
            System.out.println(zeich);
        }
    }
}
