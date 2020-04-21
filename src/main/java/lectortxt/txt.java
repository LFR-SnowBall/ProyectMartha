package lectortxt;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author lfr
 */
public class txt {
    public void Contenido(String Archivo)throws FileNotFoundException, IOException{
        String Cadena = "";
        FileReader f = new FileReader(Archivo);
        BufferedReader b = new BufferedReader(f);
        String texto=null,textoo=b.readLine()+" ";
        int NC=0;
        int cont=0;
        while((Cadena=b.readLine())!=null){
            cont=++cont;
            NC=Cadena.length();
            System.out.println(" caracteres "+NC+" linea "+cont+" "+Cadena);
            textoo = textoo+Cadena.toString();
        }
            texto=textoo.subSequence(0,0).toString();
            for(int i= 0; i<NC;i++){
                if(textoo.subSequence(i, i+1).equals(" ")){
                    texto=texto+"\npalabra ";
                }
                else{
                    texto=texto+textoo.subSequence(i, i+1);
                }
          //  System.out.println(texto);
            //System.out.println(Cadena.subSequence(0,NC));
            
            //System.out.println(Cadena.length());
               // System.out.println(Cadena);
                
        }
        System.out.println(texto);
        System.out.println(NC);
        System.out.println(texto);
        b.close();

    }
    
}
