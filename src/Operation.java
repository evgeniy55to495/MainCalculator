public class Operation {
    static int action(int a, String o, int b) {
        switch (o) {
            case "+" : return a + b;
            case "-" : return a - b;
            case "*" : return a * b;
            case "/" : return a / b;
        }
        return 0;
    }
}