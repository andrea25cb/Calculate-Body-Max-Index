package trabajos_programacion_def;

import java.util.Scanner;

public class Body_mass_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//peso/altura al cuadrado = IMC
		
		
	Scanner teclado = new Scanner (System.in);	
		
		System.out.println("Introduce tu peso en kg: ");
		double peso = teclado.nextDouble();
		
		System.out.println("Introduce tu altura en m: ");
		double altura = teclado.nextDouble();
		
		double IMC;
		
		IMC = peso / Math.pow(altura, 2);
		
		if (IMC < 18.5) 
			System.out.println("You are underweight");
			else
			if (IMC <25.0) 
			System.out.println("Your IMC is normal");
				else
					if (IMC <30.0)
					System.out.println("You are overweight");
					else
						if (IMC >30.0)
						System.out.println("You are obese");
		
	}}

