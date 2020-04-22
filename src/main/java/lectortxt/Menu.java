/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martha
 */
package lectortxt;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
   
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    //static lectortxt.txt s=null;
    public static void main(String[] args)throws IOException{
        Scanner sn = new Scanner(System.in);
        int eleccion=0;
        String Funcion="";
        while(eleccion!=5){
            System.out.println("seleccione el el programa que quiere arrancar donde\n 1 es el ejercicio 1 de pila\n 2 es el ejercicio 2 "
                    + "mil numeros aleatorios\n 3 es el ejercicio 3 busqueda binaria\n 5 para cerrar y terminar");
            eleccion=Integer.parseInt(sn.next());
            switch(eleccion){
                case 1: new lectortxt.txt().Contenido("/Users/lfr/Desktop/pila.txt");// cambiar a la ruta donde se ecuentra el txt en la compu donde se va a compilar
                    break;
                case 2:
                    System.out.println("deme el nombre del archivo donde se guardaran los numeros .txt\n no ponga el .txt al final del nombre");
                    Funcion=sn.next();
                    new NumRandom().randomnum(Funcion);
                    break;
            }
        }
         
        // TODO code application logic here
        
        
        
    }
    
}
