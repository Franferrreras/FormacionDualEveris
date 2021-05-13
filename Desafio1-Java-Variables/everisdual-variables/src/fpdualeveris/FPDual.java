package fpdualeveris;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import variables.Developer;

/**
 * Desafio1-Java
 * @author fferrera
 *
 */
public class FPDual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Nombre de la empresa " + Developer.COMPANY);
		variablesChallenge();
	}

	private static void variablesChallenge() {
		Scanner sc = new Scanner(System.in);
		// Array list que almacena los empleados que se van registrando
		List<Developer> listEmployees = new ArrayList<Developer>();

		// Bucle crea 4 nuevos developers
		for (int i = 0; i < 4; i++) {
			if (Developer.MAXEMPLOYEES <= 127) {
				System.out.println("Introduzca el nombre del empleado");
				String nameEmploye = sc.nextLine();

				Developer dvloper = new Developer(nameEmploye);

				listEmployees.add(dvloper);

			} else {
				System.out.println("No hay más vacantes");
			}
		}
		//Muestra por pantalla la información de los trabajadores
		for (int i = 0; i < listEmployees.size(); i++) {
			System.out.println(
			        "El número de total de empleados que se muestra en " + listEmployees.get(i).getName() + " es " + listEmployees.get(i).getNum_eployes());
			System.out.println("El id de empleado de " + listEmployees.get(i).getName() + " es " + listEmployees.get(i).getIdEploployees());
			System.out.println(listEmployees.get(i).getName() + " tiene " + listEmployees.get(i).getHolidays() + " de vacaciones");

		}
		//Restar 2 días las vacaciones del empleado 2 y mostrar por pantalla
		listEmployees.get(1).setHolidays(10);
		System.out.println(listEmployees.get(1).getName() + " ahora tiene " + listEmployees.get(1).getHolidays() + " de vacaciones");

	}
}
