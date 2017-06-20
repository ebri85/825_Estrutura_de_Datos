/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1.brizuelaruizesau;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author esau_br
 */
public class main {

    /**
     * Este proyecto es para probar el uso de colecciones en las estruturas de datos
     * en este caso ArrayList
     * @param args
     */
    public static void main(String[] args) {
  
            
        
    
        
        
        
    }
    
    public static int Opcionmenu(){
        int resultado=0;
        Scanner entrada = new Scanner(System.in);
        
        
        
        String menu= "Sistema de Prueba de ArrayList";
        
        menu+= "1 - Agrega Dato";
        menu+= "2 - Elimina Dato";
        menu+= "3 - Reemplaza Valor";
        
        System.out.println(menu);
        
        resultado = entrada.nextInt();
        
        return resultado;
        
    }
    
    
    public static boolean eliminaValor(ArrayList<String> val, String s){
       
        boolean resultado;
        resultado = val.remove(s);
 
        return resultado;
        
    }
    
    public static boolean agregaValor(ArrayList<String> val, String s){
       
        boolean resultado;
        resultado = val.add(s);
 
        return resultado;
        
    }
    
    public static boolean buscador(ArrayList<String> val, String s){
       
        boolean resultado;
        resultado = val.contains(s);
 
        return resultado;
        
    }
    
    public static void modifica(ArrayList<String> val, String s1,String s2){
       
        boolean resultado;
        int pos;
        String mensaje ;
        Object s;
       pos =  (val.indexOf(s1));       
       
       mensaje = (pos>0)?val.set(pos,s2):"valor no existe";

        
    }
    
    
}
