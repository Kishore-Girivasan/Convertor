import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Currency extends JFrame implements ActionListener {
	//Declaration
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField tf1;
	JButton b1,b2;
	String combos[]= {"Rupee","Dollar","Euro","Yuan"};
	JComboBox<String> cb1 = new JComboBox<>(combos);
	JComboBox<String> cb2 = new JComboBox<>(combos);
	public Currency() {
		//Label
		l1=new JLabel("CURRENCY CONVERTOR");
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
		
		l4=new JLabel("Amount");
		l4.setBounds(140, 220, 300, 30);
		l4.setFont(new Font("Verdana", Font.PLAIN,15));
		add(l4);
		
		l5=new JLabel();
		l5.setBounds(270, 320, 100, 30);
		l5.setFont(new Font("Verdana", Font.PLAIN,15));
		add(l5);
		
		l6=new JLabel("Converted value : ");
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
		int amt=Integer.parseInt(tf1.getText());
		//tf1.setText(numberToWord(amt));
		//float amt=Float.parseFloat(amt);  
		double f,g;
		//System.out.println(from+" "+to+" "+amt);
		//Currency_convertor cc = new Currency_convertor(from,to);
		switch(from) {
		case "rupee":
			switch(to) {
			case "dollar":
				f=amt*0.013;
				String s=String.valueOf(f);  
				l5.setText(s);
				break;
			case "rupee":
				f=amt*1;
				String s1=String.valueOf(f);  
				l5.setText(s1);
				break;
			case "euro":
				f=amt*0.012;
				String s2=String.valueOf(f);  
				l5.setText(s2);
				break;
			case "yuan":
				f=amt*0.084;
				g=Math.round((f*100)/100);
				String s3=String.valueOf(g);  
				l5.setText(s3);
				break;
			}
			break;
		case "dollar":
			switch(to) {
			case "dollar":
				f=amt*1;
				String s=String.valueOf(f);  
				l5.setText(s);
				break;
			case "rupee":
				f=amt*76.28;
				String s1=String.valueOf(f);  
				l5.setText(s1);
				break;
			case "euro":
				f=amt*0.92;
				String s2=String.valueOf(f);  
				l5.setText(s2);
				break;
			case "yuan":
				f=amt*6.42;
				String s3=String.valueOf(f);  
				l5.setText(s3);
				break;
			}
			break;
		case "euro":
			switch(to) {
			case "dollar":
				f=amt*1.09;
				String s=String.valueOf(f);  
				l5.setText(s);
				break;
			case "rupee":
				f=amt*82.82;
				String s1=String.valueOf(f);  
				l5.setText(s1);
				break;
			case "euro":
				f=amt*1;
				String s2=String.valueOf(f);  
				l5.setText(s2);
				break;
			case "yuan":
				f=amt*6.97;
				String s3=String.valueOf(f);  
				l5.setText(s3);
				break;
			}
			break;
		case "yuan":
			switch(to) {
			case "dollar":
				f=amt*0.16;
				String s=String.valueOf(f);  
				l5.setText(s);
				break;
			case "rupee":
				f=amt*11.88;
				String s1=String.valueOf(f);  
				l5.setText(s1);
				break;
			case "euro":
				f=amt*0.14;
				String s2=String.valueOf(f);  
				l5.setText(s2);
				break;
			case "yuan":
				f=amt*1;
				String s3=String.valueOf(f);  
				l5.setText(s3);
				break;
			}
			break;
		}
		

		
	} catch (Exception e2) {
		// TODO: handle exception
		System.out.println("Blank input field");
	}	}
	
	public static void main(String[] args){
		new Currency();
       }
}
