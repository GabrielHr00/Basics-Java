import java.util.Scanner;

public class ConcatenateData_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        String b = scan.nextLine();
        int c = Integer.parseInt(scan.nextLine());
        String town = scan.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.", a,b,c,town);
    }
}
