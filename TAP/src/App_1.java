
import Libs.Calcular;
import java.util.Scanner;

public class App_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num1 = 0;
        float num2 = 0;
        float num3 = 0;

        Calcular calc = new Calcular();
        int resp;
        System.out.println("Ingrese la opcion a realizar: ");
        System.out.println("1.- SUMA DE DOS NUMEROS");
        System.out.println("2.- SUMA DE TRES NUMEROS");
        System.out.println("3.- MULTIPLICACION DE DOS NUMEROS");
        System.out.println("4.- MULTIPLICACION DE TRES NUMEROS");
        System.out.println("5.- RESTA DE TRES NUMEROS");
        System.out.println("6.- DIVISION DE DOS NUMEROS");
        resp = scan.nextInt();
        switch (resp) {
            case 1:
                System.out.println("Ingrese el primer numero: ");
                num1 = scan.nextFloat();
                System.out.println("Ingrese el segundo numero: ");
                num2 = scan.nextFloat();
                calc.SumaDosP(num1, num2);
                break;

            case 2:
                System.out.println("Ingrese el primer numero: ");
                num1 = scan.nextFloat();
                System.out.println("Ingrese el segundo numero: ");
                num2 = scan.nextFloat();
                System.out.println("Ingrese el tercer numero: ");
                num3 = scan.nextFloat();
                calc.SumaTres(num1, num2, num3);
                break;

            case 3:

                System.out.println("Ingrese el primer numero: ");
                num1 = scan.nextFloat();
                System.out.println("Ingrese el segundo numero: ");
                num2 = scan.nextFloat();
                calc.MulDos(num1, num2);
                break;

            case 4:
                System.out.println("Ingrese el primer numero: ");
                num1 = scan.nextFloat();
                System.out.println("Ingrese el segundo numero: ");
                num2 = scan.nextFloat();
                System.out.println("Ingrese el tercer numero: ");
                num3 = scan.nextFloat();
                calc.MulTres(num1, num2, num3);
                break;

            case 5:
                System.out.println("Ingrese el primer numero: ");
                num1 = scan.nextFloat();
                System.out.println("Ingrese el segundo numero: ");
                num2 = scan.nextFloat();
                System.out.println("Ingrese el tercer numero: ");
                num3 = scan.nextFloat();
                calc.RestaTres(num1, num2, num3);
                break;

            case 6:
                System.out.println("Ingrese el primer numero: ");
                num1 = scan.nextFloat();
                System.out.println("Ingrese el segundo numero: ");
                num2 = scan.nextFloat();
                calc.Division(num1, num2);

                break;
        }
    
}
}
