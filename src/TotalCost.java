import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TotalCost extends JFrame{
   
    String money,name,card;
    TotalCost(String title) {
           super(title);
           setSize(1000, 600);
           JButton button = new JButton("Back");
           button.setBackground(Color.BLACK);
           button.setForeground(Color.WHITE);
           button.setBounds(10, 15, 87, 32);
           add(button);
                  button.addActionListener(new ActionListener() {  
                          @Override
                      public void actionPerformed(ActionEvent e) {       
                             setVisible(false);
                               
                        }
                             
                      } );
           
                      JLabel  header = new JLabel("ONLINE EVENT MANAGEMENT SYSTEM", SwingConstants.CENTER);
                      header.setBounds(0, 10, 1000, 100);
                      header.setOpaque(true);
                      header.setBackground(Color.PINK);
                      header.setFont(new Font("", Font.BOLD, 25));
                      header.setForeground(Color.gray);
                      add(header);

           JLabel label2 = new JLabel("Equipment cost :");
           label2.setBounds(39, 170, 117, 35);
           add(label2);
           JLabel label3= new JLabel("Delivery cost :");
           label3.setBounds(39, 220, 117, 35);
           add(label3);
           JLabel lblGroundCharger = new JLabel("Employes Payment :");
           lblGroundCharger.setBounds(39, 270, 132, 24);
           add(lblGroundCharger);
           
           JLabel lblMaintananceCost = new JLabel("Other Charge :");
           lblMaintananceCost.setBounds(39, 320, 132, 24);
           add(lblMaintananceCost);
           
           JTextField textField = new JTextField();
           textField.setBounds(166, 170, 167, 34);
           add(textField);
           textField.setColumns(10);
           
           JTextField textField1 = new JTextField();
           textField1.setBounds(166, 220, 167, 34);
           add(textField1);
           textField1.setColumns(10);

           JTextField textField2 = new JTextField();
           textField2.setColumns(10);
           textField2.setBounds(166, 270, 167, 34);
           add(textField2);
              
           JTextField textField3 = new JTextField();
           textField3.setColumns(10);
           textField3.setBounds(166, 320, 167, 34);
           add(textField3);

           JLabel lblTaka = new JLabel("TK");
           lblTaka.setBounds(343, 170, 48, 24);
           add(lblTaka);
           JLabel lblTaka1= new JLabel("TK");
           lblTaka1.setBounds(343, 220, 48, 24);
           add(lblTaka1);
           
           JLabel lblTaka_2 = new JLabel("TK");
           lblTaka_2.setBounds(343, 270, 48, 24);
           add(lblTaka_2);
           
           JLabel lblTaka_4 = new JLabel("TK");
           lblTaka_4.setBounds(343, 320, 48, 24);
           add(lblTaka_4);
                   
                    JLabel label4 = new JLabel("");
           label4.setFont(new Font("Tahoma", Font.BOLD, 17));
           label4.setBounds(542, 252, 314, 34);
           add(label4);
           
           JButton button5 = new JButton(" COST");
           button5.setBounds(220, 380, 89, 34);
           add(button5);
           button5.setBackground(Color.BLACK);
           button5.setForeground(Color.WHITE);
                   button5.addActionListener(new ActionListener() {  
                      
                      public void actionPerformed(ActionEvent e) {       
                              String s1=textField.getText();
                              String s2=textField1.getText();
                               String s3=textField2.getText();
                          String s4=textField3.getText();

                                 double d1=Double.parseDouble(s1);
                                 double d2=Double.parseDouble(s2);
                                   double d3=Double.parseDouble(s3); 
                                   double d4=Double.parseDouble(s4);
                                    
                                    double sum=d1+d3+d4+d2;
                               
                                    String sm=String.valueOf(sum);
                                    money=sm;
                                    sm+=" Taka Only";
                                    label4.setText(sm);
   
                        }
                             
                      } );
    


           setSize(900, 600); // frame
           setLayout(null); // frame
           setVisible(true); // frame
           setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
}
}