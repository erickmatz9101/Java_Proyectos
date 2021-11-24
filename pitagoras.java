import java.util.Scanner;

public class pitagoras {

    double valorA;

    double valorB;

    double valorC;

    double sumatoria;

    double resultado;
    
    int opcion;

    //Método constructor para sobrecargar las variables

    public pitagoras(){

        this.valorA=0;
        this.valorB=0;
        this.valorC=0;
        this.sumatoria=0;
        this.resultado=0;
        this.opcion=0;

    }


    //Método para que el usuario ingrese los datos

    public void dataInput(){

        System.out.println("Bienvenido al programa para calcular el teorema de Pitágoras\n");

        System.out.println("Para calcular el teorema de Pitágoras necesitamos conocer por lo menos 2 de sus lados. Si deseas calcular (a) digita 1, para (b) digita 2 y para (c) digita 3\n");

        Scanner entry=new Scanner(System.in);

        opcion=entry.nextInt();

        switch (opcion) {
            case 1:

            System.out.println("Elegiste la opción 1 que nos ayuda a calcular el lado C. Para ello necesitamos conocer los valores de (a) y (b)\n");

            System.out.println("Ingresa el valor de a\n");

            Scanner datoA=new Scanner(System.in);

            valorA=datoA.nextDouble();

            System.out.println("Ingresa el valor de b\n");

            Scanner datoB=new Scanner(System.in);

            valorB=datoB.nextDouble();

            //Calculando la potencia de los valores

            valorA=Math.pow(valorA, 2);
            System.out.println("El valor de a elevado es "+valorA);

            valorB=Math.pow(valorB, 2);
            System.out.println("El valor de b elevado es "+valorB);


            //Sumando los valores de a y b al cuadrado

            sumatoria=valorA+valorB;

            System.out.println("La suma de los valores elevado es de "+sumatoria);

            //Calculando la raíz cuadrada de C

            valorC=Math.sqrt(sumatoria);

            System.out.println("El valor de C es "+valorC);
                
                break;

            case 2:

            System.out.println("Elegiste la opción  que nos ayuda a calcular el lado A. Para ello necesitamos conocer los valores de (b) y (c)\n");

            System.out.println("Ingresa el valor de b\n");

            Scanner datob=new Scanner(System.in);

            valorB=datob.nextDouble();

            System.out.println("Ingresa el valor de C\n");

            Scanner datoC=new Scanner(System.in);

            valorC=datoC.nextDouble();

            //Calculando la potencia de los valores

            valorB=Math.pow(valorB, 2);
            System.out.println("El valor de b elevado es "+valorB);

            valorC=Math.pow(valorC, 2);
            System.out.println("El valor de c elevado es "+valorC);


            //Sumando los valores de a y b al cuadrado

            sumatoria=valorB+valorC;

            System.out.println("La suma de los valores elevado es de "+sumatoria);

            //Calculando la raíz cuadrada de C

            valorC=Math.sqrt(sumatoria);

            System.out.println("El valor de A es "+valorA);
                
                break;

            case 3:

            System.out.println("Elegiste la opción  que nos ayuda a calcular el lado B. Para ello necesitamos conocer los valores de (c) y (a)\n");

            System.out.println("Ingresa el valor de c\n");

            Scanner datoc=new Scanner(System.in);

            valorC=datoc.nextDouble();

            System.out.println("Ingresa el valor de a\n");

            Scanner datoa=new Scanner(System.in);

            valorA=datoa.nextDouble();

            //Calculando la potencia de los valores

            valorC=Math.pow(valorC, 2);
            System.out.println("El valor de c elevado es "+valorC);

            valorA=Math.pow(valorA, 2);
            System.out.println("El valor de a elevado es "+valorA);


            //Sumando los valores de a y b al cuadrado

            sumatoria=valorC+valorA;

            System.out.println("La suma de los valores elevado es de "+sumatoria);

            //Calculando la raíz cuadrada de C

            valorB=Math.sqrt(sumatoria);

            System.out.println("El valor de B es "+valorB);
                
                break;




        

        
            default:
                break;
        }


            
    }
    
}
