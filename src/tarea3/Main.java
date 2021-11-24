package tarea3;

public class Main {

	public static void main(String[] args) throws InterruptedException{
		tarea3.Buscador task1 = new Buscador();
		tarea3.Sumador task2 = new Sumador();
		tarea3.Decodificador task3 = new Decodificador();
		
		task1.start();
		task2.start();
		task3.start();

		while(task1.isAlive() == true || task2.isAlive() == true || task3.isAlive() == true){
			//Aqui no pasa nada, solo se espera a que terminen los threads
		}

		System.out.println("Tiempo de Ejecucion de Buscador: " + task1.getRuntime() + " segundos.");
		System.out.println("Tiempo de Ejecucion de Sumador: " + task2.getRuntime() + " segundos.");
		System.out.println("Tiempo de Ejecucion de Decodificador: " + task3.getRuntime() + " segundos.");
	}

}
