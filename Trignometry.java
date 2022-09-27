import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Trignometry extends JFrame implements ActionListener {
		JLabel l1,l2,l3,l4,l5;
		JTextField tf1;
		JButton b1,b2;
		String combos[]= {"sin","cos","tan","cot","sec","cosec"};
		String combos1[]= {"0","30","45","60","90"};
		
		JComboBox<String> cb1 = new JComboBox<>(combos);
		JComboBox<String> cb2 = new JComboBox<>(combos1);
	public Trignometry() {
		//Label
			l1=new JLabel("TRIGNOMERTIC CONVERTOR");
			l1.setBounds(140, 60, 300, 30);
			l1.setFont(new Font("Verdana", Font.PLAIN,15));
			add(l1);
			
			l2=new JLabel("Function");
			l2.setBounds(140, 120, 300, 30);
			l2.setFont(new Font("Verdana", Font.PLAIN,15));
			add(l2); 
			
			l3=new JLabel("Value");
			l3.setBounds(140, 180, 300, 30);
			l3.setFont(new Font("Verdana", Font.PLAIN,15));
			add(l3);
			
			l4=new JLabel("Converted value : ");
			l4.setBounds(120,310,150,30);
			l4.setFont(new Font("Verdana", Font.PLAIN,15));
			add(l4);
			
			l5=new JLabel();
			l5.setBounds(270,310,150,30);
			l5.setFont(new Font("Verdana", Font.PLAIN,15));
			add(l5);
			
			//Button
			b1 = new JButton("Convert");
			b1.setBounds(180,250, 100, 30);
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
			/*//Text field
			tf1 = new JTextField();
			tf1.setBounds(230, 180, 80, 30);
			add(tf1);*/
			
			//Check box
			cb1.setBounds(230, 125, 120, 25);
			add(cb1);
			cb1.addActionListener(this);
			
			cb2.setBounds(230, 180, 120, 25);
			add(cb2);
			cb2.addActionListener(this);
			
			setSize(500,500);
			setLayout(null);
			setVisible(true);
			setLocationRelativeTo(null);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		
		// TODO Auto-generated method stub
		String function=(String) cb1.getSelectedItem().toString().toLowerCase();
		String degree=(String) cb2.getSelectedItem().toString().toLowerCase();
		String value = " ";
		switch(function) {
		case "sin":
			switch(degree) {
			case "0":
				value = "0";
				l5.setText(value);
				break;
			case "30":
				value = "0.5";
				l5.setText(value);
				break;
			case "45":
				value = "0.7071";
				l5.setText(value);
				break;
			case "60":
				value = "0.866";
				l5.setText(value);
				break;
			case "90":
				value = "1";
				l5.setText(value);
				break;
			}
			break;
		case "cos":
			switch(degree) {
			case "0":
				value = "1";
				l5.setText(value);
				break;
			case "30":
				value = "0.866";
				l5.setText(value);
				break;
			case "45":
				value = "0.707";
				l5.setText(value);
				break;
			case "60":
				value = "0.5";
				l5.setText(value);
				break;
			case "90":
				value = "0";
				l5.setText(value);
				break;
			}
			break;
		case "tan":
			switch(degree) {
			case "0":
				value = "0";
				l5.setText(value);
				break;
			case "30":
				value = "0.577";
				l5.setText(value);
				break;
			case "45":
				value = "1";
				l5.setText(value);
				break;
			case "60":
				value = "1.732";
				l5.setText(value);
				break;
			case "90":
				value = "undefined";
				l5.setText(value);
				break;
			}
			break;
		case "sec":
			switch(degree) {
			case "0":
				value = "1";
				l5.setText(value);
				break;
			case "30":
				value = "1.154";
				l5.setText(value);
				break;
			case "45":
				value = "1.414";
				l5.setText(value);
				break;
			case "60":
				value = "2";
				l5.setText(value);
				break;
			case "90":
				value = "undefined";
				l5.setText(value);
				break;
			}
			break;
		case "cosec":
			switch(degree) {
			case "0":
				value = "undefined";
				l5.setText(value);
				break;
			case "30":
				value = "2";
				l5.setText(value);
				break;
			case "45":
				value = "1.414";
				l5.setText(value);
				break;
			case "60":
				value = "1.154";
				l5.setText(value);
				break;
			case "90":
				value = "1";
				l5.setText(value);
				break;
			}
			break;
		case "cot":
			switch(degree) {
			case "0":
				value = "undefined";
				l5.setText(value);
				break;
			case "30":
				value = "1.732";
				l5.setText(value);
				break;
			case "45":
				value = "1";
				l5.setText(value);
				break;
			case "60":
				value = "0.577";
				l5.setText(value);
				break;
			case "90":
				value = "0";
				l5.setText(value);
				break;
			}
			break;
		}
		
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println("Blank input field");
		}
		
	}
public static void main(String [] args) {
	new Trignometry();
}
}
