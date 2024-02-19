import java.util.Scanner;

public class factorial {
    public static long fact(long num) {
        long fac = 1;
        for (long i = 1; i <= num; ++i) {
            fac = fac * i;
        }
        return fac;
    }

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        long num = scanInput.nextLong();
        long fac = fact(num);
        System.out.println("El factorial de " + num + " es " + fac);
        scanInput.close();
    }
}