import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerHome extends JFrame {

    CustomerHome(String title) {
        super(title);

        setSize(1000, 600);
 
        JLabel  header = new JLabel("ONLINE EVENT MANAGEMENT SYSTEM", SwingConstants.CENTER);
        header.setBounds(0, 10, 1000, 100);
        header.setOpaque(true);
        header.setBackground(Color.PINK);
        header.setFont(new Font("", Font.BOLD, 25));
        header.setForeground(Color.gray);
        add(header);
        ImageIcon img = new ImageIcon("C:\\Users\\HP\\Pictures\\Saved Pictures/bg.png");
        JLabel background = new JLabel("", img, JLabel.CENTER);
       background.setBounds(0, 200,900 ,450);
        add(background);
        JButton button2 = new JButton("VIEW VANUE ");
        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setBounds(120, 110, 129, 36);
        add(button2);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                 new ViewVanue("").setVisible(true);;
            }
        });

        JButton button = new JButton(" UPDATE DETAILS");
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setBounds(290, 110, 129, 36);
        add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                UpdateCP x=new UpdateCP();
               
                ;
            }
        });
        JButton buttonb = new JButton(" BACK ");
        buttonb.setBackground(Color.BLACK);
        buttonb.setForeground(Color.WHITE);
        buttonb.setBounds(0, 110, 70, 36);
        add(buttonb);
        buttonb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
               new EMStartP(" START PANEL").setVisible(true);

            }

        });
        JButton button3 = new JButton(" FOOD ITEM ");
        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        button3.setBounds(470, 110, 129, 36);
        add(button3);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
               new ViewFood(" FOOD PANEL").setVisible(true);

            }

        });

        JButton button4 = new JButton(" BOOKING HISTORY ");
        button4.setBackground(Color.BLACK);
        button4.setForeground(Color.WHITE);
        button4.setBounds(100, 165, 129, 36);
        add(button4);
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                // new RegisterP("").setVisible(true);;
            }
        });
        JButton button5 = new JButton(" VIEW NOTIFICATION ");
        button5.setBackground(Color.BLACK);
        button5.setForeground(Color.WHITE);
        button5.setBounds(290, 165, 129, 36);
        add(button5);
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                // new NotificationP(" VIEW NOTIFICATION").setVisible(true);;

            }
        });
        JButton button1 = new JButton(" VIEW EQUIPMENT ");
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        button1.setBounds(470, 165, 129, 36);
        add(button1);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new BookV("  EQUIPMENT").setVisible(true);
                ;
            }
        });
        JButton button6 = new JButton(" BOOK EVENT ");
        button6.setBackground(Color.BLACK);
        button6.setForeground(Color.WHITE);
        button6.setBounds(650, 110, 129, 36);
        add(button6);
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new BookEvent("BOOKING  PANEL").setVisible(true);

            }

        });
        JButton button7 = new JButton(" PAYMENT ");
        button7.setBackground(Color.BLACK);
        button7.setForeground(Color.WHITE);
        button7.setBounds(650, 165, 129, 36);
        add(button7);
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new PaymentES("PAYING  PANEL").setVisible(true);

            }

        });
        
        setSize(900, 600); // frame
        setLayout(null); // frame
        setVisible(true); // frame
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
     //   setLayout(new FlowLayout(FlowLayout.CENTER, 20, 40));

    }
}