import java.util.Scanner;

public class InteractRunner {
	private static String exit = "no";
	private static double x = 0.0;
    public static void main(String[] arg) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            while (!exit.equals("yes")) {
                System.out.println("Enter first arg : ");
				checker(reader.next());
				exit = exit;
                double first = x;
				System.out.println("exit is " + exit);
				System.out.println("Enter second arg : ");
                checker(reader.next());
                double second = x;
				System.out.println(exit);
                System.out.println("Enter operation type [ add | sub | mul | div ]: ");
                String oper = reader.next();
                calc.main(first, second, oper);
                System.out.println("Result : " + calc.getResult());
                System.out.println("Clear result : yes / no ");
                calc.clearResult(reader.next());
				System.out.println(exit);
                System.out.println("Exit : yes / no ");
                //exit = reader.next();
            }
        }
        finally {
                reader.close();
        }
	}
	public static void checker (String data){
		x = 0.0;
		switch (data) {
			case "exit":
				System.out.println("exit case was activated");
				exit = "yes";
				break;
			default: 
				System.out.println("default case was activated");
				x = Double.parseDouble(data);
				break;
			
		}
		//return x;
    }
}