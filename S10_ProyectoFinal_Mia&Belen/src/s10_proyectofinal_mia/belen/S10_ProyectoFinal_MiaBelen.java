//Proyecto Final - Mia Elvir & Belen Padilla
package s10_proyectofinal_mia.belen;
import java.util.Random; 
import java.util.Scanner;
import javax.swing.JOptionPane;


public class S10_ProyectoFinal_MiaBelen {

    static Random ran = new Random(); 
    static Scanner papoy = new Scanner(System.in); 
    
    public static void main(String[] args) {
        ChatsDeCuisine cdc = new ChatsDeCuisine(); 
       /*
        ----Lista----
        1. Matrices (Chats de cuisine)
        2. ArrayLists
        3. Recursivas 
        4. Salir 
        */
       int opcion = getOption("--- MENU ---\n1. Les Chats de cuisine\n2. Inventario Elegancia Botanica\n3. Recursivas\n4. Salir o 'Presione cancelar");
       while (opcion > 0 && opcion < 4){
        switch (opcion){
            case 1: 
                System.out.println("Bienvenido a Les Chats de Cuisine!\nLas Reglas son las siguientes: \n¿Listo para comenzar?"); 
                int tablero_elec = ran.nextInt(1,4); 
                char [][] tablero = cdc.escoger_matriz(tablero_elec); 
                char [][] temp = new char [10][10]; 
                cdc.Imprimir_tab(tablero);
                System.out.println(" ");
                for (int i = 0; i < 10; i++) {
                    temp = cdc.Jugar(tablero);
                    tablero = temp; 
                }
                
                
                
                break; 
                
            case 2: 
                //Elegancia botanica
                break; 
            case 3: 
                //Recursivas
                break; 
        }//switch
        opcion = getOption("--- MENU ---\n1. Les Chats de cuisine\n2. Inventario Elegancia Botanica\n3. Recursivas\n4. Salir o 'Presione cancelar");
       }//while
        
    }//main
    
    public static int getOption (String message) {
        String unparsedOption = JOptionPane.showInputDialog(message);
        if(unparsedOption == null) {
            System.exit(0);
        }
        return Integer.parseInt(unparsedOption);
    }
    
}
