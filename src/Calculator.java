import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {
        System.out.println("Я - Великий калькулятор. Я умею складывать, вычитать, умножать и делить два целых числа от 1 до 10, в том числе и римские! \nПример: V + III = VIII || 5 * 5 = 25");
        Scanner scanner = new Scanner (System.in);
        String a,o,b;
        a = scanner.next();
        o = scanner.next();
        b = scanner.next();
        if (Check.checkArabic(a,b)) {
            int n,n2, result2;
            n = Integer.parseInt(a);
            n2 = Integer.parseInt(b);
            result2 = Operation.action(n,o,n2);
            if (result2 >= 1) {
                System.out.println(result2);
            }
            else
                System.exit(0);
        }
        else if (Check.checkRome(a,b)) {
            int num,num2, result;
            num = Rome.romeToArab(a);
            num2 = Rome.romeToArab(b);
            result = Operation.action(num,o,num2);
            if (result >= 1) {
                System.out.println(Rome.arabToRome(result));
            }
            else
                System.exit(0);
        }
        else {
            System.exit(0);
        }
    }
}