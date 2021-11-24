package tarea3;

import java.io.*;

public class Sumador implements Runnable{

    private  double runtime;

    @Override
    public void run(){
        try {
            long start = System.nanoTime();

            FileReader fp = new FileReader("numeros.txt");   
            BufferedReader buff = new BufferedReader(fp);
            Boolean flag = false;
            String line;
            int a, b;

            while ((line = buff.readLine()) != null && !flag){
                String[] nums = line.split(" ");
                for (int i = 0; i < nums.length-1; i++){
                    a = Integer.parseInt(nums[i]);
                    for (int j = i+1; j < nums.length; j++){
                        b = Integer.parseInt(nums[j]);
                        if (a+b == 65){
                            System.out.println("Sumador: "+nums[i]+" + "+nums[j]+" = 65");
                            flag = true;
                            break;
                        }

                    }
                }
            }
            buff.close();

            long end = System.nanoTime();

            double runtime = (double)(end-start)*1.0e-9;

            System.out.println("Tiempo de Ejecucion de Sumador: " + runtime + " segundos.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setRuntime(double t){
		this.runtime = t;
	}

	public double getRuntime(double t){
		return this.runtime;
	}
    
}
