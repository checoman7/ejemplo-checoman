package PrimerosEjerciciosLuis;

//5) Haz una aplicaci�n que calcule el �rea de un c�rculo(pi*R2).

import java.util.Scanner;

public class $1_5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el radio del c�rculo");
		
		int radio = entrada.nextInt();
		
		entrada.close();
		
		System.out.println("El area de un c�rculo de radio " + radio + " es: " + (Math.PI * Math.pow(radio, 2)) + ".");

	}

}
