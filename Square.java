import java.util.Scanner;

public class Square{

    int number; //Guarda el dato de entrada del usuario

    double root; //Muestra el resultado de calcular la raíz cuadrada

    //Método constructor para sobrecargar las variables

public Square(){
    this.number=0; //Guarda el dato de entrada del usuario
    this.root=0;
}


//Creando el método para que el usuario ingrese los datos

public void dataInput(){ 

    System.out.println("Bienvenido al programa para calcular tu raiz cuadrada\n ");
    Scanner entry=new Scanner(System.in);

    System.out.println("Digita el número para calcular su raiz cuadrada\n");

    number=entry.nextInt();

    System.out.println("El numero que ingresaste es el\n "+number);

    //Validando que el número ingresado sea positivo

    if (number<=0) {

        System.out.println("El número que ingresaste no puede ser negativo\n");
        
    } else {

        System.out.println("Ahora vamos a calcular la raíz cuadrada\n");
        
        calculation();
    }
}

   //Método para hacer el cálculo de la raíz cuadrada
   public void calculation(){

    root=Math.sqrt(number);

    System.out.println("El resultado de la raíz cuadrada es "+root);

}


/*Nota: Sintaxis. El método para calcular la raíz cuadrada en Java es sqrt(), el cual se 
encuentra dentro de la librería Math. Como parámetro de entrada debe recibir un número
  y como resultado devuelve un double.*/ 

}

