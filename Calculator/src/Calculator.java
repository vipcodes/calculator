import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculator
{

	private JFrame frame;
	private JTextField textDisp;
	
	double val1;
	double val2;
	double result;
	String operation;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 265, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		textDisp = new JTextField();
		textDisp.setFont(new Font("Tahoma", Font.BOLD, 18));
		textDisp.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisp.setBounds(10, 10, 229, 33);
		frame.getContentPane().add(textDisp);
		textDisp.setColumns(10);
		
		
		
		JButton btnClr = new JButton("Clear");
		btnClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textDisp.setText(null);
			}
		});
		btnClr.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		btnClr.setBounds(10, 53, 70, 50);
		frame.getContentPane().add(btnClr);
		
		
		JButton btnBck = new JButton("Correct");
		btnBck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s=textDisp.getText();
				s=s.substring(0,s.length()-1);
				textDisp.setText(s);
			}
		});
		btnBck.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		btnBck.setBounds(160, 53, 80, 50);
		frame.getContentPane().add(btnBck);
		
		
		
  //...................Row 1.......................
	
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 116, 50, 50);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num1=textDisp.getText()+btn7.getText();
				textDisp.setText(num1);
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btn7);
		
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num1=textDisp.getText()+btn8.getText();
				textDisp.setText(num1);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(70, 116, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num1=textDisp.getText()+btn9.getText();
				textDisp.setText(num1);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(130, 116, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnP = new JButton("+");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				val1=Double.parseDouble(textDisp.getText());
				textDisp.setText("");
				operation="+";
			}
		});
		btnP.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnP.setBounds(190, 116, 50, 50);
		frame.getContentPane().add(btnP);
		
		
	//.................Row 2.........................

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num1=textDisp.getText()+btn4.getText();
				textDisp.setText(num1);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 188, 50, 50);
		frame.getContentPane().add(btn4);
		
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num1=textDisp.getText()+btn5.getText();
				textDisp.setText(num1);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(70, 188, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num1=textDisp.getText()+btn6.getText();
				textDisp.setText(num1);
			}
		});
		btn6.setBounds(130, 188, 50, 50);
		frame.getContentPane().add(btn6);
		
		
		JButton btnMi = new JButton("-");
		btnMi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				val1=Double.parseDouble(textDisp.getText());
				textDisp.setText("");
				operation="-";
			}
		});
		btnMi.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMi.setBounds(190, 188, 50, 50);
		frame.getContentPane().add(btnMi);
		
	//...................Row 3.......................
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num1=textDisp.getText()+btn1.getText();
				textDisp.setText(num1);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 263, 50, 50);
		frame.getContentPane().add(btn1);
		
		
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num1=textDisp.getText()+btn2.getText();
				textDisp.setText(num1);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(70, 263, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num1=textDisp.getText()+btn3.getText();
				textDisp.setText(num1);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(130, 263, 50, 50);
		frame.getContentPane().add(btn3);
		
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				val1=Double.parseDouble(textDisp.getText());
				textDisp.setText("");
				operation="*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMul.setBounds(190, 263, 50, 50);
		frame.getContentPane().add(btnMul);
		
		
	//....................Row 4...................
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num1=textDisp.getText()+btn0.getText();
				textDisp.setText(num1);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 321, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num1=textDisp.getText()+btnDot.getText();
				textDisp.setText(num1);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(70, 321, 50, 50);
		frame.getContentPane().add(btnDot);
		
		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				val2=Double.valueOf(textDisp.getText());
				if(operation=="+")
					result=val1+val2;
				else if(operation=="-")
					result=val1-val2;
				else if(operation=="*")
					result=val1*val2;
				else if(operation=="/")
					result=val1/val2;
				
				textDisp.setText(String.valueOf(result));
				
			}
		});
		btnEq.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEq.setBounds(130, 321, 50, 50);
		frame.getContentPane().add(btnEq);
		
		
		JButton btnDev = new JButton("/");
		btnDev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				val1=Double.parseDouble(textDisp.getText());
				textDisp.setText("");
				operation="/";
			}
		});
		btnDev.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDev.setBounds(190, 321, 50, 50);
		frame.getContentPane().add(btnDev);
		
		
		
	}
}
