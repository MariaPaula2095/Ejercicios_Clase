import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double numero1, numero2, operacion;//Numeros para operar
        int opcion;
        boolean estado=true;
        String signo; //Operando a usar



        Random ale = new Random();
        Scanner teclado = new Scanner(System.in);
        System.out.println("**********BIENVENIDO A NUESTRA CALCULADORA************");


do {
    numero1=ale.nextInt((100 - 1 +1)) + 1;  //Numeros aleatorios
    numero2=ale.nextInt((100 - 1 +1)) + 1;
    System.out.println("Los numeros son: " + numero1 + " y "+numero2);
    System.out.println("Digite la operecion que quiere hacer con los numeros: " +
            "(+),(-),(*),(/),(^),(%)");
    signo=teclado.next();

    if (signo.equals("+")) {
        operacion = (numero1 + numero2);
        System.out.println("El resultado de la suma es: " + operacion);
        System.out.println("¿Desea seguir haciendo operaciones?  1= Si  / 2= No");
        opcion= teclado.nextInt();

        if (opcion==1){
            continue;
        } else if (opcion==2) {
            estado=false;
            System.out.println("Gracias por usar nuestra calculadora");
        }

    } else if (signo.equals("-")) {
        operacion = (numero1 - numero2);
        System.out.println("El resultado de la resta es: " + operacion);
        System.out.println("¿Desea seguir haciendo operaciones?  1= Si  / 2= No");
        opcion= teclado.nextInt();

        if (opcion==1){
            continue;
        } else if (opcion==2) {
            estado=false;
            System.out.println("Gracias por usar nuestra calculadora");
        }

    } else if (signo.equals("*")) {
        operacion = (numero1 * numero2);
        System.out.println("El resultado de la multiplicacion es: " + operacion);
        System.out.println("¿Desea seguir haciendo operaciones?  1= Si  / 2= No");
        opcion= teclado.nextInt();

        if (opcion==1){
            continue;
        } else if (opcion==2) {
            estado=false;
            System.out.println("Gracias por usar nuestra calculadora");
        }

    } else if (signo.equals("/")) {
        operacion = (numero1 / numero2);
        System.out.println("El resultado de la division es: " + operacion);
        System.out.println("¿Desea seguir haciendo operaciones?  1= Si  / 2= No");
        opcion= teclado.nextInt();

        if (opcion==1){
            continue;
        } else if (opcion==2) {
            estado=false;
            System.out.println("Gracias por usar nuestra calculadora");
        }

    } else if (signo.equals("^")) {
        operacion = Math.pow(numero1, numero2);
        System.out.println("El resultado de la potencia es: " + operacion);
        System.out.println("¿Desea seguir haciendo operaciones?  1= Si  / 2= No");
        opcion= teclado.nextInt();
        if (opcion==1){
            continue;
        } else if (opcion==2) {
            estado=false;
            System.out.println("Gracias por usar nuestra calculadora");
        }

    } else if (signo.equals("%")) {
        operacion = (numero1 % numero2);
        System.out.println("El resultado del modulo es: " + operacion);
        System.out.println("¿Desea seguir haciendo operaciones?  1= Si  / 2= No");
        opcion= teclado.nextInt();

        if (opcion==1){
            continue;
        } else if (opcion==2) {
            estado=false;
            System.out.println("Gracias por usar nuestra calculadora");
        }
    }
}while (estado);

    }

}