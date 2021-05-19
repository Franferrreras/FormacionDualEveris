package operators;

public class Pinball {
/**
 * M�todo lanzar bola
 * @return Retorna los puntos que obtienen los jugadores por ronda
 */
	public static int launchBall() {
		//Generar número aleatorio
		int numAleatorio = (int) (Math.random() * 100) + 1;

		return numAleatorio;
	}
}
