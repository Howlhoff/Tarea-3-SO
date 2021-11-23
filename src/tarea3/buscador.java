package tarea3;

import java.io.*;

public class buscador {
	public static void main(String[] args) throws Exception {
        String archivo = "C:\\Users\\Diego\\Desktop\\Tarea-3-SO\\src\\tarea3\\palabras.txt";
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
