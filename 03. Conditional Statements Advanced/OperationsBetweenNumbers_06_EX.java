import java.util.Scanner;

public class OperationsBetweenNumbers_06_EX {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        String op = scan.nextLine();
        double result = 0.0;

        if(op.equals("+")) {
            if((n1+n2) % 2 == 0) {System.out.println(n1 + " + " + n2 + " = " + (n1+n2) + " - even");}
            else {System.out.println(n1 + " + " + n2 + " = " + (n1+n2) + " - odd");}
        }
        else if(op.equals("-")) {
            if((n1-n2) % 2 == 0) {System.out.println(n1 + " - " + n2 + " = " + (n1-n2) + " - even");}
            else {System.out.println(n1 + " - " + n2 + " = " + (n1-n2) + " - odd");}
        }
        else if(op.equals("*")) {
            if((n1*n2) % 2 == 0) {System.out.println(n1 + " * " + n2 + " = " + (n1*n2) + " - even");}
            else {System.out.println(n1 + " * " + n2 + " = " + (n1*n2) + " - odd");}
        }
        else if(op.equals("/")) {
            result = 1.0*n1/n2;
            if(n2 == 0) {System.out.println("Cannot divide " + n1 + " by zero");}
            else {System.out.print(n1 + " / " + n2 + " = ");
                System.out.printf("%.2f",result);}
        }
        else if(op.equals("%")) {
            result = 1.0*n1%n2;
            if(n2 == 0) {System.out.println("Cannot divide " + n1 + " by zero");}
            else {System.out.print(n1 + " % " + n2 + " = ");
                System.out.printf("%.0f",result);}
        }

    }
}
