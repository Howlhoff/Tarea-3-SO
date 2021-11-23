import java.io.*;

public class App {

    public static void contenido(String archivo) throws FileNotFoundException, IOException{
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null){
            String[] bar = cadena.split(" ");
            for(int i = 0; i < bar.length; i++){
                if(bar[i] == "eiffel"){
                    System.out.println(bar[i]);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        contenido("/mnt/c/Users/Diego/Desktop/Tarea-3-SO/Tarea 3/src/palabras.txt");
    }
}
