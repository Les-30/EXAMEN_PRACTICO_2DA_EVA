
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carla
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int iPiedra = 1;
        int iTijeras = 2;
        int iPapel = 3;
        
        int Ganados = 0;
        int Perdidos = 0;
        int Empate = 0;
        
        String sEmpate = "Empate";
        String sGanaste = "Ganaste";
        String sPerdiste = "Perdiste";
       
        int iwhile = 1;
        
        System.out.println("Estas listo para jugar? (solo tendras 10 juegos disponibles)");
        while(iwhile <= 5){
            iwhile = iwhile + 1;
            
            System.out.println("JUEGO " + iwhile);
            System.out.println("Escoje Piedra, Papel o Tijeras");
        String Usu;
        Usu = input.nextLine(); 
        
        
        int Compu =(int)(Math.random()*3+1); 
            
        switch(Compu){
            case 1:
            System.out.println("Piedra");   
            break;
       
            case 2:
       
            System.out.println("Tijeras");  
            break;
        
             case 3:
            System.out.println("Papel");
            break;
            
            
        }
        if(Compu == 1 && "Piedra".equals(Usu)){
            System.out.println(sEmpate);
            Empate = Empate + 1;
        }
         if(Compu == 2 && "Tijeras".equals(Usu)){
            System.out.println(sEmpate);
            Empate = Empate + 1;
        }   
         if(Compu == 3 && "Papel".equals(Usu)){
            System.out.println(sEmpate);
            Empate = Empate + 1;
        }
         if(Compu == 1 && "Papel".equals(Usu)){
            System.out.println(sGanaste);
            Ganados = Ganados + 1;
        }    
         if(Compu == 1 && "Tijeras".equals(Usu)){
            System.out.println(sPerdiste);
            Perdidos = Perdidos + 1;
        }
         if(Compu == 2 && "Piedra".equals(Usu)){
            System.out.println(sGanaste);
            Ganados = Ganados + 1;
        }
          if(Compu == 2 && "Papel".equals(Usu)){
            System.out.println(sPerdiste);
            Perdidos = Perdidos + 1;
    }
          if(Compu == 3 && "Tijeras".equals(Usu)){
            System.out.println(sGanaste);
            Ganados = Ganados + 1;
        }
          if(Compu == 3 && "Piedra".equals(Usu)){
            System.out.println(sPerdiste);
            Perdidos = Perdidos + 1;
    }
            System.out.println(" ");
            
            
            
        
            
        }
             System.out.println("Numero de juegos empatados: " + Empate);
            System.out.println("Número de juegos ganados por el usuario: " + Ganados);
            System.out.println("Número de juegos ganados por la computadora: " + Perdidos);
        System.out.println(" ");
        }
}

