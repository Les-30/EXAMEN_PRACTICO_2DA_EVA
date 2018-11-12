
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres Ruiz
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        char linea1[] = new char[3];
        char linea2[] = new char[3];
        char linea3[] = new char[3];
        
        boolean gano=false;
        boolean existe=false;
        int resp=0;
        int resp1=0;
        
        InputStreamReader isr= new
            InputStreamReader(System.in);
        
        BufferedReader entrada = new BufferedReader (isr);
        
        System.out.println("Bienvenido al juego del gato");
        do{
            System.out.print("Ingrese en el lugar que quiera su juego seleccionando fila y columna");
            do{
                existe=false;
                System.out.println("Turno de X, en que posiciondesea jugar: ");
                System.out.print("Fila: ");
                resp=Integer.parseInt(entrada.readLine());
                if(resp>=1 & resp<=3){
                    System.out.print("Columna: ");
                    resp1=Integer.parseInt(entrada.readLine());
                    if(resp>=1 & resp<=3){
                        if(resp==1){
                            if(linea1[resp1-1]!=' '){
                            linea1[resp1-1]='X';
                            existe=true;
                        }
                        }
                        if(resp==2){
                            if(linea2[resp1-1]!=' '){
                            linea2[resp1-1]='X';
                            existe=true;
                        }
                        }
                        if(resp==3){
                            if(linea3[resp1-1]!=' '){
                            linea3[resp1-1]='X';
                            existe=true;
                        }
                            else
                            System.out.println("Existe");
                        }
                    }
                }
            }while(existe!=true);
            
            do{
                existe=false;
                System.out.println("Turno de O, en que posicion desea jugar: ");
                System.out.print("Fila: ");
                resp=Integer.parseInt(entrada.readLine());
                if(resp>=1 & resp<=3){
                    System.out.println("Columna: ");
                    resp1=Integer.parseInt(entrada.readLine());
                    if(resp>=1 & resp<=3){
                        if(resp==1){
                            if(linea1[resp1-1]!=' '){
                            linea1[resp1-1]='O';
                            existe=true;
                        }
                            else
                            System.out.println("Existe");
                        }
                    }
                }
            }while(existe!=true);
            if(linea1[0]==linea1[1]&linea1[1]==linea1[2])
                gano=true;
            if(linea1[0]==linea2[0]&linea1[0]==linea3[0])
                gano=true;
            if(linea1[0]==linea2[1]&linea2[1]==linea3[2])
                gano=true;
            if(linea1[2]==linea2[1]&linea2[1]==linea3[0])
                gano=true;
            if(linea1[2]==linea2[2]&linea2[2]==linea3[2])
                gano=true;
            if(linea3[0]==linea3[1]&linea3[1]==linea3[2])
                gano=true;
            if(linea2[0]==linea2[1]&linea2[1]==linea3[2])
                gano=true;
            if(linea1[1]==linea2[1]&linea2[1]==linea3[1])
                gano=true;
            else
                gano=false;
        }while(gano!=true);
    }
    
}
