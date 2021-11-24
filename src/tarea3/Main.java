package tarea3;

public class Main {

	public static void main(String[] args) {
		//set up para los runnables
		sumador suma = new sumador();
		decodificador decypher = new decodificador();

		//set up de threads
		buscador tarea1 = new buscador();
		Thread tarea2 = new Thread(suma);
		Thread tarea3 = new Thread(decypher);
		
		tarea1.start();
		tarea2.start();
		tarea3.start();
	}

}
