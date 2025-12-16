/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package star_wars;

import java.util.Scanner;
import java.util.Arrays;

/**                                      
 *     #########################################################################    
 *                                                                           
 *                                 EJERCICIO Star_wars                           
 *                                                                     
 *     #########################################################################   
 *     #                                                                       #
 *     #    Autor: Alfonso Díaz Morales                Fecha: 16 dic 2025      #                  
 *     #   ------------------------------            ---------------------     #
 *     #                                                                       #
 *     #########################################################################   
 *                                                                            
 *                                    DESCRIPCIÓN:                             
 *                                   --------------                             
 *                                                                           
 *               
 *                                                                                                                                               
 *     #########################################################################    
 */


public class Star_wars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\033[32m=== INICIO DEL PROGRAMA ===\033[0m");
        
        // Variables & Constantes & Inicializador
        int nivel = 1;
        boolean life = true;
        
        
        final int S1 = (int)(Math.random()*10)+1; 
        final int S2 = (int)(Math.random()*10)+1; 
        
        // Paletas de colores 
        final String ROJO = "\033[31m";
        final String VERDE = "\033[32m";
        final String AMARILLO = "\033[33m";
        final String MORADO = "\033[35m";
        final String AZUL = "\033[36m";


        // Proceso 
        
        // Introducion 
        System.out.println("\n" + AMARILLO + "=== STAR WARS CÓDIGOS SECRETOS ===\n");
        System.out.println(AMARILLO + "Hace mucho tiempo, en una galaxia muy, muy lejana… "
                + AMARILLO + "La Princesa Leia, Luke\nSkywalker, Han Solo, Chewbacca, C3PO "
                + AMARILLO + "y R2D2 viajan en una nave imperial robada\nen una misión "
                + AMARILLO + "secreta para infiltrarse en otra estrella de la muerte que el"
                + AMARILLO + " imperio\nestá construyendo para destruirla. "
                + AMARILLO + "(Presiona Intro para continuar)\n");
        String comienzo = sc.nextLine();
        
        
        // Pasamos a la accion 

        /*
        
            Explicacion : 
        
            Ponemos un bucle DO-WHILE para crear el juego con sus estructuras
        
        */
        
        do {
            
            /*
            
                Explicacion :
            
                Creamos un IF para verificar si el jugador esta vivo, en caso 
                que no este vivo no se continua el juego
            
            */
            
            if (life) {
                
                switch (nivel++) {
                    case 1:
                        System.out.println(VERDE + "Los problemas empiezan cuando deben "
                                + "realizar un salto hiperespacial hasta al\n" + VERDE +
                                "sistema " + S1 + " en el sector " + S2 + ", pero el sistema de "
                                + "navegación está estropeado y el\n" + VERDE + 
                                "computador tiene problemas para calcular parte de las "
                                + "coordenadas de salto.\n" + VERDE + "Chewbacca, piloto "
                                + "experto, se da cuenta que falta el cuarto "
                                + "número de la serie.\n" + VERDE + "Recuerda de sus tiempos "
                                + "en la academia de pilotos que para calcularlo "
                                + "hay que\n" + VERDE + "calcular el sumatorio entre el nº "
                                + "del sistema y el nº del sector (ambos inclusive).\n" 
                                + VERDE + "¿Qué debe introducir?");
                        
                        
                        
                        break;
                        
                    case 2:
                        
                        break;
                        
                    case 3:
                        break;
                        
                    case 4:
                        break;
                        
                    case 5:
                        break;
                        
                        
                        
                    // ETAPA : GANAR
        
                    /*

                        Explicacion :

                        Si el player pasa todas las fases o niveles ira al 
                        case 6 donde representa el ganador, mostramos un mensaje
                        y ponemos su vida final

                    */
                        
                    case 6:
                        
                        System.out.println(AZUL + "Luke Skywalker introduce el tiempo "
                                + AZUL + "correcto, activa el temporizador y empiezan a\n" +
                                AZUL + "sonar las alarmas. Salen de allí corriendo, "
                               + "no hay tiempo que perder. La nave se\n" +
"convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea\n" +
"consiguen llegar a la nave y salir de allí a toda prisa. A medida que se alejan\n" +
"observan por la ventana la imagen de la colosal estrella de la muerte explotando en\n" +
"el silencio del espacio, desapareciendo para siempre junto a los restos del malvado\n" +
"imperio.\n" +
"¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D");
                        
                        life = false;
                        break;
                        
                } // SWITCH para los niveles
                
            } // IF para saber si esta vivo o no
            
            
            
            
            // ETAPA : PERDER
        
            /*

                Explicacion :

                Si el player muere ponemos un if cumpliedo con la condicion de 
                que el tipo boolean de life es false y que el nivel no sea el 
                numero 6 (El 6 representa ganar), po saltara el mensaje que 
                perdiste

            */
            
            if (!life && nivel <= 5) {
                System.out.println("\n" + ROJO +"Ese no era el código correcto… La "
                        + "misión ha sido un fracaso… :( :( :(\n" + ROJO +
                        "Todavía no eres un Maestro Jedi de las Matemáticas. "
                        + "¡Vuelve a intentarlo!");
            } // IF para el mensaje si perdiste
            
            life = false;
            
        } while (life); // DO-WHILE para el juego y se finaliza si el player muere

        
        // ETAPA : FIN
        
        /*
        
            Explicacion :
            
            Una vez terminado el bucle o por asi decirlo el juego le vamos a 
            saltar un mensaje dandole las gracias
        
        */

        
        System.out.println("\n" + AMARILLO + "Gracias por jugar :D");

        // Finalizacion
        System.out.println("\n"+ ROJO + "=== FIN DEL PROGRAMA ===");
    }
}

