import java.util.Scanner;

public class TrainTheTrainers04 {
        public static void main(String[] argvs) {
            Scanner scan = new Scanner(System.in);

            int present = Integer.parseInt(scan.nextLine());
            String name = scan.nextLine();
            int counter = 0;

            double sum2 = 0;

            while(!name.equals("Finish")) {
                String pres = name;
                counter++;
                double sum1 = 0.0;
                for(int i = 1; i <= present; i++) {
                    double gr = Double.parseDouble(scan.nextLine());
                    sum1 += gr;
                }
                sum2 += sum1/present;
                System.out.printf("%s - %.2f.%n",pres,sum1/present);
                name = scan.nextLine();

            }
            System.out.printf("Student's final assessment is %.2f.", sum2/counter);
        }
}
