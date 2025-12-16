/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package star_wars;

import java.util.Scanner;
//import java.util.Arrays;

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
 *          Desarrollar un pequeño videojuego educativo para adolescentes 
 *          llamado ‘Star Wars Códigos Secretos’ que fomente la comprensión 
 *          lectora y la competencia matemática. Estará ambientado en el 
 *          universo de Star Wars con un estilo de aventura conversacional 
 *          sencillo en el que el usuario tendrá que superar varias pruebas 
 *          matemáticas para conseguir destruir la estrella de la muerte.               
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
        boolean verificar_tipo = false;
        
        // Nivel 1
        final int S1 = (int)(Math.random()*10)+1; 
        final int S2 = (int)(Math.random()*11)+20; 
        
        // Nivel 2
        final int P1 = (int)(Math.random()*7)+1; 
        final int P2 = (int)(Math.random()*5)+8; 
        
        // Nivel 3
        final int N = (int)(Math.random()*51)+50; 
        
        // Nivel 4
        final int P = (int)(Math.random()*91)+10; 
        
        // Nivel 5
        final int M = (int)(Math.random()*6)+5; 
        final int S = (int)(Math.random()*6)+5; 

        // Paletas de colores 
        final String ROJO = "\033[31m";
        final String VERDE = "\033[32m";
        final String AMARILLO = "\033[33m";
        final String AZUL = "\033[36m";
        final String RESET = "\033[0m";
        
        // Formatos
        final String formato = "#";
        final int cantidad = 100;


        // Proceso 
        
        // Introducion 
        System.out.println("\n" + AMARILLO + "=== STAR WARS CÓDIGOS SECRETOS ===\n");
        
        
        
        System.out.println(".        .          .    .    .            .            .                   .\n" +
"               .               ..       .       .   .             .\n" +
" .      .     T h i s   i s   t h e   g a l a x y   o f   . . .             .\n" +
"                     .              .       .                    .      .\n" +
".        .               .       .     .            .\n" +
"   .           .        .                     .        .            .\n" +
"             .               .    .          .              .   .         .\n" +
"               _________________      ____         __________\n" +
" .       .    /                 |    /    \\    .  |          \\\n" +
"     .       /    ______   _____| . /      \\      |    ___    |     .     .\n" +
"             \\    \\    |   |       /   /\\   \\     |   |___>   |\n" +
"           .  \\    \\   |   |      /   /__\\   \\  . |         _/               .\n" +
" .     ________>    |  |   | .   /            \\   |   |\\    \\_______    .\n" +
"      |            /   |   |    /    ______    \\  |   | \\           |\n" +
"      |___________/    |___|   /____/      \\____\\ |___|  \\__________|    .\n" +
"  .     ____    __  . _____   ____      .  __________   .  _________\n" +
"       \\    \\  /  \\  /    /  /    \\       |          \\    /         |      .\n" +
"        \\    \\/    \\/    /  /      \\      |    ___    |  /    ______|  .\n" +
"         \\              /  /   /\\   \\ .   |   |___>   |  \\    \\\n" +
"   .      \\            /  /   /__\\   \\    |         _/.   \\    \\            +\n" +
"           \\    /\\    /  /            \\   |   |\\    \\______>    |   .\n" +
"            \\  /  \\  /  /    ______    \\  |   | \\              /          .\n" +
" .       .   \\/    \\/  /____/      \\____\\ |___|  \\____________/    \n" +
"                               .                                        .\n" +
"     .                           .         .               .                 .\n" +
"                .                                   .            .");
        
        
        System.out.println(AMARILLO + "Hace mucho tiempo, en una galaxia muy, "
                + "muy lejana… " + AMARILLO + "La Princesa Leia, Luke\n"
                + "Skywalker, Han Solo, Chewbacca, C3PO "+ AMARILLO + "y R2D2 "
                + "viajan en una nave imperial robada\nen una misión "
                + AMARILLO + "secreta para infiltrarse en otra estrella de la "
                + "muerte que el" + AMARILLO + " imperio\nestá construyendo para"
                + " destruirla. " + AMARILLO + "(Presiona Intro para continuar)");
        String comienzo = sc.nextLine();        
        
        
        // Pasamos a la accion 

        /*
        
            Explicacion : 
        
            Ponemos un bucle DO-WHILE para crear el juego con sus estructuras
        
        */
        
        do {
            /*
            
            Las dos variables para los ejercicios de los niveles 1 - 5
            
            CAMBIOS URGENTES : Las tres variables antes estaba en la seccion de
            "Variables & Constantes & Inicializador" pero nos dimos cuenta que 
            ahorramos un par de lineas si ponemos dentro del bucle sin necesidad
            de crear otro variable o poner otra linea de respuestas = 0, 
            solamente poniendo dentro del bucle ejecuta en perfecta condiciones
            
            */
            
            int sumas = 0;
            int productos = 1;
            int respuesta = 0;
            
            /*
            
                Explicacion :
            
                Creamos un IF para verificar si el jugador esta vivo, en caso 
                que no este vivo no se continua el juego
            
            */
            
            if (life) {
                
                /*
                
                    Explicacion : 
                
                    Creamos un SWITCH para los niveles y dentro de la condicion
                    ponemos la variable nivel pero hacemos que se sume despues,
                    es decir nivel++ 
                
                    Estaba inicializado con 1 pues con nivel++ empezara con 1 y 
                    despues 2 hasta x sucesivamente
                
                */
                
                switch (nivel++) {
                    
                    
                    // ETAPA : NIVEL 1
                    
                    /*
            
                        Explicacion :

                        En el comienzo si o si empezaras con el nivel 1 gracias 
                        al switch y a la variable nivel
                    
                        Mostramos unos mensajes, despues hacemos un bucle FOR 
                        para las sumas desde S1 hasta S2
                        
                        Le pedimos al player que nos diga su respuesta y despues
                        compramos las respuestas a traves con un if, si aciertas
                        continuarias al siguiente nivel, en caso contrario el 
                        player morira
                    
                        CAMBIOS URGENTES :  Hemos decidido subir el FOR de 
                        sumatorios desde S1 hasta S2 en un par de lineas para 
                        poder poner la solucion antes de introducirlo

                    */
                    
                    case 1:
                        System.out.println(AMARILLO + formato.repeat(cantidad) + "\n");
                        System.out.println(VERDE + "\t\t\t=== NIVEL 1 ===");
                        System.out.println(AMARILLO + "\t\t\t----------------\n");
                        System.out.println(VERDE + "Los problemas empiezan "
                                + "cuando deben realizar un salto hiper"
                                + ""
                                + "espacial "
                                + "hasta al\n" + VERDE + "sistema " + S1 + " en "
                                + "el sector " + S2 + ", pero el sistema de "
                                + "navegación está estropeado y el\n" + VERDE 
                                + "computador tiene problemas para calcular "
                                + "parte de las coordenadas de salto.\n" + VERDE 
                                + "Chewbacca, piloto experto, se da cuenta que "
                                + "falta el cuarto número de la serie.\n" + VERDE 
                                + "Recuerda de sus tiempos en la academia de "
                                + "pilotos que para calcularlo hay que\n" + VERDE 
                                + "calcular el sumatorio entre el nº del sistema"
                                + " y el nº del sector (ambos inclusive).\n" 
                                + VERDE + "¿Qué debe introducir?" + RESET);
                        
                        for (int sumatorios = S1; sumatorios <= S2; sumatorios++) {
                            sumas += sumatorios;
                        } // FOR para los sumatorios desde S1 hasta S2
                        
                        // SOLUCION - NIVEL 1
                        System.out.println(sumas);
                        
                        
                        do {
                            verificar_tipo = true;
                            
                            try {
                                System.out.print("\nSu respuesta : ");
                                respuesta = sc.nextInt();
                            } catch (Exception e) {
                                System.err.println("Error : Has introducido un "
                                        + "caracter no numerico");
                                sc.nextLine();
                                verificar_tipo = false;
                            } // TRY-CATCH para verificar el tipo de dato
                            
                        } while (!verificar_tipo); // DO-WHILE, verificar si es True
                        
                        
                        
                        if (respuesta == sumas) {
                            System.out.println("\n" + VERDE + "Enhorabuena, "
                                    + "pasas al siguiente nivel\n");
                        } else {
                            life = false;
                        } // IF-ELSE para verificar si el player acerto o no
                        
                        break;
                        
                        
                    // ETAPA : NIVEL 2
                    
                    /*
            
                        Explicacion :

                        Seguira el nivel 2 si el player no murio antes
                        
                        Le pedimos al player que nos diga su respuesta y despues
                        compramos las respuestas a traves con un if, si aciertas
                        continuarias al siguiente nivel, en caso contrario el 
                        player morira
                        
                        En otras palabras sucedera lo mismo que el anterior nivel
                    

                    */    
                        
                    case 2:
                        System.out.println(AMARILLO + formato.repeat(cantidad) + "\n");
                        System.out.println(VERDE + "\t\t\t=== NIVEL 2 ===");
                        System.out.println(AMARILLO + "\t\t\t----------------\n");
                        System.out.println(VERDE + "Gracias a Chewbacca consiguen"
                                + " llegar al sistema correcto y ven a lo lejos "
                                + "la estrella\n" + VERDE + "de la muerte. Como "
                                + "van en una nave imperial robada se aproximan "
                                + "lentamente con\n" + VERDE + "la intención de "
                                + "pasar desapercibidos. De repente suena el "
                                + "comunicador. “Aquí\n" + VERDE + "agente de "
                                + "espaciopuerto " + P1 + " contactando con nave"
                                + " imperial " + P2 + ". No están destinados\n" 
                                + VERDE + "en este sector. ¿Qué hacen aquí?”. "
                                + "Han Solo coge el comunicador e improvisa.\n" 
                                + VERDE + "“Eh… tenemos un fallo en el… eh… "
                                + "condensador de fluzo... Solicitamos permiso\n" 
                                + VERDE + "para atracar y reparar la nave”. El "
                                + "agente, que no se anda con tonterías, "
                                + "responde\n" + VERDE + "“Proporcione código de"
                                + " acceso o abriremos fuego”. Han Solo ojea "
                                + "rápidamente el\n" + VERDE +"manual del piloto"
                                + " que estaba en la guantera y da con la página"
                                + " correcta. El código\n" + VERDE + "es el "
                                + "productorio entre el nº del agente y el nº de"
                                + " la nave (ambos inclusive).\n" + VERDE 
                                + "¿Cuál es el código?" + RESET);
                        
                        for (int productorio = P1; productorio <= P2; productorio++) {
                            productos *= productorio;
                        } // FOR para los productorios desde P1 hasta P2

                        // SOLUCION - NIVEL 2
                        System.out.println(productos);
                        
                        do {
                            verificar_tipo = true;
                            
                            try {
                                System.out.print("\nSu respuesta : ");
                                respuesta = sc.nextInt();
                            } catch (Exception e) {
                                System.err.println("Error : Has introducido un "
                                        + "caracter no numerico");
                                sc.nextLine();
                                verificar_tipo = false;
                            } // TRY-CATCH para verificar el tipo de dato
                            
                        } while (!verificar_tipo); // DO-WHILE, verificar si es True
                        
                        
                        if (respuesta == productos) {
                            System.out.println("\n" + VERDE + "Enhorabuena, "
                                    + "pasas al siguiente nivel\n");
                        } else {
                            life = false;
                        } // IF-ELSE para verificar si el player acerto o no
                        
                        break;
                        
                        
                    // ETAPA : NIVEL 3
                    
                    /*
            
                        Explicacion :

                        Lo mismo que el anterior, lo unico que cambia es la 
                        condicion del FOR que es N/10 para hacer la factorial
                        hasta x 
                    

                    */   
                        
                    case 3:
                        System.out.println(AMARILLO + formato.repeat(cantidad) + "\n");
                        System.out.println(VERDE + "\t\t\t=== NIVEL 3 ===");
                        System.out.println(AMARILLO + "\t\t\t----------------\n");
                        System.out.println(VERDE + "Han Solo proporciona el "
                                + "código correcto. Atracan en la estrella de la"
                                + " muerte, se\n" + VERDE + "equipan con trajes "
                                + "de soldados imperiales que encuentran en la "
                                + "nave para pasar\n" + VERDE + "desapercibidos"
                                + " y bajan. Ahora deben averiguar en qué nivel "
                                + "de los " + N + " existentes se\n" + VERDE 
                                + "encuentra el reactor principal. Se dirigen "
                                + "al primer panel computerizado que\n" + VERDE 
                                + "encuentran y la Princesa Leia intenta acceder"
                                + " a los planos de la nave pero necesita\n" 
                                + VERDE + "introducir una clave de acceso. "
                                + "Entonces recuerda la información que le "
                                + "proporcionó\n" + VERDE + "Lando Calrissian "
                                + "“La clave de acceso a los planos de la nave "
                                + "es el factorial de N/10\n" + VERDE 
                                + "(redondeando N hacia abajo), donde N es el nº"
                                + " de niveles”.\n" + VERDE + "¿Cual es el nivel"
                                + " correcto?" +  RESET);
                        
                        for (int productorio = 1; productorio <= N / 10; productorio++) {
                            productos *= productorio;
                        } // FOR para los productorios desde 1 hasta N

                        // SOLUCION - NIVEL 3
                        System.out.println(productos);
                        
                        do {
                            verificar_tipo = true;
                            
                            try {
                                System.out.print("\nSu respuesta : ");
                                respuesta = sc.nextInt();
                            } catch (Exception e) {
                                System.err.println("Error : Has introducido un "
                                        + "caracter no numerico");
                                sc.nextLine();
                                verificar_tipo = false;
                            } // TRY-CATCH para verificar el tipo de dato
                            
                        } while (!verificar_tipo); // DO-WHILE, verificar si es True
                        
                        
                        if (respuesta == productos) {
                            System.out.println("\n" + VERDE + "Enhorabuena, "
                                    + "pasas al siguiente nivel\n");
                        } else {
                            life = false;
                        } // IF-ELSE para verificar si el player acerto o no
                        
                        
                        
                        break;
                        
                        
                        
                    // ETAPA : NIVEL 4
                    
                       
                    /*
                        
                        Explicacion :

                        En este nivel se genera un número aleatorio P y se 
                        comprueba si es un numero primo o no
                        
                        Para eso vamos a recorrer con un bucle desde 2 
                        hasta P-1 verificando si existe algún divisor
                        
                        Pero si se encuentra un divisor es que el número no 
                        es primo
                        
                        La solución será 1 si el número es primo y 0 
                        en caso contrario
                        
                        Incluso hemos hecho la validacion de la entrada del 
                        usuario para que solo pueda introducir 0 o 1
                        y no se permite avanzar de nivel si la respuesta 
                        es incorrecta.
                    

                    */ 
                        
                    case 4:
                        System.out.println(AMARILLO + formato.repeat(cantidad) + "\n");
                        System.out.println(VERDE + "\t\t\t=== NIVEL 4 ===");
                        System.out.println(AMARILLO + "\t\t\t----------------\n");
                        System.out.println(VERDE + "Gracias a la inteligencia de"
                                + " Leia llegan al nivel correcto y encuentran "
                                + "la puerta\n" + VERDE + "acorazada que da al "
                                + "reactor principal. R2D2 se conecta al panel "
                                + "de acceso para\n" + VERDE + "intentar hackear"
                                + " el sistema y abrir la puerta. Para "
                                + "desencriptar la clave necesita\n" + VERDE 
                                + "verificar si el número " + P + " es primo o "
                                + "no. Si es primo introduce un 1, si no lo "
                                + "es\n" + VERDE + "introduce un 0." + RESET);
                        
                        int solucion = 1;
                        
                        for (int i = 2; i < P; i++) {
                            if (P % i == 0) {
                                solucion = 0;
                            } // IF para verificar si es primo o no
                        } // FOR para recorre todos los numero 
                        

                        // SOLUCION - NIVEL 4
                        System.out.println(solucion);
                        
                        do {
                            verificar_tipo = true;
                            
                            try {
                                System.out.print("\nSu respuesta : ");
                                respuesta = sc.nextInt();
                                
                                if (respuesta > 1 || respuesta < 0) {
                                    System.err.println("Error : Has introducido"
                                            + " su respuesta fuera de 0 y 1");
                                    verificar_tipo = false;
                                } // IF para que no salga de 0 y 1 
                                
                            } catch (Exception e) {
                                System.err.println("Error : Has introducido un "
                                        + "caracter no numerico");
                                sc.nextLine();
                                verificar_tipo = false;
                            } // TRY-CATCH para verificar el tipo de dato
                            
                        } while (!verificar_tipo); // DO-WHILE
                        
                        
                        if (respuesta == solucion) {
                            System.out.println("\n" + VERDE + "Enhorabuena, "
                                    + "pasas al siguiente nivel\n");
                        } else {
                            life = false;
                        } // IF-ELSE para verificar si el player acerto o no
                        
                        
                        break;
                        
                        
                    // ETAPA : NIVEL 5
                    
                       
                    /*
                        
                        Explicacion :

                        En este nivel se nos generara dos valores (M y S)
                        Hacemos los calculos factoriales con M y S con dos 
                        bucles FOR , una vez terminado sumamos ambos y le pedimos
                        al usuario su respuesta y despues lo compramos, si es 
                        correcta se pasa a la siguiente, si no ganas el player
                        pierde el juego
                    

                    */ 
                        
                    case 5:
                        System.out.println(AMARILLO + formato.repeat(cantidad) + "\n");
                        System.out.println(VERDE + "\t\t\t=== NIVEL 5 ===");
                        System.out.println(AMARILLO + "\t\t\t----------------\n");
                        System.out.println(VERDE + "Consiguen entrar al reactor."
                                + " Ya solo queda que Luke Skywalker coloque la "
                                + "bomba,\n" + VERDE + "programe el temporizador"
                                + " y salir de allí corriendo. Necesita "
                                + "programarlo para que\n" + VERDE + "explote en"
                                + " exactamente " + M + " minutos y " + S 
                                + " segundos, el tiempo suficiente para "
                                + "escapar\n" + VERDE + "antes de que explote "
                                + "pero sin que el sistema de seguridad "
                                + "anti-explosivos detecte y\n" + VERDE 
                                + "desactive la bomba. Pero el temporizador "
                                + "utiliza un reloj Zordgiano un tanto\n" 
                                + VERDE + "peculiar. Para convertir los minutos "
                                + "y segundos al sistema Zordgiano hay que "
                                + "sumar\n" + VERDE + "el factorial de M y el "
                                + "factorial de S. ¿Qué valor debe introducir?" 
                                + RESET);
                        
                        int factorialM = 1;
                        int factorialS = 1;
                        
                        for (int productorio = 1; productorio <= M; productorio++) {
                            factorialM *= productorio;
                        } // FOR para los productorios desde 1 hasta M
                        
                        for (int productorio = 1; productorio <= S; productorio++) {
                            factorialS *= productorio;
                        } // FOR para los productorios desde 1 hasta S
                        
                        // Sumamos las dos multiplicaciones
                        sumas = factorialM + factorialS;
                        
                        // SOLUCION - NIVEL 4
                        System.out.println(sumas);
                        
                        do {
                            verificar_tipo = true;
                            
                            try {
                                System.out.print("\nSu respuesta : ");
                                respuesta = sc.nextInt();
                            } catch (Exception e) {
                                System.err.println("Error : Has introducido un "
                                        + "caracter no numerico");
                                sc.nextLine();
                                verificar_tipo = false;
                            } // TRY-CATCH para verificar el tipo de dato
                            
                        } while (!verificar_tipo); // DO-WHILE, verificar si es True
                        
                        
                        if (respuesta == sumas) {
                            System.out.println("\n" + VERDE + "Enhorabuena, "
                                    + "pasas al siguiente nivel\n");
                        } else {
                            life = false;
                        } // IF-ELSE para verificar si el player acerto o no
                        
                        break;
                        
                        
                        
                    // ETAPA : GANAR
        
                    /*

                        Explicacion :

                        Si el player pasa todas las fases o niveles ira al 
                        case 6 donde representa el ganador, mostramos un mensaje
                        y ponemos su vida final

                    */
                        
                    case 6:
                        System.out.println(AMARILLO + formato.repeat(cantidad) + "\n");
                        System.out.println(AZUL + "Luke Skywalker introduce el "
                                + "tiempo correcto, activa el temporizador y "
                                + "empiezan a\n" + AZUL + "sonar las alarmas. "
                                + "Salen de allí corriendo, no hay tiempo que "
                                + "perder. La nave se\n" + AZUL + "convierte en "
                                + "un hervidero de soldados de arriba a abajo y"
                                + " entre el caos que les rodea\n" + AZUL 
                                + "consiguen llegar a la nave y salir de allí a"
                                + " toda prisa. A medida que se alejan\n" + AZUL
                                + "observan por la ventana la imagen de la "
                                + "colosal estrella de la muerte explotando en\n" 
                                + AZUL + "el silencio del espacio, desapareciendo"
                                + " para siempre junto a los restos del malvado\n" 
                                +  AZUL + "imperio.\n" + AZUL + "¡Has salvado la "
                                + "galaxia gracias a la Fuerza Jedi de las "
                                + "matemáticas! Enhorabuena ;D");
                        
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
                System.out.println("\n" + AMARILLO + formato.repeat(cantidad));
                System.out.println("\n" + ROJO +"Ese no era el código correcto… "
                        + "La misión ha sido un fracaso… :( :( :(\n" + ROJO 
                        +"Todavía no eres un Maestro Jedi de las Matemáticas. "
                        + "¡Vuelve a intentarlo!");
            } // IF para el mensaje si perdiste
            
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
