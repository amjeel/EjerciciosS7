package angelrivera_20230272;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("ingresar un numero");
        double numero = sc.nextDouble();
        while (!sc.hasNext()); {
            System.out.println("Ingrese un número");
            if (numero > 0) {
                System.out.println("el numero es positivo");
            } else if (numero < 0) {
                System.out.println("el numero es negativo");
            }
            else {
                System.out.println("el numero es 0");
            }
        }

    }
}