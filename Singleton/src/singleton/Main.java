package singleton;

import entidades.Singleton;

public class Main {

	public static void main(String[] args) {
		Singleton instanciaUno = Singleton.getInstancia();
		instanciaUno.setNombre("hola Mundo");

		Singleton instanciaDos = Singleton.getInstancia();

		System.out.println(instanciaUno + " el nombre es " + instanciaUno.getNombre());
		System.out.println(instanciaDos + " el nombre es " + instanciaDos.getNombre());
	}

}
