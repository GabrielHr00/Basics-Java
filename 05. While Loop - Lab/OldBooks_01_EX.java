import java.util.Scanner;

public class OldBooks_01_EX{
    public static void main(String[] argvs) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int count = 0;
        boolean found = false;
        String input = scan.nextLine();

        while(!input.equals("No More Books") ) {
            if(input.equals(name)) {found = true; break;}
            count++;
            input = scan.nextLine();
        }

        if(found) {System.out.printf("You checked %d books and found it.",count);}
        else {System.out.printf("The book you search is not here!%nYou checked %d books.",count);}

    }
}
