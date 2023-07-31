
import javax.swing.*;    
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionListener;
//import java.awt.Color;
import java.awt.event.ActionEvent;


public class AdminP  extends JFrame{
    JLabel  background;
    AdminP(String title){
        super( title );                      
        setSize(1000, 600);
    FileReader reader=null;
    final JLabel label = new JLabel();
    label.setBounds(20,150, 200,50);
    final JPasswordField value = new JPasswordField();
    value.setBounds(100,75,100,30);
    JLabel l1=new JLabel("Username:");
    l1.setBounds(20,20, 80,30);
    JLabel l2=new JLabel("Password:");
    l2.setBounds(20,75, 80,30);
    JButton b = new JButton("Login");
    b.setBounds(100,120, 80,30);
    final JTextField text = new JTextField();
    text.setBounds(100,20, 100,30);
    JButton b1 = new JButton("Back");
    b1.setBounds(100,120, 80,30);
    add(value);
    add(l1);
    add(label);
    add(l2);
    add(b);
    add(text);
    ImageIcon img = new ImageIcon("C:\\Users\\HP\\Pictures\\Saved Pictures/bg3.jpg");
    background = new JLabel("", img, JLabel.CENTER);
   background.setBounds(0, 0, 0, 0);
   add(background);
    setSize(901, 499); 
    setLayout(null);
    setVisible(true);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //setBackground(Color.PINK);
    b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
           
            
            File file = new File("C:\\Users\\HP\\Desktop\\user.txt");
            try {
                String userName =  text.getText();  
                String password= new String(value.getPassword());
                Scanner input = new Scanner(file);
                String user = input.nextLine();
                String pass = input.nextLine();
                
                if(userName.equals(user) && password.equals(pass)){
                    setVisible(false);
                    new AdminHome(" MANAGE NOTIFICATION").setVisible(true);
                }
                else{
                    label.setText("Incorrect Password or Username");  
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdminP.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    });
 

}
}