import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;


public class CustomerD  extends JFrame{
    JLabel  background;
    CustomerD(String title) {
           super(title);
           JButton b1 = new JButton("back");
           b1.setBounds(0, 0, 100, 30);
           add(b1);
           b1.setBackground(Color.WHITE);
           b1.setForeground(Color.BLUE);
           b1.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
               setVisible(false);
               new AdminHome("admin home").setVisible(true);
      }
           });
           String data[][]={ {"101","AMIN","01760350939","Badda","No Due","amin@gmail.com"},    
                          {"102","NABA","01760350939","Dhaka"," Due","naba@gmail.com"}, 
                          {"103","BIVA","01760350939","Barisal","Due","biva@gmail.com"}, 
                          {"104","SULTAN","01760350959","Basabo","No Due","sultan@gmail.com"},    
                          {"105","GOLAM","01760350932","Khulna"," Due","gl@gmail.com"},    
                          {"106","SOURAV","01760350939","Rampura","No Due","sourav@gmail.com"},
                          {"107","RAKIB","01760350939","Dhaka"," Due","rakib01@gmail.com"}, 
                          {"108","HASAN","01760350939","Banasree","No Due","maha@gmail.com"},   
                          {"109","NABILA","01760350939","Mirpur","No Due","nabila@gmail.com"},   
                          {"110","SINTHIA","01760350939","Uttora","Due","synthia@gmail.com"}};    
    String column[]={"Serial No.","NAME","Mobile","Address","Payment Status", "Email"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(50, 100, 800, 80);       
    JScrollPane sp=new JScrollPane(jt);   
    ImageIcon img = new ImageIcon( "C:\\Users\\HP\\Pictures\\Saved Pictures/bg4.jpg");
    background = new JLabel("", img, JLabel.CENTER);
    background.setBounds(0, 0, 0, 0);
    add(background);
    add(sp);          
    setSize(901,499);    
    setVisible(true);  
    
}     
}