import java.util.Scanner;

public class taximeter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your Kilometer:");
        double km = scan.nextDouble();
        double taximeter = 2.20;
        double openingPrice = 10.00;
        int sortDistance = 20;

        double total = (taximeter * km) + (openingPrice);

        if (km < sortDistance) {
            
            total = sortDistance;

            System.out.println("Sort Distance Price:" + total + " Turkish Lira");

        } else {
            
            System.out.println("Long Distance Price:" + total + " Turkish Lira");

        }

       

    }
}
