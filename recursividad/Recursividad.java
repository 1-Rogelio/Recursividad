package recursividad;

import java.util.Scanner;

public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
     int  dato, menu;
    boolean continuar = true;  
    while (continuar){
   
   System.out.println("*********************Menú***********************");
   System.out.println("1.- Serie Fibonacci");
   System.out.println("2.- Presentar números del 1 al 10");
   System.out.println("3.- Factorial");
   System.out.println("4.- Desaparecer números");
   System.out.println("5.- Palindromo");
   System.out.println("6.- Salir"); 
   System.out.println("\n");
   System.out.println("Selecciona una opción");
   
   menu = leer.nextInt();
    switch (menu){
       case 1:
           fibonacci(8);
           int x = fibonacci(8);
           System.out.println("Su resultado es: " +x);
           break;
       case 2:
           numeros(1);
           System.out.println("");
           break;
       case 3:
           System.out.println("Introduce el número del factorial");
           int número=leer.nextInt();
           int total = Recursividad.factorial(número);
           System.out.println("El Factorial de: " + número + " es: " +total);
           break;
       case 4:
           
           break;
       case 5:
            String palabra; 
            System.out.println("Ingresa la palabra");
            palabra = leer.next();
            palabra = palabra.replace ("","");
           if (Recursividad.palindromo(palabra,0,palabra.length()-1)){
                System.out.println("Es palindromo");
            }
            else{
                System.out.println("No es palindromo");
            }
           break;
       case 6:
           continuar = false;
           break;
           
           default:
               System.out.println("Opción incorrecta");
               break;
    }
     
}
    }    

  public static int fibonacci(int n){
      if ((n==0) || (n==1))
  return n;
 return fibonacci(n-1) + fibonacci(n-2);
  }

  public static int factorial(int x){
     if (x>0){
         int valor = x * factorial(x-1);
         return valor;
         }else
        return 1;
}
  public static boolean palindromo(String t,int x, int n){
  if (x!=t.length()/2){
      if(t.charAt(x)==t.charAt(n)) {
          return palindromo(t, ++x, --n); 
      }
      else
          return false;
      }
          return true;
  }

   public static void numeros(int a){
      if (a==11){
      }else{
                  System.out.print(""+a);
                  numeros(a+1);
                  }
      }
}
