package tarea3;

public class Main {

	public static void main(String[] args) throws InterruptedException{
		Buscador tarea1 = new Buscador();
		Sumador tarea2 = new Sumador();
		Decodificador tarea3 = new Decodificador();
		
		tarea1.start();
		tarea2.start();
		tarea3.start();

		while(tarea1.isAlive() == true || tarea2.isAlive() == true || tarea3.isAlive() == true){
			//Aqui no pasa nada, solo se espera a que terminen los threads
		}

		System.out.println("Tiempo de Ejecucion de Buscador: " + tarea1.getRuntime());
		System.out.println("Tiempo de Ejecucion de Sumador: " + tarea2.getRuntime());
		System.out.println("Tiempo de Ejecucion de Decodificador: " + tarea3.getRuntime());
	}

}
