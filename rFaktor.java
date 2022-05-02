
public class rFaktor {

	public static void main(String[] args) {
		
		double infected = 100; // Anzahl der infizierten Personen
		double rFactor = 1.1; //
		int iterations = 10; // Anzahl der Iterationen
		System.out.printf("Initial: %.6f %n",infected); // Initialwert ausgeben
		
	// For-Schleife um die Zahl der Infizierte hochzurechnen
		
	for(int i = 1;  i <= iterations; i++) {
		infected = infected * rFactor;		
			System.out.printf("Iteration %s: %.6f %n" , i, infected); // Iterationsausgeben
	}
	}
	

}

