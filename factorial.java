import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    public static BigInteger fact(BigInteger num) {
        if (num.compareTo(BigInteger.ONE) <= 0) {
            return BigInteger.ONE;
        } else {
            return num.multiply(fact(num.subtract(BigInteger.ONE)));
        }
    }

    public static BigInteger getNumber() {
        Scanner scanInput = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        BigInteger num = BigInteger.valueOf(scanInput.nextLong());
        scanInput.close();
        return num;
    }

    public static void showFac(BigInteger num) {
        if (num.compareTo(BigInteger.ZERO) < 0) {
            System.out.println("El factorial no esta definido" +
                    " para numeros negativos");
        } else {
            BigInteger fac = fact(num);
            System.out.println("El factorial de " + num + " es " + fac);
        }
    }

    public static void main(String[] args) {
        BigInteger num = getNumber();
        showFac(num);
    }
}