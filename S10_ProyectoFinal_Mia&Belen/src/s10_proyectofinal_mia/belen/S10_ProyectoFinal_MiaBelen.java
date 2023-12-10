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
        Login L = new Login(); 
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
                System.out.println("Bienvenido a Les Chats de Cuisine!\nLas Reglas son las siguientes: \n"
                        + "1. Debes tirar el dado para determinar tu avance\n2. Cuando encuentres una papa la guardaras en tu canasta\n"
                        + "3. Al encontrar una cacerola podras revisar tu canasta para determinar si puedes cocinar tus papas (tambien decidiras si cocinar o no)\n"
                        + " \n¿Deseas ver tu tablero inicial para comenzar? - Responder S o N\n"); 
                char resp_user = papoy.next().charAt(0); 
                if(resp_user == 'S' || resp_user == 's'){//Ingreso inicial
                    
                    int tablero_elec = ran.nextInt(1,4); 
                    char [][] tablero = cdc.escoger_matriz(tablero_elec); 
                    System.out.println("----- Tablero Inicial -----");
                    cdc.tabInicial(tablero);
                    System.out.println("Este es tu tablero\n¿Comenzamos?\nS o N");
                    char comenzar = papoy.next().charAt(0); 
                    if (comenzar == 'S' || comenzar == 's'){
                        cdc.Jugar(tablero);
                        System.out.println(" ");
                    }
                
                }else if (resp_user == 'N' || resp_user == 'n'){
                    System.out.println("No jugaremos");
                
                }else{
                    System.out.println("Caracter no valido, lo cual invalida el juego");
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
