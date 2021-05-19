package personas;

import enums.Gender;
/**
 * Clase Persona
 * @author fferrera
 *	@version 19/05/2021
 */
public abstract class Persona {
	private String dni;
	private String name;
	private int age;
	private Gender gender;

	/**
	 * Constructor
	 * @param dni
	 * @param name
	 * @param age
	 * @param gender
	 */
	public Persona(String dni, String name, int age, Gender gender) {
		super();
		this.dni = dni;
		this.name = name;
		this.age =  (age < 14 || age > 100 )? 18 : age;
		this.gender = gender;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni
	 *            the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	/**
	 * Comprueba si dos objetos son iguales
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	/**
	 * Impre por pantalla los atributos de persona
	 */
	@Override
	public String toString() {
		return "Persona dni=" + dni + ", name=" + name + ", age=" + age + ", gender=" + gender ;
	}

	
}
