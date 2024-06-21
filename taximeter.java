import java.util.Scanner;

public class taximeter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your Kilometer:");
        double km = scan.nextDouble();
        double perKmPrice = 2.20;
        double openingPrice = 10.00;
        int sortDistancePrice = 20;

        double total = (perKmPrice * km) + (openingPrice);

        if (km < sortDistancePrice) {
            
            total = sortDistancePrice;

            System.out.println("Sort Distance Price:" + total + " Turkish Lira");

        } else {
            
            System.out.println("Long Distance Price:" + total + " Turkish Lira");

        }

       

    }
}
