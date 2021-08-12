import java.util.Scanner;

public class Password02 {
    public static void main(String[] argvs) {

    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    String pass = scan.nextLine();

    String pass1 = scan.nextLine();

    while(!pass1.equals(pass)){
        pass1 = scan.nextLine();
    }

    System.out.println("Welcome " + name + "!");
    }
}
