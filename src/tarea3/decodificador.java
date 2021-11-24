package tarea3;

import java.io.*;
import java.util.*;

public class decodificador implements Runnable{

    public void run(){
        // Creacion de Map de Morse
        Map<String,String> morse = new HashMap<String,String>();
        String[] keys = {".-", "-...", "-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] values = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        for (int i = 0; i < keys.length; i++){
            morse.put(keys[i],values[i]);
        }


        // Run Proper
        try {
            FileReader fp;
            fp = new FileReader("morse.txt");
			BufferedReader buff = new BufferedReader(fp);
	        String line;
	        String msg = "";
            System.out.println("Decodificador: ");
            while ((line = buff.readLine()) != null){
                String[] letras =  line.strip().split(" ");
                for (int i = 0; i < letras.length; i++){
                    msg += morse.get(letras[i]);
                    msg += " ";
                }
            }
            System.out.println(msg);
            buff.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}