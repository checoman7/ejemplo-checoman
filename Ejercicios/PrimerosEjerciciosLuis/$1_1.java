package PrimerosEjerciciosLuis; 

// 1) Declara dos variables num�ricas (con el valor que desees), muestra por consola la suma, resta, multiplicaci�n, divisi�n y m�dulo (resto de la divisi�n).

import java.util.InputMismatchException;
import java.util.Scanner;

public class $1_1 { 

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1 = 1, num2 = 1;
		boolean cualFueElError = false;
		
		try {
			
			System.out.println("Introduce n�mero 1");
			num1 = entrada.nextInt();
			
			cualFueElError = true; // Para indicar si es que se introdujo un valor incorrecto en el primer o en el segundo n�mero
			
			System.out.println("Introduce n�mero 2");
			num2 = entrada.nextInt();
			
		} catch (InputMismatchException e) { // Cuando se introduce un valor diferente de un n�mero entrar� aqu�
			
			if(cualFueElError) {
				System.out.println("Solo debe introducir n�meros enteros, se tomar� el segundo n�mero como 1");
			} else {
				System.out.println("Solo debe introducir n�meros enteros, se tomar�n ambos n�meros como 1");
			}
			
		}
		
		entrada.close();
		
		System.out.println("La suma de estos n�meros es: " + (num1 + num2));
		
		System.out.println("La resta de estos n�meros es: " + (num1 - num2));
		
		System.out.println("La multiplicaci�n de estos n�meros es: " + (num1 * num2));
		
		if(num2 == 0) {
			
			System.out.println("La divisi�n de estos n�meros es: " + 0);
			
			System.out.println("El m�dulo de estos n�meros es: " + 0);
			
		} else {
			
			System.out.println("La divisi�n de estos n�meros es: " + (num1 / num2));
			
			System.out.println("El m�dulo de estos n�meros es: " + (num1 % num2));
			
		}

	}

}
