import java.util.Scanner;

public class HotelRoom_07_EX {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());
        double apart = 0.0;
        double studio = 0.0;


        switch(month) {
            case "May":
            case "October":
                if(nights > 7 && nights < 14) {
                    studio = 50.0*nights;
                    apart = 65.0*nights;
                    studio = 0.95*studio;
                }
                else if(nights > 14) {
                    studio = 50.0*nights;
                    apart = 65.0*nights;
                    studio = 0.70*studio;
                    apart = 0.90*apart;
                }
                else {
                    studio = 50.0*nights;
                    apart = 65.0*nights;
                }
                break;
            case "June":
            case "September":
                if(nights > 14) {
                    studio = 75.20*nights;
                    apart = 68.70*nights;
                    studio = 0.80*studio;
                    apart = 0.90*apart;
                }
                else {
                    studio = 75.20*nights;
                    apart = 68.70*nights;
                }
                break;
            case "July":
            case "August":
                if(nights > 14) {
                    studio = 76.0*nights;
                    apart = 77.0*nights;
                    apart = 0.90*apart;
                }
                else {
                    studio = 76.0*nights;
                    apart = 77.0*nights;
                }
                break;
        }

        System.out.printf("Apartment: %.2f lv.%n",apart);
        System.out.printf("Studio: %.2f lv.",studio);

    }
}
