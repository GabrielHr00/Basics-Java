import java.util.Scanner;

public class PasswordGuess_05 {
    public static void main(String[] argvs) {

        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();

        if(password.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }

    }
}
