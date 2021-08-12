import java.util.Scanner;

public class VowelsSum_06 {
    public static void main(String[] argvs) {

        Scanner scan = new Scanner(System.in);

        String num = scan.nextLine();
        int sum = 0;
        for(int i = 0; i < num.length(); i++) {
            char zeich = num.charAt(i);

            switch(zeich) {
                case 'a': sum+= 1; break;
                case 'e': sum+= 2; break;
                case 'i': sum+= 3; break;
                case 'o': sum+= 4; break;
                case 'u': sum+= 5; break;
                default: sum+= 0; break;
            }

        }
        System.out.println(sum);
    }
}
