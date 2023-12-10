//Les chats de cuisine
package s10_proyectofinal_mia.belen;

import java.util.Random; 
import java.util.Scanner;

public class ChatsDeCuisine {
    Random ran = new Random(); 
    Scanner papoy = new Scanner(System.in); 
    
    int size = 10;
    char [][] op1 = new char [size][size]; 
    char [][] op2 = new char [size][size]; 
    char [][] op3 = new char [size][size]; 
    int posx = 0; 
    int posy = 0; 
    int papas = 0; 
    int sopas = 0; 

    

    public ChatsDeCuisine() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public char[][] getOp1() {
        return op1;
    }

    public void setOp1(char[][] op1) {
        this.op1 = op1;
    }

    public char[][] getOp2() {
        return op2;
    }

    public void setOp2(char[][] op2) {
        this.op2 = op2;
    }

    public char[][] getOp3() {
        return op3;
    }

    public void setOp3(char[][] op3) {
        this.op3 = op3;
    }
    
    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public int getPapas() {
        return papas;
    }

    public void setPapas(int papas) {
        this.papas = papas;
    }

    public int getSopas() {
        return sopas;
    }

    public void setSopas(int sopas) {
        this.sopas = sopas;
    }
    
    
    
    
    public char [][] escoger_matriz(int num_matriz){
        //GATOTUILLE
        char [][] matriz1 = {{' ',' ','P','P',' ','P',' ','C',' ','P'},
                             {'P',' ','P',' ','P','C',' ','P',' ',' '},
                             {'C','P',' ','P','P','P',' ','P','C','P'},
                             {' ','P',' ','C','P',' ','C',' ',' ','C'},
                             {'P',' ','C','P',' ','P','C',' ','C',' '},
                             {' ',' ','P','C',' ','P',' ','P','P','P'},
                             {'P','P','P',' ','P','C',' ','P',' ','C'},
                             {' ','P',' ','P',' ','P',' ','P','C','P'},
                             {' ',' ',' ','C','P',' ','C',' ',' ','C'},
                             {'P',' ','C','P',' ','P','C',' ','P',' '}
                            };
                                 
        char [][] matriz2 = {{' ',' ','P',' ','C','P',' ','P',' ','P'},
                             {'P',' ','P',' ','P',' ','C','P',' ','P'},
                             {'C','P',' ','P',' ','P','C',' ',' ','C'},
                             {'P',' ','C','P','P',' ','P','P',' ','P'},
                             {'P','P',' ','P',' ','P',' ',' ','C',' '},
                             {' ',' ','P',' ','C','P',' ','P',' ','P'},
                             {'P',' ','P','C','P',' ','p',' ','P',' '},
                             {'p','P',' ',' ',' ','P',' ',' ',' ','C'},
                             {'P',' ','C','P','P',' ',' ','P',' ','P'},
                             {'C','P',' ','P',' ','P','P',' ','C',' '}
                            }; 
        char [][] matriz3 = {{' ',' ',' ','P',' ','C','P','C',' ','P'},
                             {'P','C',' ','P','P',' ',' ','P',' ','P'},
                             {' ','P','C','P',' ','P','C','C',' ','P'},
                             {' ','P',' ',' ','C',' ',' ',' ','P',' '},
                             {'P',' ','P',' ','C','P',' ','P',' ','C'},
                             {'P',' ',' ','P',' ','C','P','C',' ','P'},
                             {'P','C',' ','P',' ','P',' ','P',' ','C'},
                             {' ','P','C','P',' ',' ','C','P',' ',' '},
                             {' ',' ','P',' ','C',' ','P',' ','P','C'},
                             {'C',' ','P',' ','C','P',' ','P',' ',' '}
                            }; 
        
        if (num_matriz == 1){
            return matriz1; 
        }else if (num_matriz == 2){
            return matriz2; 
        }else if(num_matriz == 3){
            return matriz3; 
        }
        return matriz1;
    }//final escoger el tablero 
    
    public void tabInicial(char x[][]){
        x[posx][posy] = 'G'; 
        Imprimir_tab(x);
        RemoveG(x);
    }
    public void Jugar(char tab_actual[][]) {
        char pr_dado = 'S'; 
        int clientes = ran.nextInt(1,4);
        System.out.println("---- Informacion Previa ----\nTenemos "+clientes+" clientes, debemos preparar "+clientes+" sopas\n¡Iniciemos!");
        while (tab_actual[9][9] != 'G' && (pr_dado == 'S' || pr_dado == 's')){
             
            System.out.println("");
            System.out.println("------ DATOS ACTUALES ------");
            System.out.println("Papas en canasta: "+papas);
            System.out.println("Sopas listas: "+sopas);
            System.out.println("Posicion anterior ("+posx+","+posy+")");
            System.out.println("----------- DADO -----------\n¡DADO TIRADO!");
            //imprime datos actuales de juego
            int dado = ran.nextInt(6)+1;
            System.out.println("El dado tiro: " + dado);
            //System.out.println("h" + posx + "," + posy);
            int temporal = posx+dado;
            if (posx < 10 && ((temporal) < 10)) {
                posx += dado;
            } else {
                //9-posx, es lo que puede avanzar en x y luego eso se le resta a dado y lo que queda en dado se le suma a posx
                int rest = 9 - posx; 
                dado -= rest; 
                posy++;
                posx = 0; 
                posx += dado-1;
            }
            System.out.println("Nos encontramos en ("+posx+","+posy+")");
            System.out.println("---------------------------\n");
            //System.out.println(this.posx + ", " + this.posy);
            char prueba = tab_actual[posy][posx]; 
            tab_actual[posy][posx] = 'G';
            Imprimir_tab(tab_actual);

            if (prueba == 'P') {//papas
                System.out.println("");
                System.out.println("-- ¡Encontramos una papa! Una mas para la canasta\n");
                papas++;
            } else if (prueba == 'C') {//cacerolas
                System.out.println("");
                System.out.println("-- ¡Ey, una Cacerola!\n¿Revisamos nuestras papas para ver si podemos cocinar?\nS o N");
                char revisar = papoy.next().charAt(0); 
                if (revisar == 'S' || revisar == 's'){
                    if (this.papas < 2) {
                        System.out.println("No tenemos suficientes papas para cocinar\nSigamos colectando papitas");
                        //Luego de esto mostrar el tirar dado
                    } else {
                        //se divide entre 2 y esa es la cantidad de sopas que se pueden hacer
                        int sopas_posibles = this.papas / 2;
                        System.out.println("Podemos cocinar " + sopas_posibles + " sopas\n¿Las cocinamos?\nSi = S o No = N");
                        char cocinar = papoy.next().charAt(0);
                     
                        if (cocinar == 'S' || cocinar == 's') {
                            this.sopas += sopas_posibles;
                            this.papas -= sopas_posibles * 2;
                            System.out.println("Sopas Listas, Sigamos");
                        }else if (cocinar == 'N' || cocinar == 'n'){
                            System.out.println("Ok, continuemos");
                        }else{
                            System.out.println("Caracter no valido,\nIngreselo de nuevo:");
                            cocinar = papoy.next().charAt(0);
                        }
                    }
                }

            }else{
                System.out.println("--No encontramos nada, debemos seguir buscando\n");
            }

            RemoveG(tab_actual);
            System.out.println("---- ¿Tiramos el dado? ----");
            pr_dado = papoy.next().charAt(0);
            
        }
    }//jugar
    
    
    public void RemoveG(char matriz[][]){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] == 'G'){
                    matriz[i][j] = ' '; 
                }
            }
        }
    
    }
    
    public void Imprimir_tab(char x[][]){
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (j == 0){
                    System.out.print("|"+x[i][j]);
                }else if(j == 9){
                    System.out.print(x[i][j]+"|");
                }else{
                    System.out.print(" "+x[i][j]+" ");
                }
            }
            System.out.println();
        }
    
    }
    
    
}
