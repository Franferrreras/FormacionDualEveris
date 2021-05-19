package personas;

import enums.Gender;
import enums.Level;

/**
 * Clase Jugadores
 * 
 * @author fferrera
 * @version 19/05/2021
 */
public class Players extends Persona implements Comparable<Players> {

	private Level level;
	private int points;

	/**
	 * Constructor por defecto
	 * 
	 * @param dni
	 * @param name
	 * @param age
	 * @param gender
	 * @param level
	 */
	public Players(String dni, String name, int age, Gender gender, Level level) {
		super(dni, name, age, gender);
		this.level = level;
		this.points = 0;
	}

	/**
	 * Segundo constructor
	 * 
	 * @param dni
	 * @param name
	 * @param age
	 * @param gender
	 */
	public Players(String dni, String name, int age, Gender gender) {
		super(dni, name, age, gender);
		this.level = Level.PROFESIONAL;
		this.points = 0;
	}

	/**
	 * @return the level
	 */
	public Level getLevel(String dni, String name, byte age, Gender gender) {
		return level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(Level level) {
		this.level = level;
	}

	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * @param points
	 *            the points to set
	 */
	public void setPoints(int points) {
		this.points = points;
	}

	/**
	 * Definición de ordenación de mayor a menor
	 */
	@Override
	public int compareTo(Players o) {
		// TODO Auto-generated method stub
		return o.points - this.points;
	}

	/**
	 * Impre por pantalla los atributos de players
	 */
	@Override
	public String toString() {
		return  "Name : " + getName() + ", level : " + level + ", Dni : " + getDni()
		        + ", Age : " + getAge() 
		        + super.toString()+"\n";
	}
	
	

}
