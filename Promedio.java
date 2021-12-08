import java.util.Scanner;

public class Promedio {

    double calificacionExamen;

    double calificacionLaboratorio;

    double calificacionFinal;

    double sumaCalificaciones;

    double promedio;

    int opcion; // es la que hace la validación del switch


    //Método constructor

    public Promedio(){

        this.calificacionExamen=0;

        this.calificacionLaboratorio=0;

        this.calificacionFinal=0;

        this.sumaCalificaciones=0;

        this.promedio=0;

    }

    public void calificacion(){

        System.out.println("Bienvenido al sistema para calcular tú primedio final\n");

        System.out.println("A continuación ingresarás las calificaciones solicitadas para calcular tu promedio\n");

        System.out.println("Por favor ingresa la calificación de tú exámen\n");

        Scanner calExa= new Scanner(System.in);

        calificacionExamen=calExa.nextDouble();

        System.out.println("Por favor ingresa la calificación de laboratorio");

        Scanner calLab= new Scanner(System.in);

        calificacionLaboratorio=calLab.nextDouble();

        System.out.println("Por favor ingresa la calificación final");

        Scanner calFin=new Scanner(System.in);

        calificacionFinal=calFin.nextDouble();

        //Calculando el promedio de las calificaciones

        sumaCalificaciones= calificacionExamen+calificacionLaboratorio+calificacionFinal;

        System.out.println("La suma de tus calificaciones es "+sumaCalificaciones);

        promedio=sumaCalificaciones/3;

        System.out.println("Tú promedio final es "+promedio);

        System.out.println("Tu promedio con los criterios de redondeo es "+Math.round(promedio)); //Redondea el promedio 



    }

    //Validando si el promedio es aprobatorio minimo 7 sino que calificacion se necesita para aprobar

    public void aprobatoria(){

        if (promedio>=7) {

            System.out.println("Felicidades tienes una calificación aprobatoria en el curso");
            
        }else{

            System.out.println("Lo siento no aprobaste el curso, te falta  "+Math.round(7-promedio)+" punto(s) para pasar");

        }
        
        
    }    
        



    
}
