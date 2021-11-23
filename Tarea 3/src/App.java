import java.io.*;

public class App {

    public static void main(String[] args) throws Exception {
        String archivo = "palabras.txt";
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null){
            //System.out.println(cadena);
            String[] bar = cadena.split("\t");
            for(int i = 0; i < bar.length; i++){
                if(bar[i] == "eiffel"){
                    System.out.println("eiffel\n");
                }
            }
        }
    }
}
