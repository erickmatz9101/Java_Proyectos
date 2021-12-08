import java.util.Scanner;

public class UsoHorario {

    String horaActual;

    double nuevaHora;

    double horasFaltantes;



    int opcion;

    //Generando el costructor

    public UsoHorario(){

        this.opcion=0;

        this.nuevaHora=0;

        this.horasFaltantes=0;

    }

    //Metodo que pide el lugar al usuario

    public void ciudad(){

        System.out.println("Bienvenido al programa para conocer el horario de algunas de las ciudades más importantes del mundo\n");

        System.out.println("Para conocer el horario de alguna de la ciudades selecciona la opcion que deseas utilizar:\n");

        System.out.println("1.New York\n 2.Londres\n 3.Seúl\n 4.Santiago de Chile\n");

        Scanner seleccion=new Scanner(System.in);

        opcion=seleccion.nextInt();

        

    }


    //Método para conocer los horarios según el país de origen

    public void horario(){

        switch (opcion) {

            case 1:

            System.out.println("Estás en New York por favor digita la hora actual para conocer la hora en las demás ciudades:\n");

            Scanner hora=new Scanner(System.in);

            horaActual=hora.nextLine();


            nuevaHora=Double.parseDouble(horaActual)+5;
            System.out.println("Entre New York y Londres hay 5 hrs de diferencia y la hora actual en Londres es: "+nuevaHora );

            nuevaHora=Double.parseDouble(horaActual)+14;
            System.out.println("Entre New York y Seúl hay 14 hrs de diferencia y la hora actual en Seoul es: "+nuevaHora);

            nuevaHora=Double.parseDouble(horaActual)+2;
            System.out.println("Entre New York y Santiago de Chile hay 2 hrs de diferencia y la hora actual en Seoul es: "+nuevaHora);
            
                break;
            
            case 2:

            System.out.println("Estás en Lóndres por favor digita la hora actual para conocer la hora en las demás ciudades:\n");

            Scanner hora1=new Scanner(System.in);

            horaActual=hora1.nextLine();


            nuevaHora=Double.parseDouble(horaActual)-5;
            System.out.println("Entre Londres y New York hay -5 hrs de diferencia y la hora actual en Londres es: "+nuevaHora );

            nuevaHora=Double.parseDouble(horaActual)-9;
            System.out.println("Entre Londres y Seúl hay -9 hrs de diferencia y la hora actual en Seoul es: "+nuevaHora);

            nuevaHora=Double.parseDouble(horaActual)-3;
            System.out.println("Entre Londres y Santiago de Chile hay -3 hrs de diferencia y la hora actual en Seoul es: "+nuevaHora);

             break;


            case 3:

            System.out.println("Estás en Seúl por favor digita la hora actual para conocer la hora en las demás ciudades:\n");

            Scanner hora2=new Scanner(System.in);

            horaActual=hora2.nextLine();


            nuevaHora=Double.parseDouble(horaActual)-14;
            System.out.println("Entre Seul y New York hay -14 hrs de diferencia y la hora actual en Londres es: "+nuevaHora );

            nuevaHora=Double.parseDouble(horaActual)+9;
            System.out.println("Entre Seul y Londres hay 9 hrs de diferencia y la hora actual en Seoul es: "+nuevaHora);

            nuevaHora=Double.parseDouble(horaActual)-12;
            System.out.println("Entre Seul y Santiago de Chile hay -12 hrs de diferencia y la hora actual en Seoul es: "+nuevaHora);

              break;

            case 4:

            System.out.println("Estás en Santiago de Chile por favor digita la hora actual para conocer la hora en las demás ciudades:\n");

            Scanner hora3=new Scanner(System.in);

            horaActual=hora3.nextLine();


            nuevaHora=Double.parseDouble(horaActual)-1;
            System.out.println("Entre Santiago de Chile y New York hay -1 hrs de diferencia y la hora actual en Londres es: "+nuevaHora );

            nuevaHora=Double.parseDouble(horaActual)+4;
            System.out.println("Entre Santiago de Chile y Londres hay 4 hrs de diferencia y la hora actual en Seoul es: "+nuevaHora);

            nuevaHora=Double.parseDouble(horaActual)+12;
            System.out.println("Entre Santiago de Chile y Seul hay 12 hrs de diferencia y la hora actual en Seoul es: "+nuevaHora);

            break;

            default:

            System.out.println("Elegiste una opción no valida intentalo de nuevo más tarde");
            
            break;
        }
    }



    
}
