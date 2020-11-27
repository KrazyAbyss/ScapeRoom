	import java.awt.*;
	import java.util.Scanner;
	public class scaperoomEclipse {
	    public static void habitacion1A(int saludPersonaje,int corduraPersonaje,boolean cuchillo,boolean llave1A,boolean piezaSol,boolean escopeta,boolean piezaCruz,boolean cizalla,boolean piezaGolondrina,boolean piezaVirgen,boolean hacha){

	    }
	    public static String habitacion1B(int saludPersonaje,int corduraPersonaje,String estadoPlanta,boolean cuchillo,boolean llave1A,boolean piezaSol,boolean escopeta,boolean piezaCruz,boolean cizalla,boolean piezaGolondrina,boolean piezaVirgen,boolean hacha){
	        Scanner sc=new Scanner(System.in);
	        //En este subprograma declaro las variables booleans como siempre de los objetos y de la habitacion  para poder salir y entrar
	        boolean primeroB=true,fertilizante=false,botellaDeCristal=false;
	        //Aqui declaramos la variable que utilizaremos para movernos, la de los puzzles y la de la planta que explicare en la siguiente linea
	        String movimiento1B,combinacion="",respuesta,planta;
	        //Creo una nueva variable que sea igual que la variable estadoPlanta para diferenciar la variable del subprograma con la del programa principal
	        planta=estadoPlanta;
	        //texto ambiental
	        System.out.println("Entras en la habitacion 1B. Al entrar lo primero que ves son varias mesas, unas estan llenas de documentos, otras unas maquinas raras y otra tiene una especie de planta gigante.\n " +
	                "Además de eso ves una estantería llena de botellas y líquidos.");

	        do {
	            //Aqui, como en todas la habitaciones, utilizo un do while y un switch para los menús
	            System.out.println("\n" +
	                    "¿A donde quieres ir?\n" +
	                    "1.- Mesa con los documentos\n" +
	                    "2.- Maceta con la planta\n" +
	                    "3.- Zona de instrumentos \n" +
	                    "4.- Armario\n" +
	                    "5.- Puerta\n" +
	                    "6.- Consultar tu estado\n" +
	                    "7.- Rendirse(Salir del juego)\n");
	            movimiento1B=sc.next();
	            //Aqui hago un switch para hacer las diferentes opciones, añadiendo el default para validar lo introducido por teclado
	            switch(movimiento1B){
	                case "1":
	                    //Añado un poco de texto ambiental junto a una pista para un puzzle
	                    System.out.println("Te acercas a la mesa,hay varios documentos esparcidos por toda ella pero destaca uno por encima del resto que dice: \n" +
	                            "Para crear el fertilizante tienes que echar dos veces sulfuro de hidrogeno, una vez hierro liquido y por ultimo un poco de peroxido de hidrogeno \n" +
	                            "'Esta combinación parece importante, debería recordarla'");
	                    break;
	                case "2":

	                    //Aqui nos encontramos uno de los puzzles, a este podremos accer si la planta esta en el estado "NoFertilizado"
	                    //Esto lo hago asi ya que la planta puede tener entre tres estados y con las heramientas disponibles creo ques la mejor forma
	                    //Entonces si la planta esta no fertilizada significara que el puzzle no se ha hecho pero se puede hacer
	                    if(planta.equals("NoFertilizada")){

	                        //Aqui nos dira que tenemos que hacer para fertilizar a la planta
	                        System.out.println("Te acercas a la planta, es una especie bastante rara, a su lado hay un posit que pone: \n" +
	                                "'Recuerda que tienes que echarle el fertilizante a la planta, debería haber algún bote vacio en la estanteria,cuando lo tengas utiliza el instrumental para hacerlo.\n" +
	                                "P.D: Si no te acuerdas de la combinacion, deberia estar en los documentos del laboratorio.\n" +
	                                "P.D.D: Cuando lo hagas no tardes mucho en utilizarlo, esta combinacion es muy inestable'");
	                        //Si conseguimos hacer el fertilizante se lo daremos a la planta y se volvera al estado "Fertilizada"
	                        if(fertilizante){
	                            System.out.println("Coges el fertilizante y lo utilizas en la planta, esta crece exponencialmente hasta tener una presencia magnífica. No parece que vaya a pasar nada más.");
	                            //Ademas los objetos fertilizante y botella de cristal se pondran como falsos, para no volver a utilizarlos
	                            fertilizante=false;
	                            botellaDeCristal=false;
	                            planta="Fertilizada";
	                        }else{
	                            System.out.println("No tienes nada parecido a un fertilizante asi que no puedes hacer nada con la planta");
	                        }
	                    //Si la planta esta fertilizada nos pondra un texto ambiental y ya
	                    }else if(planta.equals("Fertilizada")){
	                        System.out.println("Te acercas a la planta. Sus colores vivos hacen que te olvides por un momento en todo el horror de la situacion, en cierto modo, te tranquiliza.");
	                     //El tercer y utlimo estado se dara si intentamos el puzzle pero fallamos, no pudiendo hacer el fertilizante y no pudiendo fertilizarla
	                    }else{
	                        System.out.println("La planta sigue ahi, esperando un fertilizante que nunca llegara por tu ineptitud");
	                    }
	                    break;
	                case "3":
	                    System.out.println("Te acercas al instrumental del laboratorio. Ves numerosos utensilios punzantes, cortantes, perforantes..., gasas, vendas sin usar y unos extraños dispensadores de diferentes liquidos, estan marcados con etiquetas");
	                    //Aqui hago este if para evitar que el puzzle se repita si:
	                    //Lo has intentado y has fallado
	                    //Si ya lo has hecho(el puzzle o el fertilizante)
	                    //Si no has cogido la botella
	                    if(planta.equals("NoFertilizada")&&(!fertilizante)&&(botellaDeCristal)){
	                        System.out.println("Coges la botella de cristal decidido a hacer el fertilizante");

	                        //Aqui meto un bucle que servira para hacer la combinacion del fertilizante(el puzzle)

	                        for(int i=0;i<=3;i++){
	                            System.out.println("1.- Fe (Líquido Gris)\n" +
	                                                "2.- H2S (Líquido Azul)\n" +
	                                                "3.- H2O2 (Liquido Amarillo)");
	                            combinacion+=sc.next();
	                        }
	                        //Este if anidado lo utilizaod para comprobar si la combinacion es correcta o no
	                        if(combinacion.equals("2213")){
	                            System.out.println("Echas el último líquido y aunque en un primer momento parece que va a explotar, finalmente para y se estabiliza,. No te haces muchas preguntas y supones que lo has hecho bien.");
	                            fertilizante=true;
	                        }else{
	                            //Si lo fallas no podras volver a intentar el puzzle, para eso el estado 'ImposibleDeFertilizar'
	                            System.out.println("Echas el ultimo liquido en la combinacion. Esta adquiere un color marron, empieza a echar espuma y comienza a temblar. Lo tiras contra la pared antes de que te reviente en la mano.\n" +
	                                    " 'Definitivamente, la química no es lo mio'.");
	                            planta="ImposibleDeFertilizar";
	                            botellaDeCristal=false;
	                        }
	                    }
	                    break;
	                case "4":
	                    //Este if esta hecho para que la botella de cristal solo se puede coger una  vez
	                    if((!botellaDeCristal)&& planta.equals("NoFertilizada")) {
	                        System.out.println("Te acercas al armario. Está lleno de botes y líquidos misterioses, entre ellos ves un bote vacio que podria servirte, ¿quieres cogerlo?\n" +
	                                "1.-SI\n" +
	                                "2.-NO");
	                        respuesta = sc.next();
	                        if (respuesta.equals("1")) {
	                            System.out.println("Alargas la mano y coges la botella,esto podria servir para hacer el fertilizante");
	                            botellaDeCristal = true;
	                        }else{
	                            System.out.println("No sabes si cogerla o no, pero el tiempo apremia y no puedes perderlo en semejante estupidez, decides continuar tu camino");
	                        }
	                    }else{
	                        System.out.println("Ves muchos liquidos y compuestos misteriosos, pero nada util con tus conccimientos tan mediocres");
	                    }
	                    break;
	                case "5":
	                    //Aqui salimos de la habitacion, si salimos y tenemos la botella de cristal, la dejaremos en el armario
	                    //Si tenemos el fertilizante este explotara,impidiendo su uso
	                    //Esto lo hago ante la imposibilidad de devolver más de un objeto
	                    primeroB=false;
	                    if(fertilizante){
	                        System.out.println("Ves que el fertilizante que adquiere un color marron, empieza a echar espuma y comienza a temblar. Lo tiras contra la pared antes de que te reviente en la mano.\n" +
	                                " 'Pues si que era inestable la mezcla'");
	                        planta="ImposibleDeFertilizar";
	                        botellaDeCristal=false;
	                    }else if(botellaDeCristal){
	                        System.out.println("No puedes cargar con la botella todo el tiempo, decides dejarla en el armario donde la habías encontrado");
	                    }
	                    break;
	                    //Aqui, como en todos los menús, ponemos los subprogramas de menús de estados y para salir del juego
	                case "6":
	                    menuEstadoPersonaje(saludPersonaje,corduraPersonaje,cuchillo,llave1A,piezaSol,escopeta,piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                    break;
	                case "7":
	                    salirDelJuego();
	                    break;
	                default:
	                    //Aquí ponemos la opción para validar
	                    System.out.println("Opción incorrecta, el tiempo corre en tu contra, no puedes fallar");
	            }
	        }while(primeroB);
	        return planta;
	    }
	    public static boolean habitacion1C(int saludPersonaje,int corduraPersonaje,boolean candado,boolean cuchillo,boolean llave1A,boolean piezaSol,boolean escopeta,boolean piezaCruz,boolean cizalla,boolean piezaGolondrina,boolean piezaVirgen,boolean hacha){
	        Scanner sc=new Scanner(System.in);
	        boolean primeroC=true;
	        String movimiento1C,contraseña;
	        do{
	            //Hacemos un do while para que se repita el menú mientras estemos en la habitación, que será un boolean
	            System.out.println("\n" +
	                    "¿A donde quieres ir?\n" +
	                    "1.- Mesa\n" +
	                    "2.- Puerta\n" +
	                    "3.- Tablon \n" +
	                    "4.- Consultar tu estado\n" +
	                    "5.- Rendirse(Salir del juego)\n");
	            movimiento1C=sc.next();
	            //Aqui hago un switch para hacer las diferentes opciones, añadiendo el default para validar opciones
	            switch (movimiento1C){
	                case "1":
	                    System.out.println("LLegas a la mesa, hay varios documentos de poco importancia menos uno que destaca por encima del resto, parece el fichero de un paciente de un psiquiátrico, destaca porque esta enteramente tachado y solo se ven las siguientes letras BPLEAULC,no ves nada más interesante");
	                    break;
	                case "2":
	                    //Aqui hay un if para que en caso de que averigue la contraseña haga el cambio de habitacion, pero si no se quede en la misma
	                    //Añado la  variable 'candado' para que cuando consiga abrirlo no tenga que abrirlo cada vez que entra en la habitacion
	                    if(candado){
	                        System.out.println("LLegas a la puerta y te encuentras que está cerrado con un candado numérico que admite hasta tres cifras:");
	                        System.out.println("Introduce una clave");
	                        contraseña=sc.next();
	                        if (contraseña.equals("040")){
	                            System.out.println("Al poner el último número notas como el candado se abre permitiendote salir de la habitacion");
	                            //Aqui hago "el primer cambio de habitacion" que yo lo hago con booleanos
	                            primeroC=false;
	                        }else{
	                            System.out.print("Contraseña incorrecta");
	                        }
	                    }else{
	                        System.out.println("Vuelves al vestíbulo");
	                        primeroC=false;
	                    }
	                    break;
	                case "3":
	                    System.out.print("Te acercas al tablon donde puedes ver un folleto del psiquiatrico donde habla de lo bueno que es y los increibles resultados que han tenido con 'casos sin retorno' como los enfermos mentales." +
	                            "\n A su lado te ecuentras un extracto de un periodico que habla sobre un asesinato multiple que ocurrio en dicho psiatrico, " +
	                            "\n 'uno de los pacientes se escapo y mato a todos los pacientes y trabajadores que habia...'no se puede leer más");
	                    break;
	                //Aqui añadimos las opciones al menu para comprobar el estado del jugador y para salir dlejuego, como en todos los menus
	                case "4":
	                    menuEstadoPersonaje( saludPersonaje,corduraPersonaje,cuchillo,llave1A,piezaSol,escopeta,piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                    break;
	                case "5":
	                    salirDelJuego();
	                default:
	                    //Aquí ponemos la opción para validar
	                    System.out.println("Opción incorrecta, el tiempo corre en tu contra, no puedes fallar");
	            }
	        }while(primeroC);
	        return primeroC;
	    }
	    public static String habitacion1D(String parteScapeRoom,int saludPersonaje,int corduraPersonaje,boolean cuchillo,boolean llave1A,boolean piezaSol,boolean escopeta,boolean piezaCruz,boolean cizalla,boolean piezaGolondrina,boolean piezaVirgen,boolean hacha){
	        Scanner sc=new Scanner(System.in);
	        //Booleans para la habitacion y los objetos que se pueden coger en ellea
	        boolean primeroD=true,cogerPieza=false;
	        //Aqui hago las variables del movimiento, puzzle y una para controlar un evento que pasa en esta habitacion
	        String estadoScapeRoom,movimiento1D,respuesta;
	        //Esta variable la declaro para poder controlar los eventos y controlar que solo pasen una vez y no infinitas veces
	        estadoScapeRoom=parteScapeRoom;
	        System.out.println("Entras en la habitacion 1D. La habitacion es bastante parecida a aquella en la que te despertaste.\n " +
	                "Hay una camilla con correas en el centro de la habitacion, ademas de una mesa y un armario a su lado");
	        do {
	            //Hacemos un do while para que se repita el menú mientras estemos en la habitación, que será un boolean
	            System.out.println("\n" +
	                    "¿A donde quieres ir?\n" +
	                    "1.- Camilla\n" +
	                    "2.- Mesa\n" +
	                    "3.- Armario \n" +
	                    "4.- Puerta \n" +
	                    "5.- Consultar tu estado\n" +
	                    "6.- Rendirse(Salir del juego)\n");
	            movimiento1D=sc.next();
	            switch(movimiento1D){
	                case "1":
	                    System.out.println("Te acercas a la camilla. Las correas estan roidas, desgastadas pero sorprendentemente estan rigidas.\n " +
	                            "Al intentar aflojarlas no puedes y un escalofrio te recorre el cuerpo, como si alguien estuviera observandote");
	                    break;
	                case "2":
	                    System.out.println("Te acercas a la mesa, hay muchos documentos.\n" +
	                            " Te centras en uno, es un documento medico de uno de los pacientes, por lo que lees tiene personalidad múltiple y cometio un gran numero de asesinatos.\n" +
	                            " El nombre de las personalidades no sale, estan tachadas con...'¿sangre?.'");
	                    break;
	                case "3":
	                    //Aqui utilizo lavariable de la parte de la scape room para  controlar los eventos que pasan
	                    if (estadoScapeRoom.equals("Parte0")) {
	                        System.out.println("Te acercas al armario, al abrirlo ves varias herramientas quirúrgicas, vendas, pastillas..., pero te destaca una pieza de madera que tiene grabado un sol.\n" +
	                                "¿La coges?\n"+
	                                "1.-SI\n" +
	                                "2.-NO");
	                        respuesta=sc.next();
	                        if(respuesta.equals("1")){
	                            //Aqui utilizo la variable cogerPieza para que asi no puedas coger infinitas piezas, ademas de que luego lo utilizo para hacer el cambio de parte en la scape room
	                            cogerPieza=true;
	                            //pongo la variable piezaSol para poder mostrar este objeto en el inventario si el usuario
	                            //deccide comprobarlo en la habitacion justo despues de cogerlo
	                            piezaSol=true;
	                        }else{
	                            System.out.println("Aunque parece algo importante, decides dejar la pieza en el armario");
	                        }

	                    }else{
	                        System.out.println("Te acercas al armario, al abrirlo ves varias herramientas quirúrgicas, vendas, pastillas... . No ves nada interesante para coger");
	                    }
	                    break;
	                case "4":
	                	//Vuelta al vestibulo
	                    System.out.println("Decides volver al vestíbulo");
	                    primeroD=false;
	                    break;
	                case "5":
	                    menuEstadoPersonaje(saludPersonaje,corduraPersonaje,cuchillo,llave1A,piezaSol,escopeta,piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                    break;
	                case "6":
	                    salirDelJuego();
	                default:
	                    System.out.println("Opción incorrecta, el tiempo corre en tu contra, no puedes fallar");
	            }
	            //Este if lo hago para que en caso de que cogerPieza sea true yla parte de la scape room sea la 0 se produzca el evento, si no se cumple eso no sucede nada
	            if((cogerPieza)&&(estadoScapeRoom.equals("Parte0"))){
	                System.out.println("Coges la pieza y al guardartela notas como la cabeza empieza a dolerte.\n" +
	                        " Un chillido incesante te destruye los oidos y hace que te bombee la cabeza, caes y cuando parece que el dolor va a acabar contigo el sonido mengua, lentamente hasta desaparecer.\n" +
	                        " No sabes lo que ha pasado pero notas el ambiente como raro, mas oscuro y la sensacion de inquietud es cada vez más creciente");
	                estadoScapeRoom="Parte1";
	            }
	        }while(primeroD);

	        return estadoScapeRoom;
	    }
	    public static boolean habitacionA1(int saludPersonaje,int corduraPersonaje,boolean cuchillo,boolean llave1A,boolean piezaSol,boolean escopeta,boolean piezaCruz,boolean eventoHabitacionA1,boolean cizalla,boolean piezaGolondrina,boolean piezaVirgen,boolean hacha){
	    	//Aqui declaro las variables utilizadas para la habitacion y para moverse, esto es lo mismo en todas
	        boolean nota=false,habitacionA1=true;
	        String movimientoHabitacionA1;
	        Scanner sc=new Scanner(System.in);
	        //este if lo hago para que haya una entrada diferente dependiendo de si el evento todavia no se ha hecho o si ya se ha hecho
	        if(eventoHabitacionA1) {
	            System.out.println("Entras en la habitacion A1. Al entrar ves como hay un ventilador girando, de el hay una...persona colgada. No sabes como el ventilador se sostiene\n" +
	                    "El cadaver sigue girando y girando. Ademas ves una mesa con varios documentos");
	        }else{
	            System.out.println("Entras en la habitacion A1. El cadaver de antes yace junto al ventilador roto en el suelo.");
	        }
	        do {
	        	//hacemos el do while de todas las habitaciones
	            System.out.println("\n" +
	                    "¿A donde quieres ir?\n" +
	                    "1.- Mesa\n" +
	                    "2.- Ventilador\n" +
	                    "3.- Puerta \n" +
	                    "4.- Consultar tu estado\n" +
	                    "5.- Rendirse(Salir del juego)\n");
	            movimientoHabitacionA1 = sc.next();
	            //Un switch aqui para controlar el movimiento,al igual que en todas las habitaciones
	            switch (movimientoHabitacionA1) {
	                case "1":
	                    System.out.println("Te acercas a la mesa, ves varios documentos y entre ellos una nota:\n" +
	                            "'Tomas, el paciente nº3 se ha vuelto a escapar y ha cambiado la contraseña de la habitacion D1, sabes su\n " +
	                            "problema con las adivinanzas. Hemos intentado que nos diga la respuesta pero solo repite una cosa:\n" +
	                            "3 U 10. Si tienes idea de que puede significar dimelo.\n" +
	                            "Geronimo' ");
	                    //La variable nota esta hecha para controlar cuando tiene que pasar el evento
	                    //En este caso sera cuando el usuario haya leido la nota
	                    nota=true;
	                    break;
	                case"2":
	                	//Aqui hago otro if para hacer lo mismo que al principio, dos descripciones que saldra una u otra
	                	//Dependiendo de si el evento ha pasado o tiene que pasar
	                    if(eventoHabitacionA1) {
	                        System.out.println("Te acercas al ventilador. Sigue girando y el cuerpo con el." +
	                                "\n Ves que la persona llevaba un bata, que ahora esta completamente destrozada, con un corte longitudinal en el pecho. ");
	                    }else{
	                        System.out.println("Te acercas al ventilador. De la caida se ha destrozado, a su lado yace el cadaver aquel.");
	                    }
	                    break;
	                case"3":
	                	//Volvemos al vestibulo
	                    System.out.println("Vuelves al vestibulo");
	                    habitacionA1=false;
	                    break;
	                case"4":
	                    menuEstadoPersonaje(saludPersonaje,corduraPersonaje,cuchillo,llave1A,piezaSol,escopeta,piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                    break;
	                case"5":
	                    salirDelJuego();
	                default:
	                    System.out.println("Opción incorrecta, el tiempo corre en tu contra, no puedes fallar");
	            }
	            //Este es el evento, pongo dos condiciones para que pase cuando nota sea true y para que cuando se produzca
	            //eventoHabitacionA1 cambie a falso y no se repita mas.
	            if ((nota) && (eventoHabitacionA1)) {
	                System.out.println("Cuando coges la nota, escuchas un ruido estruendoso detrás tuya.\n" +
	                        " Al girarte te das cuenta de que el ventilador se ha caido y el cadaver esta de pie, mirandote.");
	                //El evento sera diferente dependiendo de si tenemos la cordura baja o no (tiene sentido por la historia)
	                //Si no tienes la cordura lo suficientemente baja lo que hara sera hacerte daño y ya.
	                if(corduraPersonaje<=80){
	                    System.out.println("Derrepente, ves como el cadaver levanta las manos, no para pegarte, si no como para protegerse el mismo \n" +
	                            "Ves como se va echando para atras, puedes observar el terror en sus ojos. \n" +
	                            "Entonces, notas como el aire se vuelve mas fuerte delante tuya por un momento. Cuando vuelves a mirar el cadaver,\n" +
	                            "Este tiene un corte en toda la frente, como si algo o alguien le hubiese clavado algo. La persona cae, muerta, al lado del ventilador");
	                    System.out.println("'Hay algo mas aqui aparte de yo, no se el que pero...debo tener cuidado.'");
	                }else{
	                    System.out.println("Con una fuerza y velocidad pasmosa, el cadaver se abalanza sobre ti, mordiendote el cuello.Gritas de dolor.\n" +
	                            "Consigues agarrar tu cuchillo y se lo clavas varias veces al bicho hasta que notas que sus fuerzas se extinguen." +
	                            "Sales de la habitacion con las pocas fuerzas que te quedan.");
	                            habitacionA1=false;
	                }
	            //Aqui hago el cambio de boolean a false para que no se repita el evento mas
	            eventoHabitacionA1=false;
	            }
	        }while(habitacionA1);
	        return eventoHabitacionA1;
	    }
	    public static String  habitacionB1(int saludPersonaje,int corduraPersonaje,boolean cuchillo,boolean llave1A,boolean piezaSol,String estadoPlanta,String estadoEscopeta,boolean escopeta,boolean piezaCruz,boolean cizalla,boolean piezaGolondrina,boolean piezaVirgen,boolean hacha){
	    	//Declaracion de variables: las de movimiento y de habitacion
	        Scanner sc=new Scanner(System.in);
	        boolean habitacionB1=true;
	        String movimientoHabitacionB1;
	        //Aqui utilizo el estado de Planta, variable declarada en el main para saber si la planta estara viva o no
	        //Si te acuerdas esto dependera del puzzle de la habitacion 1B, que un primer momento parecia que no valia  para nada.
	        //Utilizo dos ifs para diferenciar, se que podria haberlo hecho como en la habitacion A1 pero preferi hacerlo asi porque quedaba mas claro
	        //al menos a mi parecer.
	            if (estadoPlanta.equals("Fertilizada")){
	                System.out.println("Entras a la habitacion B1. Se parece bastante al laboratorio del principio," +
	                        "hay una especie de maceta gigante donde hay una planta carbonizada.\n" +
	                        "'¿Tuvo algo que ver lo que hice con la planta aquella...?'\n" +
	                        "Detras suya ves un estante con una escopeta");
	                do {
	                    System.out.println("\n" +
	                            "¿A donde quieres ir?\n" +
	                            "1.- Mesa\n" +
	                            "2.- Estante\n" +
	                            "3.- Puerta \n" +
	                            "4.- Consultar tu estado\n" +
	                            "5.- Rendirse(Salir del juego)\n");
	                    movimientoHabitacionB1=sc.next();
	                    switch (movimientoHabitacionB1){
	                    //Aqui metemos texto ambiental y tambien una pista para un puzzle futuro
	                        case "1":
	                            System.out.println("Te acercas a la mesa, no ves nada importante, pero al acercarte ves ordenador encendido, el teclado esta manchado de sangre y algunas teclas estan saltadas. Hay algo escrito en la pantalla, parece un correo sin enviar: \n" +
	                                    "'Necesitamos ayuda. Se ha escapado con todos, me he encontrado antes un cadaver que tenia escrito\n" +
	                                    " 'el sol siempre a la derecha y arriba, para que alumbre', no se lo que signficia, se lo ha grabado a un paciente en el torso." +
	                                    "Viene para aca, le escucho, sabe que estoy aqui, no me queda mucho tiempo, por favor, manden reeeeeeeeeeeeejkfeqbujbf fewujb ...'\n" +
	                                    " el resto de palabras son teclas aleatorias, como si alguien hubiese aporreado el teclado'");
	                            System.out.println("'Que cojones hay aqui, que es lo que anda suelto'");
	                            break;
	                        //Aqui utilizo la variable estadoEscopeta, declarada e inicializada en el main, para controlar si la escopeta se ha cogido y evitar que se cogan infinitas escopetas
	                        //Esta escopeta nos servira para uno de los finales.    
	                        case "2":
	                            if(estadoEscopeta.equals("NoCogida")) {
	                                System.out.println("Te acercas al estante,la planta esta carbonizada y no parece que  vaya a hacer nada. Puedes acercate a la escopeta. La coges. Ahora te sientes mas seguro.Tiene una bala, parece que solo tiene un uso");
	                                //Aqui lo que hago es cambiar el estado de la escopeta y la variable escopeta
	                                //La primera para evitar que puedes cogar varias escopetas
	                                //La segunda para que te salga en el inventario en la misma habitacion
	                                estadoEscopeta="Cogida";
	                                escopeta=true;
	                                break;
	                            }else{
	                                System.out.println("Te acercas al estante, no parece que haya nada más importante.La planta sigue carbonizada.");
	                            }
	                        //Aqui hago las mismas opciones de las habitaciones, para poder salir de la habitacion, del juego y poder salir del juego    
	                        case "3":	       
	                            System.out.println("Vuelves al vestibulo");
	                            habitacionB1=false;
	                            break;
	                        case "4":
	                            menuEstadoPersonaje(saludPersonaje,corduraPersonaje,cuchillo,llave1A,piezaSol,escopeta,piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                            break;
	                        case"5":
	                            salirDelJuego();
	                        default:
	                            System.out.println("Opción incorrecta, el tiempo corre en tu contra, no puedes fallar");
	                    }
	                }while(habitacionB1);
	             //En este if hago lo mismo que en el anterior, solo hay cambios a la hora de coger la escopeta
	            }else{
	                System.out.println("Entras a la habitacion B1. Se parece bastante al laboratorio del principio," +
	                        "hay una especie de maceta gigante donde hay una planta enorme.\n" +
	                        "No sabes muy bien si es agresiva o no, aunque parece una planta carnivora.\n" +
	                        "Detras suya ves un estante con una escopeta");
	                do {
	                    System.out.println("\n" +
	                            "¿A donde quieres ir?\n" +
	                            "1.- Mesa\n" +
	                            "2.- Estante\n" +
	                            "3.- Puerta \n" +
	                            "4.- Consultar tu estado\n" +
	                            "5.- Rendirse(Salir del juego)\n");
	                    movimientoHabitacionB1=sc.next();
	                    switch (movimientoHabitacionB1){
	                        case "1":
	                            System.out.println("Te acercas a la mesa, no ves nada importante, pero al acercarte ves ordenador encendido, el teclado esta manchado de sangre y algunas teclas estan saltadas. Hay algo escrito en la pantalla, parece un correo sin enviar: \n" +
	                                    "'Necesitamos ayuda. Se ha escapado con todos, me he encontrado antes un cadaver que tenia escrito\n" +
	                                    " 'el sol siempre a la derecha y arriba, para que alumbre', no se lo que signficia, se lo ha grabado a un paciente en el torso." +
	                                    "Viene para aca, le escucho, sabe que estoy aqui, no me queda mucho tiempo, por favor, manden reeeeeeeeeeeeejkfeqbujbf fewujb ...'\n" +
	                                    " el resto de palabras son teclas aleatorias, como si alguien hubiese aporreado el teclado'");
	                            System.out.println("'Que cojones hay aqui, que es lo que anda suelto'");
	                            break;
	                        case "2":
	                        	//Al intentar ir a coger la escopeta,la planta nos atacara, nos impedira el paso y no podremos coger la escopeta
	                        	//Quitarnos vida solo lo hara una vez, por ello cambio el estado de la escopeta, para que no se repita el evento.
	                            if(estadoEscopeta.equals("NoCogida")) {
	                                System.out.println("Te intentas acercar al estante, en un primer momento la planta no se mueve pero al intentar aproximarte a la escopeta, la planta se abre descubriendo una boca mosntruosa que va hacia ti.\n" +
	                                        "Te muerde fuerte el torso, aun así con el cuchillo coges liberarte y huir, la planta vuelve a cerrarse.\n" +
	                                        "No parece que sea posible alcanzar la escopeta");
	                                estadoEscopeta="IntentodeCogida";
	                                saludPersonaje-=20;
	                                break;
	                            }else{
	                                System.out.println("Te gustaria coger la escopeta, pero esta la planta en medio. Antes has tenido suerte zafandote, pero es bastante probable que si lo vuelves a intentar, mueras." +
	                                        "'Este sitio es de locos'");
	                            }
	                        case "3":
	                            System.out.println("Vuelves al vestibulo");
	                            habitacionB1=false;
	                            break;
	                        case "4":
	                            menuEstadoPersonaje(saludPersonaje,corduraPersonaje,cuchillo,llave1A,piezaSol,escopeta,piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                            break;
	                        case"5":
	                            salirDelJuego();
	                        default:
	                            System.out.println("Opción incorrecta, el tiempo corre en tu contra, no puedes fallar");
	                    }
	                }while(habitacionB1);

	            }
	        //Devuelvo el estado de la escopeta para hacer los cambios en el main
	        return estadoEscopeta;
	    }
	    public static boolean habitacionC1(){	    
	        Scanner sc=new Scanner(System.in);
	        //Declaramos variables, destacamos la variable evento y que no este la variable de la habitacion
	        //Basicamente esta habitacion es especial, al entrar pasaran una serie de eventos que impdeiran al jugador hacer nada
	        //Cuando consiga salir de la habitacion no podra volver a entrar
	        //Saldra cuando se acabe el evento, por eso no hay un do while, si no un for.
	        boolean evento=false;
	        String movimientoHabitacionC1;
	        System.out.println("Entras a la habitacion, es completamente blanca con una pequeña alcantarilla, no ves nada más. ");
	        //Aqui hacemos el for, que dependiendo de la vuelta que sea, nos mostrara un menu u otro, todos controlados por switches
	        for(int i=0;i<=3;i++){
	        	//En el primer bucle podremos elegir para investigar un sitio o irnos, cabe destacar que en este sitio no podremos mirar los menus 
	            if(i==0){
	                System.out.print("¿A donde quieres ir" +
	                        "\n 1.- Alcantarilla" +
	                        "\n 2.- Salir\n");
	                movimientoHabitacionC1=sc.next();
	                switch (movimientoHabitacionC1){
	                    case"1":
	                        System.out.println("Te acercas a la alcantarilla. En un primer momento no ves nada pero al acercarte más consigues discernir un ojo, te está mirando fijamente." +
	                                "\n Te apartas rapidisimo para salir cuando te das cuenta que la puerta ha desaparecido, en su lugar hay una palabra escrita en sangre 'CULPABLE'");
	                        break;
	                    case"2":
	                        System.out.println("No ves nada interesante en la habitacion asi que decides salir pero \n" +
	                                " te das cuenta que la puerta ha desaparecido, en su lugar hay una palabra escrita en sangre 'CULPABLE'");
	                        break;
	                    default:
	                        System.out.println("Te quedas parado en medio de la habitacion cuando escuchas un sonido detras tuya, miras y" +
	                                "\n donde antes estana la puerta ahora hay una palabra escrita en sangre, 'CULPABLE'.La puerta ha desaparecido");
	                        break;
	                }	               
	            }else if(i==1){
	                System.out.print("¿A donde quieres ir?" +
	                        "\n 1.- Alcantarilla" +
	                        "\n 2.- Salir\n");
	                movimientoHabitacionC1=sc.next();
	                switch (movimientoHabitacionC1){
	                    case"1":
	                        System.out.println("Te acercas a la alcantarilla, ves como un liquido rojo esta empezando a subir," +
	                                "\n encima de él un ojo mirandote fijamente, incluso dirias que ha parpadeado.");
	                        break;
	                    case"2":
	                        System.out.println("Intentas ir a donde antes estaba la puerta pero ha desaparecido, en su lugar esta la palabra 'CULPABLE' escrita en sangre");
	                        break;
	                    default:
	                        System.out.println("No sabes a donde ir, la puerta ha desaparecido");
	                        break;
	                }
	                System.out.println("Vuelves al medio de la habitacion y ves como las paredes se empiezan a llenar de la misma palabra continuamente. Todas escritos con sangre");
	            }
	            //Aqui ya directamente no añadimos switches, porque hagas lo que haga solo podras hacer una cosa
	            else if(i==2){
	                System.out.println("Escuchas un ruido que viene de la alcantarilla, cuando te giras te das cuenta que esta saliendo sangre que está llenando la habitacion. No para de salir y empieza a llenar todo el suelo");
	                System.out.print("Necsitas salir de aqui ahora mismo" +
	                        "\n 1.- SALIR" +
	                        "\n 2.- SALIR" +
	                        "\n 3.- SALIR" +
	                        "\n 4.- SALIR" +
	                        "\n 5.- SALIR\n");
	                movimientoHabitacionC1=sc.next();
	                System.out.println("Intentas salir, aporreas la pared, buscas si hay algun compartimento oculto pero no, es una pared lisa. La puerta ha desaparecido");
	                System.out.println("La palabra resuena por tu cabeza, necesitas salir de ahi ya, la habitacion se esta inundando de sangre, y las paredes se llenan mas y mas.");
	            }
	            else if(i==3){
	                System.out.print("¿CULPABLE CULPABLE CULPABLE CULPABLE?" +
	                        "\n 1.- CULPABLE" +
	                        "\n 2.- CULPABLE" +
	                        "\n 3.- CULPABLE" +
	                        "\n 4.- CULPABLE" +
	                        "\n 5.- CULPABLE\n");
	                movimientoHabitacionC1=sc.next();
	                //Finalmente el evento se acabara y nos permitira salir
	                System.out.println("No puedes mas, la cabeza te va a estallar. La sangre te empieza a llegar por las rodillas. Piensas que esta todo acabado cuando derrepente ves como vuelve a aparecer la puerta" +
	                        "\n Con las pocas fuerzas que te quedan vas hacia la puerta y la atraviesas, vuelves a estar en el vestibulo. La puerta se cierra detras tuya y cuando te miras te das cuenta que esta completamente limpio," +
	                        "\n como si no hubiese pasado nada.'Necesito salir de aqui.YA'");
	            }

	        }
	        return evento=true;
	    }
	    public static boolean habitacionD1(int saludPersonaje,int corduraPersonaje,boolean cuchillo,boolean llave1A,boolean piezaSol,boolean escopeta,boolean piezaCruz,boolean cizalla,boolean piezaGolondrina,boolean piezaVirgen,boolean hacha){
	        Scanner sc=new Scanner(System.in);
	        //Aqui declaramos las variables ademas de la variable evento para controlar el evento y
	        //la variable contraseña que nos servira para el puzzle
	        boolean habitacionD1=true,evento=false;
	        String movimientoHabitacionD1,contraseña;
	        System.out.println("Entras a la habitacion D1. Ves una habitacion bastante pequeña, que tiene una camilla.\n" +
	                " En ella, atado, un hombre completamente despellejado. A su lado ves tambien un armario de cristal. Tiene algo dentro.");
	        do {
	        	//Hacemos el bucle para controlar el movimiento junto al switch
	            System.out.println("\n" +
	                    "¿A donde quieres ir?\n" +
	                    "1.- Camilla\n" +
	                    "2.- Armario\n" +
	                    "3.- Puerta \n" +
	                    "4.- Consultar tu estado\n" +
	                    "5.- Rendirse(Salir del juego)\n");
	            movimientoHabitacionD1 = sc.next();
	            switch (movimientoHabitacionD1) {
	                case"1":
	                	//Aqui habra un texto dependiendo de si hemos cogido la pieza Cruz
	                    if(!piezaCruz){
	                        System.out.println("Te acercas a la camilla, las correas estan sujetas al cuerpo, rigidas." +
	                                "\n El cuerpo esta inmovil, completamente despellajado. Aun puedes ver ciertos trozo de piel. Los ojos y boca estan cerrados.");
	                    }else{
	                        System.out.println("\"Te acercas a la camilla, las correas estan sujetas al cuerpo, rigidas.\n" +
	                                "El cuerpo esta inmovil, completamente despellajado. Aun puedes ver ciertos trozo de piel. Lo mas espeluznante es como los ojos estan completamente abiertos,\n" +
	                                "parece como si te siguieran. La boca muestra una macabra sonrisa.");
	                    }
	                    break;
	                case"2":
	                	//Aqui igual, dependiendo de si hemos cogido la pieza Cruz nos pondra una cosa u otra
	                	//Si no la hemos cogido nos dara paso a hacer el puzzle
	                	//Si la hemos cogido nos dira que no hay nada mas en el armario
	                    if(!piezaCruz){
	                       System.out.println("Te acercas al armario, dentro hay una pieza, parecida a la que cogiste antes. El armario esta cerrado, hay una nota: \n" +
	                               "'En el cielo brinco y vuelo. Me encanta subir, flotar y lucir mi pelo.'\n" +
	                               "Abajo, una cerradura electronica.\n" +
	                               "Introduce una contraseña:");
	                       contraseña=sc.next();
	                       contraseña.toLowerCase();
	                       if(contraseña.equals("cometa")){
	                           System.out.println("La cerradura emite una luz verde y se abre,permitiendote coger la pieza.");
	                           piezaCruz=true;
	                           evento=true;
	                       }else{
	                           System.out.println("La cerradura emite una luz roja y pone 'CONTRASEÑA INCORRECTA.INTENTELO DE NUEVO'");
	                       }
	                    }else{
	                        System.out.println("Te acercas al armario. No ves nada importante. Muchos papeles, batas... .");
	                    }
	                    break;
	                //Como siempre, ponemos opciones para irnos y para comprobar el estado de nuestro personaje.
	                case"3":
	                    habitacionD1=false;
	                    System.out.println("Vuelves al vestibulo");
	                    break;
	                case"4":
	                    menuEstadoPersonaje(saludPersonaje,corduraPersonaje,cuchillo,llave1A,piezaSol,escopeta,piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                    break;
	                case"5":
	                    salirDelJuego();
	                default:
	                    System.out.println("Opción incorrecta, el tiempo corre en tu contra, no puedes fallar");
	            }
	            //Aqui hacemos un if para que en caso de que cojamos la pieza y el evento sea true
	            //Pase un mini evento, ambas variables estan para controlar cuando se produce y
	            //Evitar que se repita continuamente
	            if((piezaCruz)&&(evento)){
	                System.out.println("Cuando coges la pieza y te giras, un escalofrio te recorre todo el cuerpo.\n" +
	                        " Los ojos del cadaver, completamente abiertos, te miran y una especie de sonrisa se le dibuja en el rostro.\n" +
	                        " No parece que vaya a moverse, pero lo mejor es que te vayas.");
	                evento=false;
	            }
	        }while(habitacionD1);
	        //Devolvemos la piezaCruz para que se cambie en el main
	        return piezaCruz;
	    }
	    public static void bibliotecaOscura(int saludPersonaje,int corduraPersonaje,boolean cuchillo,boolean llave1A,boolean piezaSol,boolean escopeta,boolean piezaCruz,boolean cizalla,boolean piezaGolondrina,boolean piezaVirgen,boolean hacha){
	        Scanner sc = new Scanner(System.in);
	        //Declaramos las variables de la habitacion ademas de las variables de
	        //eleccionFila3 y Libro para buscar una informacion que nos sera necesario para realizar un puzzle.
	        boolean bibliotecaOscura=true;
	        String movimientoBibliotecaOscura,eleccionFila3,libro;
	        System.out.println("Entras a la biblioteca. Cuando entras ves como lo que se supone que era un mostrador esta completamente destrozado, hay marchas de cortes." +
	                "\n Hay varias filas de libros, 5 en concreto, y un rastro de sangre que va desde el mostrador a la fila 2.");
	        do {
	        	//Hacemos el bucle de la habitacion y un switch para controlar el movimiento
	            System.out.println("\n" +
	                    "¿A donde quieres ir?\n" +
	                    "1.- Fila 1\n" +
	                    "2.- Fila 2\n" +
	                    "3.- Fila 3 \n" +
	                    "4.- Fila 4 \n" +
	                    "5.- Fila 5 \n" +
	                    "6.- Puerta \n" +
	                    "7.- Consultar tu estado\n" +
	                    "8.- Rendirse(Salir del juego)\n");
	            movimientoBibliotecaOscura = sc.next();
	            switch (movimientoBibliotecaOscura){
	            //Dependiendo de las filas nos pondra una serie de informacion, que sera importante para los puzzles o para la historia
	                case"1":
	                    System.out.println("Te acercas a la primera fila, ves varios cubiletes que en otro momento guardarian libros, ahora estan vacios.\n" +
	                            "Los libros estan desgarrados y destrozados.No parece que haya nada de importancia aqui.");
	                    break;
	                case"2":
	                    System.out.println("Sigues el rastro de sangre hasta una pequeña nota que hay en una balda. La nota dice '0923'.\n" +
	                            "'¿Que coño es esto? Tiene pinta de una combinacion, puede servirme'");
	                    break;
	                case"3":
	                	//Aqui utilizaremos las variables "libro" y "eleccionFila3" 
	                    System.out.println("Vas a la fila 3, sorprendentemente esta fila es la unica llena de libros. Hay varios cubiletes de distintas letras" +
	                            "\n ¿cuál quieres revisar?" +
	                            "\n1.-A" +
	                            "\n2.-O" +
	                            "\n3.-Ñ" +
	                            "\n4.-U" +
	                            "\n5.-T" +
	                            "\n6.-M");
	                    eleccionFila3=sc.next();
	                    if(eleccionFila3.equals("4")) {
	                        System.out.println("Te acercas al cubilete U. Ves varios libros, numerados del 1 al 10 ¿Que numero quieres mirar?");
	                        libro = sc.next();
	                        if (libro.equals("10")) {
	                            System.out.println("Coges el libro 10 y al abrirlo ves que en todas las hojas hay dibujado un niño con una cometa." +
	                                    "\n'Bastante extraño, la verdad'");
	                        } else {
	                            System.out.println("Echas un vistazo por encima pero no ves nada util, decides continuar");
	                        }
	                    }else{
	                        System.out.println("Miras un poco por encima pero no ves nada interasnte. Decides continuar tu camino.");
	                    }
	                    break;
	                case"4":
	                    System.out.println("Te acercas a la fila 4. Aparentemente no ves nada interesante, solo libros sobre biologia,medicina, fisica... .");
	                    break;
	                case"5":
	                    System.out.println("Te acercas a  la utima fila,destaca que no hay libros si no documentos. Supones que en otro momento esta fila deberia estar cerrada.\n" +
	                            "Ves varios informes medicos y te destaca uno, hablando de un paciente con personalidad multiple. Ves las iniciales de los nombres de estas.\n" +
	                            "Uno te destaca por encima del resto 'P.S.'.\n");
	                    System.out.println("'Son las mismas iniciales que las de esa cosa que me ha metido esto, pero no puede ser cierto ¿verdad?'");
	                    break;
	                //Aqui añadimos las opciones de siempre    
	                case"6":
	                    System.out.println("Sales de la biblioteca");
	                    bibliotecaOscura=false;
	                    break;
	                case"7":
	                    menuEstadoPersonaje(saludPersonaje, corduraPersonaje, cuchillo, llave1A, piezaSol, escopeta, piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                    break;
	                case"8":
	                    salirDelJuego();
	                default:
	                    System.out.println("Opción incorrecta, el tiempo corre en tu contra, no puedes fallar");
	            }
	        }while(bibliotecaOscura);

	    }
	    public static boolean comedorOscuro(int saludPersonaje,int corduraPersonaje,boolean cuchillo,boolean llave1A,boolean piezaSol,boolean escopeta,boolean piezaCruz,boolean cizalla,boolean piezaGolondrina,boolean piezaVirgen,boolean hacha){

	        Scanner sc = new Scanner(System.in);
	        //Declaramos las variables
	        boolean comedorOscuro=true;
	        String movimientoComedorOscuro;
	        //Aqui hacemos un if para controlar si sale un texto u otro, dependiendo de si hemos cogido 
	        //La cizalla o no.
	        if(!cizalla){
	            System.out.println("Entras en el comedor. Esta destrozado, todas las sillas y mesas estan en las paredes y en el centro de la habitacion\n" +
	                    "hay lo que parece un frigorifico.No para de moverse,como si hubiese algo dentro.");
	        }else{
	            System.out.println("Entras al comedor.Ves el frigorifico abierto de par en par.No ves nada destacable.");
	        }
	        do{
	            System.out.println("\n" +
	                    "¿A donde quieres ir?\n" +
	                    "1.- Frigorifico\n" +
	                    "2.- Mesas\n" +
	                    "3.- Puerta \n" +
	                    "4.- Consultar tu estado\n" +
	                    "5.- Rendirse(Salir del juego)\n");
	            movimientoComedorOscuro = sc.next();
	            switch (movimientoComedorOscuro){
	                case"1":
	                	//Aqui hacemos el evento para coger la cizalla, pasará si no la tenemos
	                	//si la tenemos nos pondra otro texto.
	                    if(!cizalla){
	                        System.out.println("Te acercas al frigorifo.Conforme te vas acercando empieza a agitarse mas y mas\n" +
	                                "Te armas de valor y extiendes el brazo para abrirlo, el frigorifico tiembla mas y mas.\n" +
	                                "Finalmente lo abres, en su interior no hay nada, solo una cizalla." +
	                                "\nLa coges.");
	                        cizalla=true;
	                    }else {
	                        System.out.println("Te acercas al frigorifico. Esta abierto, no ves que tenga nada mas.");
	                    }
	                    break;
	                    //Las demas opciones son las mismas de siempre y una sobre un lugar que podemos visitar
	                case"2":
	                    System.out.println("Te acercas a las mesas.Estan la mayoria destrozadas, como si algo los hubiera destrozado.No ves nada util.");
	                    break;
	                case"3":
	                    System.out.println("Vuelves a la segunda planta");
	                    comedorOscuro=false;
	                    break;
	                case"4":
	                    menuEstadoPersonaje(saludPersonaje, corduraPersonaje, cuchillo, llave1A, piezaSol, escopeta, piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                    break;
	                case"5":
	                    salirDelJuego();
	                default:
	                    System.out.println("Opción incorrecta, el tiempo corre en tu contra, no puedes fallar");
	            }

	        }while(comedorOscuro);
	        return cizalla;
	    }	    
	    public static boolean biblioteca(int saludPersonaje,int corduraPersonaje,boolean cuchillo,boolean llave1A,boolean piezaSol,boolean escopeta,boolean piezaCruz,boolean cizalla,boolean piezaGolondrina,boolean piezaVirgen,boolean hacha){
	    	//Declaramos las variables de la habitacion y del movimiento
	    	Scanner sc = new Scanner(System.in);
	    	boolean biblioteca=true;
	    	String movimientoBiblioteca;
	    	System.out.println("Entras en la biblioteca, puedes ver varias filas de libros. Al final ves que hay una zona bloqueda por una especie de mampara.\n");	    		
	    	do {
	    		//Hacemos el bucle de la habitacion y un switch para controlar el movimiento
	            System.out.println("\n" +
	                    "¿A donde quieres ir?\n" +
	            		"1.- Mostrador\n" +
	                    "2.- Fila 1\n" +
	                    "3.- Fila 2\n" +
	                    "4.- Fila 3 \n" +
	                    "5.- Fila 4 \n" +
	                    "6.- Fila 5 \n" +
	                    "7.- Puerta \n" +
	                    "8.- Consultar tu estado\n" +
	                    "9.- Rendirse(Salir del juego)\n");
	            movimientoBiblioteca = sc.next();
	            switch(movimientoBiblioteca) {
	            	case"1":
	            		System.out.println("Te acercas al mostrador. En un primer momento no ves nada pero si te fijas, hay un pequeño posit puesto en el borde,dice: \n"
	            				+ "'Te he entregado el paquete.\n Te lo he dejado en la fila 4.\n No te olvides de el'");
	            		System.out.println("No ves nada mas interesante");
	            		break;
	            	case"2":
	            		System.out.println("Te acercas a la fila 1. Ves varios libros de arte, historia, latin... .\n"
	            				+ "'No tengo tiempo para estas gilipolleces, tengo que llegar ya al antidoto'");
	            		break;
	            	case"3":
	            		System.out.println("Vas a la fila 2. No ves nada interesante, solo revistas de varias tematicas: \n"
	            				+ "'Bad bunny saca su nuevo disco y rompe Internet'\n"
	            				+ "'Visite Silent Hill, el pueblo de ensueño.... .\n\n"
	            				+ "'Estas cosas son inutiles, se me acaba el tiempo");
	            		break;
	            	case"4":
	            		System.out.println("Al llegar a esta fila te sorprende que no hay ningun libro, solo un pequeño cuadro con una cometa.");
	            		break;
	            	case"5":
	            		if(!piezaGolondrina) {	            			
	            			System.out.println("Llegas a la fila 4, ves varios libros y un paquete encima de una silla.\n"
	            				+ "'Este debe ser el paquete del que hablaba el posit'\n"
	            				+ "Decides abrirlo y te encuentras otra pieza de madera, esta tiene un dibujo de una golondrina\n\n\n");
	            			System.out.println("'Ya tengo las 4 piezas, ya puedo resolver el puñetero puzzle ese y conseguir el antidoto.");
	            			piezaGolondrina=true;
	            		}else {
	            			System.out.println("Te acercas a la fila 4. Ves muchos libros sobre temas que ni comprendes pero nada que parezca util");
	            		}
	            		break;
	            	case"6":
	            		System.out.println("Te acercas a la mampara. Esta cerrada y no parece que vaya a abrirse. Sera mejor que te vayas.");
	            		break;
	            	case"7":
	            		System.out.println("Vuelves a la segunda planta");
	            		biblioteca=false;
	            	case"8":
	                    menuEstadoPersonaje(saludPersonaje, corduraPersonaje, cuchillo, llave1A, piezaSol, escopeta, piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                    break;
	            }
	    		
	    	}while(biblioteca);
	    	return piezaGolondrina;
	    }
	    public static void menuEstadoPersonaje( int saludPersonaje,int corduraPersonaje,boolean cuchillo,boolean llave1A,boolean piezaSol,boolean escopeta,boolean piezaCruz,boolean cizalla,boolean piezaGolondrina,boolean piezaVirgen,boolean hacha){

	        //Este es el subprograma del menu del personaje, donde podremos elegir si queremos ver nuestra salud/cordura, nuestros movimientos restantes o nuestros objetos
	        Scanner sc=new Scanner(System.in);
	        boolean continuarMenu;
	        String eleccionMenu;
	        do{
	            //Al igual que con todos los menus, utilizo un dowhile y dentro un switch
	             continuarMenu=true;
	            System.out.print("Bienvenido al estado de tu personaje, que quieres mirar:" +
	                    "\n 1.- Salud y cordura" +
	                    "\n 2.- Tiempo restante" +
	                    "\n 3.- Objetos" +
	                    "\n presione cualquier otro boton para volver al juego\n");
	            eleccionMenu=sc.next();
	            switch (eleccionMenu){
	                case "1":
	                    //Aqui nos mostrara la salud y cordura de nuestro personaje
	                    System.out.println("\n--------SALUD Y CORDURA-------\n" +
	                            "Tu salud es "+saludPersonaje+ " y tu cordura es "+corduraPersonaje+"\n");
	                    break;
	                case "2":
	                    //Aqui nos mostrara cuantos movimientos nos quedan
	                    System.out.println("\n--------MOVIMIENTOS RESTANTES--------\n" +
	                            "Aquí mostrara el tiempo o movimientos que te quedan\n");
	                    break;
	                case "3":
	                    //Aqui ira el subprograma que nos llevara a los objetos, al ser tantod he decidio hacerlo asi
	                    inventario(cuchillo, llave1A, piezaSol,escopeta,piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                    break;
	                default:
	                    continuarMenu=false;
	                    break;
	            }
	      }while(continuarMenu);
	    }
	    public static void inventario(boolean cuchillo,boolean llave1A,boolean piezaSol,boolean escopeta,boolean piezaCruz,boolean cizalla,boolean piezaGolondrina,boolean piezaVirgen,boolean hacha){
	        //Aqui pongo todos los objetos, al ser booleans seran true si el protagonista los tiene y falso si no los tiene
	        //Tengo que ponerlos como if separados para que los compruebe todos
	        System.out.print("\n-------- OBJETOS --------\n");
	        if (cuchillo){
	            //En cada objeto vendra su nombre y una pequeña descripción
	            System.out.println("Cuchillo: Encontrado en la habitacion en la que despertaste, tiene manchas de sangre secas y esta bastante afilado.\n");
	        }
	        if (llave1A) {
	            System.out.println("Llave: Encontrada en el cadaver del vestibulo. Tiene un llavero donde pone '1A'\n");
	        }
	        if (piezaSol){
	            System.out.println("Pieza de madera con un dibujo de Sol: Encontrada en la habitacion 1D. Parece importante, aunque no consigo adivinar cual puede ser su uso.\n");
	        }
	        if (escopeta){
	            System.out.println("Escopeta: Encontrado en la habitacion B1. Es una escopeta de un solo cañon, solo tiene una bala. Deberia ser precavido al utilizarla.\n");
	        }
	        if (piezaCruz) {
	            System.out.println("Pieza de madera con un dibujo de Cruz: Encontrada en la habitacion D1. Parece importante, aunque no consigo adivinar cual puede ser su uso.\n");
	        }
	        if (cizalla){
	            System.out.println("Cizalla: Encontrada en el comedor.Parece bastante usada aunque deberia cumplir su funcion perfectamente.\n");
	        }
	        if (piezaGolondrina) {
	        	System.out.println("Pieza de madera con un dibujo de una Golondrina: Encontrada en la biblioteca. Parece importante, aunque no consigo adivinar cual puede ser su uso.\n");
	        }
	        if (piezaVirgen) {
	        	System.out.println("Pieza de madera con un dibujo de una Virgen: Encontrada en la segunda planta. Parece importante, aunque no consigo adivinar cual puede ser su uso.\n ");
	        }
	        if (hacha) {
	        	System.out.println("Hacha: Encontrada en la habitacion 1A. Aun se pueden ver los restos de sangre en el filo. Cuando la sostienes te sientes mejor.\n"
	        			+ "Como si una parte de ti hubiese vuelto.\n");
	        }
	        System.out.println("-------------------------\n");
	    }
	    public static void salirDelJuego(){
	        //Aqui hago al accion de salir del juego que yo la tomo como que se rinde, por ello pongo un pequeño texto ambiental
	        System.out.println("Notas como la presion te corroe, no puedes seguir, no quieres seguir, quieres acabar con esto ya,\n coges tu cuchillo y con todas tus fuerzas te lo clavas en tu gargante, todo se apaga, también el dolor.");
	        //Aqui utilizo system.exit para cerrar el programa instantaneamente
	        System.exit(0);
	    }
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        //He separado en tres lineas,la primera es para los booleans objetos, la segunda para los booleans de habitacion y finalmente la tercera son para el resto de booleans (aunque normalmente para los booleans que van a evitar que haya objetos infinitos)

	        //lista de objetos
	        boolean cuchillo = true, llave1A = false, piezaSol = false, escopeta = false, piezaCruz = false,cizalla=false,piezaGolondrina=false,piezaVirgen=false,hacha=false;
	        //lista de plantas
	        boolean escapeRoom=true,primeraPlanta = true,segundaPlanta = false, primeraPlantaOscura = false, segundaPlantaOscura = false;
	        //resto de booleans
	        boolean candado = true, habitacionC1Cerrada = false, eventoHabitacionA1 = true, eventoSucedido = false;
	        //La salud y cordura de los personajes si lo he puesot como enteros
	        int saludPersonaje = 100, corduraPersonaje = 100;
	        //Finalmente declaramos algunas variables string,utilizadas para el movmiento como para diferentes puzzles o los cambio de parte en la scape room
	        String movimientoPrimeraPlanta,movimientoSegundaPlanta, movimientoPrimeraPlantaOscura,movimientoSegundaPlantaOscura, estadoPlanta = "NoFertilizada", parteScapeRoom = "Parte0", estadoEscopeta = "NoCogida", cogerLlave = "";

	        //En estos print se explica un poco la historia, los separo en tres para que quede mas claro
	        System.out.println("Te levantas, la cabeza te duele, te cuesta abrir los ojos porque tienes una luz apuntando directamente hacia ti,\n cuando tus ojos se acostumbran puedes discernir donde estas.\n"
	        		+ " Lo primero que te das cuenta es que estas atado, concretamente a una cama, tienes correas en tus pies, los brazos los tienes libres.\n La habitacion es bastante espeluznante, aparte de la cama hay una mesa, un tablón y una mesita a tu lado,\n donde puedes ver una especie de carta y un cuchillo.\n Alargando la mano consigues coger el cuchillo y con el cortas las correas.\n Una vez liberado coges la carta, que dice lo siguiente: \n\n\n");
	        System.out.println("'Buenos días princesa, \n" +
	                "veo que por fin te has despertado, espero que tu cama haya sido cómoda.\n Te gustará saber que gracias a mis investigaciones he encontrado un virus capaz de aniquilar a la población,\n pero obviamente tenía que probarlo, y vaya que suerte, tenía a un joven apuesto y sano a mi disposición.\n Efectivamente, estás infectado por el, denominado por mi, COVID-20 (no se por qué el COVID-19 tenía copyright).\n Este virus tiene un tiempo de efecto de 2 horas, pero conforme vaya extendiendose por tu cuerpo verás diversos “efectos secundarios” que ya irás descubriendo.\n Pero tengo una buena noticia, ¡PUEDES SALVARTE!, he escondido el antídoto en este edificio, solo tendrás que sortear las dificultades que te he puesto (nada serio, tú tranquilo).\n Bueno, diviértete, BESIS!!!\n" +
	                "Con cariño, P.S\n" +
	                "P.D: Deberías fijarte en las letras que son capitales de esta carta, es el primer paso para salvarte <3'\n\n\n");
	        System.out.println("Notas como el sudor empieza a caer por tu piel, tienes una cuenta atrás antes de morir, tienes que encontrar la salida y el antídoto cuanto antes,\n pero lo primero es salir de esa habitación...¿letras capitales, que querra decir?");

	        //Aqui ya empezamos la scape room como tal, como empezamos en la habitacion 1C este sera el primer subprograma,
	        //Luego veremos como en el main se pondran los menus de las plantas, mientras que cada habitacion sera un subprograma

	        //Utilizamos la variable candado para evitar tener que repetir el puzzle de la habitacion 1C cada vez que entremos
	        candado = habitacion1C(saludPersonaje, corduraPersonaje, candado, cuchillo, llave1A, piezaSol, escopeta, piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	        //Aqui el usuario consigue salir de la habitacion 1C y entramos en el bucle de la primera planta(utilizo el do while porque el bucle tiene que pasar como minimo una vez
	    do{
	    	 while (primeraPlanta){

	            //Aqui mostramos el menu donde el usuario podra elegir que hacer,
	            System.out.println("\n" +
	                    "¿A donde quieres ir?\n" +
	                    "1.- Habitacion 1A\n" +
	                    "2.- Habitacion 1B\n" +
	                    "3.- Habitacion 1C\n" +
	                    "4.- Habitacion 1D\n" +
	                    "5.- Zona de espera\n" +
	                    "6.- Escaleras\n" +
	                    "7.- Consultar tu estado\n" +
	                    "8.- Rendirse(Salir del juego)\n");
	            movimientoPrimeraPlanta = sc.next();
	            switch (movimientoPrimeraPlanta) {
	                case "1":
	                    //Para entrar en esta habitacion necesitaras de una llave, por eso el if else con el boolean llave1A
	                    if (llave1A) {

	                        //Si la tienes iras al subprograma habitacion 1A, las variables de entrada que pido son para el menu de estado, pasa lo mismo en todos los subprogramas
	                        //Para ver que pasa en la habitacion 1A, vayase al subprograma habitacion1A
	                        habitacion1A(saludPersonaje, corduraPersonaje, cuchillo, llave1A, piezaSol, escopeta, piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);

	                    } else {
	                        //Si no tienes la llave te devolvera al menu de la primera planta
	                        System.out.println("Intentas abrir la puerta, pero ves que está cerrada con llave, hasta que no la tengas  será imposible entrar");
	                    }
	                    break;
	                case "2":
	                    //Aqui entramos en la habitacion 1B, aqui haremos un puzzle que puede tener tres estados asi que decidí hacer una string para identificar esos casos
	                    //Ya que este puzzle influenciara en una habitacion posterior(Lo dejo mas claro en el subprograma correspondiente)
	                    estadoPlanta = habitacion1B(saludPersonaje, corduraPersonaje, estadoPlanta, cuchillo, llave1A, piezaSol, escopeta, piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                    break;
	                case "3":
	                    //Aqui volvemos a la habitacion 1C, en la que empezamos
	                    System.out.println("Vuelves a la habitacion en la que despertaste");
	                    habitacion1C(saludPersonaje, corduraPersonaje, candado, cuchillo, llave1A, piezaSol, escopeta, piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                    break;
	                case "4":
	                    //Aqui entramos en la habitacion 1D, que sera donde podamos hacer el cambio de planta (esto es explicado por la historia)
	                    //Utilizo la variable parteScapeRoom para indicar ese cambio de parte y poder controlarlo y que los eventos se hagan correctamente
	                    //Ademas me permite impedir que se consigan objetos infinitos

	                    parteScapeRoom = habitacion1D(parteScapeRoom, saludPersonaje, corduraPersonaje, cuchillo, llave1A, piezaSol, escopeta, piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);

	                    //Este if lo hago para evitar que el cambio de planta se haga siempre que entremos en la habitacion,
	                    //asi el jugador puede entrar y salir de la habitacion que si no se produce el evento no cambiara de planta
	                    if (parteScapeRoom.equals("Parte1")) {
	                        piezaSol = true;
	                        primeraPlanta = false;
	                        primeraPlantaOscura = true;
	                        //Pongo aqui  el print para que salga cuando hacemos el cambio de plano, pero solo ahi
	                        //lo mismo con lo de la cordura, es para evitar que hago todo el rato las instrucciones cuando nos movamos entre planta y planta
	                        System.out.println("Al salir de la habitacion ves como todo ha cambiado, lo que antes era un vestibulo impoluto ahora esta lleno de sangre,las habitaciones han cambiado," +
	                                "\n los muebles destrozados, la luz parpadeando...y...y...y donde antes estaba la zona de espera ahora hay un cadaver con algo clavado en la cabeza," +
	                                "\n no consigues discernir que es desde aqui pero parece una llave... ." +
	                                "\n'¿Donde cojones me han metido'?");
	                        corduraPersonaje -= 10;
	                    }
	                    break;
	                case "5":
	                	//Añadimos unas zonas de ambientacion que no nos daran objetos ni nada
	                    System.out.println("Te acercas a una pequeña zona que hay de espera. Hay unos sofas y una pequeña mesa donde hay varias revistas.");
	                    break;
	                case "6":
	                	if(parteScapeRoom.equals("Parte2")) {
	                		System.out.println("Cuando te acercas a las escaleras, ya no estan bloqueadas. La muralla ha desaparecido.\n"
	                				+ "'Ha llegado la hora de acabar con esto'");
	                		primeraPlanta=false;
	                		segundaPlanta=true;
	                		System.out.println("Al subir ves tres puertas, las de la biblioteca y el comedor, a la derecha e izquierda respectivamente.\n "
	                				+ "En el medio, una puerta que pone 'DESPACHO'. Tiene un cuadrado en el centro y un letrero, aunque tendras que acercarte\n"
	                				+ "para verlo mejor.");
	                	}else {
	                		System.out.println("Te acercas a las escaleras, una barricada de muebles te impide pasar, tendrás que ir a otro lado");
	                	}
	                    break;
	                case "7":
	                    //Aqui utilizo el subprograma que nos permitirá comprobar el estado de nuestro protagonista
	                    menuEstadoPersonaje(saludPersonaje, corduraPersonaje, cuchillo, llave1A, piezaSol, escopeta, piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                    break;
	                case "8":
	                    //Este subprograma esta hecho para permitir salir del juego en cualquier momento al usuario
	                    salirDelJuego();
	                default:
	                    System.out.println("Opción incorrecta, el tiempo corre en tu contra, no puedes fallar");
	            }
	        }
	    	 while(segundaPlanta) {
	    		 //Aqui mostramos el menu de la segunda planta, la ultima de la scape room
	    		 //Como siempre, utilizamos un while para repetir el menu y un switch
	    		 System.out.println("\n" +
		                    "¿A donde quieres ir?\n" +
		                    "1.- Biblioteca\n" +
		                    "2.- Comedor\n"+ 
		                    "3.- Despacho" +
		                    "4.- Bajar a la primera planta \n" +
		                    "5.- Consultar tu estado\n" +
		                    "6.- Rendirse(Salir del juego)\n");
	    		 movimientoSegundaPlanta=sc.next();
	    		 switch(movimientoSegundaPlanta) {
	    		 	case"1":
	    		 		//Aqui nos metemos en el subprograma de la biblioteca
	    		 		piezaGolondrina=biblioteca(saludPersonaje, corduraPersonaje, cuchillo, llave1A, piezaSol, escopeta, piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	    		 	case"2":
	    		 		//Aqui nos metemos en el subprograma del comedor 
	    		 		//comedor();
	    		 	case"3":
	    		 		//Aqui nos metemos en el subprograma del despacho
	    		 		//despacho();
	    		 	case"4":
	    		 		//Aqui bajamos a la primera planta
	    		 		System.out.println("Bajas a la primera planta");
	    		 		segundaPlanta=false;
	    		 		primeraPlanta=true;
	    		 		break;
	    		 	case"5":
	                    menuEstadoPersonaje(saludPersonaje, corduraPersonaje, cuchillo, llave1A, piezaSol, escopeta, piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                    break;
	    		 	case"6":
	                    //Este subprograma esta hecho para permitir salir del juego en cualquier momento al usuario
	                    salirDelJuego();
	                    break;
	                default:
	                	System.out.println("No sabes que hacer, estas indiceso, pero el tiempo corre en tu contra.\n"
	                			+ "Cuanto mas tiempo pierdas ahora,menos tiempo te quedara para salvarte.");
	    		 }
	    		 
	    	 }
	    	 
	        
	        //Aqui metemos el segundo while, el de la segunda parte de la scape room,
	        //que sera en una zona "espejo" de la primera pero mucho mas oscura
	        
	        while (primeraPlantaOscura) {
	        	//Aqui esta el dowhile de la primera planta "oscura" (es como yo las he diferenciado de las otras
	            System.out.println("\n" +
	                    "¿A donde quieres ir?\n" +
	                    "1.- Habitacion A1\n" +
	                    "2.- Habitacion B1\n" +
	                    "3.- Habitacion C1\n" +
	                    "4.- Habitacion D1\n" +
	                    "5.- Zona de espera\n" +
	                    "6.- Escaleras\n" +
	                    "7.- Consultar tu estado\n" +
	                    "8.- Rendirse(Salir del juego)\n");
	            movimientoPrimeraPlantaOscura = sc.next();
	            switch (movimientoPrimeraPlantaOscura) {
	            //Aqui hacemos los diferentes lugares
	                case "1":
	                	//Esta es la habitacion A1, nos devolvera el valor del evento para saber si ha pasado
	                	//Si ha pasado haremos los cambios en la salud o en la cordura,respectivamente,
	                	//asi al hacerlo en el main ya se graba en el resto del programa
	                    eventoHabitacionA1 = habitacionA1(saludPersonaje, corduraPersonaje, cuchillo, llave1A, piezaSol, escopeta, piezaCruz, eventoHabitacionA1,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                    if ((!eventoHabitacionA1) && (!eventoSucedido)) {
	                        if (corduraPersonaje <= 80) {
	                            corduraPersonaje -= 20;
	                        } else {
	                            saludPersonaje -= 40;
	                        }
	                        //La variable evento sucedido la pongo para que no se repita esto cada vez que netremos en la habitacion A1
	                        eventoSucedido = true;
	                    }
	                    break;
	                case "2":
	                	//Aqui viene la habitacion de la escopeta, utilizo la variable del estado para controlar 
	                	//si la hemos cogido o no, al igual que antes, para que esta comprobacion no se repita
	                	//cambio el estado de la escopeta a "NoSePuedeCoger", impidiendo que se repita el evento
	                    estadoEscopeta = habitacionB1(saludPersonaje, corduraPersonaje, cuchillo, llave1A, piezaSol, estadoPlanta, estadoEscopeta, escopeta, piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                    //Añadimos los if para controlar el evento que ha pasado
	                    //si no hemos podido coger la escopeta nos quitara vida
	                    //si lo hemos cogido, escopeta se volvera true
	                    if (estadoEscopeta.equals("Cogida")) {
	                        escopeta = true;
	                        estadoEscopeta = "NoSePuedeCoger";	                    
	                    } else if (estadoEscopeta.equals("IntentodeCogida")) {
	                        saludPersonaje -= 20;
	                        estadoEscopeta = "NoSePuedeCoger";
	                    }
	                    break;
	                    //aqui añadimos la habitacionC1, que como hemos visto en el subprograma sera una habitacion diferente
	                    //la variable de la habitacion cerrada servira para evitar que el personaje vuelva a entrar en la habitacion
	                case "3":
	                    if (!habitacionC1Cerrada) {
	                        habitacionC1Cerrada = habitacionC1();
	                        corduraPersonaje -= 20;
	                    } else {
	                        System.out.println("Intentas abrir la puerta pero es como si algo o alguien hiciese fuerza para que no puedas girar el pomo. Tras un tiempo intentadolo, desistes.");
	                    }
	                    break;
	                case "4":
	                	//Aqui añadimos la habitacion para conseguir la piezaCruz, necesaria para hacer el puzzle final
	                    piezaCruz = habitacionD1(saludPersonaje, corduraPersonaje, cuchillo, llave1A, piezaSol, escopeta, piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                    break;
	                case "5":
	                	//Aqui añadimos un evento para conseguir la llave de la habitacion 1A
	                	//Añado el if para evitar que se haga de forma infinita y que solo se haga cuando tenemos la llave.
	                    if (!llave1A) {
	                        System.out.println("Te acercas al cadaver.Conforme te vas acercando  vas dandote cuenta que lo que tiene clavado es una llave.Ademas de eso no ves nada interesante." +
	                                "\n ¿Coges la llave?" +
	                                "\n 1.- Si" +
	                                "\n 2.- No");
	                        //Añado la variable cogerLlave para controlar si quieres coger la llave o no, 
	                        //si dices que si la cogeres y pasara un evento
	                        //si dices que no, simplemente te iras
	                        cogerLlave = sc.next();
	                        if (cogerLlave.equals("1")) {
	                            System.out.println("Te armas el valor suficiente para coger la llave. Se la arrancas del craneo, esta a punto de salir cuando te agarra el brazo.\n" +
	                                    "Mirando al suelo 'Ya viene, ya viene, ya viene, su hacha suena, su hacha suena, su hacha suena' en ese momento levanta la mirada, te mira y \n" +
	                                    "puedes observar cierto ¿terror? mientras grita 'YA ESTA AQUI,YA ESTA AQUI, YA ESTA AQ...' hasta que derrepente para, sus ojos se vuelven blancos\n" +
	                                    "y sus brazos se caen, liberandote. Consigues arrancar finalmente la llave.");
	                            System.out.println("'No puedo mas. ¿De quien huyen, sera el mismo que me encerro?");
	                            llave1A = true;
	                            corduraPersonaje -= 10;
	                        } else {
	                            System.out.println("Aunque necesitas esa llave, tienes miedo de lo que pueda pasar y decides dejarla ahi. El cadavver no se mueve.");
	                        }
	                    } else {
	                        System.out.println("Te acercas al cadaver. Esta inmovil, tiene la mirada completamente en blanco," +
	                                "\nfijandote bien ves como en el hombro tiene un corte prominente." +
	                                "\n No ves nada util.");
	                    }
	                    break;
	                case "6":
	                	//En este plano nos permitira ir a la segunda planta, por eso podremos utilizar las escaleras
	                	//y haremos el cambio de planta
	                    System.out.println("Vas a las escaleras y te das cuenta de que ya no estan bloqueadas, pudiendo subir a la segunda planta.");
	                    primeraPlantaOscura = false;
	                    segundaPlantaOscura = true;
	                    System.out.println("Subes a a la segunda planta. Ves dos puertas, una a la izquierda con un cartel de 'BIBLIOTECA' y otra a la derecha con el cartel 'COMEDOR'.\n" +
	                            "Entre medias ves un dibujo de una puerta, esta dibujado con sangre y tiene algo escrito 'Nos vemos en el otro lado jiji'.");
	                    break;
	                case "7":
	                    menuEstadoPersonaje(saludPersonaje, corduraPersonaje, cuchillo, llave1A, piezaSol, escopeta, piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                    break;
	                case "8":
	                    salirDelJuego();
	                default:
	                    System.out.println("Opción incorrecta, el tiempo corre en tu contra, no puedes fallar");
	            }
	            //Aqui añadimos un if para que en caso de haber cogido la llave y la pieza cambiemos de plano otra vez,volviendo al otro plano
	            if((piezaCruz)&&(llave1A)){
	                parteScapeRoom="Parte2";
	                primeraPlantaOscura=false;
	                primeraPlanta=true;
	                System.out.println("Te empieza a doler la cabeza otra vez.Un dolor insoportable,solo que esta vez no cesa.No cesa hasta que te desmayas.\n" +
	                        "Cuando te despiertas estas otra vez en la primera planta, en la qu empezaste. No sabes que ha pasado,pero ahora las escaleras estan abiertas.\n" +
	                        "'Estoy cerca de el, lo presiento'.");
	                parteScapeRoom="Parte2";
	            }
	        }
	        while (segundaPlantaOscura){
	        	//Aqui añadimos el bucle de la segunda planta "oscura"
	            System.out.println("\n" +
	                    "¿A donde quieres ir?\n" +
	                    "1.- Biblioteca\n" +
	                    "2.- Comedor\n" +
	                    "3.- Bajar a la primera planta \n" +
	                    "4.- Consultar tu estado\n" +
	                    "5.- Rendirse(Salir del juego)\n");
	            movimientoSegundaPlantaOscura=sc.next();
	            switch (movimientoSegundaPlantaOscura){
	                case"1":
	                	//Aqui ponemos el subprograma para entrar en la biblioteca "oscura"
	                    bibliotecaOscura(saludPersonaje, corduraPersonaje, cuchillo, llave1A, piezaSol, escopeta, piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                    break;
	                case"2":
	                	//Aqui ponemos el subprograma para entrar en el comedorOscuro
	                	//Igualamos a la cizalla para que en caso de tenerla se nos ponga como true
	                    cizalla=comedorOscuro(saludPersonaje, corduraPersonaje, cuchillo, llave1A, piezaSol, escopeta, piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                    break;
	                case"3":
	                	//Para volver a la primer planta "oscura"
	                    System.out.println("Decides volver a la primer planta");
	                    segundaPlantaOscura=false;
	                    primeraPlantaOscura=true;
	                    break;
	                case"4":
	                    menuEstadoPersonaje(saludPersonaje, corduraPersonaje, cuchillo, llave1A, piezaSol, escopeta, piezaCruz,cizalla,piezaGolondrina,piezaVirgen,hacha);
	                    break;
	                case"5":
	                    salirDelJuego();
	                default:
	                    System.out.println("Opción incorrecta, el tiempo corre en tu contra, no puedes fallar");
	            }
	        }
	    }while(escapeRoom) ;
	    }
	}

