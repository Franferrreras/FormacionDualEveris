package fpdualeverisMain;

import java.awt.Menu;
import java.util.Scanner;

import enums.Gender;
import enums.Level;
import operators.Pinball;
import personas.Players;
import torneo.TorenoEveris;

/**
 * 
 * @author fferrera
 * @version 19/05/2021
 */
public class FPDualMain {
	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		TorenoEveris torenoEveris = new TorenoEveris();

		int eleccion;

		System.out.println("Qúe desea hacer");
		menu2();

		eleccion = sc.nextInt();

		if (eleccion == 1) {
			System.out.println("Cuantos jugadores desea inscribir | 7-10");
			int num_player = sc.nextInt();

			if (num_player > 10 || num_player < 7) {
				System.out.println("No se admiten esa cantidad de jugadores");
			} else {
				//Registra jugadores
				for (int i = 0; i < num_player; i++) {

					sc.nextLine();
					System.out.println("Introduzca el DNI");
					String dni = sc.nextLine();

					System.out.println("Introduzca nombre del jugador");
					String name = sc.nextLine();

					System.out.println("Introduzca la edad del jugador");
					int age = sc.nextInt();

					sc.nextLine();
					System.out.println("Introduzca el género de los jugadores | Hombre, Mujer, Otros");
					String gender = sc.nextLine();

					System.out.println("Introduzca el nivel | Causal, Iniciado, Veterano, Profesional ");
					String level = sc.nextLine();

					Players newPlayer = new Players(dni, name, age, Gender.valueOf(gender.toUpperCase()), Level.valueOf(level.toUpperCase()));
					torenoEveris.addPlayer(newPlayer);
				}

				System.out.println("Todos los jugadores registrados");

				int election2 = 0;

				do {
					menu();
					election2 = sc.nextInt();

					switch (election2) {
					case 1:
						torenoEveris.showAllPlayers();
						break;

					case 2:
						torenoEveris.filterNumHombresMujeres();
						break;

					case 3:
						torenoEveris.showhistorial();
					}
				} while (election2 != 5);
			}

		} else if (eleccion == 2) {
			// participantes
			Players p1 = new Players("x2346234", "Juan", 18, Gender.HOMBRE);
			Players p2 = new Players("x2346235", "Marcial", 18, Gender.HOMBRE);
			Players p3 = new Players("x2346236", "Lorena", 18, Gender.MUJER);
			Players p4 = new Players("x2346237", "Jeremias", 18, Gender.HOMBRE);
			Players p5 = new Players("x2346238", "Carlos", 18, Gender.HOMBRE);
			Players p6 = new Players("x2346239", "Maria", 18, Gender.MUJER);
			Players p7 = new Players("x2346210", "Fernando", 18, Gender.HOMBRE);
			Players p8 = new Players("x2346231", "David", 18, Gender.HOMBRE);
			Players p9 = new Players("x2346232", "Marcos", 18, Gender.HOMBRE);
			Players p10 = new Players("x2346233", "Teresa", 18, Gender.MUJER);

			// Añadir participantes al torneo
			torenoEveris.addPlayer(p1);
			torenoEveris.addPlayer(p2);
			torenoEveris.addPlayer(p3);
			torenoEveris.addPlayer(p4);
			torenoEveris.addPlayer(p5);
			torenoEveris.addPlayer(p6);
			torenoEveris.addPlayer(p7);
			torenoEveris.addPlayer(p8);
			torenoEveris.addPlayer(p9);
			torenoEveris.addPlayer(p10);

			System.out.println("Jugadores registrados");

			int election2 = 0;
			do {
				menu();
				election2 = sc.nextInt();

				switch (election2) {
				case 1:
					torenoEveris.showAllPlayers();
					break;

				case 2:
					torenoEveris.filterNumHombresMujeres();
					break;

				case 3:
					torenoEveris.showhistorial();
				}
			} while (election2 != 4);

		}

		/*
		 * // Mostrar hisotorial del torneo torenoEveris.showhistorial();
		 * 
		 * // Muestra jugadores por sexo y cantidad de estos torenoEveris.filterNumHombresMujeres();
		 */
	}

	public static void menu() {
		System.out.println("_________Opciones_________");
		System.out.println("1.- Mostrar todos los jugadores");
		System.out.println("2.- Mostrar jugadores por género");
		System.out.println("3.- Mostrar historico del toreno");
		System.out.println("4.- Parar");
	}

	public static void menu2() {
		System.out.println("1.-Registrar jugadores manualmente");
		System.out.println("2.-Cargar jugadores ya determinados (RECOMENDADO)");
	}

}
