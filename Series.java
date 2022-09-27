import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class Series extends JFrame implements ActionListener {
	//declaration
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField tf1,tf2,tf3,tf4;
	JButton b,b1,b2;
	String combos[]= {"Arithmetic progression","Geometric Progression","Fibonacci series"};
	JComboBox<String> cb1 = new JComboBox<>(combos);
	public Series() {
		//label
		l1=new JLabel("MATHEMATICAL SERIES");
		l1.setBounds(50, 20, 300, 30);
		l1.setFont(new Font("Verdana", Font.PLAIN,15));
		add(l1);
		
		l2=new JLabel("Starting number");
		l2.setBounds(50, 120, 300, 30);
		l2.setFont(new Font("Verdana", Font.PLAIN,15));
		add(l2);
		
		l3=new JLabel("Common difference");
		l3.setBounds(50, 170, 300, 30);
		l3.setFont(new Font("Verdana", Font.PLAIN,15));
		add(l3);
		
		l4=new JLabel("number of terms");
		l4.setFont(new Font("Verdana", Font.PLAIN,15));
		l4.setBounds(50,220,150,30);
		add(l4);
		
		l5=new JLabel("Output");
		l5.setFont(new Font("Verdana", Font.PLAIN,15));
		l5.setBounds(50,330,150,30);
		add(l5);
		
		
		
		//check box
		cb1.setBounds(50, 65, 180, 25);
		add(cb1);
		cb1.addActionListener(this);
		
		//text field
		tf1 = new JTextField();
		tf1.setBounds(280, 120, 50, 30);
		add(tf1);
		
		tf2 = new JTextField();
		tf2.setBounds(280, 170, 50, 30);
		add(tf2);
		
		tf3 = new JTextField();
		tf3.setBounds(280, 220, 50, 30);
		add(tf3);
		
		tf4 = new JTextField();
		tf4.setBounds(120, 330, 250, 30);
		add(tf4);
		
		//Button
		b = new JButton("Convert");
		b.setBounds(120,270, 100, 30);
		add(b);
		b.addActionListener(this);
				
		b1 = new JButton("Clear");
		b1.setBounds(240,270, 100, 30);
		add(b1);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tf1.setText(null);
				tf2.setText(null);
				tf3.setText(null);
				tf4.setText(null);
			}
		});
		
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
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e)  {
		// TODO Auto-generated method stub
		try {
		
		
		if(cb1.getSelectedItem()=="Arithmetic progression") {
			l3.setVisible(false);
			l3=new JLabel("Common difference");
			l3.setBounds(50, 170, 300, 30);
			l3.setFont(new Font("Verdana", Font.PLAIN,15));
			add(l3);
			l4.setVisible(true);
			l5.setVisible(true);
			tf1.setVisible(true);
			tf2.setVisible(true);
			tf3.setVisible(true);
			int a=Integer.parseInt(tf1.getText());
			int d=Integer.parseInt(tf2.getText());
			int n=Integer.parseInt(tf3.getText());
			 int first=a;
			 int arr[]=new int[n];
			 StringBuffer sb = new StringBuffer();
			 for (int i = 0; i < n; i++)
			 {   arr[i]=first;
				 first =first + d;
			 }
			 for (int i = 0; i < n; i++) {
				sb.append(arr[i]+" ");
			 }
			 String output = sb.toString();
			 tf4.setText(output);
		}
		else if(cb1.getSelectedItem()=="Geometric Progression") {
			l3.setVisible(false);
			l3=new JLabel("Common ratio");
			l3.setBounds(50, 170, 300, 30);
			l3.setFont(new Font("Verdana", Font.PLAIN,15));
			add(l3);
			l5.setVisible(true);
			l4.setVisible(true);
			tf1.setVisible(true);
			tf2.setVisible(true);
			tf3.setVisible(true);
			 int first;
			 int a=Integer.parseInt(tf1.getText());
			 int d=Integer.parseInt(tf2.getText());
			 int n=Integer.parseInt(tf3.getText());
			 int arr[]=new int[n];
			 StringBuffer sb = new StringBuffer();
		     for (int i = 0; i < n; i++) { 
		     first = a * (int)Math.pow(d, i);
		     arr[i]=first;}
		     for (int i = 0; i < n; i++) {
		    	 sb.append(arr[i]+" ");
		     }
		     String output = sb.toString();
		     tf4.setText(output);
		}
		else if(cb1.getSelectedItem()=="Fibonacci series") {
			l2.setVisible(false);
			l3.setVisible(false);
			l4.setVisible(false);
			tf2.setVisible(false);
			tf3.setVisible(false);
			l2=new JLabel("number of terms");
			l2.setFont(new Font("Verdana", Font.PLAIN,15));
			l2.setBounds(50, 120, 300, 30);
			add(l2);
			 int n=Integer.parseInt(tf1.getText());
			 int n1=0,n2=1,n3,i;
			 StringBuffer sb = new StringBuffer();
			 sb.append(n1+" "+n2);
			 for(i=2;i<n;++i) {
				 n3=n1+n2;
				 sb.append(n3+" ");
				 n1=n2;
				 n2=n3;
			 }
			 String output = sb.toString();
		     tf4.setText(output);	
		}
		}
		catch (Exception e1) {
			// TODO: handle exception
			System.out.println("Blank input field");
		}
		
		
		
	}
	public static void main(String [] args) {
		new Series();
		
	}
}
