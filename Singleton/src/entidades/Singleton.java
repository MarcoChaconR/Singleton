package entidades;

public class Singleton {
	private String nombre;
	private static Singleton instancia;

	private Singleton() {
		super();
	}

	public static Singleton getInstancia() {
		if (instancia == null) {
			instancia = new Singleton();
		}
		return instancia;
	}

	public static void cerrarInstancia() {
		instancia = null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
