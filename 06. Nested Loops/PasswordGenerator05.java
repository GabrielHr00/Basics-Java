import java.util.Scanner;

public class PasswordGenerator05 {
    public static void main(String[] argvs) {
    Scanner scan = new Scanner(System.in);

    int n = Integer.parseInt(scan.nextLine());
    int l = Integer.parseInt(scan.nextLine());

    for(int i = 1; i < n;i++) {
        for(int j=1; j <= n; j++) {
            for(int a = 97; a < 97+l; a++) {
                char sym = (char) a;
                for(int m = 97; m < 97+l; m++) {
                    char sym1 = (char) m;
                    for(int s = 1; s <= n;s++) {
                        if(s > i && s > j) {
                            System.out.printf("%d%d%c%c%d ",i,j,a,m,s);
                        }
                    }
                }
            }
        }
    }
    }
}
