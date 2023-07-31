
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class PaymentES extends JFrame{
   
     String money,name,card;
     PaymentES(String title) {
            super(title);
         
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(901,499);
		
		setLayout(null);
            setVisible(true);
		
		JLabel label1 = new JLabel(" ");
		label1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label1.setBounds(315, 0, 386, 45);
		add(label1);
                
                JButton button = new JButton("Back");
		button.setBounds(10, 15, 87, 32);
		add(button);
               button.addActionListener(new ActionListener() {  
                       @Override
	               public void actionPerformed(ActionEvent e) {       
	                      setVisible(false);
                             // Pannel1 nw=new Pannel1();
	                 }
	                      
	               } );
		JLabel label2 = new JLabel("PAYMENT :");
		label2.setBounds(39, 100, 117, 35);
		add(label2);
		JLabel label7 = new JLabel("NID :");
		label7.setBounds(39, 150, 117, 35);
		add(label7);

		JLabel label8= new JLabel("CARD NO. :");
		label8.setBounds(39,200, 117, 35);
		add(label8);

		JLabel label = new JLabel("CARD NAME :");
		label.setBounds(39, 250, 117, 35);
		add(label);

		JTextField textField2 = new JTextField();
		textField2.setBounds(150, 101, 117, 35);
		add(textField2);
		JTextField textField1 = new JTextField();
		textField1.setBounds(150, 150, 117, 35);
		add(textField1);
        JTextField textField = new JTextField();
		textField.setBounds(150, 200, 117, 35);
		add(textField);
		JTextField textField3 = new JTextField();
		textField3.setBounds(150, 250, 117, 35);
		add(textField3);
		textField.setColumns(10);
		
                JLabel lblTaka = new JLabel("Taka");
		lblTaka.setBounds(300, 101, 48, 35);
		add(lblTaka);
		
                
                 JLabel label4 = new JLabel(" ");
		label4.setFont(new Font("Tahoma", Font.BOLD, 17));
		label4.setBounds(542, 172, 314, 34);
		add(label4);
		
		JButton button5 = new JButton(" PAY ");
		button5.setBounds(563, 270, 89, 34);
		add(button5);
                button5.addActionListener(new ActionListener() {  
	               public void actionPerformed(ActionEvent e) {       
	                       String s1=textField2.getText();
						   String s2=textField3.getText();
						   String s3=textField.getText();
						   double d1=Double.parseDouble(s1);
						   double d2=Double.parseDouble(s3);
                                 double sum=(d1*.1)+d1;
								 double sum1=d2;
								 String sm3=String.valueOf(sum1);
								 String sm1=String.valueOf(s2);
                                 String sm=String.valueOf(sum);
                                 money=sm;
								 card =sm3;
								 name = sm1;
                                 sm+=" Deposited";
                                 label4.setText(sm);

	                 }
	                      
	               } );
				   JButton Slipbuttton = new JButton("Generate  Slip");
		Slipbuttton.setBounds(534, 100, 147, 34);
		add(Slipbuttton);
                Slipbuttton.addActionListener(new ActionListener() {  
	               public void actionPerformed(ActionEvent e) {     
                    setVisible(false);
					new BookingHis(" ").setVisible(true);
					String s="Booking No: "+card +"   Account Holder: "+name+ " ";
				}} 
				   );
                JButton Slipbuttton1 = new JButton("Print  Slip");
		Slipbuttton1.setBounds(534, 332, 147, 34);
		add(Slipbuttton1);
                Slipbuttton1.addActionListener(new ActionListener() {  
	               public void actionPerformed(ActionEvent e) {       
	                 
                FileWriter fwrite=null;
		java.io.BufferedWriter bw=null;
		PrintWriter pw=null;
		
		try {
		
			 fwrite =new FileWriter("C:\\Users\\HP\\Downloads\\Project\\BMSDemo\\Deposit.txt");
			 bw =new java.io.BufferedWriter(fwrite);
			 pw=new PrintWriter(bw);
			 pw.println("\t\t*******************************************************");
			 pw.println("\t\t\t\t\tPAYMEN SLIP");
			 pw.println("\t\t*******************************************************");
                         pw.println("Digital Payment receipt Cheque");
						 pw.println("________________________________________________________________________________________");
                         String pay="Booking No: "+card +"\t\t   Account Holder: "+name+ " ";
						pw.println("_________________________________________________________________________________________");
                         pw.println(pay);
                         pw.println("\nExcluding 10% Service Charge !");
			            pw.println("__________________________________________________________________________________________");
						pw.println("PAYMENT: "+money+" taka");
			            pw.println("___________________________________________________________________________________________");
                     //    JOptionPane.showMessageDialog("The slip has been generated!");  
                        bw.close();
			pw.close();
                        
                        
		}          catch (IOException ex) {
                             
                           }

	                 }
	                      
	               } 
				   );
		
		
      }
}