public class Calculate {
	
	public static void main (String[] arg) {
		//System.out.println("Calculating...");
		String operation = String.valueOf(arg[0]);
		double first = Double.valueOf(arg[1]);
		double second = Double.valueOf(arg[2]);
		double result;
		switch (operation) {
			case "sum": result = first + second;
				break;
			case "mul": result = first * second;
				break;
			case "div": result = first / second;
				break;
			case "sub": result = first - second;
				break;
			default:  result = 0.0;
				break;
			}
		System.out.println("Result is " + result);
	}
	
}