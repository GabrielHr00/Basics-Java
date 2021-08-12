import java.util.Scanner;

public class ExamPreparation_02_EX {
    public static void main(String[] argvs) {

        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());
        int counter = 0;
        boolean found = true;
        int tasks = 0;
        double sum = 0.0;
        String last = "";

        while(counter < count) {
            String name = scan.nextLine();
            if(name.equals("Enough")) {found = false; break;}
            int grade = Integer.parseInt(scan.nextLine());
            if(grade <= 4) {++counter;}

            ++tasks;
            sum += grade;
            last = name;

        }

        if(found == false) {
            System.out.printf("Average score: %.2f%n", sum*1.0/tasks);
            System.out.printf("Number of problems: %d%n", tasks);
            System.out.printf("Last problem: %s",last);}
        else {System.out.printf("You need a break, %d poor grades.",counter);}

    }
}
