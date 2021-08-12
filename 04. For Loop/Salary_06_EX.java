import java.util.Scanner;

public class Salary_06_EX {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());

        for(int i = 0; i < count; i++) {
            String site = scan.nextLine();
            if(site.equals("Instagram")) {salary -= 100;}
            else if(site.equals("Facebook")) {salary -= 150;}
            else if(site.equals("Reddit")) {salary -= 50;}

            if(salary <= 0) {break;}
        }

        if(salary <= 0) {System.out.println("You have lost your salary.");}
        else {System.out.println(salary);}
    }
}
