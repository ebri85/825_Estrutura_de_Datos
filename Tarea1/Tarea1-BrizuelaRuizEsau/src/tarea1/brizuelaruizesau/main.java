/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1.brizuelaruizesau;


import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.bind.annotation.XmlElement;

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
        try {
          Scanner entrada = new Scanner(System.in);
          int opcion;
          String op1, op2,op3, op4;
          char op = 0;
          String mensaje = "";
          int i = 0;
          String dato ="";         
          
          
          ArrayList<String>palabras;
          
                 palabras = new ArrayList<>();
        do{
              opcion = OpcionMenu();
              
              switch(opcion){
                  
                  case 1 : 

                      System.out.println(agregaValor(palabras));
              
                      break;
                      
                  case 2 :
                       Scanner entrada2 = new Scanner(System.in);
                        System.out.println("Digite la palabra que desea eliminar de la coleccion \n");
                            dato = entrada2.nextLine();

                      eliminaValor(palabras,i,dato);
                      break;
                      
                  case 3 :
             
                      System.out.println(Buscador(palabras));
                      break;
                      
                  case 4:
                  
                      System.out.println(Modificar(palabras));
                      break;
                      
                  case 0:
                      
                      System.exit(0);
                      
                      break;
                  default:
                      
                  break;

                  
              }
             System.out.println("Desea realizar otra operacion? (S/N)"); 
            op = entrada.next().charAt(0);
          }while(op!='n');

            
        } catch (Exception e){
            System.out.println("Por favor revise el error " + e.getMessage());
        }

    }
    
    public static int OpcionMenu(){
       int resultado=0;
      try{
    
           Scanner entrada = new Scanner(System.in);
        
        
        
        String menu= "Sistema de Prueba de ArrayList \n\n";
        
        menu+= "1 - Agrega Palabra \n";
        menu+= "2 - Elimina Palabra\n";
        menu+= "3 - Buscar Palabra \n";
        menu+= "4 - Reemplaza Valor \n";
        menu+= "0 = Salir";
        
        System.out.println(menu);
        
        resultado = entrada.nextInt();
          
          
      }   catch (Exception e){
            System.out.println("Por favor revise el error " + e.getMessage());
        }       
        
        return resultado;
        
    }
    
    //Metodo para eliminar valor usando recursividad retorna mensaje de cuando se logra remover el elemento
    public static void eliminaValor(ArrayList<String> val, int i, String valor) {
       
        try {

            String temp = val.get((i+1)-1);
            
            if(temp.equals(valor.toLowerCase())){
                
                val.remove(temp);
               String resultado = "Se elimino satisfactoriamente el valor :" + valor.toUpperCase() + "\n";
               System.out.println(resultado);
                
            } else { 
                
             eliminaValor(val, ++i, valor);
            
            }

        }catch (IndexOutOfBoundsException e){
            
                System.out.println("La Palabra "+valor.toUpperCase()+" digitada no se encuentra en la Coleccion");

         }

    }
    
    //Metodo para agregar Palabras a la coleccion
    public static String agregaValor(ArrayList<String> val){
       
        String resultado = "";
        try {
                 
            String dato ="";
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite la palabra a insertar en la coleccion \n");
                dato = entrada.nextLine();
            
            String mensaje = "Se agrego de forma satisfactoria la palabra " + dato.toUpperCase() + " a la Coleccion \n";
                resultado = (val.add(dato.toLowerCase()))?mensaje:"Error \n"; 

           }catch(Exception e){
                System.out.println(e.getMessage());
           
         }
           
        return resultado;
        
    }
    
    //Metodo busca la palabra y retorna un resultado
    public static String Buscador(ArrayList<String> val){
       
        String resultado = "";
        
        try{

            String dato ="";
            Scanner entrada = new Scanner(System.in);
              
            System.out.println("Digite la palabra que desea buscar en la coleccion \n");
               dato = entrada.nextLine();
              
            String mensaje = "La palabra " + dato.toUpperCase() + " indicada existe en la coleccion y se encuentra en la posicion: \n";
                resultado = (val.contains(dato.toLowerCase()))?mensaje +val.indexOf(dato.toLowerCase())+" ":"Error ese valor no existe en la coleccion \n";
 
        }catch(Exception e){
                System.out.println(e.getMessage());
           
         }
        return resultado;
        
    }
    
    //Metodo para reemplazar palabras en la coleccion
    public static String Modificar(ArrayList<String> val){
       
        String resultado = "";
        String dato1 ="";
        String dato2 = "";
        Scanner entrada = new Scanner(System.in);
        int pos = 0;
        try {

            System.out.println("Digite la palabra que desea reemplazar en la coleccion \n");
                dato1 = entrada.nextLine();
            
            System.out.println("Digite la la palabra nueva \n");
                dato2 = entrada.nextLine();
         
            String mensaje ;
        
                pos =  (val.indexOf(dato1.toLowerCase()));       
       
            if(pos>0){

              val.set(pos,dato2.toLowerCase());
              mensaje = "Se reemplazo de forma satisfactoria la palabra "+ dato1.toUpperCase()+ " por " + dato2.toUpperCase() + "\n";
           
           
            } else {
           
                mensaje = "No se logro lo solicitado, por favor valide que la Palabra " +dato1.toUpperCase() +"Exista \n";
            }
              resultado = mensaje;
            
        }catch(Exception e){
                System.out.println(e.getMessage());
          
          }

       return resultado;
      
    }
    
    
}
