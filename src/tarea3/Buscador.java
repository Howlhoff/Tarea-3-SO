package tarea3;

import java.io.*;

/*
* Mensaje: Ahora que el buscador te funciono, hay que convertirlo en un Runnable. Pero cuando lo hice yo me dijo que habia un error 
*          leyendo el archivo, asi que reverti esos cambiospara verlo dsps mientras hago los otros dos Runnables
*/

public class Buscador extends Thread{

	private double runtime;

	@Override
	public void run() {
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

	public void setRuntime(double t){
		this.runtime = t;
	}

	public double getRuntime(){
		return this.runtime;
	}
	

}
