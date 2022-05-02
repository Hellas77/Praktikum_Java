import java.util.Scanner;

public class rFaktor2 {

    public static void main(String[] args) {

        System.out.printf("java RFactor ");


        Scanner scan = new Scanner(System.in);

        String numbers[] = new String[10];

        numbers[0] = scan.next();
        numbers[1] = scan.next();
        numbers[2] = scan.next();

        scan.close();

        double infected = Double.parseDouble(numbers[0]);
        double rFactor = Double.parseDouble(numbers[1]);
        int iterations = Integer.parseInt(numbers[2]);
        
        System.out.printf("Initial: %.6f %n", infected);



    	for(int i = 1;  i <= iterations; i++) { // For-Schleife um die Zahl der Infizierte hochzurechnen
    		infected = infected * rFactor;		
    			System.out.printf("Iteration %s: %.6f %n" , i, infected); // Iterationsausgeben
    			iterations--;
    		
        }
    	


    }

}

