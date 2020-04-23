/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectortxt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Martha
 */
public class NumRandom {
    private int [] Fila;
    String RandomNum="";
    Scanner N = new Scanner(System.in);
    int Num;
    public NumRandom(){
        Fila = new int[1000];
        
    }
    public void randomnum(String name){
        for(int i = 0; i<1000; i++){
            Num =(int)(Math.random()* Math.pow(10, 3))+1;
            RandomNum +=String.valueOf(Num)+"\n";
            Fila[i]=Num;
        }
        printtxt(RandomNum, name);
        Busqueda();
    }
    public void Busqueda(){
        boolean sino=false;
        int Posicion=0;
        int numb =0;
        while(numb!=-1){
            System.out.println("busqueda de numero deme un numero para buscar si usted llega a poner -1 terminara el programa");
            numb = Integer.parseInt(N.next());
            for(int i =0; i<Fila.length; i++){
                if(Fila[i]==numb){
                    sino=true;
                    Posicion = i;
                    break;
                }
                else{
                    sino=false;
                }
            }
            if(sino){
                System.out.println("Se encontró el numero en la posición contando desde 0 : "+Posicion+"\no en la posición contando de 1 : "+(Posicion+1));
            }
            else{
                System.out.println("No se encontro el numero");
            }
        }
        System.out.println("Terminado");
    }
    public void printtxt(String contenido,String name){
        try {
            String ruta="/Users/lfr/Desktop/";
            String tipo=".txt";
             File file =new File(ruta+name+tipo);
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
