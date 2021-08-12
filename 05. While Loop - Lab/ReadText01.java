import java.util.Scanner;

public class ReadText01 {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        while(!name.equals("Stop")){
            System.out.println(name);
            name = scan.nextLine();
        }
    }
}
