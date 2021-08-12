import java.util.Scanner;

public class FruitorVegetable_09 {
    public static void main(String[] argvs) {
        Scanner scan = new Scanner(System.in);

        String fruitOrVeg = scan.nextLine();

        if(fruitOrVeg.equals("banana") || fruitOrVeg.equals("apple") || fruitOrVeg.equals("kiwi") || fruitOrVeg.equals("cherry") || fruitOrVeg.equals("lemon") || fruitOrVeg.equals("grapes")) {
            System.out.println("fruit");
        }
        else if(fruitOrVeg.equals("tomato") || fruitOrVeg.equals("cucumber") || fruitOrVeg.equals("pepper") || fruitOrVeg.equals("carrot")) {
            System.out.println("vegetable");
        }
        else {System.out.println("unknown");}

    }
}
