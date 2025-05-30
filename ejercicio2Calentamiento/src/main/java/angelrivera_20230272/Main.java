package angelrivera_20230272;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingresa un numero");
        num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es inpar");
        }
        sc.close();
    }
}