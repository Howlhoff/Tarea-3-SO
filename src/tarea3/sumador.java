package tarea3;

import java.io.*;

public class sumador implements Runnable{

    @Override
    public void run(){
        try {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
