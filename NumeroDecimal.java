import java.util.Scanner;

public class NumeroDecimal {

    double numero;

    double parteDecimal;

    double parteEntera;

    //Método constructor

    public NumeroDecimal(){

        this.numero=0;

        this.parteDecimal=0;

        this.parteEntera=0;
    }


    //Método para mostrar la parte decimal de un número

    public void decimal() {

        System.out.println("Bienvenido al programa que te muestra la parte decimal del número que ingreses\n");

        System.out.println("Por favor inggesa el numero del cual deseas conocer su parte decimal\n");

        Scanner entrada=new Scanner(System.in);

        numero=entrada.nextDouble();

        //Trabajando el número para mostrar la parte decimal

        parteDecimal=numero % 1;

        System.out.println("La parte decimal de el número ingresado es "+parteDecimal);





    }
    
}
