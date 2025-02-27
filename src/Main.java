import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int max = 50;
        int min = 1;
        int adivinar;

        Random ale = new Random();
        adivinar = ale.nextInt((max - min +1))+min;


        for (int i= 1; i<=3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese el numero: ");
            int usuario = teclado.nextInt();

            if (usuario == adivinar) {
                System.out.println("Usted a adivinado el número");
            } else if (usuario > adivinar) {
                System.out.println("El número es menor");
            } else if (usuario < adivinar) {
                System.out.println("El número es mayor");
            }
        }
        System.out.println("El numero era "+ adivinar);
    }
}