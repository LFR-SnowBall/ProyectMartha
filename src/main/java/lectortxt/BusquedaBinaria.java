/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectortxt;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Martha
 */
public class BusquedaBinaria {
    Scanner N = new Scanner(System.in);
    private int [] Nums;
    int Num;
    public BusquedaBinaria(){
        Nums=new int [1000];
    }
    public void BinariNum(){
        for(int i = 0; i<Nums.length; i++){
            Num =(int)(Math.random()* Math.pow(10, 3))+1;
            Nums[i]=Num;
            
        }
        Ordenbusqueda();
        
    }
    public void Ordenbusqueda(){
        Arrays.sort(Nums);
        int numb =0;
        while(numb!=-1){
            System.out.println("busqueda de numero deme un numero para buscar si usted llega a poner -1 terminara el programa");
            numb = Integer.parseInt(N.next());
            if (Arrays.binarySearch(Nums, numb)>0){
                System.out.println("El numero se encontró en la posición: " +Arrays.binarySearch(Nums, numb));}
            else{ 
                System.out.println("El número no se encontro ");
            }
        }
        
    }
    
}
