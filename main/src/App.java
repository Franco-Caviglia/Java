import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor del primer numero: ");
        int num1 = entrada.nextInt();

        System.out.println("Ingrese el valor del segundo numero: ");
        int num2 = entrada.nextInt();

        System.out.println("Ingrese el valor del tercer numero: ");
        int num3 = entrada.nextInt();

        numeroMayor(num1, num2, num3);
        promedioTresNumeros(num1, num2, num3);

        System.out.println("Ingrese el numero que desee saber si es par: ");
        int num = entrada.nextInt();
        numeroPar(num);

        entrada.close();
        // if (num1 > num2 && num1 > num3) {
        // System.out.println("El mayor numero es: " + num1);
        // } else if (num2 > num1 && num2 > num3) {
        // System.out.println("EL mayor numero es el: " + num2);
        // } else if (num3 > num1 && num3 > num2) {
        // System.out.println("El mayor numero es el: " + num3);
        // } else {
        // System.out.println("Numeros repetidos, vuelve a intentar");
        // }
    }

    // Funciones;
    private static void promedioTresNumeros(int num1, int num2, int num3) {
        int suma = num1 + num2 + num3;
        float avg = suma / 3;
        System.out.println("El promedio es: " + avg);
    }

    private static void numeroPar(int num) {

        if (num % 2 == 0) {
            System.out.println("El numero es par!");
        }
    }

    private static void numeroMayor(int num1, int num2, int num3) {
        int numMayor = num1;

        if (num2 > numMayor) {
            numMayor = num2;
        }
        if (num3 > numMayor) {
            numMayor = num3;
        }
        System.out.println("El numero mayor es: " + numMayor);
    }
}
