import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int rondas, dado1, dado2;
        int max = 10;
        int min = 1;

        int contdado1=0, contdado2=0;

        Random ale = new Random();

        rondas = ale.nextInt((max - min +1)) + min;
        System.out.println("CANTIDAD DE RONDAS: " + rondas );

        for(int i=1; i<= rondas; i++) {
            dado1 = ale.nextInt((6 - 1 + 1))+1;
            contdado1 += dado1;

            dado2 = ale.nextInt((6 - 1 + 1))+1;
            contdado2 += dado2;

            System.out.println();
            System.out.print("DADO1: " + dado1 + "");

            System.out.print(" DADO2: " + dado2);



        }
        System.out.println();
        if (contdado1 > contdado2) {
            System.out.println("El ganador es D1 con " + contdado1);
        }else{
            System.out.println("El ganador es D2 con "+ contdado2);

        }



    }
}