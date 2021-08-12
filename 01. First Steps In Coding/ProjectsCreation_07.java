import java.util.Scanner;

public class ProjectsCreation_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        int c = Integer.parseInt(scan.nextLine());
        int b = c*3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", a,b,c);
    }
}
