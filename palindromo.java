import java.util.Scanner;

public class palindromo {

String cadena;

String reversa;

//Método cosntructor para sobrecargar las variables


public palindromo(){

    this.cadena="";

}

//Metodo para convertir las palabras a minúsculas y quitar espacios

public void palabras(){

    System.out.println("Bienvenido al programa para saber si una palabra o frase es palindromo\n");

    System.out.println("Por favor ingresa la palabra o frase\n");

    Scanner entrada=new Scanner(System.in);

    cadena=entrada.nextLine();

    //Convirtiendo a minúsculas y quitando espacios

    cadena=cadena.toLowerCase().replace(" ", "");

    System.out.println(cadena.getClass().getSimpleName());


}

//Método que invierte la cadena de texto y valida si es palindromo o no


public  void inversa(){

    StringBuilder rev = new StringBuilder(cadena);

    reversa= rev.reverse().toString();

    System.out.println(reversa.getClass().getSimpleName());
    

    if (cadena.equals(reversa)) {

        System.out.println("la palabra o frase que ingresaste es un palíndromo");
        
    } else {

        System.out.println("La palabra o frase que ingresaste no es un palíndromo");
        
    }
}
    
}


/**En el método inversa utilicé la clase StringBuilder y creando el objeto rev para poder separar los elementos del String en caracteres
 * ésto es en lugar de utilizar un for ya que ésto me permite que también se tenga un index y así poderle pasar a la variable cvadena como
 * parámetro para poder hacer esto.
 * reversa que es mi segunda variable, está igualada a rev que en éste caso es mi objeto poder recorrer de derecha a izquierda
 * y con el método .tostring poder unir nuevamente esa cadena de caracteres en un string para poder comparar con el if si son o no iguales
 * 
 * En el if valide con .equals ya que es una validación de tipo boolen porque valida el lugar que se ocupa en la memoria en caso de 
 * ser de tipo string y comprar cadena con reversa
 */