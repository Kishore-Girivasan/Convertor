import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Bit_operation extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField tf1;
	JButton b1,b2,b3;
	String combos[]= {"Decimal","Binary","Octal","Hexa decimal"};
	JComboBox<String> cb1 = new JComboBox<>(combos);
	JComboBox<String> cb2 = new JComboBox<>(combos);
	public Bit_operation() {
		l1=new JLabel("BIT OPERATION");
		l1.setBounds(140, 60, 300, 30);
		l1.setFont(new Font("Verdana", Font.PLAIN,15));
		add(l1);
	
		l2=new JLabel("From");
		l2.setBounds(140, 120, 300, 30);
		l2.setFont(new Font("Verdana", Font.PLAIN,15));
		add(l2);
		
		l3=new JLabel("To");
		l3.setBounds(140, 170, 300, 30);
		l3.setFont(new Font("Verdana", Font.PLAIN,15));
		add(l3);
		
		l4=new JLabel("Input");
		l4.setBounds(140, 220, 300, 30);
		l4.setFont(new Font("Verdana", Font.PLAIN,15));
		add(l4);
		
		l5=new JLabel();
		l5.setBounds(190, 320, 400, 30);
		l5.setFont(new Font("Verdana", Font.PLAIN,15));
		add(l5);
		
		l7=new JLabel();
		l7.setBounds(190, 320, 400, 30);
		l7.setFont(new Font("Verdana", Font.PLAIN,15));
		add(l7);
		
		l8=new JLabel();
		l8.setBounds(190, 320, 400, 30);
		l8.setFont(new Font("Verdana", Font.PLAIN,15));
		add(l8);
		
		l6=new JLabel("Output : ");
		l6.setFont(new Font("Verdana", Font.PLAIN,15));
		l6.setBounds(120,320,150,30);
		add(l6);
		
		//Text field
		tf1 = new JTextField();
		tf1.setBounds(220, 220, 80, 30);
		add(tf1);
		
		//Button
		b1 = new JButton("Convert");
		b1.setBounds(180,280, 100, 30);
		add(b1);
		b1.addActionListener(this);
		
		b2 = new JButton("Back");
		b2.setBounds(360,390, 100, 30);
		add(b2);
		b2.addActionListener(new ActionListener() {
			
			@SuppressWarnings({ "rawtypes", "unused" })
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Convertor cv = new Convertor();	
			}
		});
		b3 = new JButton("Clear");
		b3.setBounds(290,280, 100, 30);
		add(b3);
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tf1.setText(null);
				l5.setText(null);
				l7.setText(null);
			}
		});
		//Check box
		cb1.setBounds(200, 125, 120, 25);
		add(cb1);
		cb1.addActionListener(this);
		cb2.setBounds(200, 175, 120, 25);
		add(cb2);
		cb2.addActionListener(this);
		
		//Frame
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {

		// TODO Auto-generated method stub
		String from=(String) cb1.getSelectedItem().toString().toLowerCase();
		String to=(String) cb2.getSelectedItem().toString().toLowerCase();
		int input=Integer.parseInt(tf1.getText());
		String input1=tf1.getText();
		String o;
		switch(from) {
		case "decimal":
			switch(to) {
			case "decimal":
				l5.setText(input1);
				break;
			case "binary":
				o=Integer.toBinaryString(input);
				String output1=String.valueOf(o);
				l5.setText(output1);
				break;
			case "octal":
				o=Integer.toOctalString(input);
				String output2=String.valueOf(o);
				l5.setText(output2);
				break;
			case "hexa decimal":
				o=Integer.toHexString(input).toUpperCase();
				String output3=String.valueOf(o);
				l5.setText(output3);
				break;
			}
			break;
		case "binary":
			switch (to) {
			case "binary":
				l7.setText(input1);
				break;
			case "decimal":
				int m=Integer.parseInt(input1,2);
				String output=String.valueOf(m);
				l5.setText(output);
				break;
			case "octal":
				int num = Integer.parseInt(input1, 2);
				String octal=Integer.toOctalString(num);
				String o1=String.valueOf(octal);
				l5.setText(o1);
				break;
			case "hexa decimal":
				int num1 = Integer.parseInt(input1, 2);
				String hexa=Integer.toHexString(num1).toUpperCase();
				String o2=String.valueOf(hexa);
				l5.setText(o2);
				break;
			}
		case "octal":
			switch (to) {
			case "binary":
				int b=Integer.parseInt(input1,8);
				String b1=Integer.toBinaryString(b);
				l5.setVisible(false);
				l8.setText(b1);
				break;
			case "decimal":
				int m1=Integer.parseInt(input1,8);
				System.out.println(m1);
				String output1=String.valueOf(m1);
				l5.setVisible(false);
				l8.setText(output1);
				break;
			case "octal":
				l8.setText(input1);
				break;
			case "hexa decimal":
				int m2=Integer.parseInt(input1,8);
				String b2=Integer.toHexString(m2).toUpperCase();
				l5.setVisible(false);
				l8.setText(b2);
				break;
			}
		case "hexa decimal":
			switch (to) {
			case "binary":
				int n=Integer.parseInt(input1,16);
				String bin=Integer.toBinaryString(n);
				l5.setText(bin);
				break;
			case "decimal":
				int m=Integer.parseInt(input1,16);
				String output=String.valueOf(m);
				l5.setText(output);
				break;
			case "octal":
				int m1=Integer.parseInt(input1,16);
				String output1=Integer.toOctalString(m1);
				l5.setText(output1);
				break;
			case "hexa decimal":
				l5.setText(input1);
				break;
			}
		}
		
	} catch (Exception e2) {
		// TODO: handle exception
	}
	}
	public static void main(String [] args) {
		new Bit_operation();
	}

}
