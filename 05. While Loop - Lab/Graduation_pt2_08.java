import java.util.Scanner;

public class Graduation_pt2_08 {
    public static void main(String[] argvs) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        int counter = 0;
        int counter1 = 0;
        double sum = 0.0;

        while(counter1 < 12) {
            double grade = Double.parseDouble(scan.nextLine());
            if(grade < 4.00) {
                ++counter;
                if(counter == 2) {break;}
                continue;
            }
            ++counter1;
            sum += grade;
        }

        if(counter1 == 12) {System.out.printf("%s graduated. Average grade: %.2f", name,sum/counter1);}
        else {System.out.printf("%s has been excluded at %d grade",name,counter1+1);}

    }
}
