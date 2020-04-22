package lectortxt;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


/**
 *
 * @author Martha
 */
public class txt {
    String Txt="";
    private String [] Pila;
    private int[] aux;
    private int tope, longitud=1000;
    private int topee;
    
    public txt(){
        Pila=new String[longitud];
        aux=new int [longitud];
        tope=-1;
        topee=1;
    }
    public boolean getvacia(){
        return tope==-1;
    }
    public int getLongitud(){
        return longitud;
    }
    public void apilar(String alumno){
        if(!imprimir(alumno)){
            if(tope+1<longitud){
            tope++;
            Pila[tope]=alumno;
        }
        }
    }
    boolean imprimir(String Checar){//checa si el valor existe edentro
        boolean existencia=false;
        if(!getvacia()){
            String contenido="";
            for(int i=(tope); i>=0; i--){
                contenido=Pila[i];
               if(contenido.equals(Checar)){
                   existencia=true;
               }
               else{
                   existencia=false;
                  
               }
            }
        }
        return existencia;     
    }
    String imprimirr(){//imprime la pila completa
        if(!getvacia()){
            String contenido="";
            for(int i=(tope); i>=0; i--){
                contenido+=Pila[i];
            }
            Txt = contenido;
            return "contenido de la pila: \n"+contenido;
        }
        else{
            return "Pila vacia";
        }
    }
    public void Contenido(String Archivo)throws FileNotFoundException, IOException{
        String Cadena = "";
        FileReader f = new FileReader(Archivo);
        BufferedReader b = new BufferedReader(f);
        int NC=0;
        int cont=0;
        while((Cadena=b.readLine())!=null){
            String texto="";
            cont=++cont;
            NC=Cadena.length();
            //System.out.println(" caracteres "+NC+" linea "+cont+" "+Cadena);
            for(int i = 0; i<NC; i++){
                if(Cadena.subSequence(i, i+1).toString().equals(" ")){
                    apilar(texto);
                    texto="";
                    
                }
                else{
                    texto=texto+Cadena.subSequence(i, i+1);
                }
            }
        }
            b.close();
            System.out.println(imprimirr());
            printtxt(Txt);
            
          //  System.out.println(texto);
            //System.out.println(Cadena.subSequence(0,NC));
            
            //System.out.println(Cadena.length());
               // System.out.println(Cadena);
                

    }
    public void printtxt(String contenido){
        try {
            String ruta = "/Users/lfr/Desktop/pila_resultado.txt";//editar donde se quiere que se guarde el archivo .txt
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
