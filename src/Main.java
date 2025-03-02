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




        Scanner teclado = new Scanner(System.in);
        System.out.println("**********BIENVENIDO A NUESTRA CALCULADORA************");


do {
    System.out.println("Ingrese el primer numero de 1 a 100: ");
    numero1= teclado.nextDouble();
    System.out.println("Ingrese el segundo numero de 1 a 100: ");
    numero2= teclado.nextDouble();
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