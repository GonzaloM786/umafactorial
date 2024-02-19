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
        if (num < 0) {
            System.out.println("El factorial no esta definido"
                    + " para numeros negativos");
        } else {
            long fac = fact(num);
            System.out.println("El factorial de " + num + " es " + fac);
        }
        scanInput.close();
    }
}