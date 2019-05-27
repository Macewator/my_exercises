package exercises.precyzja_liczb;

import java.math.BigDecimal;
import java.util.Scanner;

public class NumberPrecision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0.1;
        double b = 0.0;

        BigDecimal bigDecimal = BigDecimal.valueOf(a);
        BigDecimal result = BigDecimal.valueOf(b);
        BigDecimal userNum = BigDecimal.valueOf(scanner.nextDouble());

        if (userNum.doubleValue() > 0)
            while (result.doubleValue() <= userNum.doubleValue()) {
                System.out.print(result + " ");
                result = result.add(bigDecimal);
            }
        else
            while (result.doubleValue() >= userNum.doubleValue()) {
                System.out.print(result + " ");
                result = result.subtract(bigDecimal);
            }
    }
}
