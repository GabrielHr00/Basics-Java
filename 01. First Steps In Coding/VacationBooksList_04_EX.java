import java.util.Scanner;

public class VacationBooksList_04_EX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pagesOfTheBook = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        int sum = (pagesOfTheBook/pagesPerHour)/days;

        System.out.println(sum);

    }
}
