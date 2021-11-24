package tarea3;

import java.io.*;

/*
* Mensaje: Ahora que el buscador te funciono, hay que convertirlo en un Runnable. Pero cuando lo hice yo me dijo que habia un error 
*          leyendo el archivo, asi que reverti esos cambiospara verlo dsps mientras hago los otros dos Runnables
*/

public class buscador {
	public static void main(String[] args) throws Exception {
        String archivo = "palabras.txt";
        String cadena;
        FileReader f = new FileReader(archivo);
		BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null){
            String[] bar = cadena.split(" ");
            for(int i = 0; i < bar.length; i++){
                if(bar[i].equals("eiffel")) {
                	System.out.println(bar[i]);
                }
            }
        }
        b.close();
    }
}
