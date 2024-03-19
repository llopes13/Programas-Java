package JAVA.Practicas;

import java.util.Scanner;

public class Uf2Pt3ex1LopesLuis {
  
  // Método para calcular el factorial de un número
  public static int factorial(int num){
    if (num == 0) {
        return 1;
    }else
    return num * factorial(num - 1); 
    
  }

  // Método para calcular la suma de todos los números anteriores a uno dado
  public static int suma(int num){
    if(num == 0){
      return 0;
    }else
    return num + suma(num - 1);
  }

  // Método para calcular el término n-ésimo de la secuencia de Fibonacci
  public static int fibonacci(int num){
    if (num == 1 || num == 2) {
        return 1;
    }else
    return fibonacci(num - 1) + fibonacci(num - 2);
    }

    // Método para invertir una cadena de texto
    public static String inverter(String cadena){
      if (cadena.length() == 1) {
        return cadena;
      }else
        return inverter(cadena.substring(1)) + cadena.charAt(0);
    }

    // Método para contar la cantidad de dígitos de un número
    public static int digitos(int num){
      if (num < 10) {
        return 1;
      }else
        return 1 + digitos(num/10);
    }

    // Método para calcular una potencia
    public static int potencia(int base, int exponente){
      if (exponente == 0) {
        return 1;
      }else
        return  base * potencia(base, exponente -1);
    }
  
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    int opcion = 0;
    int numero = 0;
    
    // Menú de opciones
    do {
      System.out.println("Menu");
      System.out.println("1. Factorial");
      System.out.println("2. Suma");
      System.out.println("3. Fibonacci");
      System.out.println("4. Invertir cadenas");
      System.out.println("5. Contar digitos");
      System.out.println("6. Potencia");
      System.out.println("7. Salir");
      opcion = key.nextInt();

      // Switch para manejar las diferentes opciones
      switch (opcion) {
        case 1:
          System.out.println("Escriba un numero para saber su factorial");
          numero = key.nextInt();
          System.out.println(numero + "! = " + factorial(numero));
          break;
        case 2:
          System.out.println("Escriba un numero para saber la suma de todos los numeros anteriores a el");
          numero = key.nextInt();
          System.out.println(numero + " + todos los numeros anteriores = " + suma(numero));
          break;
        case 3:
          System.out.println("Elige que posicion de la secuencia de fibonacci quieres saber");
          numero = key.nextInt();
          System.out.println("La posicion " + numero + " de la secuencia de fibonacci es " + fibonacci(numero));
          break;
        case 4:
          System.out.println("Introduce el texto que quieres invertir");
          key.nextLine(); // Se realiza para consumir la línea pendiente
          String texto = key.nextLine();
          String invertida = inverter(texto);
          System.out.println(texto + " al revés es " + invertida);
          break;
        case 5:
          System.out.println("Inserta el numero del cual quieres contar las cifras");
          numero = key.nextInt();
          System.out.println(numero + " tiene " + digitos(numero) + " cifras");
          break;
        case 6:
          int base = 0;
          int exponente = 0;
          System.out.print("Cual es la base: ");
          base = key.nextInt();
          System.out.print("Cual es el exponente: ");
          exponente = key.nextInt();
          System.out.println(base + " elevado a " + exponente + " es " + potencia(base, exponente));
          break;
        case 7:
          System.out.println("Cerrando programa!!");
          break;
        default:
          System.out.println("Opcion no encontrada");
          break;
      }
    } while (opcion != 7);
  }
}
