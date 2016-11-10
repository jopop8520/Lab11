import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class inputFrame1 extends JFrame{
	
	
	
	public inputFrame1(){
		JButton but1 = new JButton("�ŧ���ͧ��");
		but1.setSize(100, 100);
	
		
		JLabel lb1 = new JLabel("Celsius");
		getContentPane().add(lb1);
		
		JTextField tx1 =new JTextField("");
		tx1.setColumns(10);
		getContentPane().add(tx1);
		
		JLabel lb2 = new JLabel("Fahrenheit");
		getContentPane().add(lb2);
		JLabel lb3 = new JLabel("0");
		getContentPane().add(lb3);
		
		JLabel lb4 = new JLabel("Fahrenhiet");
		getContentPane().add(lb4);
		
		JTextField tx2 =new JTextField("");
		tx2.setColumns(10);
		getContentPane().add(tx2);
		
		JLabel lb5 = new JLabel("Celsius");
		getContentPane().add(lb5);
		JLabel lb6 = new JLabel("0");
		getContentPane().add(lb6);
		
		
		but1.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				String degree;
				double fahren1,celsius1;
				degree = tx1.getText();
				
				fahren1= celsiusToFahrenheit(Double.parseDouble(degree));
				lb3.setText(Double.toString(fahren1));
				
				degree = tx2.getText();
				celsius1 = fahrenheitToCelsius(Double.parseDouble(degree));
				NumberFormat formatter = new DecimalFormat("#0.000");
				lb6.setText(formatter.format(celsius1));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			} });
		getContentPane().add(but1);
		//////////////////////////////////////////////////
		JButton but2 = new JButton("����¹��Ҥ������");
		but1.setSize(100, 100);
		
		JLabel lb7 = new JLabel("Meter");
		getContentPane().add(lb7);
		
		JTextField tx3 =new JTextField("");
		tx3.setColumns(10);
		getContentPane().add(tx3);
		
		JLabel lb8 = new JLabel("Foot");
		getContentPane().add(lb8);
		JLabel lb9 = new JLabel("0");
		getContentPane().add(lb9);
	
		JLabel lb10 = new JLabel("Foot");
		getContentPane().add(lb10);

		JTextField tx4 =new JTextField("");
		tx4.setColumns(10);
		getContentPane().add(tx4);
		
		JLabel lb11 = new JLabel("Meter");
		getContentPane().add(lb11);
		JLabel lb12 = new JLabel("0");
		getContentPane().add(lb12);
		
		but2.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				String degree;
				double foot1,meter1;
				degree = tx4.getText();
				foot1= meterToFoot(Double.parseDouble(degree));
				lb9.setText(Double.toString(foot1));
				
				degree = tx4.getText();
				meter1 = footToMeter(Double.parseDouble(degree));
				NumberFormat formatter = new DecimalFormat("#0.000");
				lb12.setText(formatter.format(meter1));
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
			}});
		getContentPane().add(but2);

	}

	public static double celsiusToFahrenheit(double celsius) {
		return (1.8)*celsius + 32;
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0/9)*(fahrenheit - 32);
	}
	public static double meterToFoot(double meter)	{
		return 3.279 * meter;
	}
	public static double footToMeter(double foot)	{
		return 0.305 * foot;
	}
	
	public static void main(String[] args) {
		inputFrame1 in1 = new inputFrame1();
		in1.setLayout(new FlowLayout());
		in1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		in1.setDefaultLookAndFeelDecorated(true);
		in1.setTitle("Hello Lab11");
		in1.setSize(500, 500);
		in1.setVisible(true);
		
		
	}

}
