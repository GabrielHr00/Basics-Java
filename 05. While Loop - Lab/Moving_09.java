import java.util.Scanner;

public class Moving_09 {
    public static void main(String[] argvs) {

        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int hight = Integer.parseInt(scan.nextLine());

        int vol = width*length*hight;

        while(vol > 0) {
            String qub = scan.nextLine();
            if(qub.equals("Done")) {break;}
            int boxes = Integer.parseInt(qub);
            vol = vol - boxes;
        }

        if(vol >= 0) {
            System.out.println(vol + " Cubic meters left.");
        }
        else {
            System.out.println("No more free space! You need " + Math.abs(vol) + " Cubic meters more.");
        }
    }
}
