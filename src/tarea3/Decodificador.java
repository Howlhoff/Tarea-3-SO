package tarea3;

import java.io.*;
import java.util.*;

public class Decodificador extends Thread{

    private double runtime;

    public Decodificador(){
        this.runtime = 0;
    }

    @Override
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
            long start = System.nanoTime();

            FileReader fp;
            fp = new FileReader("morse.txt");
			BufferedReader buff = new BufferedReader(fp);
	        String line;
	        String msg = "Decodificador: ";
            while ((line = buff.readLine()) != null){
                String[] letras =  line.strip().split(" ");
                for (int i = 0; i < letras.length; i++){
                    msg += morse.get(letras[i]);
                }
                msg += " ";
            }

            System.out.println(msg);
            buff.close();

            long end = System.nanoTime();

            this.setRuntime((double)(end-start)*1.0e-9);

        } catch (Exception e) {
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