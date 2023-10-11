import java.util.Scanner;

public class TempCToF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tempC = 0.00;
        double tempF;
        boolean valid = false;

        System.out.println("Input the temperature in Celsius");
        do {
            if (scan.hasNextDouble()) {
                valid = true;
            }
            else {
                scan.nextLine();
                System.out.println("Please enter a valid input");
            }


        } while (valid == false);

        tempC = scan.nextDouble();
        tempF = tempC * 9 / 5 + 32;
        System.out.printf("%-7s %7.2f", "Degrees C:", tempC);
        System.out.printf("\n%-9s %7.2f", "Degrees F:", tempF);
    }
}