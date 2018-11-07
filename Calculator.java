public class Calculator {
    private double result;
    public void main (double a, double b, String y) {
        switch (y) {
            case "add":
                add (a, b);
                break;
            case "sub":
                sub (a, b);
                break;
            case "mul":
                mul (a, b);
                break;
            case "div":
                div (a, b);
                break;
            default:
                this.result = 0;
        }
    };
    public void add (double a, double b){
        this.result = a + b;
    }

    public void sub(double a, double b) {
        this.result = a - b;
    }

    public void mul(double a, double b) {
        this.result = a * b;
    }

    public void div(double a, double b) {
        this.result = a / b;
    }

    public double getResult() {
        return this.result;
    }

    public void clearResult(String x) {
        if (x.equals("yes")) {
            this.result = 0;
			System.out.println("result was cleared");
        }
    }

}