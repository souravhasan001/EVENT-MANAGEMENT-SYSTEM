import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContactUs extends JFrame{
    ContactUs(String Title){
        super(Title);
        setSize( 1000, 600 );
        JLabel header = new JLabel("ONLINE EVENT MANAGEMENT SYSTEM", SwingConstants.CENTER);
        header.setBounds(0, 0, 900, 100);
        header.setOpaque(true);
        header.setBackground(Color.PINK);
        header.setFont(new Font("", Font.BOLD, 25));
        header.setForeground(Color.BLACK);
        add(header);
        JButton button3 = new JButton(" BACK ");
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        button3.setBounds(300, 100, 200, 36);
        add(button3);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                EMStartP st=new EMStartP(" HOME Panel");
                st.setVisible(true);

            }

        });
        JLabel  list = new JLabel("<html>THIS PROJECT IS BASED ON ONLINE EVENT MANAGEMENT SYSTEM<br><br>SUBMITTED TO:<br>MAHAMUDUL HASAN<br><br> SUBMITTED BY: <br>  SOURAV HASAN <br>  EWU-ID :2021-3-60-227 <br><br>  NUSHERA TAJRIN MIMU <br>  EWU-ID :2021-3-60-227<br><br>  AFSARA TASNIM BIVA <br>  EWU-ID : 2022-1-60-396", SwingConstants.CENTER);
        list.setBounds(0, 136, 900, 480);
        list.setOpaque(true);
        list.setBackground(Color.PINK);
        list.setForeground(Color.black);
        list.setFont(new Font("", Font.BOLD, 17));
        add(list);
        setSize(901, 609); 
        setLayout(null);
        setVisible(true);
    
}
}