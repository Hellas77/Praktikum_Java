import java.util.Scanner;

public class rFaktor3 {
    public static void main(String[] args) {


        System.out.printf("java rFactor ");

        Scanner scan = new Scanner(System.in);

        String[] numbers = new String[10];

        // Einlesen der Zahlen
        numbers[0] = scan.next();
        numbers[1] = scan.next();
        numbers[2] = scan.next();

        scan.close();

        double infected = Double.parseDouble(numbers[0]);
        double rFactor = Double.parseDouble(numbers[1]);
        int iterations = Integer.parseInt(numbers[2]);
        

        if (infected < 0.0) {
            System.out.println("Amount of infected people cannot be negative!");
            return;
        }

        if (iterations < 0.0) {
            System.out.println("Number of iterations cannot be negative!");
            return;
        }

    	for(int i = 1;  i <= iterations; i++) { // For-Schleife um die Zahl der Infizierte hochzurechnen
    		infected = infected * rFactor;		
    			System.out.printf("Iteration %s: %.6f %n" , i, infected); // Iterationsausgeben
            if (infected < 0.1 ) {
                System.out.println("The pandemic is over!");
                return;
            }
        }
    }
}
