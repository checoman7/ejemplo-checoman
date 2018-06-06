package PrimerosEjerciciosLuis; 

// 2) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Mostrar los valores para comprobar que funciona.

import java.util.InputMismatchException;
import java.util.Scanner;

public class $1_2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1 = 0, num2 = 0;
		boolean cualFueElError = false;
		
		try {
			
			System.out.println("Introduce número 1");
			num1 = entrada.nextInt();
			
			cualFueElError = true; // Para indicar si es que se introdujo un valor incorrecto en el primer o en el segundo número
			
			System.out.println("Introduce número 2");
			num2 = entrada.nextInt();
			
		} catch (InputMismatchException e) { // Cuando se introduce un valor diferente de un número entrará aquí
			
			if(cualFueElError) {
				System.out.println("Solo debe introducir números enteros, se tomará el segundo número como 0");
			} else {
				System.out.println("Solo debe introducir números enteros, se tomarán ambos números como 0");
			}
			
		}
		
		entrada.close();
		
		if(num1 > num2) {
			System.out.println("El número mayor es " + num1 + " y el número menor es " + num2 + ".");
		} else if (num2 > num1) {
			System.out.println("El número mayor es " + num2 + " y el número menor es " + num1 + ".");
		} else {
			System.out.println("El número " + num1 + " y el número " + num2 + " son iguales.");
		}

	}

}
