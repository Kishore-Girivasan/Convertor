import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Matrix extends JFrame implements ActionListener{
	//Declaration
		JLabel l1,l2,l3,l4,l5,l6,v1,v2,v3,v4,v5,v6,v7,v8,v9;
		JTextField m1,m2,m3,m4,m5,m6,m7,m8,m9,n1,n2,n3,n4,n5,n6,n7,n8,n9;
		int z1,z2,z3,z4,z5,z6,z7,z8,z9;
		JButton b,bc,bu;
		String combos[]= {"Addition","Multiplication","Subtraction"};
		JComboBox<String> cb1 = new JComboBox<>(combos);
		int a1,a2,a3,a4,a5,a6,a7,a8,a9,b1,b2,b3,b4,b5,b6,b7,b8,b9;
		public Matrix() {
			//Labels
			l1=new JLabel("MATRIX OPERATION");
			l1.setBounds(50, 20, 300, 30);
			l1.setFont(new Font("Verdana", Font.PLAIN,15));
			add(l1);
			
			l2=new JLabel("Matrix 1");
			l2.setBounds(50, 50, 300, 30);
			l2.setFont(new Font("Verdana", Font.PLAIN,15));
			add(l2);
			
			l3=new JLabel("Matrix 2");
			l3.setBounds(50, 150, 300, 30);
			l3.setFont(new Font("Verdana", Font.PLAIN,15));
			add(l3);
			
			l4=new JLabel("Converted value : ");
			l4.setFont(new Font("Verdana", Font.PLAIN,15));
			l4.setBounds(50,320,150,30);
			add(l4);
			
			//Output labels
			v1=new JLabel();
			v1.setBounds(210, 325, 50, 40);
			v1.setFont(new Font("Verdana", Font.BOLD,15));
			add(v1);
			v2=new JLabel();
			v2.setBounds(270, 325, 50, 40);
			v2.setFont(new Font("Verdana", Font.BOLD,15));
			add(v2);
			v3=new JLabel();
			v3.setBounds(330, 325, 50, 40);
			v3.setFont(new Font("Verdana", Font.BOLD,15));
			add(v3);
			v4=new JLabel();
			v4.setBounds(210, 350, 50, 40);
			v4.setFont(new Font("Verdana", Font.BOLD,15));
			add(v4);
			v5=new JLabel();
			v5.setBounds(270, 350, 50, 40);
			v5.setFont(new Font("Verdana", Font.BOLD,15));
			add(v5);
			v6=new JLabel();
			v6.setBounds(330, 350, 50, 40);
			v6.setFont(new Font("Verdana", Font.BOLD,15));
			add(v6);
			v7=new JLabel();
			v7.setBounds(210, 375, 50, 40);
			v7.setFont(new Font("Verdana", Font.BOLD,15));
			add(v7);
			v8=new JLabel();
			v8.setBounds(270, 375, 50, 40);
			v8.setFont(new Font("Verdana", Font.BOLD,15));
			add(v8);
			v9=new JLabel();
			v9.setBounds(330, 375, 50, 40);
			v9.setFont(new Font("Verdana", Font.BOLD,15));
			add(v9);
			
			//Button
			b = new JButton("Convert");
			b.setBounds(130,270, 100, 30);
			add(b);
			b.addActionListener(this);
			
			bc = new JButton("Clear");
			bc.setBounds(260,270, 100, 30);
			add(bc);
			bc.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					m1.setText(null);
					m2.setText(null);
					m3.setText(null);
					m4.setText(null);
					m5.setText(null);
					m6.setText(null);
					m7.setText(null);
					m8.setText(null);
					m9.setText(null);
					n1.setText(null);
					n2.setText(null);
					n3.setText(null);
					n4.setText(null);
					n5.setText(null);
					n6.setText(null);
					n7.setText(null);
					n8.setText(null);
					n9.setText(null);
					v1.setText(null);
					v2.setText(null);
					v3.setText(null);
					v4.setText(null);
					v5.setText(null);
					v6.setText(null);
					v7.setText(null);
					v8.setText(null);
					v9.setText(null);
				}
			});
			
			bu = new JButton("Back");
			bu.setBounds(360,390, 100, 30);
			add(bu);
			bu.addActionListener(new ActionListener() {
				
				@SuppressWarnings({ "rawtypes", "unused" })
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Convertor cv = new Convertor();	
				}
			});
			//Text field
			m1 = new JTextField();
			m1.setBounds(130, 50, 30, 30);
			add(m1);
			m1.addActionListener(this);
			m2 = new JTextField();
			m2.setBounds(170, 50, 30, 30);
			add(m2);
			m3 = new JTextField();
			m3.setBounds(210, 50, 30, 30);
			add(m3);
			m4 = new JTextField();
			m4.setBounds(130, 80, 30, 30);
			add(m4);
			m5 = new JTextField();
			m5.setBounds(170, 80, 30, 30);
			add(m5);
			m6 = new JTextField();
			m6.setBounds(210, 80, 30, 30);
			add(m6);
			m7 = new JTextField();
			m7.setBounds(130, 110, 30, 30);
			add(m7);
			m8 = new JTextField();
			m8.setBounds(170, 110, 30, 30);
			add(m8);
			m9 = new JTextField();
			m9.setBounds(210, 110, 30, 30);
			add(m9);
			n1 = new JTextField();
			n1.setBounds(130, 150, 30, 30);
			add(n1);
			n2 = new JTextField();
			n2.setBounds(170, 150, 30, 30);
			add(n2);
			n3 = new JTextField();
			n3.setBounds(210, 150, 30, 30);
			add(n3);
			n4 = new JTextField();
			n4.setBounds(130, 180, 30, 30);
			add(n4);
			n5 = new JTextField();
			n5.setBounds(170, 180, 30, 30);
			add(n5);
			n6 = new JTextField();
			n6.setBounds(210, 180, 30, 30);
			add(n6);
			n7 = new JTextField();
			n7.setBounds(130, 210, 30, 30);
			add(n7);
			n8 = new JTextField();
			n8.setBounds(170, 210, 30, 30);
			add(n8);
			n9 = new JTextField();
			n9.setBounds(210, 210, 30, 30);
			add(n9);
			
			//Check box
			cb1.setBounds(300, 55, 150, 25);
			add(cb1);
			cb1.addActionListener(this);

			//Frame
			setSize(500,500);
			setLayout(null);
			setVisible(true);
			setLocationRelativeTo(null);
		}
		public void actionPerformed(ActionEvent e) {
			try {

			//Initialization text field values into variables
			 a1 = Integer.parseInt(m1.getText());
			 a2 = Integer.parseInt(m2.getText());
			 a3 = Integer.parseInt(m3.getText());
			 a4 = Integer.parseInt(m4.getText());
			 a5 = Integer.parseInt(m5.getText());
			 a6 = Integer.parseInt(m6.getText());
			 a7 = Integer.parseInt(m7.getText());
			 a8 = Integer.parseInt(m8.getText());
			 a9 = Integer.parseInt(m9.getText());
			 b1 = Integer.parseInt(n1.getText());
			 b2 = Integer.parseInt(n2.getText());
			 b3 = Integer.parseInt(n3.getText());
			 b4 = Integer.parseInt(n4.getText());
			 b5 = Integer.parseInt(n5.getText());
			 b6 = Integer.parseInt(n6.getText());
			 b7 = Integer.parseInt(n7.getText());
			 b8 = Integer.parseInt(n8.getText());
			 b9 = Integer.parseInt(n9.getText());
			 
			 if(cb1.getSelectedItem()=="Multiplication") {
				 multiplication();
			 }
			 else if(cb1.getSelectedItem()=="Addition") {
				 addition();
			 }
			 else if(cb1.getSelectedItem()=="Subtraction") {
				 subtraction();
			 }
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println("Blank input field");
			}
		}
		void multiplication() {
			z1=(a1*b1)+(a2*b4)+(a3*b7);
			v1.setText(String.valueOf(z1));
			z2=(a1*b2)+(a2*b5)+(a3*b8);
			v2.setText(String.valueOf(z2));
			z3=(a1*b3)+(a2*b6)+(a3*b9);
			v3.setText(String.valueOf(z3));
			z4=(a4*b1)+(a5*b4)+(a6*b7);
			v4.setText(String.valueOf(z4));
			z5=(a4*b2)+(a5*b5)+(a6*b8);
			v5.setText(String.valueOf(z5));
			z6=(a4*b3)+(a5*b6)+(a6*b9);
			v6.setText(String.valueOf(z6));
			z7=(a7*b1)+(a8*b4)+(a9*b7);
			v7.setText(String.valueOf(z7));
			z8=(a7*b2)+(a8*b5)+(a9*b8);
			v8.setText(String.valueOf(z8));
			z9=(a7*b3)+(a8*b6)+(a9*b9);
			v9.setText(String.valueOf(z9));
		}
		void addition() {
			z1=a1+b1;
			v1.setText(String.valueOf(z1));
			z2=a2+b2;
			v2.setText(String.valueOf(z2));
			z3=a3+b3;
			v3.setText(String.valueOf(z3));
			z4=a4+b4;
			v4.setText(String.valueOf(z4));
			z5=a5+b5;
			v5.setText(String.valueOf(z5));
			z6=a6+b6;
			v6.setText(String.valueOf(z6));
			z7=a7+b7;
			v7.setText(String.valueOf(z7));
			z8=a8+b8;
			v8.setText(String.valueOf(z8));
			z9=a9+b9;
			v9.setText(String.valueOf(z9));
		}
		void subtraction() {
			z1=a1-b1;
			v1.setText(String.valueOf(z1));
			z2=a2-b2;
			v2.setText(String.valueOf(z2));
			z3=a3-b3;
			v3.setText(String.valueOf(z3));
			z4=a4-b4;
			v4.setText(String.valueOf(z4));
			z5=a5-b5;
			v5.setText(String.valueOf(z5));
			z6=a6-b6;
			v6.setText(String.valueOf(z6));
			z7=a7-b7;
			v7.setText(String.valueOf(z7));
			z8=a8-b8;
			v8.setText(String.valueOf(z8));
			z9=a9-b9;
			v9.setText(String.valueOf(z9));
		
		
}
		public static void main(String [] args) {
			new Matrix();
			
		}
}
