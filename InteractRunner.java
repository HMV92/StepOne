import java.util.Scanner;
import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;


public class InteractRunner {
	private static String exit = "no";
	private static double x = 0.0;
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		Scanner reader = new Scanner(System.in);
        JPanel windowContent = new JPanel();
		JButton numButtons[] = new JButton[9];
		GirdBagLayout gb = new GirdBagLayout();
		GirdBagConstraints constr = new GirdBagConstraints();
		constr.x=0;
		constr.y=0;
		constr.gridheight = 1;
		constr.gridwidth = 6;
		constr.fill = constr.BOTH;
		constr.weightx = 1;
		constr.weighty = 1;
		constr.anchor = constr.CENTER;
		displayField = new JTextField();
		gb.setConstraints(displayField,constr);
		windowContent.add(displayField);
		
		windowContent.setLayout(gb);
		
		
		JLabel label1 = new JLabel("First number");
		JTextField field1 = new JTextField(15);
		field1.setHorizontalAlignmentr(RIGHT);
		JLabel label2 = new JLabel("Second number");
		JTextField field2 = new JTextField(15);
		JLabel label3 = new JLabel("Result");
		JTextField field3 = new JTextField(25);
		JButton add = new JButton("add");
		JButton sub = new JButton("sub");
		JButton mul = new JButton("mul");
		JButton div = new JButton("div");
		
		windowContent.add(label1);	
		windowContent.add(field1);	
		windowContent.add(label2);	
		windowContent.add(field2);	
		windowContent.add(label3);	
		windowContent.add(field3);	
		windowContent.add(add);	
		windowContent.add(sub);	
		windowContent.add(mul);	
		windowContent.add(div);

		JFrame frame = new JFrame("My first app with graphic interface");
		frame.setContentPane(windowContent);
		frame.setSize(400,400);
		frame.setVisible(true);
		/*
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
        }*/
	}
	public class numButton (String value){
		JButton 
    }
}