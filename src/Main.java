import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double peso;
        double estatura;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su peso en Kg: ");
        peso= teclado.nextDouble();

        System.out.println("Ingrese su estatura en cm: ");
        estatura= teclado.nextDouble();
        double imc= (peso/(estatura*estatura));

        if (imc<= 18.5){
            System.out.println("Tiene bajo peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Tiene un peso normal");
        } else if (imc >= 25 && imc <= 26.9) {
            System.out.println("Tiene sobrepeso grado 1");
        } else if (imc >= 27 && imc <= 29.9) {
            System.out.println("Tiene sobrepeso grado 2");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Tiene obesidad grado 1");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Tiene obesidad grado 2");
        } else if (imc >= 40 && imc <= 49.9) {
            System.out.println("Tiene obesidad grado 3");
        } else if (imc >= 50) {
            System.out.println("Tiene obesidad grado 4");
        }
    }
}