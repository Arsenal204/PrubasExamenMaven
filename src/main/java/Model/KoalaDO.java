package Model;


public class KoalaDO {
	private int idKoala;
	private String nombre;
	private String nickGuerra;
	private int edad;
	private String color;
	private int fuerza;
	private int inteligencia;
	private int horasSueno;
	private int tiempoBerserk;
	private int idAvestruz;
	private int idCarritoGolf;

	public KoalaDO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KoalaDO(int idKoala, String nombre, String nickGuerra, int edad, String color, int fuerza, int inteligencia,
			int horasSueno, int tiempoBerserk, int idAvestruz, int idCarritoGolf) {
		super();
		this.idKoala = idKoala;
		this.nombre = nombre;
		this.nickGuerra = nickGuerra;
		this.edad = edad;
		this.color = color;
		this.fuerza = fuerza;
		this.inteligencia = inteligencia;
		this.horasSueno = horasSueno;
		this.tiempoBerserk = tiempoBerserk;
		this.idAvestruz = idAvestruz;
		this.idCarritoGolf = idCarritoGolf;
	}

	/**
	 * @return the idKoala
	 */
	public int getIdKoala() {
		return idKoala;
	}

	/**
	 * @param idKoala the idKoala to set
	 */
	public void setIdKoala(int idKoala) {
		this.idKoala = idKoala;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the nickGuerra
	 */
	public String getNickGuerra() {
		return nickGuerra;
	}

	/**
	 * @param nickGuerra the nickGuerra to set
	 */
	public void setNickGuerra(String nickGuerra) {
		this.nickGuerra = nickGuerra;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the fuerza
	 */
	public int getFuerza() {
		return fuerza;
	}

	/**
	 * @param fuerza the fuerza to set
	 */
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	/**
	 * @return the inteligencia
	 */
	public int getInteligencia() {
		return inteligencia;
	}

	/**
	 * @param inteligencia the inteligencia to set
	 */
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	/**
	 * @return the horasSueno
	 */
	public int getHorasSueno() {
		return horasSueno;
	}

	/**
	 * @param horasSueno the horasSueno to set
	 */
	public void setHorasSueno(int horasSueno) {
		this.horasSueno = horasSueno;
	}

	/**
	 * @return the tiempoBerserk
	 */
	public int getTiempoBerserk() {
		return tiempoBerserk;
	}

	/**
	 * @param tiempoBerserk the tiempoBerserk to set
	 */
	public void setTiempoBerserk(int tiempoBerserk) {
		this.tiempoBerserk = tiempoBerserk;
	}

	public int getIdAvestruz() {
		return idAvestruz;
	}

	public void setIdAvestruz(int idAvestruz) {
		this.idAvestruz = idAvestruz;
	}

	public int getIdCarritoGolf() {
		return idCarritoGolf;
	}

	public void setIdCarritoGolf(int idCarritoGolf) {
		this.idCarritoGolf = idCarritoGolf;
	}

	@Override
	public String toString() {
		return "KoalaDO [idKoala=" + idKoala + ", nombre=" + nombre + ", nickGuerra=" + nickGuerra + ", edad=" + edad
				+ ", color=" + color + ", fuerza=" + fuerza + ", inteligencia=" + inteligencia + ", horasSueno="
				+ horasSueno + ", tiempoBerserk=" + tiempoBerserk + ", idAvestruz=" + idAvestruz + ", idCarritoGolf="
				+ idCarritoGolf + "]";
	}

	
}
