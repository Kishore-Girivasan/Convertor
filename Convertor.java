import javax.swing.*;
import java.sql.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Convertor<AboutWindow> extends JFrame implements ActionListener{
	//declaration
    JLabel l1,l2,l3,l4,l5;
    Image img;
    JMenu menu;
    JMenuItem help,exit,about,feedback;
    JButton b1;
    String about_info = "PROJECT NAME : UNIT CONVERTOR \n POWERED BY : \n\t G.KISHORE(20MIS0038) \n\t K.SOMURAJ(20MIS0043)";
    String help_info = "This project is related to convertor which is used to convert from one thing to other thing";
    String combos[]= {"Currency","Trignometry","Matrix","Series","Bit Operations"};
	JComboBox<String> cb = new JComboBox<>(combos);
	
	Convertor(){
    //Label 1
	l1=new JLabel("UNIT CONVERTOR");
	l1.setFont(new Font("Verdana", Font.PLAIN,30));
    l1.setBounds(110, 50, 300, 30);
    add(l1);
    l4=new JLabel("Select any one of the following options for converting.");
    l4.setFont(new Font("Verdana", Font.PLAIN,15));
    l4.setBounds(35,95,500, 30);
    add(l4);
    l5=new JLabel("<html>POWERED BY, <br> G.KISHORE(20MIS0038)<br> K.SOMURAJ(20MIS0043)</html>");
    l5.setFont(new Font("Verdana", Font.PLAIN,15));
    l5.setBounds(35,265,500, 100);
    add(l5);
    
    //Menu
    JMenuBar mb = new JMenuBar();
    menu = new JMenu("Menu");
    about = new JMenuItem("About");
    help = new JMenuItem("Help");
    exit = new JMenuItem("Exit");
    feedback = new JMenuItem("Feedback");
    mb.add(menu);
    menu.add(about);
    menu.add(help);
    menu.add(exit);
    menu.add(feedback);
    setJMenuBar(mb);
    help.addActionListener(this);
    about.addActionListener(this);
    exit.addActionListener(this);
    feedback.addActionListener(this);
    
    //Button
    b1 = new JButton("Convert");
    b1.setFont(new Font("Verdana", Font.PLAIN,15));
    b1.setBounds(185, 190, 100, 28);
    add(b1);
    
    JLabel l5=new JLabel();
    l5.setFont(new Font("Verdana", Font.PLAIN,15));
    l5.setBounds(35, 240, 400, 30);
    add(l5);
    
    b1.addActionListener(new ActionListener() {
		@SuppressWarnings("unused")
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//l5.setText("Selected convertor : "+cb.getSelectedItem().toString());
			if(cb.getSelectedItem().toString()=="Trignometry") {
				Trignometry t = new Trignometry();
			}
			if(cb.getSelectedItem().toString()=="Currency") {
				Currency c = new Currency();
			}
			if(cb.getSelectedItem().toString()=="Matrix") {
				Matrix m = new Matrix();
			}
			if(cb.getSelectedItem().toString()=="Series") {
				Series s = new Series();
			}
			if(cb.getSelectedItem().toString()=="Bit Operations") {
				Bit_operation b = new Bit_operation();
			}
		}
	});
    
    
    //Shortcut 
    menu.setMnemonic(KeyEvent.VK_M); //alt+M for menu
    help.setMnemonic(KeyEvent.VK_H); //alt+H for help
    exit.setMnemonic(KeyEvent.VK_E); //alt+E for exit
    about.setMnemonic(KeyEvent.VK_A);//alt+A for about
    feedback.setMnemonic(KeyEvent.VK_F);//alt+F for feedback
    
    //Combo box
    cb.setBounds(170, 140, 120, 25);
    add(cb);
    
   //img=new ImageIcon("src/bg.png").getImage();
   
    
    //Frame 
    //l3.setSize(300, 300);
    setSize(500,500);
    setLayout(null);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
 
    }
	@SuppressWarnings("unused")
	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource() == exit) {
			System.exit(0);	
		    }
		 else if(e.getSource() == help) {
			 JOptionPane.showInternalMessageDialog(null, help_info);
			}
		 else if(e.getSource() ==about) {
			 JOptionPane.showInternalMessageDialog(null, about_info);
			}
		 else if(e.getSource() == about) {
			 JOptionPane.showInternalMessageDialog(null, about_info);
			}
		 else if(e.getSource() == feedback) {
			 JTextField tf1=new JTextField();
			 JTextField tf2=new JTextField();
			 JTextField tf3=new JTextField();
			 Object[] fields= {
					 "Name ",tf1,
					 "Area ",tf2,
					 "Feedback",tf3
			 };
			 int ans=JOptionPane.showConfirmDialog(null, fields,"Feedback",JOptionPane.OK_CANCEL_OPTION);
			 if (ans == 0) {
				try {
					String url="jdbc:mysql://localhost:3306/convertor";
					 String uname="root";
					 String pwd="Kishore2003";
					 Class.forName("com.mysql.cj.jdbc.Driver");
					Connection c = DriverManager.getConnection(url,uname,pwd);
					PreparedStatement s=c.prepareStatement("insert into feedback values(?,?,?)");
					s.setString(1,tf1.getText());
					s.setString(2,tf2.getText());
					s.setString(3,tf3.getText());
					int i=s.executeUpdate();
					c.close();
					s.close();
					JOptionPane.showMessageDialog(null, "Thanks for you feedback");
					
				} catch (SQLException | ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			 }
			}
		 
	}
	/*public void paint(Graphics g) {
		Graphics2D g2D=(Graphics2D) g;
		g2D.drawImage(img, 0, 0, null);
		g2D.setPaint(Color.white);
		}*/
@SuppressWarnings("rawtypes")
public static void main(String[] args) {
	new Convertor();
}
}
