package torneo;

import java.util.ArrayList;
import java.util.Comparator;

import enums.Gender;
import operators.Pinball;
import personas.Players;

/**
 * Clase Torneo
 * 
 * @author fferrera
 *
 */
public class TorenoEveris {
	/**
	 * Atributos
	 */
	public static String nameString = "EverisMasterTour";
	private String localizacion = "Empresa Everis";
	private ArrayList<Players> playerList = new ArrayList<Players>();

	/**
	 * @return the playerList
	 */
	public ArrayList<Players> getPlayerList() {
		return playerList;
	}

	/**
	 * Método que a�ade jugadores al toreno
	 * 
	 * @param player
	 */
	public void addPlayer(Players player) {
		// Comprobación que el número participantes no eccede el límite
		if (playerList != null) {
			if (playerList.size() < 10) {
				// Comprobación que no hay ningún jugador ya registrado
				if (playerList.contains(player)) {
					System.out.println("El jugador ya se encuntra registrado");

				} else {
					playerList.add(player);
				}

			} else {
				System.out.println("Número máximo de jugadores alcanzado");
			}
		}

	}

	/**
	 * Muestra historial de todo el torneo
	 */
	public void showhistorial() {

		if (playerList.size() < 7) {
			System.out.println("No hay suficiente jugadores para empezar el torneo");
			
		} else {
			System.out.println("_______________Empieza el torneo !!!!!!!!!!!!___________________");
			// Array almacena todos los jugadores
			ArrayList<Players> firstRound = (ArrayList<Players>) playerList.clone();

			// Array almacena los jugadores que avanzan a la segunda ronda
			ArrayList<Players> secondRound = new ArrayList<Players>();

			// Array almacena los jugadores finalistas
			ArrayList<Players> finalRund = new ArrayList<Players>();

			// jugadores juegan primera ronda
			Metodos.playRound(playerList);

			System.out.println("___________________RONDA 1___________________________");
			System.out.println("Lista de jugadores y puntuación");

			// Mostra jugadores de la primer ronda y la puntuaci�n obtenida
			Metodos.showRoundPlayers(firstRound);

			// Ordenar jugadores de mayor a menor para que sea facil pasar los mejores de la rodna a la seguiente
			firstRound.sort(null);

			// Añade los cuatro mejores jugadores a la lista de cuatro mejores
			for (int i = 0; i < 4; i++) {
				secondRound.add(firstRound.get(i));
			}

			// Jugadores juegan ronda
			Metodos.playRound(secondRound);

			System.out.println("");
			System.out.println("___________________RONDA 2___________________________");
			System.out.println("Lista de jugadores y puntuación de la segunda ronda");

			// Muestrar jugadores de la segunda ronda y la puntuación
			Metodos.showRoundPlayers(secondRound);

			// Ordenar jugadores de mayor a menor puntuación
			secondRound.sort(null);

			// Bucle en el que se pasa los jugadores de la segunda ronda a la última ronda
			for (int i = 0; i < 2; i++) {
				finalRund.add(secondRound.get(i));
			}

			// Jugadores juegan la ronda final
			Metodos.playRound(finalRund);

			System.out.println("");
			System.out.println("___________________Final Rund___________________________");

			// Muestra juegadores y la puntuación obtenida
			Metodos.showRoundPlayers(finalRund);

			// Muestra ganador del torneo
			if (finalRund.get(0).getPoints() > finalRund.get(1).getPoints()) {
				System.out.println("_______________________________________________________");
				System.out.println("!!!!!!!!!!!!!!!!El ganador del toreno es " + finalRund.get(0).getName() + "!!!!!!!!!!!!!!!!!!!!");
			} else {
				System.out.println("_______________________________________________________");
				System.out.println("!!!!!!!!!!!!!!!!El ganador del toreno es " + finalRund.get(1).getName() + "!!!!!!!!!!!!!!!!!!!!");
			}
		}
	}

	/**
	 * Mustra los participantes por género y la cantidad de estos
	 */
	public void filterNumHombresMujeres() {
		// Lista hombres
		ArrayList<Players> list_hombre = new ArrayList<Players>();

		// lista mujeres
		ArrayList<Players> list_Mujer = new ArrayList<Players>();

		// Contadores de hombres y mujeres
		int countH = 0;
		int countM = 0;

		// Bucle añade a cada hombre y mujer a la lista correspondiente
		for (int i = 0; i < playerList.size(); i++) {
			if (playerList.get(i).getGender() == Gender.HOMBRE) {
				list_hombre.add(playerList.get(i));
				countH++;
			} else if (playerList.get(i).getGender() == Gender.MUJER) {
				list_Mujer.add(playerList.get(i));
				countM++;
			}
		}

		// mostrar por pantalla la información
		System.out.println("\n Lista de hombres que participan en el torneo");
		System.out.println(list_hombre.toString());
		System.out.println("\n hay " + countH);
		System.out.println("\n Lista de mujeres que participan en el torneo");
		System.out.println(list_Mujer.toString());
		System.out.println("\n Hay " + countM + " mujeres en total");
	}
	
	/**
	 * Método que muestra todos los jugadores del torneo
	 */
	public void showAllPlayers() {
		System.out.println(playerList);
	}
	/**
	 * @return the nameString
	 */
	public static String getNameString() {
		return nameString;
	}

	/**
	 * @param nameString
	 *            the nameString to set
	 */
	public static void setNameString(String nameString) {
		TorenoEveris.nameString = nameString;
	}

	/**
	 * @return the localizacion
	 */
	public String getLocalizacion() {
		return localizacion;
	}

	/**
	 * @param localizacion
	 *            the localizacion to set
	 */
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	/**
	 * @param playerList
	 *            the playerList to set
	 */
	public void setPlayerList(ArrayList<Players> playerList) {
		this.playerList = playerList;
	}

}
