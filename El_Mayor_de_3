package Estructura_de_control_selectiva;

import java.util.Scanner;

public class El_Mayor_de_3 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		
		Scanner teclado = new Scanner(System.in );
				
			System.out.println("Introduzca el 1º Número:");
			num1=teclado.nextInt();
			
			System.out.println("Introduzca el 2º Número:");
			num2=teclado.nextInt();
			
			System.out.println("Introduzca el 3º Número:");
			num3=teclado.nextInt();
			
		if(num1>num2 && num1>num3) {
			System.out.println("El mayor es "+num1); // número 1
		} else if (num2>num1 && num2>num3) {
			System.out.println("El mayor es "+num2); // número 2
		} else if(num3>num2 && num3>num1) {
			System.out.println("El mayor es "+num3); // número 3
		} else if(num1==num3 && num1> num2) {
			System.out.println("El mayor es "+num1); // números 1 y 3 iguales
		} else if(num1==num2 && num1> num3) {
			System.out.println("El mayor es "+num1);// números 1 y 2 iguales
		} else if(num3==num2 && num3> num1) {
			System.out.println("El mayor es "+num3); // números 2 y 3 iguales
		} else {
			System.out.println("Todos los numeros son iguales.");
		}
		
		
	}

}
