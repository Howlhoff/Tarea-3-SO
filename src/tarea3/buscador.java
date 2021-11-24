package tarea3;

import java.io.*;

/*
* Mensaje: Ahora que el buscador te funciono, hay que convertirlo en un Runnable. Pero cuando lo hice yo me dijo que habia un error 
*          leyendo el archivo, asi que reverti esos cambiospara verlo dsps mientras hago los otros dos Runnables
*/

public class buscador extends Thread{
	
	public void run() {
		String archivo = "C:\\Users\\Diego\\Desktop\\Tarea-3-SO\\src\\tarea3\\palabras.txt";
        String cadena;
        FileReader f;
		try {
			f = new FileReader(archivo);
			BufferedReader b = new BufferedReader(f);
	        try {
				while((cadena = b.readLine())!=null){
				    String[] bar = cadena.split(" ");
				    for(int i = 0; i < bar.length; i++){
				        if(bar[i].equals("eiffel")) {
				        	System.out.println(bar[i]);
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
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	

}
