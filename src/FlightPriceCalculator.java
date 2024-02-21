import java.util.Scanner;

public class FlightPriceCalculator {
    public static void main(String[] args) {
        // Adding variables
        // Degiskenleri Ekledim

        int distance;
        int flight;
        int age;
        double price;
        double tax = 1.20;

        // Taking flight information from the user
        // To avoid a confusion I added scanner classes through variables
        // Kullanicidan ucusuna ait bilgileri aliyoruz
        // Kafa karisikligi olmamasi icin scanner siniflarini degiskenlere gore belirledim

        System.out.println("Please Enter The Distance To Be Traveled In KM : ");
        Scanner dist = new Scanner(System.in);
        distance = dist.nextInt();

        System.out.println("Please Enter Your Age : ");
        Scanner ages = new Scanner(System.in);
        age = ages.nextInt();

        System.out.println("Please Enter Your Flight Type : ");
        Scanner type = new Scanner(System.in);
        flight = type.nextInt();

        price = (distance * 0.95) * tax;

        // I am using switch case construct because it seems much easy to me
        // If you want to use if else construct it is similar to switch case
        // Switch case yapisi bana daha kolay geldigi icin bunu kullandim
        // If else yapisi da kullanilabilir hemen hemen benzerler zaten intellij otomatik uyari veriyor
        // Flight Type 1 = One Way 2 = Round Trip selection
        // Ucus Tipi 1 = Tek Yon  = Gidis-Donus secimi

        switch (flight) {

            case 1:
                if (age >= 0 && age <= 7) {
                    System.out.println("Fee : " + (price * 0.6) + " Euro ");
                } else if (age >= 18 && age <= 24) {
                    System.out.println("Fee : " + (price * 0.9) + " Euro ");
                } else if (age >= 65) {
                    System.out.println("Fee : " + (price * 0.8) + " Euro ");
                } else if (age < 0 || distance < 0) {
                    System.out.println("Distance And Age Cannot Be Below Zero You Asamoah");
                } else {
                    System.out.println(" Fee " + price + " Euro");
                }
                break;

            case 2:
                if (age >= 0 && age <= 7) {
                    System.out.println(" Fee " + (price * 0.6 * 2) + " Euro ");
                } else if (age >= 18 && age <= 24) {
                    System.out.println(" Fee " + (price * 0.9 * 2) + " Euro ");
                } else if (age >= 65) {
                    System.out.println(" Fee " + (price * 0.8 * 2) + " Euro ");
                } else if (age < 0 || distance < 0) {
                    System.out.println("Distance And Age Cannot Be Below Zero You Schweinsteiger");
                } else {
                    System.out.println(" Fee " + (price * 2) + " Euro ");
                }
                break;
        }
    }
}
