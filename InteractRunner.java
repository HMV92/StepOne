import java.util.Scanner;

public class InteractRunner {
    public static void main(String[] arg) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no", x = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter first arg : ");
                double first = Double.parseDouble(reader.next());
                System.out.println("Enter second arg : ");
                double second = Double.parseDouble(reader.next());
                System.out.println("Enter operation type [ add | sub | mul | div ]: ");
                String oper = reader.next();
                calc.main(first, second, oper);
                System.out.println("Result : " + calc.getResult());
                System.out.println("Clear result : yes / no ");
                calc.clearResult(reader.next());
                System.out.println("Exit : yes / no ");
                exit = reader.next();
            }
        }
        finally {
                reader.close();
        }

    }
}