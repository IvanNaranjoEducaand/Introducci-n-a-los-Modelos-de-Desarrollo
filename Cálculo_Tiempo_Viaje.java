package Estrucutura_de_control_secuencial;

import java.util.Scanner;

public class Cálculo_Tiempo_Viaje {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int  distancia;
		int  velocidad;
		float horas;
		
		System.out.println("Escriba la distancia que se quiere recorrer(km):");
		distancia = scanner.nextInt();
		
		System.out.println("Escriba la velocidad promedio del viaje(km/h):");
		velocidad = scanner.nextInt();
		
		horas =(float) distancia/velocidad;
		System.out.println("El viaje durará "+horas+" horas.");
	}
}
