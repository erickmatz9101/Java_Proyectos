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

    cadena=cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
    .replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");

    System.out.println(cadena.getClass().getSimpleName());


}

//Método que invierte la cadena de texto y valida si es palindromo o no


public  void inversa(){

    StringBuilder rev = new StringBuilder(cadena);

    reversa= rev.reverse().toString();

    System.out.println(reversa.getClass().getSimpleName());
    

    if (cadena==reversa) {

        System.out.println("la palabra o frase que ingresaste es un palíndromo");
        
    } else {

        System.out.println("La palabra o frase que ingresaste no es un palíndromo");
        
    }
}
    
}
