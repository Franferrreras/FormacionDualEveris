package variables;

import javax.sound.midi.Soundbank;
/**
 * Clase de Developers
 * @author fferrera
 *
 */
public class Developer {
	// Atributos de la clase
	private static int count = 0;
	public static final String COMPANY = "EVERIS";
	public static final byte MAXEMPLOYEES = 127;
	private static int num_eployes = 0;
	private int idEploployees;
	private String name;
	private int holidays;

	// Constructor de la clase
	public Developer(String name) {
		this.name = name;
		this.holidays = 21;
		this.num_eployes++;
		this.idEploployees = ++count;
	}

	/**
	 * @return the num_eployes
	 */
	public static int getNum_eployes() {
		return num_eployes;
	}

	/**
	 * @param num_eployes
	 *            the num_eployes to set
	 */
	public static void setNum_eployes(int num_eployes) {
		Developer.num_eployes = num_eployes;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the holidays
	 */
	public int getHolidays() {
		return holidays;
	}

	/**
	 * @param holidays
	 *            the holidays to set
	 */
	public void setHolidays(int holidays) {
		//Comprobación si la suma o resta de la vacaciones se encuentran en el rango requerido
		if (this.holidays + holidays >= 0 && this.holidays + holidays + holidays <= 21) {

			this.holidays = this.holidays + holidays;

		} else {
			System.out.println("No se ha podido modificar las vacaciones del empleado " + this.name);
		}
	}

	/**
	 * @return the idEploployees
	 */
	public int getIdEploployees() {
		return idEploployees;
	}

	/**
	 * @param idEploployees
	 *            the idEploployees to set
	 */
	public void setIdEploployees(int idEploployees) {
		this.idEploployees = idEploployees;
	}

	/**
	 * @return the cOMPANY
	 */
	public String getCOMPANY() {
		return COMPANY;
	}

	/**
	 * @return the nUMMAXEMPLOYEES
	 */
	public byte getMAXEMPLOYEES() {
		return MAXEMPLOYEES;
	}

	@Override
	public String toString() {
		return "Developer [COMPANY=" + COMPANY + ", NUMMAXEMPLOYEES=" + MAXEMPLOYEES + ", idEploployees=" + idEploployees + ", name=" + name + ", holidays="
		        + holidays + "]";
	}

}
