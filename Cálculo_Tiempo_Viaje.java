package Estrucutura_de_control_secuencial;

import java.util.Scanner;

public class Cálculo_Tiemoi_Viaje {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double distancia;
		double  velocidad;
		int  horas;
		int minutos;
		
		System.out.println("Escriba la distancia que se quiere recorrer(km):");
		distancia = scanner.nextDouble();
		
		System.out.println("Escriba la velocidad promedio del viaje(km/h):");
		velocidad = scanner.nextDouble();
		
		horas =(int)( distancia/velocidad);
		minutos =(int) (( distancia % velocidad));
		minutos = (int) (minutos / velocidad *60);
		System.out.println("El viaje durará "+horas+" horas y "+minutos+" minutos");
	}
}
