package torneo;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import operators.Pinball;
import personas.Players;

/**
 * Clase guarda métodos
 * 
 * @author fferrera
 *
 */
public class Metodos {

	final static Logger LOGGER = LoggerFactory.getLogger(Metodos.class);

	/**
	 * Método mustra jugadores y puntuación por ronda
	 * 
	 * @param list_players
	 */
	public static void showRoundPlayers(ArrayList<Players> list_players) {
		LOGGER.info("Inicio del método");
		for (int i = 0; i < list_players.size(); i++) {
			System.out.println("Nombre: " + list_players.get(i).getName() + "    | puntuación: " + list_players.get(i).getPoints());

			LOGGER.debug("Iteración mostrar historial: {}", list_players.get(i));

		}
	}

	/**
	 * Método que da puntos a los jugadores de manera aleatoria
	 * 
	 * @param list
	 */
	public static void playRound(ArrayList<Players> list) {
		LOGGER.info("Inicio del método");
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setPoints(Pinball.launchBall());

			LOGGER.debug("Iteración jugar ronda: {}", list.get(i));
		}
	}

}
