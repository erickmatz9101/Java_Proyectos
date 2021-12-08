import java.util.Scanner;

public class NumeroReversible {

    int numero; //es donde se guarda el dato del usuario 

    int desplace; // permite el desplace de los numeros para poder invertirlos

    int invertido; //guarda el valor del número invertido


    //Método constructor


    public NumeroReversible(){
        this.numero=0;

    }

    //Método para poder revertir el número que ingrese el usuario

    public void reversible(){

        System.out.println("Bienvenido al programa que hace reversible el número que ingreses: \n");

        System.out.println("Por favor ingresa el número que deseas se haga reversible\n");

        Scanner num=new Scanner(System.in);

        numero=num.nextInt();

        while (numero>0) {

            desplace=numero%10;

            invertido=invertido*10+desplace;

            numero /=10;
            
        }

        System.out.println("El número invertido es: "+invertido);

        

    }
    
}
