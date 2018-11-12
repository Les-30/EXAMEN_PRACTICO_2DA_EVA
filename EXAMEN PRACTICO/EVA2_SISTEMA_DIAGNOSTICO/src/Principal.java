
import java.util.Scanner;

/*
 * EXAMEN PRÁCTICO DE LA EVALUACIÓN 2
    3. SISTEMA DIAGNOSTICO
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
        
        System.out.println("¿Tiene fiebre?");
        boolean Desicion1 = input.nextBoolean();
        if(Desicion1 == true){
            System.out.println("¿Tose?");
            boolean Desicion2 = input.nextBoolean();
            if(Desicion2 == true){
                System.out.println("¿Le cuesta respirar, resuella o tose con flemas?");
                boolean Desicion3 = input.nextBoolean();
                if(Desicion3 == true){
                    System.out.println("Posible diagnóstico: neumonía o infección de las vias respiratorias");
                }else{
                    System.out.println("¿Le duele la cabeza?");
                    boolean Desicion4 = input.nextBoolean();
                    if(Desicion4 == true){
                    System.out.println("Posible diagnóstico: infección vírica");
                }else{
                        System.out.println("¿Le duelen los huesos o articulaciones?");
                        boolean Desicion5 = input.nextBoolean();
                        if(Desicion5 == true){
                            System.out.println("Posible diagnóstico: infección vírica");
                        }else{
                            System.out.println("¿Presenta erupciones cutáneas?");
                            boolean Desicion6 = input.nextBoolean();
                            if(Desicion6 == true){
                                System.out.println("No se dispone de información suficiente para realizar diagnóstico");
                            }else{
                                System.out.println("¿Le duele la garganta?");
                                boolean Desicion7 = input.nextBoolean();
                                if(Desicion7 == true){
                                    System.out.println("Posible diagnóstico: infección en la garganta");
                                }else{
                                    System.out.println("¿Le duele la espalda por encima de las lumbares, con escalofrios y fiebre?");
                                    boolean Desicion8 = input.nextBoolean();
                                    if(Desicion8 == true){
                                        System.out.println("Posible diagnóstico: infección renal");
                                    }else{
                                        System.out.println("¿Le duele al orinar o lo hace con más frecuencia?");
                                        boolean Desicion9 = input.nextBoolean();
                                        if(Desicion9 == true){
                                            System.out.println("Posible diagnóstico: infección del tracto urinario");
                                        }else{
                                            System.out.println("¿Ha pasado el dáa al sol con mucho calor?");
                                            boolean Desicion10 = input.nextBoolean();
                                            if(Desicion10 == true){
                                                System.out.println("Posible diagnóstico: golpe de calor o agotamiento por calor");
                                            }else{
                                                System.out.println("No se dispone de información suficiente para realizar un diagnóstico");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }else{
                System.out.println("¿Le duele la cabeza?");
                boolean Desicion11 = input.nextBoolean();
                if(Desicion11 == true){
                    System.out.println("¿Tiene alguno de los siguientes sintomas: dolor cuando inclina la cabeza hacia adelante, náuseas, vómitos, "
                    + "fuerte molestia en los ojos ante una luz brillante, somnolencia o confusión?");
                    boolean Desicion12 = input.nextBoolean();
                    if(Desicion12 == true){
                        System.out.println("Posible diagnóstico: meningitis");
                        
                }else{
                        System.out.println("¿Vomita o tiene diarrea?");
                        boolean Desicion13 = input.nextBoolean();
                        if(Desicion13 == true){
                            System.out.println("Posible diagnóstico: infección en el tracto digestivo");
                    }
                }
                }else{
                    System.out.println("¿Le duelen los huesos o articulaciones?");
                        boolean Desicion5 = input.nextBoolean();
                        if(Desicion5 == true){
                            System.out.println("Posible diagnóstico: infección vírica");
                        }else{
                            System.out.println("¿Presenta erupciones cutáneas?");
                            boolean Desicion6 = input.nextBoolean();
                            if(Desicion6 == true){
                                System.out.println("No se dispone de información suficiente para realizar diagnóstico");
                            }else{
                                System.out.println("¿Le duele la garganta?");
                                boolean Desicion7 = input.nextBoolean();
                                if(Desicion7 == true){
                                    System.out.println("Posible diagnóstico: infección en la garganta");
                                }else{
                                    System.out.println("¿Le duele la espalda por encima de las lumbares, con escalofrios y fiebre?");
                                    boolean Desicion8 = input.nextBoolean();
                                    if(Desicion8 == true){
                                        System.out.println("Posible diagnóstico: infección renal");
                                    }else{
                                        System.out.println("¿Le duele al orinar o lo hace con más frecuencia?");
                                        boolean Desicion9 = input.nextBoolean();
                                        if(Desicion9 == true){
                                            System.out.println("Posible diagnóstico: infección del tracto urinario");
                                        }else{
                                            System.out.println("¿Ha pasado el dáa al sol con mucho calor?");
                                            boolean Desicion10 = input.nextBoolean();
                                            if(Desicion10 == true){
                                                System.out.println("Posible diagnóstico: golpe de calor o agotamiento por calor");
                                            }else{
                                                System.out.println("No se dispone de información suficiente para realizar un diagnóstico");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
    

else{
            System.out.println("No se dispone de información suficiente para realiar un diagnostico");
}

    }
    
}
