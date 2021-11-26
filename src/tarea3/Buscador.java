package tarea3;

import java.io.*;

/*
* Mensaje: Ahora que el buscador te funciono, hay que convertirlo en un Runnable. Pero cuando lo hice yo me dijo que habia un error 
*          leyendo el archivo, asi que reverti esos cambiospara verlo dsps mientras hago los otros dos Runnables
*/

public class Buscador extends Thread{

	private double runtime; // guarda el valor del tiempo de ejecucion del thread, se usa al final de run

	// constructor del thread Buscador
	public Buscador(){
		this.runtime = 0;
	}

	@Override
	public void run() { // esta funcion es el programa que ha de correr el thread
		String archivo = "palabras.txt";
        String cadena;
        FileReader f;

		try {
			long start = System.nanoTime();

			f = new FileReader(archivo);
			BufferedReader b = new BufferedReader(f);
	        try {
				while((cadena = b.readLine())!=null){
				    String[] bar = cadena.split(" ");
				    for(int i = 0; i < bar.length; i++){
				        if(bar[i].equals("eiffel")) {
				        	System.out.println("Buscador: "+bar[i]);
				        	break;
				        }
				    }
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	        try {
				b.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

            long end = System.nanoTime();

            this.setRuntime((double)(end-start)*1.0e-9);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	// funcion para settear el valor runtime del thread
	public void setRuntime(double t){
		this.runtime = t;
	}

	// funcion para obtener el valor runtime del thread
	public double getRuntime(){
		return this.runtime;
	}
	

}
