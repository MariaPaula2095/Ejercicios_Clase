import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double dinero;
        int numero;
        int max= 3;
        int min= 1;
        boolean estado= true;


        Random ale = new Random();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su cantidad de dinero: ");
        dinero= teclado.nextDouble();

        numero = ale.nextInt((max - min +1)) + min;
        System.out.println("Su número es: " + numero);

        double saldo1;
        double saldo2;
        double saldo3;

        int opcion;

do  {


    if (numero == 3) {
        saldo1=(dinero-dinero);
        System.out.println("Usted ha perdido todo su dinero. Saldo= " + saldo1);
        estado=false;
    } else if (numero == 2) {
        saldo2=(dinero/2);
        System.out.println("Usted ha perdido la mitad de su dinero. Saldo= " + saldo2);
        System.out.println("Desea seguir jugando? 1= Sí / 2= No");
        opcion = teclado.nextInt();

        if (opcion == 1){

            numero = ale.nextInt((max - min +1)) + min;
            System.out.println("Su número es: " + numero);
        }else if (opcion==2){

            estado=false;
            System.out.println("Gracias por participar. Su saldo es: " + dinero);
        }

    } else if (numero == 1) {
        saldo3=(dinero*dinero);
        System.out.println("Usted ha duplicado su dinero. Saldo= " + saldo3);
        System.out.println("Desea seguir jugando? 1= Sí / 2= No");
        opcion = teclado.nextInt();

        if (opcion == 1){
            numero = ale.nextInt((max - min +1)) + min;
            System.out.println("Su número es: " + numero);
        }else if (opcion==2){
            System.out.println("Gracias por participar. Su saldo es: " + dinero);
            break;
        }
    }
}while (estado);
    }

}