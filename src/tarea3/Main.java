package tarea3;

public class Main {

	public static void main(String[] args) {
		//set up para los runnables
		tarea3.Sumador suma = new Sumador();
		tarea3.Decodificador decypher = new Decodificador();

		//set up de threads
		tarea3.Buscador tarea1 = new Buscador();
		Thread tarea2 = new Thread(suma);
		Thread tarea3 = new Thread(decypher);
		
		tarea1.start();
		tarea2.start();
		tarea3.start();
	}

}
