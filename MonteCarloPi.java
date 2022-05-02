import java.lang.Math;

public class MonteCarloPi {
	// main-Methode
	public static void main(String[] args) {
		double inSquare = 0.0; //iteration
		double inCircle = 0.0;
		double approxPi = 0.0;
		int counter = 0;
		
		// Absolutbetrag Differenz von appoxPi und Math.Pi
		while((Math.abs (approxPi - Math.PI)) > 0.00001) {
			
			//random Koordinaten
			double x = Math.random();
			double y = Math.random();
			
			// beide um 1 erhöhen
			inSquare++;
			counter++;
			
			//Prüfung ob Punkt innerhalb de Kreises
			double condition = Math.sqrt(Math.pow(x, 2) + Math.pow(y,  2));
			if (condition <= 1) {
				inCircle++;
			}
			approxPi = (inCircle / inSquare) * 4;
		}
		System.out.printf("Iteration %s: %s %n", counter, approxPi);
		
}
}

