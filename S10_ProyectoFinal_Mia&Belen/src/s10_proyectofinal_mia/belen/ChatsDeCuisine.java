//Les chats de cuisine
package s10_proyectofinal_mia.belen;

import java.util.Random; 

public class ChatsDeCuisine {
    Random ran = new Random(); 
    
    int size = 10;
    char [][] op1 = new char [size][size]; 
    char [][] op2 = new char [size][size]; 
    char [][] op3 = new char [size][size]; 
    int posx = 0; 
    int posy = 0; 

    

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
    
    public char [][] escoger_matriz(int num_matriz){
        //GATOTUILLE
        char [][] matriz1 = {{'_','_','P','P','_','P','_','C','_','P'},
                             {'P','_','P','_','P','C','_','P','_','_'},
                             {'C','P','_','P','P','P','_','P','C','P'},
                             {'_','P','_','C','P','_','C','_','_','C'},
                             {'P','_','C','P','_','P','C','_','C','_'},
                             {'_','_','P','C','_','P','_','P','P','P'},
                             {'P','P','P','_','P','C','_','P','_','C'},
                             {'_','P','_','P','_','P','_','P','C','P'},
                             {'_','_','_','C','P','_','C','_','_','C'},
                             {'P','_','C','P','_','P','C','_','P','_'}
                            };
                                 
        char [][] matriz2 = {{'_','_','P','_','C','P','_','P','_','P'},
                             {'P','_','P','_','P','_','C','P','_','P'},
                             {'C','P','_','P','_','P','C','_','_','C'},
                             {'P','_','C','P','P','_','P','P','_','P'},
                             {'P','P','_','P','_','P','_','_','C','_'},
                             {'_','_','P','_','C','P','_','P','_','P'},
                             {'P','_','P','C','P','_','p','_','P','_'},
                             {'p','P','_','_','_','P','_','_','_','C'},
                             {'P','_','C','P','P','_','_','P','_','P'},
                             {'C','P','_','P','_','P','P','_','C','_'}
                            }; 
        char [][] matriz3 = {{'_','_','_','P','_','C','P','C','_','P'},
                             {'P','C','_','P','P','_','_','P','_','P'},
                             {'_','P','C','P','_','P','C','C','_','P'},
                             {'_','P','_','_','C','_','_','_','P','_'},
                             {'P','_','P','_','C','P','_','P','_','C'},
                             {'P','_','_','P','_','C','P','C','_','P'},
                             {'P','C','_','P','_','P','_','P','_','C'},
                             {'_','P','C','P','_','_','C','P','_','_'},
                             {'_','_','P','_','C','_','P','_','P','C'},
                             {'C','_','P','_','C','P','_','P','_','C'}
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
    
   public int dado(){
       int dado = ran.nextInt(0,7); 
       return dado;    
   }
    
    public char [][] Jugar(char tab_actual[][], int x, int y){
        char [][] temp = tab_actual; 
        int posx = x; 
        int posy = y; 
        temp[x][y] = 'G'; 
        
        return temp; 
    }//jugar
    
    public void rondas(){
        //rondas con un for o while
    
    
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
